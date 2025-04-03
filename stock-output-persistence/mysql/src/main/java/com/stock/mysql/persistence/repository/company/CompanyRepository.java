package com.stock.mysql.persistence.repository.company;

import com.stock.mysql.persistence.entity.company.CompanyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<CompanyEntity, Long> {
}
