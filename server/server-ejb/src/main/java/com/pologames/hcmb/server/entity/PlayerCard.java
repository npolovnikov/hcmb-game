package com.pologames.hcmb.server.entity;

import com.pologames.hcmb.server.pojo.PlayerUtils;

import javax.persistence.*;

@Entity
public class PlayerCard extends PlayerBase {

    /**
     * Идентификатор
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * Ссылка на игрока
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PLAYER_ID", nullable = false)
    private Player player;

    /**
     * Ссылка на владельца карточки
     */
    private int gamerId;

    /**
     * Ссылка на статистику карточки
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PLAYER_STATISTIC_ID", nullable = false)
    private PlayerStatistic statistics;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public int getGamerId() {
        return gamerId;
    }

    public void setGamerId(int gamerId) {
        this.gamerId = gamerId;
    }

    public PlayerStatistic getStatistics() {
        return statistics;
    }

    public void setStatistics(PlayerStatistic statistics) {
        this.statistics = statistics;
    }

    public int getOvr(){
        return PlayerUtils.ovr(this, player.getPosition());
    }

    @Override
    public String toString() {
        return "PlayerCard{" +
                super.toString() +
                ", id=" + id +
                ", player=" + player +
                ", gamerId=" + gamerId +
                ", statistics=" + statistics +
                '}';
    }
}
