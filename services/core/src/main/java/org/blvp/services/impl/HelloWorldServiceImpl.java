package org.blvp.services.impl;

import org.blvp.sample.model.Greeting;
import org.blvp.sample.service.HelloWorldService;

/**
 * Created by blvp.me on 31.07.16.
 */
public class HelloWorldServiceImpl implements HelloWorldService {
    @Override
    public Greeting hello(String name) {
        Greeting greeting = new Greeting();
        greeting.setGreet("Hello" + name);
        return greeting;
    }
}
