package com.geek.reevon.mapper;

import com.geek.reevon.constant.KINGDOM;
import com.geek.reevon.dto.SecretMessage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SecretMessageMapperTest {

    @Test
    public void testConversion() {
        assertEquals(SecretMessage.builder().kingdom(KINGDOM.LAND).data("ABCD").build(), SecretMessageMapper.map("LAND ABCD"));
        assertEquals(SecretMessage.builder().kingdom(KINGDOM.UNKNOWN).data("ABCD").build(), SecretMessageMapper.map("LANN ABCD"));
        assertEquals(SecretMessage.builder().kingdom(KINGDOM.LAND).data("").build(), SecretMessageMapper.map("LAND "));
        assertEquals(SecretMessage.builder().kingdom(KINGDOM.LAND).data("").build(), SecretMessageMapper.map("LAND"));
        assertEquals(SecretMessage.builder().kingdom(KINGDOM.UNKNOWN).data("LANN").build(), SecretMessageMapper.map("LANN"));
    }

}