package com.example.webclientsession;

import com.fasterxml.jackson.annotation.JsonProperty;

public record FuturamaCharacter(
        String age,
        String gender,
        int id,
        @JsonProperty("name")
        FuturamaName nameInformation
) {
}
