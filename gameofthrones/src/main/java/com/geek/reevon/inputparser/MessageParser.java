package com.geek.reevon.inputparser;

import com.geek.reevon.dto.SecretMessage;

import java.util.List;

public interface MessageParser {
    List<SecretMessage> getSecretMessages(String fileLocation);
}
