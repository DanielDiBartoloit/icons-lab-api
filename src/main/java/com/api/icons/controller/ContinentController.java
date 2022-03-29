package com.api.icons.controller;

import com.api.icons.dto.ContinentDTO;
import com.api.icons.service.ContinentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("continentes")
public class ContinentController {

    @Autowired
    ContinentService continentService;

    @GetMapping("/todos")
    public ResponseEntity<List<ContinentDTO>> getAll() {
        List<ContinentDTO> continents = continentService.getAllContinents();
        return ResponseEntity.ok().body(continents);
    }


    @PostMapping("/crear")
    public ResponseEntity<ContinentDTO> save(@RequestBody ContinentDTO continent) {

        ContinentDTO continentSaved = continentService.save(continent);
        return ResponseEntity.status(HttpStatus.CREATED).body(continentSaved);
    }


}
