package com.auto.configuration.some;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class SomeEntity {

    @Id
    @GeneratedValue
    protected Long id;

    @Column(unique = true)
    protected String name;

    public SomeEntity() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}