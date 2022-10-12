package programmer.zaman.now.aplication;

import programmer.zaman.now.data.HelloWorld;

public class HelloWorldApp {
    public static void main(String[] args) {
        HelloWorld english = new HelloWorld() {
            public void sayHello() {
                System.out.println("hello");

            }

            public void sayHello(String name) {
                System.out.println("hello " + name);
            }
        };

        HelloWorld indonesia = new HelloWorld() {
            public void sayHello() {
                System.out.println("halo");

            }

            public void sayHello(String name) {
                System.out.println("halo" + name);
            }
        };

        english.sayHello();
        indonesia.sayHello("aku");
    }
}
