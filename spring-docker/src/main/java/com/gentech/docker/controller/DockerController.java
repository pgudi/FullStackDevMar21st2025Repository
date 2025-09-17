package com.gentech.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class DockerController {

    @GetMapping("/docker")
    public String getMessage()
    {
        return "It is a Docker Message for Testing Docker software!!";
    }
}
