package com.api.mapeamentosHibernate.repositories.OneToManyAndManyToOne;

import com.api.mapeamentosHibernate.models.onToManyAndManyToOne.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
