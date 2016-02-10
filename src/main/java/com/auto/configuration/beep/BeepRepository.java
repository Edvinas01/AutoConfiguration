package com.auto.configuration.beep;

import com.auto.configuration.some.SomeRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BeepRepository extends SomeRepository<BeepEntity> {
}