package com.example.building.api.repository;

import java.util.List;

public interface CRUDimpl<T> {
    /**
     * 全件検索
     * @return
     */
    abstract List<T> selectAll();

    /**
     * id検索
     * @param id
     * @return
     */
    abstract List<T> findById(int id);

    /**
     * 条件検索
     * @param data
     * @return
     */
    abstract List<T> find(T data);

    /**
     * 追加
     */
    abstract void add(T data);

    /**
     * 更新
     */
    abstract void update(T data);

    /**
     * 論理削除
     */
    abstract void delete(int id);
}
