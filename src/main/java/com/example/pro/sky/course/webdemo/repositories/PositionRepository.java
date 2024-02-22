package com.example.pro.sky.course.webdemo.repositories;

import com.example.pro.sky.course.webdemo.model.Position;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PositionRepository extends JpaRepository<Position, Long> {

    List<Position> findByName(String position);
}
