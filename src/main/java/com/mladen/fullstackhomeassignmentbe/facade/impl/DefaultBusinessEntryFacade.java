package com.mladen.fullstackhomeassignmentbe.facade.impl;

import com.mladen.fullstackhomeassignmentbe.facade.BusinessEntryFacade;
import com.mladen.fullstackhomeassignmentbe.model.BusinessEntry;
import com.mladen.fullstackhomeassignmentbe.service.BusinessEntryService;
import org.springframework.stereotype.Component;

@Component
public class DefaultBusinessEntryFacade implements BusinessEntryFacade {
    private BusinessEntryService businessEntryService;

    public DefaultBusinessEntryFacade(BusinessEntryService businessEntryService) {
        this.businessEntryService = businessEntryService;
    }

    @Override
    public BusinessEntry getBusinessEntryById(String id) {
        return businessEntryService.getBusinessEntryById(id);
    }
}
