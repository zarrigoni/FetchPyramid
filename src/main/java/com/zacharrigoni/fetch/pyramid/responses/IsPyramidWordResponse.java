package com.zacharrigoni.fetch.pyramid.responses;

public class IsPyramidWordResponse {
    private final boolean isValidPyramidWord;

    public IsPyramidWordResponse(boolean isPyramidWord){
        this.isValidPyramidWord = isPyramidWord;
    }


    public boolean isValidPyramidWord() {
        return isValidPyramidWord;
    }
}
