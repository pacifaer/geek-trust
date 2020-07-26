package com.geek.reevon.formatter;

import com.geek.reevon.constant.KINGDOM;
import com.geek.reevon.dto.SecretMessage;

import java.util.List;
import java.util.stream.Collectors;

public class StringConsoleWinFormatter implements OutputFormatter {
    @Override
    public String format(List<SecretMessage> messages, KINGDOM ruler) {
        return ruler.getKingdom() + " " + messages
                .stream()
                .map(a -> a.getKingdom().getKingdom())
                .collect(Collectors.joining(" "));
    }
}
