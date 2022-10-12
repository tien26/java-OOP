package programmer.zaman.now.aplication;

import static programmer.zaman.now.data.Aplication.PROCESSORS;
import static programmer.zaman.now.data.Constans.*;
import programmer.zaman.now.data.Country;
import programmer.zaman.now.util.MathUtil;

public class StacticApp {
    public static void main(String[] args) {
        System.out.println(APLICATION);
        System.out.println(VERSION);

        System.out.println(
                MathUtil.sum(1,1,1,1,1)
        );

        Country.City city = new Country.City();
        city.setName("subang");

        System.out.println(city.getName());

        System.out.println(PROCESSORS);
    }
}
