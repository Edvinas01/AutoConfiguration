package com.auto.configuration.some;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface SomeRepository<T extends SomeEntity> extends JpaRepository<T, Long>, JpaSpecificationExecutor<T> {

    T findByName(String name);
}