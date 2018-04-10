package com.pologames.hcmb.server.entity;

import com.pologames.hcmb.server.pojo.PlayerUtils;
import com.pologames.hcmb.server.pojo.PositionEnum;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Описание игрока
 */
@Entity
public class Player extends PlayerBase {

    /**
     * Идентификатор
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * Полсное имя
     */
    @Column
    private String fullName;

    /**
     * Короткое имя (на майке)
     */
    @Column
    private String shortName;

    /**
     * Позиция
     */
    @Column(nullable = false, length = 1)
    @NotNull(message = "Позиция не может быть пустой")
    @Size(min = 1, max = 1, message = "Размер от 1 до 1")
    private PositionEnum position;

    /**
     * Талант
     */
    @Column(nullable = false)
    @NotNull(message = "Талант не может быть пустой")
    @Size(min = 1, max = 1, message = "Размер от 1 до 1")
    private int talent;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public PositionEnum getPosition() {
        return position;
    }

    public void setPosition(PositionEnum position) {
        this.position = position;
    }

    public int getTalent() {
        return talent;
    }

    public void setTalent(int talent) {
        this.talent = talent;
    }

    public int getOvr(){
        return PlayerUtils.ovr(this, position);
    }

    @Override
    public String toString() {
        return "Player{" +
                super.toString() +
                ", id=" + id +
                ", fullName='" + fullName + '\'' +
                ", shortName='" + shortName + '\'' +
                ", position=" + position +
                ", talent=" + talent +
                '}';
    }
}
