package com.geek.reevon.logic;

import com.geek.reevon.constant.KINGDOM;
import com.geek.reevon.dto.SecretMessage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Game {

    private final int minAllies;

    public Game(int minAllies) {
        this.minAllies = minAllies;
    }

    public Game() {
        this(3);
    }


    public List<SecretMessage> processMessages(List<SecretMessage> messages) {
        if (!didShanWin(messages))
            return List.of();
        return messages.stream()
                .filter((a) -> a.getKingdom() != KINGDOM.UNKNOWN)
                .filter((a) -> !a.getData().isBlank())
                .filter(this::isValidMessage)
                .collect(Collectors.toList());
    }

    public boolean isValidMessage(SecretMessage message) {
        Map<Integer, Integer> characterCountMap = createCharacterCountEmblemMap(message.getKingdom().getEmblem());
        iterateMapString(characterCountMap, message.getData());
        return characterCountMap.isEmpty();
    }

    public void iterateMapString(Map<Integer, Integer> map, String data) {
        String ldata = data.toUpperCase();
        for (int i = 0; i < ldata.length(); i++) {
            int key = ldata.charAt(i) - 65;
            map.computeIfPresent(key, (k, v) -> --v < 1 ? null : v);
        }
    }

    public Map<Integer, Integer> createCharacterCountEmblemMap(String data) {
        String ldata = data.toUpperCase();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < ldata.length(); i++) {
            int key = ((int) ldata.charAt(i) + ldata.length() - 65) % 26;
            map.computeIfPresent(key, (k, v) -> ++v);
            map.putIfAbsent(key, 1);
        }
        return map;
    }

    public boolean didShanWin(List<SecretMessage> messages) {
        return messages.size() >= minAllies;
    }


}
