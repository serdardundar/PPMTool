package io.springguru.ppmtool.services;

import io.springguru.ppmtool.domain.Project;
import io.springguru.ppmtool.exceptions.ProjectIdException;
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

        try{
            project.setProjectIdentifier(project.getProjectIdentifier().toUpperCase());
            return projectRepository.save(project);

        }catch (Exception e){
            throw new ProjectIdException("Project ID '" + project.getProjectIdentifier().toUpperCase() + "' already exists");
        }

    }

    public Project findProjectByIdentifier(String identifier){
        Project project =  projectRepository.findByProjectIdentifier(identifier.toUpperCase());

        if(project == null) {
            throw new ProjectIdException("Project ID '" + identifier.toUpperCase() + "' doesnot exist");
        }

        return project;
    }

    public Iterable<Project> findAllProjects(){
        return projectRepository.findAll();
    }

    public void deleteProjectByIdentifier(String identifier){
        Project project = projectRepository.findByProjectIdentifier(identifier.toUpperCase());

        if(project == null) {
            throw new ProjectIdException("Project cannot be deleted. Project ID '" + identifier.toUpperCase() + "' doesnot exist");
        }

        projectRepository.delete(project);
    }
}
