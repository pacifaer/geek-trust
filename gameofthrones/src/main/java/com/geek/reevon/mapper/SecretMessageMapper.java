package com.geek.reevon.mapper;

import com.geek.reevon.constant.KINGDOM;
import com.geek.reevon.dto.SecretMessage;

public class SecretMessageMapper {
    public static SecretMessage map(String str) {
        if (str == null || str.isBlank())
            return SecretMessage.getDefaulUnkown();
        try {
            int index = str.indexOf(' ');
            KINGDOM kingdom = getKingdom(index, str);
            return SecretMessage.builder().kingdom(kingdom).data(getData(index, str, kingdom)).build();
        } catch (Exception e) {
            return SecretMessage.getDefaulUnkown();
        }
    }

    private static KINGDOM getKingdom(int index, String str) {
        try {
            return index < 0 ? KINGDOM.valueOf(str) : KINGDOM.valueOf(str.substring(0, index));
        } catch (IllegalArgumentException e) {
            return KINGDOM.UNKNOWN;
        }
    }

    private static String getData(int index, String str, KINGDOM kingdom) {
        return kingdom != KINGDOM.UNKNOWN && index == -1 ? "" : str.substring(index + 1);
    }
}
