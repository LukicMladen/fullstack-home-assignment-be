package com.mladen.fullstackhomeassignmentbe.facade;

import com.mladen.fullstackhomeassignmentbe.model.BusinessEntry;

public interface BusinessEntryFacade {

    /**
     * @param id of business entry which should be returned
     * @return Business entry by provided id
     */
    BusinessEntry getBusinessEntryById(String id);
}
