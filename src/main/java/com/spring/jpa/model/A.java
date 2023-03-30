package com.spring.jpa.model;

import javax.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
@NamedEntityGraph(name = "A.data", attributeNodes = @NamedAttributeNode("data"))
@Table(name = "a")
public class A {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "aid",
            nullable = false
    )
    private long aid;


    @Column(name = "data")
    private String data;

    @OneToMany(mappedBy = "a", fetch = FetchType.LAZY)
    private List<B> b;
}
