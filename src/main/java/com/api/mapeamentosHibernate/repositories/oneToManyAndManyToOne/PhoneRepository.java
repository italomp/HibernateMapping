package com.api.mapeamentosHibernate.repositories.oneToManyAndManyToOne;

import com.api.mapeamentosHibernate.models.oneToManyAndManyToOne.Phone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhoneRepository extends JpaRepository<Phone, Long> {
}
