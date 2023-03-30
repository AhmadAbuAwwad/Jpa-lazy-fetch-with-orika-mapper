package com.spring.jpa.controller;

import com.spring.jpa.DTO.ADto;
import com.spring.jpa.DTO.BDto;
import com.spring.jpa.services.AService;
import com.spring.jpa.services.BService;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BController {
    @Autowired
    BService bService;


    @GetMapping("/getBLazy")
    public ResponseEntity<List<BDto>> getBzLazy() {
        List<BDto> bz = bService.findAzLazily();
        return ResponseEntity.ok(bz);
    }
}
