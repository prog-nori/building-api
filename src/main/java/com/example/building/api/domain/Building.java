package com.example.building.api.domain;

import java.sql.Date;
import java.sql.Timestamp;
import lombok.Data;

/**
 * ビルデータを読み込む際に使用するdomain
 */
@Data
public class Building {
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
     * その他の構造（自由記述）
     */
    private String otherStructures;

    /**
     * 木造
     * 0...該当しない
     * 1...該当
     */
    private int w;

    /**
     * アルミ造
     * 0...該当しない
     * 1...該当
     */
    private int al;

    /**
     * 軽量鉄骨造
     * 0...該当しない
     * 1...該当
     */
    private int sLight;

    /**
     * 重量鉄骨造
     * 0...該当しない
     * 1...該当
     */
    private int sHeavy;

    /**
     * 鉄筋コンクリート造（RC造）
     * 0...該当しない
     * 1...該当
     */
    private int rc;

    /**
     * 鉄骨鉄筋コンクリート造（SRC造）
     * 0...該当しない
     * 1...該当
     */
    private int src;

    /**
     * コンクリート充填鋼管構造（CFT造）
     * 0...該当しない
     * 1...該当
     */
    private int cft;

    /**
     * コンクリートブロック造（CB造）
     * 0...該当しない
     * 1...該当
     */
    private int cb;

    /**
     * その他基礎工法（自由記述）
     */
    private String otherFoundations;

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
}
