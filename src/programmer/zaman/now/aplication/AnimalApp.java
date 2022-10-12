package programmer.zaman.now.aplication;

import programmer.zaman.now.annotation.Fancy;
import programmer.zaman.now.data.Animal;
import programmer.zaman.now.data.Cat;

@Fancy(name = "aku", tags = {"java","html"})
public class AnimalApp {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.name = "Puss";
        animal.run();
    }
}
