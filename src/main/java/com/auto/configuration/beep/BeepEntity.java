package com.auto.configuration.beep;

import com.auto.configuration.some.SomeEntity;

import javax.persistence.Entity;

@Entity
public class BeepEntity extends SomeEntity {

    public BeepEntity() {
    }

    public BeepEntity(String name) {
        this.name = name;
    }
}