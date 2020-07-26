package com.geek.reevon.formatter;

import com.geek.reevon.constant.KINGDOM;
import com.geek.reevon.dto.SecretMessage;

import java.util.List;

public class StringConsoleLoseFormatter implements OutputFormatter {
    @Override
    public String format(List<SecretMessage> messages, KINGDOM ruler) {
        return KINGDOM.UNKNOWN.getEmblem();
    }
}
