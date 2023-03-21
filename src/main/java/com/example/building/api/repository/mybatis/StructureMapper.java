package com.example.building.api.repository.mybatis;

import com.example.building.api.domain.Structure;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StructureMapper {
    /**
     * 全件検索
     * @return
     */
    List<Structure> selectAll();

    /**
     * id検索
     * @return
     */
    List<Structure> findById(int id);

    /**
     * 条件検索
     * @return
     */
    List<Structure> find(Structure structure);

    /**
     * 追加
     * @param data
     */
    void add(Structure data);

    /**
     * 更新
     * @param data
     */
    void set(Structure data);

    /**
     * 削除（論理削除）
     * @param id
     */
    void remove(int id);
}
