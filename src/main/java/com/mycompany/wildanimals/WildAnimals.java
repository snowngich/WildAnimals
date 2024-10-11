/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.wildanimals;

/**
 *
 * @author snow
 */
class Animals{
    public String movement(String x) {
        return x; 
                }
}

public class WildAnimals extends Animals {
    

    public static void main(String[] args) {
        WildAnimals Lion=new WildAnimals();
        WildAnimals Eagle=new WildAnimals();
        String x="walking and running";
        String y="walking and flying";
        System.out.println(Lion.movement(x));
        System.out.println(Eagle.movement(y));
    }
}
