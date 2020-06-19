package com.zacharrigoni.fetch.pyramid.services;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class PyramidWordServiceTests {

    private final PyramidWordService pyramidWordService = new PyramidWordService();

    @Test
    public void isPyramidWord_EmptyWord() {
        boolean result = pyramidWordService.isPyramidWord(Optional.empty());
        assertFalse(result);
    }

    @Test
    public void isPyramidWord_BlankWord() {
        boolean result = pyramidWordService.isPyramidWord(Optional.of(""));
        assertFalse(result);
    }

    @Test
    public void isPyramidWord_ValidWord() {
        boolean result = pyramidWordService.isPyramidWord(Optional.of("banana"));
        assertTrue(result);
    }

    @Test
    public void isPyramidWord_ValidWord__SingleCharacter() {
        boolean result = pyramidWordService.isPyramidWord(Optional.of("b"));
        assertTrue(result);
    }

    @Test
    public void isPyramidWord_ValidWord_MixedCase() {
        boolean result = pyramidWordService.isPyramidWord(Optional.of("baNanA"));
        assertTrue(result);
    }

    @Test
    public void isPyramidWord_InvalidWord() {
        boolean result = pyramidWordService.isPyramidWord(Optional.of("bandana"));
        assertFalse(result);
    }
}
