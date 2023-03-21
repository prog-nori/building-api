package com.example.building.api.repository;

import com.example.building.api.domain.BuildingCoreData;
import java.util.ArrayList;
import java.util.List;

public class BuildingsRepository implements CRUDimpl<BuildingCoreData> {
    /**
     * 全件検索
     * @return
     */
    public List<BuildingCoreData> find() {
        // return all Buildings
        List<BuildingCoreData> buildings = new ArrayList<>();
        return buildings;
    }

    /**
     * 一見検索
     * @return
     */
    public BuildingCoreData get(BuildingCoreData target) {
        // return a Building
        BuildingCoreData building = new BuildingCoreData();
        return building;
    }

    /**
     * 追加
     */
    public void add(BuildingCoreData data) {
        //
    }

    /**
     * 更新
     */
    public void update(BuildingCoreData data) {
        //
    }

    /**
     * 論理削除
     */
    public void delete(BuildingCoreData data) {
        //
    }
}
