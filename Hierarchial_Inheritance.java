public class Hierarchial_Inheritance {
    public static void main(String[] args) {
        Bird b= new Bird();
        b.eat();
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
void walk(){
    System.out.print("walks");
}
}
class Bird extends Animal{
    void fly(){
        System.out.println("fly");
    }
}