package com.api.icons.mapper;

import com.api.icons.dto.ContinentDTO;
import com.api.icons.entity.ContinentEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ContinentMapper {

    public ContinentEntity continentDTO2Entity(ContinentDTO dto) {
        ContinentEntity continentEntity = new ContinentEntity();
        continentEntity.setImage(dto.getImage());
        continentEntity.setDenomination(dto.getDenomination());

        return continentEntity;
    }

    public ContinentDTO continentEntity2DTO(ContinentEntity entity) {
        ContinentDTO continentDTO = new ContinentDTO();
        continentDTO.setId(entity.getId());
        continentDTO.setImage(entity.getImage());
        continentDTO.setDenomination(entity.getDenomination());

        return continentDTO;
    }

    public List<ContinentDTO> continentEntityList2DTO(List<ContinentEntity> entities) {
        List<ContinentDTO> listDTOS = new ArrayList<>();
        for (ContinentEntity continent : entities) {
            listDTOS.add(this.continentEntity2DTO(continent));
        }
        return listDTOS;
    }

}

