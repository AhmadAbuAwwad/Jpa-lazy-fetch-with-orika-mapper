package com.spring.jpa.repository;

import com.spring.jpa.model.A;
import com.spring.jpa.model.B;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BRepository extends JpaRepository<B, Integer> {
    @Query("SELECT b FROM B b join fetch A a On a.id = b.a.id")
    List<B> findAllBz();
}
