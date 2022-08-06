package com.api.mapeamentosHibernate.repositories.manyToMany;

import com.api.mapeamentosHibernate.models.manyToMany.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
