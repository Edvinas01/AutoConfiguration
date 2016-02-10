package com.auto.configuration.some;

import java.util.List;

public abstract class SomeEntityService<T extends SomeEntity> {

    private final SomeRepository<T> someRepository;

    public SomeEntityService(SomeRepository<T> someRepository) {
        this.someRepository = someRepository;
    }

    public T getSomeEntity(String name) {
        return someRepository.findByName(name);
    }

    public List<T> getSomeEntities() {
        return someRepository.findAll();
    }

    public abstract void init();
}