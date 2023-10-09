package Day13.Upcasting ;



class Animal{
    void animalNoise(Animal obj){
        System.out.println("Animal Voice") ;
    } 
}

class Dog extends Animal{
    void animalNoise(Animal obj){
        System.out.println("Woof Woof") ;
    }
}

class Cat extends Animal{
    void animalNoise(Animal obj){
        System.out.println("Meow") ;
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Cat() ;                //Achieving upcasting
        animal.animalNoise(animal) ;
        animal = new Dog() ;
        animal.animalNoise(animal) ;
        
    }
}
