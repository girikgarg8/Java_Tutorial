class Student{
    private int rollno;
    private String name;

    //Getters and setters
    public void setRoll(int r){
        System.out.println("Value of roll number changed ");
         rollno=r;
    }
    public int getRollNo(){
        System.out.println("User is accessing roll number ");
        return rollno;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setRoll(2);
        //s1.rollno=2;
        //s1.name="Navin";
        System.out.println(s1.getRollNo());
    }
}
