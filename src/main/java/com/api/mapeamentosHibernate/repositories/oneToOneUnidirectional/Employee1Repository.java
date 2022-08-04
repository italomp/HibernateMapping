package com.api.mapeamentosHibernate.repositories.oneToOneUnidirectional;

import com.api.mapeamentosHibernate.models.oneToOneUnidirectional.Employee1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Employee1Repository extends JpaRepository<Employee1, Long> {
}
