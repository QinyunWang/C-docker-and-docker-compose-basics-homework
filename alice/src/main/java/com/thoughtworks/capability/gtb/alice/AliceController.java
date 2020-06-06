package com.thoughtworks.capability.gtb.alice;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class AliceController {

    private final AliceService aliceService;

    @GetMapping("/hello")
    @ResponseStatus(HttpStatus.OK)
    public String hello() {
        return aliceService.helloFromBob();
    }

    @GetMapping("/healthcheck")
    @ResponseStatus(HttpStatus.OK)
    public String health() {
        return "HealthCheck";
    }
}
