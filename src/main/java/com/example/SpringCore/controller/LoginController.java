package com.example.SpringCore.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class LoginController {
    //We have used the LoggerFactory and using static method getLogger to check the logging.
    //We have used the SLF4J for logs

    Logger logger = LoggerFactory.getLogger(LoginController.class);

    @GetMapping("/login")
    public ModelAndView logUser() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login.html");
//We have defined a trace pattern and the logs will be shown in the trace pattern for the controller.
        //logger.error("Login logs");
         logger.trace("Login Controller Logs");
        return modelAndView;
    }
}
