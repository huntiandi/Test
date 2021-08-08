import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        System.out.println("gfdgfd");
        test2 ttttt = new test2();
        ttttt.main2();
        Dog dog = new Dog("bibo");
        System.out.println(dog.getName());
        dog.setName("james");
        System.out.println(dog.getName());
        String clazz = Dog.clazz;
        System.out.println(clazz);

    }

}

class test2 {
    public void main2() {
        System.out.println("gfdgfd");
    }

}
