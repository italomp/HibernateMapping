package com.api.mapeamentosHibernate.repositories.oneToOneBidirectional;

import com.api.mapeamentosHibernate.models.oneToOneBidirectional.Address2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Address2Repository extends JpaRepository<Address2, Long> {
}
