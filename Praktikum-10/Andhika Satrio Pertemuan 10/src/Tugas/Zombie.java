/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tugas;

/**
 *
 * @author Andhika
 */
abstract public class Zombie implements IDestroyable{
    protected int health, level;
    
    abstract public void heal();
    @Override
    abstract public void destroyed();
    public String getZombieInfo() {
        return "Health = " + this.health + "\n"
        + "Level = " + this.level + "\n";
    };
}

