package com.juanmolero.papelito.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    void game_has_id() {
        Game game = new Game(1L);
        assertEquals(1L, game.id());
    }
}