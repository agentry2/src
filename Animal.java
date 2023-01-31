public class Animal {

    int age;
    String gender;
        
    public void isMammal() { 
        System.out.println("This is a public method run() from class Animal");
    }

    public void mate() {
            
    }
    public static void main(String[] args) throws Exception {
        
    }
    
    Zebra myZebra;
    Animal myAnimal;
    Fish myFish;

}

class Fish extends Animal {
    private int sizeInFeet;

    private void canEat() {
        System.out.println("This is a private method canEat() from subclass Fish");
    }
}

class Zebra extends Animal {
    public boolean is_wild;

    public void run() {
        System.out.println("This is a public method run() from subclass Zebra");
    }
}