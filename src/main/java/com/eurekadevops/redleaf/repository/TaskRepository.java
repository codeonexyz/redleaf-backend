package com.eurekadevops.redleaf.repository;

import com.eurekadevops.redleaf.domain.Project;
import com.eurekadevops.redleaf.domain.Task;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends CrudRepository<Task, Long> {
    
    Task findBySequence(String sequence);
    
    List<Task> findAllByProjectOrderByPriority(Project project);

}
