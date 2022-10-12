package programmer.zaman.now.aplication;

import programmer.zaman.now.error.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {
        connectDatabase("aku","123");
        System.out.println("sukses");
    }

    public static void connectDatabase(String username,String password){
        if (username == null || password == null){
            throw  new DatabaseError("Tidak Connect Database");
        }
    }
}
