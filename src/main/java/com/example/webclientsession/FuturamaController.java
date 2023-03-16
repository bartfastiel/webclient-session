package com.example.webclientsession;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/futurama")
@RequiredArgsConstructor
public class FuturamaController {
    private final FuturamaService service;

    @GetMapping
    FuturamaCharacter getFuturamaCharacter() {
        return service.getFuturamaCharacter();
    }
}
