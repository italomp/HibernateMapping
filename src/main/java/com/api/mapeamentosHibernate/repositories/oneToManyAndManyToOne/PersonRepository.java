package com.api.mapeamentosHibernate.repositories.oneToManyAndManyToOne;

import com.api.mapeamentosHibernate.models.oneToManyAndManyToOne.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
