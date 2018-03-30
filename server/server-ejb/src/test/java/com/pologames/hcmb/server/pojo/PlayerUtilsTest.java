package com.pologames.hcmb.server.pojo;

import com.pologames.hcmb.server.entity.Player;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PlayerUtilsTest {
    private final static Logger LOG = LoggerFactory.getLogger(PlayerUtilsTest.class);

    @Test
    public void createRandomGTest() {
        for (int j = 0; j < 5; j++) {
            LOG.info("j = {}", j);
            for (int i = 40; i < 100; i += 10) {
                final int max = i + 10;

                final Player playerG = PlayerUtils.createRandomG(i, max);
                LOG.info("min = {}, max = {}, Player.OVR = {}", i, max, playerG.getOvr());
                assertTrue(playerG.getOvr() >= i, playerG.toString());
                assertTrue(playerG.getOvr() <= max, playerG.toString());
            }
        }
    }
}