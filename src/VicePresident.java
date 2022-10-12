class VicePresident extends Manager {

    // jika ada Constractor harus dimasukan parameternya salah satu
    VicePresident(String name){
        super(name);
    }

    void sayHalo(String name){
        System.out.println("Haloo "+name + ",My Name Is Vp "+this.name);
    }
}
