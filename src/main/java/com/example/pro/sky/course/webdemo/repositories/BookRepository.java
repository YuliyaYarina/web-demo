package com.example.pro.sky.course.webdemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.Position;

public interface BookRepository extends JpaRepository<Position, Long> {

}
