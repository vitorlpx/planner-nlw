package com.rocketseat.planner.link;

import com.fasterxml.jackson.annotation.JsonProperty;

public record LinkRequestPayload(String title, String url) {
}
