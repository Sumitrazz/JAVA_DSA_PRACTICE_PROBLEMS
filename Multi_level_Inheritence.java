public class Multi_level_Inheritence {
    public static void main(String[] args) {
        Dog Puppy= new Dog();
        Puppy.eat();
    }
}
class Animal{
    String color;
    void eat(){
        System.out.println("eats..");
    }
    void breathe(){
        System.out.println("breathes");
    }
}
class Mummul extends Animal{
    int legs;
}
class Dog extends Mummul{
    String breed;
}