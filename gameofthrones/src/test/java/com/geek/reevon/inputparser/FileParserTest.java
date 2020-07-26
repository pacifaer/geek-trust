package com.geek.reevon.inputparser;

import com.geek.reevon.constant.KINGDOM;
import com.geek.reevon.dto.SecretMessage;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class FileParserTest {
    private final FileParser parser = new FileParser();

    @Test
    public void testFileParsing() {
        List<SecretMessage> secretMessages = parser.getSecretMessages("G:\\Work\\ws\\IdeaProjects\\geektrust-gameofthrones\\src\\test\\resources\\test1.txt");
        List<SecretMessage> expected = new ArrayList<>();
        expected.add(SecretMessage.builder().kingdom(KINGDOM.AIR).data("ROZO").build());
        expected.add(SecretMessage.builder().kingdom(KINGDOM.LAND).data("FAIJWJSOOFAMAU").build());
        expected.add(SecretMessage.builder().kingdom(KINGDOM.ICE).data("STHSTSTVSASOS").build());
        assertIterableEquals(expected, secretMessages);
    }

    @Test
    public void testFileParsing2() {
        List<SecretMessage> secretMessages = parser.getSecretMessages("G:\\Work\\ws\\IdeaProjects\\geektrust-gameofthrones\\src\\test\\resources\\test4.txt");
        List<SecretMessage> expected = new ArrayList<>();
        expected.add(SecretMessage.builder().kingdom(KINGDOM.AIR).data("OWLAOWLBOWLC").build());
        expected.add(SecretMessage.builder().kingdom(KINGDOM.LAND).data("").build());
        expected.add(SecretMessage.builder().kingdom(KINGDOM.ICE).data("VTBTBHTBBBOBAB").build());
        expected.add(SecretMessage.builder().kingdom(KINGDOM.WATER).data("SUMMER IS COMING").build());
        assertIterableEquals(expected, secretMessages);
    }
}