package com.example.building.api.repository;

import com.example.building.api.domain.Building;
import java.util.ArrayList;
import java.util.List;

public class BuildingsRepository implements CRUDimpl<Building> {
    /**
     * 全件検索
     * @return
     */
    public List<Building> find() {
        // return all Buildings
        List<Building> buildings = new ArrayList<>();
        return buildings;
    }

    /**
     * 一見検索
     * @return
     */
    public Building get(Building target) {
        // return a Building
        Building building = new Building();
        return building;
    }

    /**
     * 追加
     */
    public void add(Building data) {
        //
    }

    /**
     * 更新
     */
    public void update(Building data) {
        //
    }

    /**
     * 論理削除
     */
    public void delete(Building data) {
        //
    }
}
