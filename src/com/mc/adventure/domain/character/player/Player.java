package com.mc.adventure.domain.character.player;

import com.mc.adventure.domain.buff.BuffEffect;
import com.mc.adventure.domain.buff.BuffEffects;
import com.mc.adventure.domain.character.Character;
import com.mc.adventure.domain.item.Equipment;
import com.mc.adventure.domain.item.armor.Armor;
import com.mc.adventure.domain.item.armor.DefaultArmor;
import com.mc.adventure.domain.item.weapon.DefaultWeapon;
import com.mc.adventure.domain.item.weapon.Weapon;
import com.mc.adventure.domain.skill.Skill;

import java.util.Random;

public class Player extends Character {
    private int level = 1;
    private int experience;
    private Weapon weapon = new DefaultWeapon();
    private Armor armor = new DefaultArmor();
    private final BuffEffects buffs = new BuffEffects();
    private final Skill skill;
    private final CoolTime coolTime = new CoolTime();

    public Player(String name, int hp, int atk, int def, Skill skill) {
        super(name, hp, atk, def);
        this.skill = skill;
    }

    public void startTurn(Character target, int code){
        coolTime.deduct();
        buffs.deductDuration();

        if(code == 0){
            attack(target);
        }else if (code == 1){
            activatePlayerSkill();
        }else if (code == 2){
            activateWeaponSkill();
        }else {
            activateArmorSkill();
        }
    }

    @Override
    public void attack(Character target) {
        int damage = calAttackDamage();
        weapon.attack();
        if(!buffs.isEmpty()){
            System.out.println(buffs);
        }

        target.takeDamage(damage);
    }

    @Override
    public void takeDamage(int damage) {
        damage = calTakeDamage(damage);
        damage = Math.max(damage, 0);
        System.out.println(name + " " + damage + " 데미지를 받았습니다.");
        this.currentHp -= damage;
        this.currentHp = Math.max(this.currentHp, 0);
    }

    public void activatePlayerSkill(){
        if(coolTime.usedPlayerSkill()) {
            System.out.println("이미 스킬을 사용했습니다.");
            return;
        }

        BuffEffect buffEffect = skill.activate();
        coolTime.applyPlayer(true);
        buffs.add(buffEffect);
    }

    public void activateArmorSkill(){
        if(!coolTime.isArmorReady()){
            System.out.println("쿨타임 입니다.");
            return;
        }

        BuffEffect buffEffect = armor.activateSkill();
        coolTime.applyArmor(armor.getCoolTime());
        buffs.add(buffEffect);
    }

    public void activateWeaponSkill(){
        if(!coolTime.isWeaponReady()){
            System.out.println("쿨타임 입니다.");
            return;
        }

        BuffEffect buffEffect = weapon.activateSkill();
        coolTime.applyWeapon(weapon.getCoolTime());
        buffs.add(buffEffect);
    }

    private int calTakeDamage(int damage) {
        damage = damage - def;
        if(!buffs.isEmpty()) damage = buffs.calBuffDefWeight(damage);
        damage = armor.calDefWeight(damage);
        return Math.max(damage, 0);
    }

    private int calAttackDamage() {
        Random random = new Random();
        int damage = random.nextInt((int) (atk*0.5), (int) (atk*1.5));
        damage = buffs.calBuffAtkWeight(damage);
        damage = weapon.calAtkWeight(damage);
        return damage;
    }

    public void addExperience(int exp) {
        experience += exp;
        if (experience > 100) {
            levelUp();
            experience = 100 - experience;
        }
    }

    private void levelUp(){
        System.out.println("축하합니다! level " + level + "달성");
        level++;
        this.atk += 10;
        this.def += 10;
    }

    public void chargeHP(int i) {
        System.out.println("체력을 " + i + "만큼 회복했습니다.");
        super.currentHp += i;
        if (super.currentHp > 100) super.currentHp = 100;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public void equip(Equipment equipment) {
        if(equipment instanceof Weapon equip) setWeapon(equip);
        if(equipment instanceof Armor equip) setArmor(equip);
    }
}
