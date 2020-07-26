package com.geek.reevon.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainControllerTest {
    private final MainController app = new MainController();

    @Test
    public void test() {
        assertEquals("SPACE AIR LAND ICE", app.process("G:\\Work\\ws\\IdeaProjects\\geektrust-gameofthrones\\src\\test\\resources\\test1.txt"));
        assertEquals("SPACE LAND ICE FIRE", app.process("G:\\Work\\ws\\IdeaProjects\\geektrust-gameofthrones\\src\\test\\resources\\test2.txt"));
        assertEquals("NONE", app.process("G:\\Work\\ws\\IdeaProjects\\geektrust-gameofthrones\\src\\test\\resources\\test3.txt"));
        assertEquals("NONE", app.process("G:\\Work\\ws\\IdeaProjects\\geektrust-gameofthrones\\src\\test\\resources\\test4.txt"));
        assertEquals("NONE", app.process("G:\\Work\\ws\\IdeaProjects\\geektrust-gameofthrones\\src\\test\\resources\\test5.txt"));
    }
}