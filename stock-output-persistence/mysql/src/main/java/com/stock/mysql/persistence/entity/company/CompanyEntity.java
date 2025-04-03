package com.stock.mysql.persistence.entity.company;

import com.stock.application.domain.company.Company;
import com.stock.mysql.persistence.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Entity
@Table(name = "company", schema = "stock-mysql")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class CompanyEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "company_id", updatable = false, nullable = false)
    private Long id;

    @Column(name = "name", length = 50, nullable = false, unique = true)
    private String name;

    public Company toDomain() {
        return Company.builder()
                .id(id)
                .name(name)
                .build();
    }

    public static CompanyEntity of(Company member) {
        return CompanyEntity.builder()
                .name(member.getName())
                .build();
    }
}
