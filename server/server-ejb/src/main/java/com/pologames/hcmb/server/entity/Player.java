package com.pologames.hcmb.server.entity;

import com.pologames.hcmb.server.pojo.PositionEnum;

/**
 * Created by npolovnikov on 28.11.17.
 */
public class Player {

    private long id;
    private String fullName;
    private String shortName;
    private PositionEnum position;
    private int talent;

    //GK
    //Reflex
    private int angles;
    private int breakaway;
    private int fiveHole;
    private int glove;
    private int stick;
    //Athletics
//    private int aggressiveness;
//    private int agility;
//    private int durability;
//    private int endurance;
//    private int speed;
    private int vision;
    //Pick Control
//    private int passing;
//    private int poise;
    private int pokeCkech;
    private int puckPlayingFreq;
    private int reboundControl;
    private int recover;

    //Player
    // PuckSkills
    private int deking;
    private int handEye;
    private int passing;
    private int puckControl;
    // Shooting
    private int stapShotAccuracy;       //точность броска
    private int stapShotPower;          //сила броска
    private int wristShotAccuracy;      //точность удара (коротки)
    private int wristShotPower;         //сила удара
    //Skating
    private int acceleration;           //ускорение
    private int agility;                //ловкость
    private int balance;                //балансировка
    private int endurance;              //выносливость
    private int speed;                  //скорость
    //Senses
    private int discipline;             //дисциплины
    private int offAwareness;           //осознание
    private int poise;                  //уравновешенность
    //defense
    private int defAwareness;           //защита
    private int faceOff;                //вбрасывание
    private int shotBlocking;           //перехват
    private int stickChecking;          //отбор
    //Physical
    private int aggressiveness;         //агрессивность
    private int bodyChecking;           //силовой прием
    private int durability;             //порчность
    private int fightingSkill;          //боевой навык
    private int strength;               //Сила


}
