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
    private int angles;                 //Углы
    private int breakaway;              //1 на 1
    private int glove;                  //Работа ловушкой
    private int stick;                  //Работа клюшкой

    //Pick Control
    private int pokeCkech;              //Выбивание шайбы
    private int reboundControl;         //Контроль отскока
    private int recover;                //Восстановление

    //Player
    // PuckSkills
    private int handEye;                //Виденье
    private int passing;                //Пасы
    private int puckControl;            //Контроль шайбы
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
    private int durability;             //стойкость
    private int fightingSkill;          //боевой навык
    private int strength;               //Сила


}
