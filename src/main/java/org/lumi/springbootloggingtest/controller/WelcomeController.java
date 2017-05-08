package org.lumi.springbootloggingtest.controller;

import org.lumi.springbootloggingtest.model.Greeting;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 5/5/2017.
 */

@Controller
/*@RequestMapping("/hello-world")*/
public class WelcomeController {
    @RequestMapping("/")
    public String welcome(Map<String, Object> model) {
        logger.debug("Welcome {}", "testing");
        logger.info("Hello1");
        logger.error("Hello2");
        model.put("message", this.message);

        return "welcome";

    }

    /*@RequestMapping(method= RequestMethod.GET)
    public @ResponseBody
    Greeting sayHello(@RequestParam(value="name", required=false, defaultValue="Stranger") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));

    }*/

    // inject via application.properties
    @Value("${welcome.message:test}")
    private String message = "Hello World";
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    private static final Logger logger = LoggerFactory.getLogger(WelcomeController.class);

}
