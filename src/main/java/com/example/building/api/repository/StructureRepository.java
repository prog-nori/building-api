package com.example.building.api.repository;

import com.example.building.api.domain.Structure;
import com.example.building.api.repository.mybatis.StructureMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StructureRepository implements CRUDimpl<Structure> {

    /**
     * structureテーブルに対応したMapperをautowired
     */
    @Autowired
    private StructureMapper structureMapper;

    @Override
    public List<Structure> selectAll() {
        return structureMapper.selectAll();
    }

    @Override
    public List<Structure> findById(int id) {
        return structureMapper.findById(id);
    }

    @Override
    public List<Structure> find(Structure structure) {
        return structureMapper.find(structure);
    }

    @Override
    public void add(Structure data) {
        structureMapper.add(data);
    }

    @Override
    public void update(Structure data) {
        structureMapper.set(data);
    }

    @Override
    public void delete(int id) {
        structureMapper.remove(id);
    }
}
