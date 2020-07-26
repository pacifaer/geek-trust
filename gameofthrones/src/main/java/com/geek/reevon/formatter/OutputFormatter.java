package com.geek.reevon.formatter;

import com.geek.reevon.constant.KINGDOM;
import com.geek.reevon.dto.SecretMessage;

import java.util.List;

public interface OutputFormatter {

    String format(List<SecretMessage> messages, KINGDOM ruler);
}
