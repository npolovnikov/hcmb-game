package com.pologames.hcmb.server.manager;

import com.pologames.hcmb.server.entity.Player;
import com.pologames.hcmb.server.pojo.PositionEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ejb.Local;
import javax.ejb.Stateless;

import static com.pologames.hcmb.server.pojo.PlayerUtils.*;

/**
 * Класс для управления игроками
 */
@Stateless
@Local
public class PlayerManager {
    private final static Logger LOG = LoggerFactory.getLogger(PlayerManager.class);

    public Player createRandomPlayer(int minOvr, int maxOvr) {
        LOG.info("createRandomPlayer: start. min = {}, max = {}", minOvr, maxOvr);
        final PositionEnum positionEnum = PositionEnum.G;
        LOG.info("Position: {}", positionEnum);

        final Player player;
        switch (positionEnum) {
            case G: player = createRandomG(minOvr, maxOvr); break;
            case D: player = createRandomD(minOvr, maxOvr); break;
            case L: player = createRandomL(minOvr, maxOvr); break;
            case R: player = createRandomR(minOvr, maxOvr); break;
            case C: player = createRandomC(minOvr, maxOvr); break;
            default: player = null;
        }
        LOG.info("OVR: {}", player.getOvr());
        return player;
    }
}
