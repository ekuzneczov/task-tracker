package org.example.tasktracker.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

//public record ProjectCreateEditDto (@NotBlank String name) {
//}

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ProjectCreateEditDto {

    @NotBlank
    String name;
}
