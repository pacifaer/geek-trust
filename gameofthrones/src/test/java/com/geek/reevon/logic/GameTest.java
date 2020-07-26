package com.geek.reevon.logic;

import com.geek.reevon.constant.KINGDOM;
import com.geek.reevon.dto.SecretMessage;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class GameTest {


    @Test
    public void testLogic() {
        List<SecretMessage> list = new ArrayList<>();
        list.add(SecretMessage.builder().kingdom(KINGDOM.AIR).data("ROZO").build());
        list.add(SecretMessage.builder().kingdom(KINGDOM.LAND).data("FAIJWJSOOFAMAU").build());
        list.add(SecretMessage.builder().kingdom(KINGDOM.ICE).data("STHSTSTVSASOS").build());
        Game app = new Game(3);
        List<SecretMessage> secretMessages = app.processMessages(list);
        assertTrue(app.didShanWin(secretMessages));
    }
}