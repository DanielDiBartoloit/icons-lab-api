package com.api.icons.service;

import com.api.icons.dto.ContinentDTO;

import java.util.List;

public interface ContinentService {

    ContinentDTO save(ContinentDTO dto);

    List<ContinentDTO> getAllContinents();
}
