package org.example.tasktracker.service;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.example.tasktracker.database.repository.ProjectRepository;
import org.example.tasktracker.dto.ProjectCreateEditDto;
import org.example.tasktracker.dto.ProjectReadDto;
import org.example.tasktracker.mapper.ProjectCreateEditMapper;
import org.example.tasktracker.mapper.ProjectReadMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Transactional(readOnly = true)
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Service
public class ProjectService {

    ProjectRepository projectRepository;
    ProjectCreateEditMapper projectCreateEditMapper;
    ProjectReadMapper projectReadMapper;

    public Optional<ProjectReadDto> findByName(String name) {
        return projectRepository.findByName(name).map(projectReadMapper::map);
    }

    @Transactional
    public ProjectReadDto create(ProjectCreateEditDto project) {
        return projectReadMapper.map(
                projectRepository.saveAndFlush(projectCreateEditMapper.map(project))
        );
    }


    public Optional<ProjectReadDto> findById(Long id) {
        return projectRepository.findById(id)
                .map(projectReadMapper::map);
    }
}
