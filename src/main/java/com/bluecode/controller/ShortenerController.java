package com.bluecode.controller;

import com.bluecode.entity.ShortenerRequest;
import com.bluecode.service.ShortenerService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/shortener")
public class ShortenerController {

    private final ShortenerService service;

    public ShortenerController(ShortenerService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public ShortenerRequest create(@RequestBody ShortenerRequest someEntity) {
        return this.service.applyShortener(someEntity);
    }

    @GetMapping
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public List<ShortenerRequest> findAll() {
        return this.service.findAll();
    }

}
