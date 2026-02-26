package org.allobank.com.finanacedataservice.clent;

import org.allobank.com.finanacedataservice.clent.dto.FrankfurterLatestResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class FrankfurterClient {
    private final RestTemplate restTemplate;

    public FrankfurterClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public FrankfurterLatestResponse getLatestIdrRates() {
        ResponseEntity<FrankfurterLatestResponse> response = restTemplate.getForEntity("/latest/base=IDR", FrankfurterLatestResponse.class);
        return response.getBody();
    }
}
