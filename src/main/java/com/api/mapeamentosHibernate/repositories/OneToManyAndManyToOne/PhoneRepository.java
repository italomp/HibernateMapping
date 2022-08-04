package com.api.mapeamentosHibernate.repositories.OneToManyAndManyToOne;

import com.api.mapeamentosHibernate.models.onToManyAndManyToOne.Phone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhoneRepository extends JpaRepository<Phone, Long> {
}
