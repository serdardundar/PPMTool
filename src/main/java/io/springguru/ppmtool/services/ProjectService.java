package io.springguru.ppmtool.services;

import io.springguru.ppmtool.domain.Project;
import io.springguru.ppmtool.repositories.ProjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author serdardundar
 * @since 03/12/2018
 */
@Service
@RequiredArgsConstructor
public class ProjectService {

    private final ProjectRepository projectRepository;

    public Project saveOrUpdateProject(Project project){

        return projectRepository.save(project);
    }
}
