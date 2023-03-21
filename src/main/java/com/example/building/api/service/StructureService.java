package com.example.building.api.service;

import com.example.building.api.domain.Structure;
import com.example.building.api.repository.StructureRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StructureService {

    @Autowired
    StructureRepository repository;

    public List<Structure> selectAll() {
        return repository.selectAll();
    }

    public List<Structure> findById(int id) {
        return repository.findById(id);
    }

    public List<Structure> find(Structure structure) {
        return repository.find(structure);
    }

    public void add(Structure data) {
        repository.add(data);
    }

    public void update(Structure data) {
        repository.update(data);
    }

    public void delete(int id) {
        repository.delete(id);
    }
}
