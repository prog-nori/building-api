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

    public Structure(
            int id,
            int w,
            int al,
            int sLight,
            int sHeavy,
            int rc,
            int src,
            int cft,
            int cb,
            String others) {
        this.setBuildingID(id);
        this.setW(w);
        this.setAl(al);
        this.setSLight(sLight);
        this.setSHeavy(sHeavy);
        this.setRc(rc);
        this.setSrc(src);
        this.setCft(cft);
        this.setCb(cb);
        this.setOthers(others);
    }
}
