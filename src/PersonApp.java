public class PersonApp {
    public static void main(String[] args) {
        var person1 = new Person("Irfan Martien","Ciawi");
        // person1.country = "Amerika"; Error Karena final

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("Budi");
        
        // Pemanggilan Object
        
        Person person2 = new Person("Ayah");
        person2.sayHello("Bubu");

        Person person3;
        person3 = new Person();
        person3.name = "sayang";
        person3.sayHello("baku");

    }
}
