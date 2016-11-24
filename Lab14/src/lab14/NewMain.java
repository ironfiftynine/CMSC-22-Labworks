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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Character c1 = new Queen();
        Character c2 = new King();
        Character c3 = new Troll();
        Character c4 = new Knight();
        
        c1.setWeaponBehavior(new BowAndArrowBehavior());
        c1.fight();
        
        c2.setWeaponBehavior(new KnifeBehavior());
        c2.fight();
        
        c3.setWeaponBehavior(new AxeBehavior());
        c3.fight();
        
        c4.setWeaponBehavior(new SwordBehavior());
        c4.fight();
        
        
        
    }
    
}
