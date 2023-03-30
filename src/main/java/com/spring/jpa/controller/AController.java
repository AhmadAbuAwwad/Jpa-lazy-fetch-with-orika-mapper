package com.spring.jpa.controller;

import com.spring.jpa.DTO.ADto;
import com.spring.jpa.model.A;
import com.spring.jpa.repository.ARepository;
import com.spring.jpa.services.AService;
import com.spring.jpa.util.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AController {
    @Autowired
    AService aService;

    @Autowired
    ARepository aRepository;
    @Autowired
    Mapper mapper;

    @GetMapping("/getALazy1")
    public ResponseEntity<List<ADto>> getAzLz() {
        List<A> az = aRepository.findAllLazy();
        return ResponseEntity.ok(mapper.mapAsList(ADto.class, (List<Object>) (List<?>)az));
    }

    @GetMapping("/getAEager")
    public ResponseEntity<List<ADto>> getAz() {
        List<ADto> az = aService.findAzEagerly();
        return ResponseEntity.ok(az);
    }

    @GetMapping("/getALazy")
    public ResponseEntity<List<ADto>> getAzLazy() {
        List<ADto> az = aService.findAzLazily();
        return ResponseEntity.ok(az);
    }
}
