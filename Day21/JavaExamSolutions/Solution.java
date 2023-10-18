package Day21.JavaExamSolutions;

import java.io.*;
import java.util.*; 

abstract class Vehicle  implements Comparable{
    int wheels ;
    int speed ;
    abstract void print() ;
}

class Car extends Vehicle {
    int passengerCount ;
    Car(int wheels ,int speed ,int passengerCount){
        this.speed = speed ;
        this.wheels = wheels ;
        this.passengerCount = passengerCount ;
    }
    void print(){
        System.out.println(passengerCount) ;
    } 
    public int compareTo(Object obj){
        Vehicle v = (Vehicle)obj ;
        return this.speed - v.speed ;
    }
}

class Truck extends Vehicle{
    int loadLimit ;
    Truck(int wheels ,int speed ,int loadLimit){
        this.speed = speed ;
        this.wheels = wheels ;
        this.loadLimit = loadLimit ;
    }
    void print(){
        System.out.println(loadLimit) ;
    } 
    public int compareTo(Object obj){
        Vehicle v = (Vehicle)obj ;
        return this.speed - v.speed ;
    }
    
}


public class Solution {
    public static void display(Vehicle arr[]){
        for(Vehicle v : arr){
            if(v instanceof Truck){
                System.out.print(v.speed +" "+ v.wheels + " " ) ;
            }else{
                System.out.print(v.speed +" "+ v.wheels + " " ) ;
            }
            System.out.print(v.speed +" "+ v.wheels + " " ) ;
        }
    }
    
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner scn = new Scanner(System.in) ;
        int n = scn.nextInt() ;
        Vehicle veh[] = new Vehicle[n] ;
        for(int i = 0 ; i < n ; i++){
            int type = scn.nextInt() ;
            if(type == 1){
                int wheels = scn.nextInt() ;
                int speed = scn.nextInt() ;
                int passenegers = scn.nextInt() ;
               veh[i] = new Car(wheels,speed,passenegers) ;
            }else{
                int wheels = scn.nextInt() ;
                int speed = scn.nextInt() ;
                int loadLimit = scn.nextInt() ;
               veh[i] = new Truck(wheels,speed,loadLimit) ; 
            }
            display(veh) ;
        }
        
    }
}
