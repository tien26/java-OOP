class Person {
    String name;
    String address;
    final String country = "Indonesia";

    Person(String name, String paramAddress){
        this.name = name;
        this.address = paramAddress;
    }
    
    Person(String name){
        this(name, null);
    }
    
    Person(){
        this(null);
    }

    void sayHello(String name){
        System.out.println("Haloo "+ name + ", My Name Is " +this.name);
    }
}
