package org.lumi.springbootloggingtest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

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
        logger.info("Hello2");
        logger.error("Hello3");
        model.put("message", this.message);

        return "welcome";

    }

    // inject via application.properties
    @Value("${welcome.message:test}")
    private String message = "Hello World";
    private static final Logger logger = LoggerFactory.getLogger(WelcomeController.class);

}
