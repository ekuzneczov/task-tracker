package org.example.tasktracker.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TaskReadDto {

    Long id;

    String name;

    @JsonProperty("created_at")
    Instant createdAt;

    String description;
}
