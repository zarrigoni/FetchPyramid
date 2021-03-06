package com.zacharrigoni.fetch.pyramid.services;

import java.util.*;

public class PyramidWordService {
    public PyramidWordService(){

    }

    /**
     * This method identifies the set of characters that make up the word. It then takes that count of unique characters
     * and figures out the expected Pyramid work length count and compares it with the actual word length to determine
     * if it is a pyramid word.
     *
     * @param word the string of characters we are checking if its a pyramid word
     * @return if the submitted word is a pyramid word
     */
    public boolean isPyramidWord(Optional<String> word){
        if (!word.isPresent() || word.get().isEmpty()) {
            return false;
        }
        String lowerCaseWord = word.get().toLowerCase().trim();

        Set<Character> characterSet = buildCharacterSet(lowerCaseWord);

        Integer numberOfUniqueCharacters = characterSet.size();
        Integer expectedSize = getExpectedCharacterSize(numberOfUniqueCharacters);
        Integer length = lowerCaseWord.length();

        return expectedSize == length;
    }

    private Integer getExpectedCharacterSize(Integer uniqueCharacters) {
        Integer total = 0;

        for (int count = 1; count <= uniqueCharacters; count++) {
            total = total + count;
        }

        return total;
    }

    private Set<Character> buildCharacterSet(String word){
        Set<Character> characterSet = new HashSet<>();

        for (char character : word.toCharArray()) {
            characterSet.add(character);
        }

        return characterSet;
    }
}
