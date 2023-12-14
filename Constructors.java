public class Constructors {
    public static void main(String[] args) {
        
    
    Student s1= new Student("Sumit");
    System.out.println(s1.name);
    backAcc b1= new backAcc();
    b1.setPassword("Sumit54323#$@!");
   System.out.println(b1.getPassword());
}}
class backAcc{
    private String password;
    void setPassword(String newpwd){
        this.password=newpwd;
    }
    String  getPassword(){
        return password;
    }
}
class Student{
    String name;
    int roll;
    Student(String name){
        this.name=name;
    }
}