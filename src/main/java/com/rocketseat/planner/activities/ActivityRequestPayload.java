package com.rocketseat.planner.activities;

import java.time.LocalDateTime;

public record ActivityRequestPayload(
        String title,
        String ocurrsAt
) {
}
