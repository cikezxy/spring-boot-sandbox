package com.cikezxy.springbootsandbox.jpa.repository;

import com.cikezxy.springbootsandbox.jpa.entity.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ActorRepository extends JpaRepository<Actor, Long> {

    List<Actor> findByFirstName(String firstName);
}
