package com.example.webclientsession;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Objects;

@Service
public class FuturamaService {

    private final WebClient webClient = WebClient.create("https://api.sampleapis.com/futurama");

    FuturamaCharacter getFuturamaCharacter() {
        ResponseEntity<FuturamaCharacter> responseEntity = webClient
                .get()
                .uri("/characters/2")
                .retrieve()
                .toEntity(FuturamaCharacter.class)
                .block()
                ;
        return Objects.requireNonNull(responseEntity).getBody();
    }
}






