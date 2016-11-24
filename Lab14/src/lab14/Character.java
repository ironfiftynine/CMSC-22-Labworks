/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab14;

/**
 *
 * @author localuser
 */
public abstract class Character{

    private WeaponBehavior weapon;
    
    public void setWeaponBehavior(WeaponBehavior weapon){
        this.weapon = weapon;
    }
    
    public void fight(){
        weapon.useWeapon();
    }
    
    public abstract void display();

}