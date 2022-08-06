package autometiontest;

public class Variable_Q2 {

    int id;
    String name;

    public Variable_Q2 (int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void display () {

        System.out.println (id + " - "+ name );

    }

    public static void main (String [] args) {
        Variable_Q2 obj1 = new Variable_Q2(101, "Dhawal");
        Variable_Q2 obj2 = new Variable_Q2(102, "Codebuster");
       obj1.display();
       obj2.display();

    }



}
