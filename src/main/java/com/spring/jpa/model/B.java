package com.spring.jpa.model;

//import jakarta.persistence.*;
import lombok.*;

import javax.persistence.*;

import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "b")
public class B {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "bid",
            updatable = false,
            nullable = false
    )
    private long bid;


    @Column(name = "data")
    private String data;


    @ManyToOne(fetch = FetchType.LAZY)
    private A a;
}
