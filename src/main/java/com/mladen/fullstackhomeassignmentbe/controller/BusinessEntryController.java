package com.mladen.fullstackhomeassignmentbe.controller;

import com.mladen.fullstackhomeassignmentbe.dto.BusinessEntryDto;
import com.mladen.fullstackhomeassignmentbe.facade.BusinessEntryFacade;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("business")
public class BusinessEntryController {

    private final BusinessEntryFacade businessEntryFacade;
    private final ModelMapper modelMapper;

    public BusinessEntryController(BusinessEntryFacade businessEntryFacade, ModelMapper modelMapper) {
        this.businessEntryFacade = businessEntryFacade;
        this.modelMapper = modelMapper;
    }

    @GetMapping("{id}")
    public ResponseEntity<BusinessEntryDto> getBusinessEntryById(@PathVariable("id") String id) {
        try {
            return new ResponseEntity<>(modelMapper.map(businessEntryFacade.getBusinessEntryById(id),
                                                        BusinessEntryDto.class), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }

    }
}
