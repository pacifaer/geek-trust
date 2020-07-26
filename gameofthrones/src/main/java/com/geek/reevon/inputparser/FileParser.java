package com.geek.reevon.inputparser;

import com.geek.reevon.dto.SecretMessage;
import com.geek.reevon.mapper.SecretMessageMapper;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FileParser implements MessageParser {

    @Override
    public List<SecretMessage> getSecretMessages(String fileLocation) {
        try {
            return Files.readAllLines(Path.of(fileLocation))
                    .stream().map(SecretMessageMapper::map)
                    .collect(Collectors.toList());
        } catch (Exception e) {
            return new ArrayList<>(0);
        }
    }

}
