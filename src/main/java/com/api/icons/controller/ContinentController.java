package com.api.icons.controller;

import com.api.icons.dto.ContinentDTO;
import com.api.icons.service.ContinentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("continentes")
public class ContinentController {

    @Autowired
    ContinentService continentService;

    @PostMapping("/crear")
    public ResponseEntity<ContinentDTO> save (@RequestBody ContinentDTO continent){

        ContinentDTO continentSaved = continentService.save(continent);
        return ResponseEntity.status(HttpStatus.CREATED).body(continentSaved);

    }







}
