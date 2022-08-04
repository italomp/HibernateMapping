package com.api.mapeamentosHibernate.repositories.oneToOneBidirectional;

import com.api.mapeamentosHibernate.models.oneToOneBidirectional.Employee2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Employee2Repository extends JpaRepository<Employee2, Long> {
}
