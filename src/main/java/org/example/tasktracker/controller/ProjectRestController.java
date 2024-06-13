package org.example.tasktracker.controller;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.example.tasktracker.dto.ProjectCreateEditDto;
import org.example.tasktracker.dto.ProjectReadDto;
//import org.example.tasktracker.exeption.BadRequestException;
//import org.example.tasktracker.exeption.NotFoundException;
import org.example.tasktracker.service.ProjectService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import static java.lang.String.format;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequestMapping("/api/v1/projects")
public class ProjectRestController {

    ProjectService projectService;

    @PostMapping()
    public ProjectReadDto create(@RequestBody @Validated ProjectCreateEditDto project) {

//        projectService.findByName(project.getName())
//                .ifPresent(projectDto -> {
//                    throw new BadRequestException(format("Project '%s' already exists", project.getName()));
//                });

        return projectService.create(new ProjectCreateEditDto(project.getName()));
    }

    @PutMapping("/{id}")
    public ProjectReadDto edit(@PathVariable Long id,
                               @RequestParam String name) {

//        ProjectReadDto project = projectService.findById(id)
//                .orElseThrow(() -> new NotFoundException(format("Project with id = %s doesn't exist.", id)));

        return null;
    }
}
