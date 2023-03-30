package com.spring.jpa.DTO;

import com.spring.jpa.model.B;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ADto {
    private long aid;
    private String data;
    private List<BDto> b;
}
