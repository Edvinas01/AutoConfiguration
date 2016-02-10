package com.auto.configuration.beep;

import com.auto.configuration.some.SomeEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class BeepService extends SomeEntityService<BeepEntity> {

    private final BeepRepository beepRepository;

    @Autowired
    public BeepService(BeepRepository beepRepository) {
        super(beepRepository);
        this.beepRepository = beepRepository;
    }

    @Override
    @PostConstruct
    public void init() {
        beepRepository.save(new BeepEntity("BEEP"));
        beepRepository.save(new BeepEntity("BOOP"));
    }
}