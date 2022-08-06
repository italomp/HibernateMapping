package com.api.mapeamentosHibernate.repositories.manyToMany;

import com.api.mapeamentosHibernate.models.manyToMany.Person2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Person2Repository extends JpaRepository<Person2, Long> {
}
