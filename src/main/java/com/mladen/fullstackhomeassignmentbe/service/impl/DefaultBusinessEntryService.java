package com.mladen.fullstackhomeassignmentbe.service.impl;
import com.mladen.fullstackhomeassignmentbe.model.BusinessEntry;
import com.mladen.fullstackhomeassignmentbe.service.BusinessEntryService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DefaultBusinessEntryService implements BusinessEntryService {

    private final RestTemplate restTemplate;

    public DefaultBusinessEntryService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public BusinessEntry getBusinessEntryById(String id) {
        return restTemplate.getForObject("https://storage.googleapis.com/coding-session-rest-api/" + id, BusinessEntry.class);
    }
}
