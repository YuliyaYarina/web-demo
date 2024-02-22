package com.example.pro.sky.course.webdemo.servise;

import com.example.pro.sky.course.webdemo.model.Position;
import com.example.pro.sky.course.webdemo.repositories.PositionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionService {
    private final PositionService positionRepository;

    public PositionService(PositionRepository positionrepository) {
        this.positionRepository = positionRepository;
    }

    public Position createPosition(Position position) {
        return positionRepository.save(position);
    }
    public Position findById(Long id) {
        return positionRepository.findById(id).get();
    }
    public void deleteById(Long id) {
        positionRepository.deleteById(id);
    }
    public List<Position> findByName(String name) {
        return positionRepository.findByName(name);
    }
}
