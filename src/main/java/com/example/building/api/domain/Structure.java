package com.example.building.api.domain;

import java.sql.Timestamp;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * structureテーブルのデータを表現するためのdomain
 * 構造
 */
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Structure {
    /**
     * ビルID（識別子）
     */
    private int buildingID;

    /**
     * 直接基礎
     * 0...該当しない
     * 1...該当
     * 2...該当（併用）
     */
    private int directFoundation;

    /**
     * 布基礎
     * 0...該当しない
     * 1...該当
     * 2...該当（併用）
     */
    private int clothFoundation;

    /**
     * 独自基礎
     * 0...該当しない
     * 1...該当
     * 2...該当（併用）
     */
    private int originalFoundation;

    /**
     * ベタ基礎
     * 0...該当しない
     * 1...該当
     * 2...該当（併用）
     */
    private int solidFoundation;

    /**
     * 杭基礎
     * 0...該当しない
     * 1...該当
     * 2...該当（併用）
     */
    private int pileFoundation;

    /**
     * 支持杭
     * 0...該当しない
     * 1...該当
     * 2...該当（併用）
     */
    private int supportPile;

    /**
     * 摩擦杭
     * 0...該当しない
     * 1...該当
     * 2...該当（併用）
     */
    private int frictionPile;

    /**
     * その他（自由記述）
     */
    private String others;

    /**
     * データ作成日
     */
    private Timestamp createAt;

    /**
     * データ更新日
     */
    private Timestamp updateAt;

    /**
     * 削除フラグ（論理削除）
     * 0...存在
     * 1...削除
     */
    private int deleteFlag;
}
