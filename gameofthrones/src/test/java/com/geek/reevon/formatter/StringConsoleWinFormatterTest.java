package com.geek.reevon.formatter;

import com.geek.reevon.constant.KINGDOM;
import com.geek.reevon.dto.SecretMessage;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringConsoleWinFormatterTest {

    private final StringConsoleWinFormatter app = new StringConsoleWinFormatter();

    @Test
    public void testoutput() {
        List<SecretMessage> list = new ArrayList<>();
        list.add(SecretMessage.builder().kingdom(KINGDOM.AIR).data("ROZO").build());
        list.add(SecretMessage.builder().kingdom(KINGDOM.LAND).data("FAIJWJSOOFAMAU").build());
        list.add(SecretMessage.builder().kingdom(KINGDOM.ICE).data("STHSTSTVSASOS").build());
        assertEquals("SPACE AIR LAND ICE", app.format(list, KINGDOM.SPACE));

    }
}