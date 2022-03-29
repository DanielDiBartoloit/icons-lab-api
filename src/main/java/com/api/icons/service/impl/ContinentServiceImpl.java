package com.api.icons.service.impl;

import com.api.icons.dto.ContinentDTO;
import com.api.icons.entity.ContinentEntity;
import com.api.icons.mapper.ContinentMapper;
import com.api.icons.repository.ContinentRepository;
import com.api.icons.service.ContinentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContinentServiceImpl implements ContinentService {

    @Autowired
    public ContinentMapper continentMapper;

    @Autowired
    public ContinentRepository continentRepository;

    public ContinentDTO save(ContinentDTO dto) {
        ContinentEntity continentEntity = continentMapper.continentDTO2Entity(dto);
        ContinentEntity continentSaved = continentRepository.save(continentEntity);
        ContinentDTO result = continentMapper.continentEntity2DTO(continentSaved);

        return result;
    }


    public List<ContinentDTO> getAllContinents() {
        List<ContinentEntity> entities = continentRepository.findAll();
        List<ContinentDTO> result = continentMapper.continentEntityList2DTO(entities);
        return result;
    }


}



