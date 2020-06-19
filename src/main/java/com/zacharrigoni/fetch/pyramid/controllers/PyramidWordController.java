package com.zacharrigoni.fetch.pyramid.controllers;
import com.zacharrigoni.fetch.pyramid.responses.IsPyramidWordResponse;
import com.zacharrigoni.fetch.pyramid.services.PyramidWordService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class PyramidWordController {

    private final PyramidWordService pyramidWordService;

    public PyramidWordController() {
        this.pyramidWordService = new PyramidWordService();
    }

    @GetMapping("/is-pyramid-word")
    public IsPyramidWordResponse isPyramidWord(@RequestParam(value = "word") Optional<String> word){
        boolean isPyramidWord = pyramidWordService.isPyramidWord(word);
        return new IsPyramidWordResponse(isPyramidWord);
    }
}
