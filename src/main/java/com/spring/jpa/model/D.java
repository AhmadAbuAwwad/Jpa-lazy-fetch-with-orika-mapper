package com.spring.jpa.model;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
@Table(name = "d")
public class D {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "did",
            nullable = false
    )
    private long did;

    @Column(name = "data")
    private String data;

}
