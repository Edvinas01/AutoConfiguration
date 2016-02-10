package com.auto.configuration.some;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/entities")
@ConditionalOnBean(value = SomeEntityService.class)
public class SomeController<T extends SomeEntity> {

    private final SomeEntityService<T> someEntityService;

    @Autowired
    public SomeController(SomeEntityService<T> someEntityService) {
        this.someEntityService = someEntityService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<T> getSomeEntities() {
        return someEntityService.getSomeEntities();
    }

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public T getSomeEntity(@PathVariable String name) {
        return someEntityService.getSomeEntity(name);
    }
}