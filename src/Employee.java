public class Employee {
    String name;

    Employee(String name){
        this.name = name;
    }

    void sayHalo(String name){
        System.out.println("Haloo "+name + ",My Name Is Employee "+this.name);
    }
}
