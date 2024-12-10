package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        HealthStation childrensHospital = new HealthStation();

        Person ethan = new Person("Ethan", 1, 7, 110);
        Person peter = new Person("Peter", 33, 85, 176);
    
        System.out.println("weighings performed: " + childrensHospital.weighings());

        childrensHospital.weigh(ethan);
        childrensHospital.weigh(peter);
    
        System.out.println("weighings performed: " + childrensHospital.weighings());
    
        childrensHospital.weigh(ethan);
        childrensHospital.weigh(ethan);
        childrensHospital.weigh(ethan);
        childrensHospital.weigh(ethan);
    
        System.out.println("weighings performed: " + childrensHospital.weighings());
    }
}