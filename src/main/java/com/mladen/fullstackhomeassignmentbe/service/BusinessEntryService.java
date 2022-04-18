package com.mladen.fullstackhomeassignmentbe.service;

import com.mladen.fullstackhomeassignmentbe.model.BusinessEntry;

public interface BusinessEntryService {

    /**
     * @param id of business entry which should be returned
     * @return Business entry by provided id
     */
    BusinessEntry getBusinessEntryById(String id);
}
