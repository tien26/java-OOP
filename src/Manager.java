class Manager extends Employee{

    Manager(String name){
        super(name);
    }

    void sayHalo(String name){
        System.out.println("Haloo "+name + ",My Name Is Manager "+this.name);
    }

}