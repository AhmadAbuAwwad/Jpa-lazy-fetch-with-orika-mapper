package com.spring.jpa.repository;

import com.spring.jpa.model.A;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface ARepository extends JpaRepository<A, Integer> {

    @Query("SELECT DISTINCT a FROM A a inner join a.b")
    List<A> findAllLazy();

    @Query("SELECT distinct a FROM A a join  fetch a.b")
    List<A> findAllEager();

//    @Query("SELECT a FROM A a join fetch a.data")
//    List<A> findData();

    @EntityGraph("A.data")
    @Query("SELECT a FROM A a")
    List<A> findAllz();
}
