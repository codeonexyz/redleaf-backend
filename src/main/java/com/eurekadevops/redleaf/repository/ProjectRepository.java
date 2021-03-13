package com.eurekadevops.redleaf.repository;

import com.eurekadevops.redleaf.domain.Project;
import com.eurekadevops.redleaf.domain.User;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> {

    public Project findByProjectIdentifier(String projectIdentifier);
    
    public List<Project> findAllByUser(User user);

}
