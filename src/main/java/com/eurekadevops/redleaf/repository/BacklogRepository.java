package com.eurekadevops.redleaf.repository;

import com.eurekadevops.redleaf.domain.Backlog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BacklogRepository extends CrudRepository<Backlog, Long> {

}
