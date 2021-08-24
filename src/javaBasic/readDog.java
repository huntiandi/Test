package javaBasic;

public class readDog extends Dog{


    public readDog(String empname) {
        super(empname);
    }

    @Override
    public void eat() {
        System.out.println("readDog"+"eat foods");
    }
}
