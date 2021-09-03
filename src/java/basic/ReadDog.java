package basic;

import basic.Dog;

public class ReadDog extends Dog {


    public ReadDog(String empname) {
        super(empname);
    }

    @Override
    public void eat() {
        System.out.println("readDog"+"eat foods");
    }
}
