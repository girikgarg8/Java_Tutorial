class emp{
    int eid;
    int salary;
    static String ceo; //making ceo not object specific, it will be same for all objects
    static{
        ceo="Henry";
        System.out.println("In static ");
    }
    public emp(){
        System.out.println("In constructor ");
    }
    public void show(){
        System.out.println(eid + " : "+ salary+ " : "+ ceo );
    }
}
public class StaticDemo {
    int i=0;
    public static void main(String[] args) {
        emp navin=new emp();
        navin.eid=8;
        navin.salary=4000;
        
        emp abhi=new emp();
        abhi.eid=10;
        abhi.salary=10022;
        // abhi.ceo="Mahesh";

        // navin.ceo = "Nikhil";
        // emp.ceo="Henry";
        navin.show();
        abhi.show();
    }
}
