package quyet.example.bootApp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import quyet.example.bootApp.vars.StatusMessages;

@RestController
public class HealthCheck {


    @GetMapping("/")
    public String index() {
        return StatusMessages.GET_HEALTH_SUCCESS;
        //return "application's up an running!";
    }

}
