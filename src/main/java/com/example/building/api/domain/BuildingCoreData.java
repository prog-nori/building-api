package com.example.building.api.domain;

import java.sql.Date;
import java.sql.Timestamp;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * buildingテーブルのデータを表現するためのdomain
 */
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BuildingCoreData {
    /**
     * ビルID（識別子）
     */
    private int buildingID;

    /**
     * ビル名
     */
    private String buildingName;

    /**
     * 計画名
     */
    private String planName;

    /**
     * 緯度
     */
    private String latitude;

    /**
     * 経度
     */
    private String longitude;

    /**
     * 住所
     */
    private String address;

    /**
     * 敷地面積
     */
    private float siteArea;

    /**
     * 建築面積
     */
    private float buildingArea;

    /**
     * 延べ床面積
     */
    private float totalFloorArea;

    /**
     * 階数（地上）
     */
    private int groundFloors;

    /**
     * 階数（地下）
     */
    private int basementFloors;

    /**
     * 階数（塔屋）
     */
    private int towerFloors;

    /**
     * 高さ
     */
    private float height;

    /**
     * 着工予定
     */
    private Date startAt;

    /**
     * 竣工予定
     */
    private Date endAt;

    /**
     * 事業主
     */
    private String businessOwner;

    /**
     * 建築主
     */
    private String architect;

    /**
     * 設計者
     */
    private String designer;

    /**
     * 施工者
     */
    private String builder;

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
