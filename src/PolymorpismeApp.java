public class PolymorpismeApp {
    public static void main(String[] args) {
        Employee employee = new Employee("irfan");
        employee.sayHalo("budi");

        employee = new Manager("irfan");
        employee.sayHalo("budi");

        employee = new VicePresident("Irfan");
        employee.sayHalo("budi");

        sayHello(new Employee("budi"));
        sayHello(new Manager("kaka"));
        sayHello(new VicePresident("mama"));
    }

    static void sayHello(Employee employee){
        if (employee instanceof VicePresident){
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("hello VP " + vicePresident.name);
        }else if(employee instanceof Manager){
            Manager manager = (Manager) employee;
            System.out.println("hello Manager " +manager.name);
        }else {
            System.out.println("hello " + employee.name);
        }
    }
}
