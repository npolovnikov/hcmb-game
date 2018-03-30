package com.pologames.hcmb.server.pojo;

import com.pologames.hcmb.server.entity.Player;

import java.util.Random;

public class PlayerUtils {

    public static int ovr(Player player) {
        switch (player.getPosition()) {
            case G: return ovrG(player);
        }
        return 0;
    }

    /**
     * Генерация рандомного вратаря
     * @param minOvr минимальный оvr
     * @param maxOvr максимальный оvr
     * @return
     */
    public static Player createRandomG(int minOvr, int maxOvr) {
        final Player playerG = new Player();
        playerG.setPosition(PositionEnum.G);

        //Главное для вратаря
        playerG.setAgility(randomInt(minOvr - 5, maxOvr + 5));
        playerG.setEndurance(randomInt(minOvr - 5, maxOvr + 5));

        playerG.setAngles(randomInt(minOvr - 5, maxOvr + 5));
        playerG.setBreakaway(randomInt(minOvr - 5, maxOvr + 5));
        playerG.setGlove(randomInt(minOvr - 5, maxOvr + 5));
        playerG.setStick(randomInt(minOvr - 5, maxOvr + 5));

        playerG.setReboundControl(randomInt(minOvr - 5, maxOvr + 5));
        playerG.setRecover(randomInt(minOvr - 5, maxOvr + 5));
        playerG.setPokeCkech(randomInt(minOvr - 5, maxOvr + 5));

        //Второстепенное
        playerG.setBalance(randomInt(minOvr - 15, maxOvr + 15));
        playerG.setSpeed(randomInt(minOvr - 15, maxOvr + 15));

        playerG.setDiscipline(randomInt(minOvr - 15, maxOvr + 15));
        playerG.setOffAwareness(randomInt(minOvr - 15, maxOvr + 15));
        playerG.setPoise(randomInt(minOvr - 15, maxOvr + 15));

        playerG.setAggressiveness(randomInt(minOvr - 15, maxOvr + 15));
        playerG.setBodyChecking(randomInt(minOvr - 15, maxOvr + 15));
        playerG.setDurability(randomInt(minOvr - 15, maxOvr + 15));
        playerG.setFightingSkill(randomInt(minOvr - 15, maxOvr + 15));
        playerG.setStrength(randomInt(minOvr - 15, maxOvr + 15));

        playerG.setHandEye(randomInt(minOvr - 15, maxOvr + 15));
        playerG.setPassing(randomInt(minOvr - 15, maxOvr + 15));
        playerG.setPuckControl(randomInt(minOvr - 15, maxOvr + 15));

        //Ненужное для вратаря
        playerG.setStapShotAccuracy(randomInt(0, 70));
        playerG.setStapShotPower(randomInt(0, 70));
        playerG.setWristShotAccuracy(randomInt(0, 70));
        playerG.setWristShotPower(randomInt(0, 70));

        playerG.setAcceleration(randomInt(0, 70));

        playerG.setDefAwareness(randomInt(0, 70));
        playerG.setFaceOff(randomInt(0, 70));
        playerG.setShotBlocking(randomInt(0, 70));
        playerG.setStickChecking(randomInt(0, 70));
        return playerG;
    }

    public static Player createRandomD(int minOvr, int maxOvr) {
        final Player playerD = new Player();
        return playerD;
    }

    public static  Player createRandomR(int minOvr, int maxOvr) {
        final Player playerR = new Player();
        return playerR;
    }

    public static  Player createRandomL(int minOvr, int maxOvr) {
        final Player playerL = new Player();
        return playerL;
    }

    public static Player createRandomC(int minOvr, int maxOvr) {
        final Player playerC = new Player();
        return playerC;
    }

    private static int randomInt(int minOvr, int maxOvr) {
        return new Random().nextInt(maxOvr - minOvr) + minOvr;
    }

    private static int ovrG(Player player) {
        int sum_1 = player.getAgility() + player.getEndurance() + player.getAngles() + player.getBreakaway()
                + player.getGlove() + player.getStick() + player.getReboundControl() + player.getRecover() + player.getPokeCkech();
        sum_1 *= 1.1;

        int sum_2 = player.getBalance() + player.getSpeed() + player.getDiscipline() + player.getOffAwareness() + player.getPoise()
                + player.getAggressiveness() + player.getBodyChecking() + player.getDurability() + player.getFightingSkill() + player.getStrength()
                + player.getHandEye() + player.getPassing() + player.getPuckControl();
        sum_2 *= 0.9;

        return ((sum_1 / 9) + (sum_2 / 13)) / 2;
    }
}
