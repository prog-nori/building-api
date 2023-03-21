package com.example.building.api.repository;

import java.util.List;

public interface CRUDimpl<T> {
    /**
     * 全件検索
     * @return
     */
    abstract List<T> find();

    /**
     * 一見検索
     * @return
     */
    abstract T get(T target);

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
    abstract void delete(T data);
}
