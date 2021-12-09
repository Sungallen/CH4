package p25;

import javax.swing.*;

public class p25
{
    public static void  main (String[] args)
    {
        Car car1 = new Car();
        Car car2 = new Car();

        Car car3;
        car3 = car1;


        System.out.println("car1與car2相同"+ car1.equals(car2));
        System.out.println("car1與car3相同"+ car1.equals(car3));
    }
}

class Car {
    protected int num;
    protected double gas;

    public Car() {
        num = 0;
        gas = 0.0;
        System.out.println("生產了車子");
    }

    public void setCar(int n, double g)
    {
        num = n;
        gas = g;
        System.out.println("將車號設為"+num+",汽油量為"+gas);
    }

    public String toString()//此處複寫
    {
        String str = "車號"+ num + "，汽車量"+ gas;
        return str;
    }

}

class RacingCar extends Car{
    private int course;

    public  RacingCar()
    {
        course = 0;
        System.out.println("生產了賽車");
    }


    public void setCourse(int c){
        course = c;
        System.out.println("將賽車編號設為"+course);
    }

    public void show()
    {
        System.out.println("賽車的車號是" + num);
        System.out.println("汽油量是" + gas);
        System.out.println("賽車編號是" + course);
    }
}