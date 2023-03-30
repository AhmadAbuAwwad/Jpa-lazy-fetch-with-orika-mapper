package com.spring.jpa.services;

import com.spring.jpa.DTO.ADto;
import com.spring.jpa.model.A;
import com.spring.jpa.repository.ARepository;
import com.spring.jpa.util.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service

public class AService {

    @Autowired
    ARepository aRepository;

    @Autowired
    Mapper mapper;

    public List<ADto> findAzEagerly() {
        List<A> as1 = aRepository.findAllEager();
        List<A> as2 = aRepository.findAllz();
        return mapper.mapAsList(ADto.class,  (List<Object>) (List<?>) as1);
    }

    public List<ADto> findAzLazily() {
        List<A> as = aRepository.findAllLazy();
        return mapper.mapAsList(ADto.class,  (List<Object>) (List<?>) as);
    }
}
