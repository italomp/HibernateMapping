package com.api.mapeamentosHibernate.repositories.oneToOneUnidirectional;

import com.api.mapeamentosHibernate.models.oneToOneUnidirectional.Address1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Address1Repository extends JpaRepository<Address1, Long> {
}
