package com.pologames.hcmb.server.entity;

import com.pologames.hcmb.server.pojo.PlayerUtils;
import com.pologames.hcmb.server.pojo.PositionEnum;

/**
 * Описание игрока
 */
public class Player {

    /**
     * Идентификатор
     */
    private long id;

    /**
     * Полсное имя
     */
    private String fullName;

    /**
     * Короткое имя (на майке)
     */
    private String shortName;

    /**
     * Позиция
     */
    private PositionEnum position;

    /**
     * Талант
     */
    private int talent;

    //GK
    //Reflex
    /**
     * Контроль углов
     */
    private int angles;

    /**
     * 1 на 1
     */
    private int breakaway;

    /**
     * Работа ловушкой
     */
    private int glove;

    /**
     * Работа клюшкой
     */
    private int stick;

    //Pick Control
    /**
     * Выбивание шайбы
     */
    private int pokeCkech;

    /**
     * Контроль отскока
     */
    private int reboundControl;

    /**
     * Восстановление
     */
    private int recover;

    //Player
    // PuckSkills
    /**
     * Виденье
     */
    private int handEye;

    /**
     * Пасы
     */
    private int passing;

    /**
     * Контроль шайбы
     */
    private int puckControl;

    // Shooting
    /**
     * Точность броска
     */
    private int stapShotAccuracy;

    /**
     * Сила броска
     */
    private int stapShotPower;

    /**
     * Точность удара
     */
    private int wristShotAccuracy;

    /**
     * Сила удара
     */
    private int wristShotPower;

    //Skating
    /**
     * Ускорение
     */
    private int acceleration;

    /**
     * Ловкость
     */
    private int agility;

    /**
     * Балансировка
     */
    private int balance;

    /**
     * Выносливость
     */
    private int endurance;

    /**
     * Скорость
     */
    private int speed;

    //Senses
    /**
     * Дисциплина
     */
    private int discipline;

    /**
     * Осознаность
     */
    private int offAwareness;

    /**
     * Уравновешиность
     */
    private int poise;


    //defense
    /**
     * Защита
     */
    private int defAwareness;

    /**
     * Вбрасывание
     */
    private int faceOff;

    /**
     * Перехват
     */
    private int shotBlocking;

    /**
     * Отбор
     */
    private int stickChecking;

    //Physical
    /**
     * Агрессивность
     */
    private int aggressiveness;

    /**
     * Силовой прием
     */
    private int bodyChecking;

    /**
     * Стойкость
     */
    private int durability;

    /**
     * Боевой навык
     */
    private int fightingSkill;

    /**
     * Сила
     */
    private int strength;

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public int getAngles() {
        return angles;
    }

    public void setAngles(int angles) {
        this.angles = angles;
    }

    public int getBreakaway() {
        return breakaway;
    }

    public void setBreakaway(int breakaway) {
        this.breakaway = breakaway;
    }

    public int getGlove() {
        return glove;
    }

    public void setGlove(int glove) {
        this.glove = glove;
    }

    public int getStick() {
        return stick;
    }

    public void setStick(int stick) {
        this.stick = stick;
    }

    public int getPokeCkech() {
        return pokeCkech;
    }

    public void setPokeCkech(int pokeCkech) {
        this.pokeCkech = pokeCkech;
    }

    public int getReboundControl() {
        return reboundControl;
    }

    public void setReboundControl(int reboundControl) {
        this.reboundControl = reboundControl;
    }

    public int getRecover() {
        return recover;
    }

    public void setRecover(int recover) {
        this.recover = recover;
    }

    public int getHandEye() {
        return handEye;
    }

    public void setHandEye(int handEye) {
        this.handEye = handEye;
    }

    public int getPassing() {
        return passing;
    }

    public void setPassing(int passing) {
        this.passing = passing;
    }

    public int getPuckControl() {
        return puckControl;
    }

    public void setPuckControl(int puckControl) {
        this.puckControl = puckControl;
    }

