package com.thoughtworks.capability.gtb.alice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import static org.springframework.http.HttpMethod.GET;

@Service
public class AliceService {

    private final RestTemplate restTemplate;

    private final String baseUrl;

    public AliceService(
            RestTemplate restTemplate, @Value("${bob.baseUrl}") String bobBaseUrl) {
        this.restTemplate = restTemplate;
        this.baseUrl = bobBaseUrl;
    }

    public String helloFromBob() {
        ResponseEntity<String> response = restTemplate.exchange(
                baseUrl + "/hello",
                GET,
                null,
                String.class
        );
        return response.getBody();
    }
}
