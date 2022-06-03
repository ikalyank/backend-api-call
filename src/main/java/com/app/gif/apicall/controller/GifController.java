package com.app.gif.apicall.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.gif.apicall.Domains.Gif;
import com.app.gif.apicall.services.GifService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/gif")
public class GifController {
    private GifService gifService;
    public GifController(GifService gifService) {
        this.gifService = gifService;
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/{query}")
    public ResponseEntity<Gif> getGif(@PathVariable String query) {
        Gif gif = gifService.getGif(query);
        return ResponseEntity.ok(gif);
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/trending")
    public ResponseEntity<Gif> getTrendingGifs() {
        Gif gif = gifService.gettrendinggifs();
        return ResponseEntity.ok(gif);
    }    
}
