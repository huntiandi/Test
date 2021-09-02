package java.oop;

/**
 * @ProjectName: WorkSpace
 * @author: ZhangBiBo
 * @description:
 * @data: 2021/9/2 14:59
 */
public class Salary extends Employee {
    private double salary;
    public Salary(String name, String address, int number) {
        super(name, address, number);
    }

    public void mailCheck()
    {
        System.out.println("Within mailCheck of Salary class ");
        System.out.println("Mailing check to " + getName()
                + " with salary " + salary);
    }
    public double getSalary()
    {
        return salary;
    }
    public void setSalary(double newSalary)
    {
        if(newSalary >= 0.0)
        {
            salary = newSalary;
        }
    }

}
