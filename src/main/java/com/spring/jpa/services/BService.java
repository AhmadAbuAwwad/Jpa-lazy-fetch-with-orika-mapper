package com.spring.jpa.services;

import com.spring.jpa.DTO.ADto;
import com.spring.jpa.DTO.BDto;
import com.spring.jpa.DTO.DDto;
import com.spring.jpa.model.A;
import com.spring.jpa.model.B;
import com.spring.jpa.model.D;
import com.spring.jpa.repository.BRepository;
import com.spring.jpa.util.Mapper;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class BService {

    @Autowired
    BRepository bRepository;

    @Autowired
    Mapper mapper;

//    public List<ADto> findAzLazily(){
//        return mapper.mapAsList(ADto.class, aRepository.findAllLazy());
//    }

    private static MapperFactory factory =
            new DefaultMapperFactory.Builder().build();

    public List<BDto> findAzLazily() {
//        List<B> bList = bRepository.findAllBz();
        factory.getMapperFacade().map( new D(4l, "DATA"), DDto.class);
//        factory.getMapperFacade().map(BDto.class, new B(44l, new A()));
//        return mapper.mapAsList(BDto.class, Collections.singletonList(bList));
        return  new ArrayList<>();
    }
}
