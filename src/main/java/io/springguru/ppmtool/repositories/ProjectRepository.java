package io.springguru.ppmtool.repositories;

import io.springguru.ppmtool.domain.Project;
import org.springframework.data.repository.CrudRepository;

/**
 * @author serdardundar
 * @since 03/12/2018
 */
public interface ProjectRepository extends CrudRepository<Project, Long> {

    Project findByProjectIdentifier(String identifier);

    @Override
    Iterable<Project> findAll();
}