    public int getStapShotAccuracy() {
        return stapShotAccuracy;
    }

    public void setStapShotAccuracy(int stapShotAccuracy) {
        this.stapShotAccuracy = stapShotAccuracy;
    }

    public int getStapShotPower() {
        return stapShotPower;
    }

    public void setStapShotPower(int stapShotPower) {
        this.stapShotPower = stapShotPower;
    }

    public int getWristShotAccuracy() {
        return wristShotAccuracy;
    }

    public void setWristShotAccuracy(int wristShotAccuracy) {
        this.wristShotAccuracy = wristShotAccuracy;
    }

    public int getWristShotPower() {
        return wristShotPower;
    }

    public void setWristShotPower(int wristShotPower) {
        this.wristShotPower = wristShotPower;
    }

    public int getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(int acceleration) {
        this.acceleration = acceleration;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDiscipline() {
        return discipline;
    }

    public void setDiscipline(int discipline) {
        this.discipline = discipline;
    }

    public int getOffAwareness() {
        return offAwareness;
    }

    public void setOffAwareness(int offAwareness) {
        this.offAwareness = offAwareness;
    }

    public int getPoise() {
        return poise;
    }

    public void setPoise(int poise) {
        this.poise = poise;
    }

    public int getDefAwareness() {
        return defAwareness;
    }

    public void setDefAwareness(int defAwareness) {
        this.defAwareness = defAwareness;
    }

    public int getFaceOff() {
        return faceOff;
    }

    public void setFaceOff(int faceOff) {
        this.faceOff = faceOff;
    }

    public int getShotBlocking() {
        return shotBlocking;
    }

    public void setShotBlocking(int shotBlocking) {
        this.shotBlocking = shotBlocking;
    }

    public int getStickChecking() {
        return stickChecking;
    }

    public void setStickChecking(int stickChecking) {
        this.stickChecking = stickChecking;
    }

    public int getAggressiveness() {
        return aggressiveness;
    }

    public void setAggressiveness(int aggressiveness) {
        this.aggressiveness = aggressiveness;
    }

    public int getBodyChecking() {
        return bodyChecking;
    }

    public void setBodyChecking(int bodyChecking) {
        this.bodyChecking = bodyChecking;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public int getFightingSkill() {
        return fightingSkill;
    }

    public void setFightingSkill(int fightingSkill) {
        this.fightingSkill = fightingSkill;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getOvr() {
        return PlayerUtils.ovr(this);
    }


    @Override
    public String toString() {
        return "Player{" +
                "ovr=" + getOvr() +
                ", id=" + id +
                ", fullName='" + fullName + '\'' +
                ", shortName='" + shortName + '\'' +
                ", position=" + position +
                ", talent=" + talent +
                ", angles=" + angles +
                ", breakaway=" + breakaway +
                ", glove=" + glove +
                ", stick=" + stick +
                ", pokeCkech=" + pokeCkech +
                ", reboundControl=" + reboundControl +
                ", recover=" + recover +
                ", handEye=" + handEye +
                ", passing=" + passing +
                ", puckControl=" + puckControl +
                ", stapShotAccuracy=" + stapShotAccuracy +
                ", stapShotPower=" + stapShotPower +
                ", wristShotAccuracy=" + wristShotAccuracy +
                ", wristShotPower=" + wristShotPower +
                ", acceleration=" + acceleration +
                ", agility=" + agility +
                ", balance=" + balance +
                ", endurance=" + endurance +
                ", speed=" + speed +
                ", discipline=" + discipline +
                ", offAwareness=" + offAwareness +
                ", poise=" + poise +
                ", defAwareness=" + defAwareness +
                ", faceOff=" + faceOff +
                ", shotBlocking=" + shotBlocking +
                ", stickChecking=" + stickChecking +
                ", aggressiveness=" + aggressiveness +
                ", bodyChecking=" + bodyChecking +
                ", durability=" + durability +
                ", fightingSkill=" + fightingSkill +
                ", strength=" + strength +
                '}';
    }
}
