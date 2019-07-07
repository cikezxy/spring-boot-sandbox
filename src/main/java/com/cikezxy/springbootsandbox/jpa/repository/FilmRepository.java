package com.cikezxy.springbootsandbox.jpa.repository;

import com.cikezxy.springbootsandbox.jpa.entity.Film;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepository extends JpaRepository<Film,Long>{
}
