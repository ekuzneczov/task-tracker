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
public class ProjectReadDto {

    @NonNull
    Long id;

    @NonNull
    String name;

    @NonNull
    @JsonProperty("created_at")
    Instant createdAt;

    @NonNull
    @JsonProperty("updated_at")
    Instant updatedAt;
}
