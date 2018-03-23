package com.pologames.hcmb.server.manager;

import com.pologames.hcmb.server.entity.Player;
import com.pologames.hcmb.server.pojo.PositionEnum;

import javax.ejb.Local;
import javax.ejb.Stateless;

/**
 * Класс для управления игроками
 */
@Stateless
@Local
public class PlayerManager {

    public Player createRandomPlayer(int minOvr, int maxOvr) {
        final PositionEnum positionEnum = PositionEnum.random();
        final Player player;
        switch (positionEnum){
            case G: player = createRandomG(minOvr, maxOvr); break;
            case D: player = createRandomD(minOvr, maxOvr); break;
            case L: player = createRandomL(minOvr, maxOvr); break;
            case R: player = createRandomR(minOvr, maxOvr); break;
            case C: player = createRandomC(minOvr, maxOvr); break;
            default: player = null;
        }
        return player;
    }

    private Player createRandomG(int minOvr, int maxOvr) {
        final Player playerG = new Player();
        return playerG;
    }

    private Player createRandomD(int minOvr, int maxOvr) {
        final Player playerD = new Player();
        return playerD;
    }

    private Player createRandomR(int minOvr, int maxOvr) {
        final Player playerR = new Player();
        return playerR;
    }

    private Player createRandomL(int minOvr, int maxOvr) {
        final Player playerL = new Player();
        return playerL;
    }

    private Player createRandomC(int minOvr, int maxOvr) {
        final Player playerC = new Player();
        return playerC;
    }
}
