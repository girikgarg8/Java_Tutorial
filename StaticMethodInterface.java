interface abc {
    int i = 0;

    void display();

    static void show() {
        System.out.println(" Hi ");
    }
}

class ABC implements abc {
    public void display() {
        System.out.println("In ABC");
    }

    ABC() {
        // i=9;
    }
}

public class StaticMethodInterface {
    public static void main(String[] args) {
        abc.show(); // in order to call this interface function, I don't need to create an object
    }
}
