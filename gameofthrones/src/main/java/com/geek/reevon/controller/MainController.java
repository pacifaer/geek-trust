package com.geek.reevon.controller;

import com.geek.reevon.constant.KINGDOM;
import com.geek.reevon.dto.SecretMessage;
import com.geek.reevon.formatter.OutputFormatter;
import com.geek.reevon.formatter.StringConsoleLoseFormatter;
import com.geek.reevon.formatter.StringConsoleWinFormatter;
import com.geek.reevon.inputparser.FileParser;
import com.geek.reevon.inputparser.MessageParser;
import com.geek.reevon.logic.Game;

import java.util.List;

public class MainController {
    public String process(String data) {
        List<SecretMessage> secretMessages = parser().getSecretMessages(data);
        Game game = new Game(3);
        List<SecretMessage> result = game.processMessages(secretMessages);
        return formatter(game.didShanWin(result)).format(result, KINGDOM.SPACE);
    }

    private OutputFormatter formatter(boolean win) {
        return win ? new StringConsoleWinFormatter() : new StringConsoleLoseFormatter();
    }

    private MessageParser parser() {
        return new FileParser();
    }
}
