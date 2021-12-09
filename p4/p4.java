package p4;

import javax.swing.*;

public class p4 {
    public static void  main (String[] args)
    {
        RacingCar rccar1;
        rccar1 = new RacingCar();
        rccar1.setCar(1234, 20.5);
        rccar1.setCourse(5);


    }
}

class Car {
    private int num;
    private double gas;

    public Car() {
        num = 0;
        gas = 0.0;
        System.out.println("��鈭���");
    }

    public void setCar(int n, double g)
    {
        num = n;
        gas = g;
        System.out.println("撠��身�"+num+",瘙賣硃��"+gas);
    }

    public void show()
    {
        System.out.println("頠�" + num);
        System.out.println("瘙賣硃��"+gas);
    }

}

class RacingCar extends Car{
    private int course;
    public  RacingCar()
    {
        course = 0;
        System.out.println("��鈭魚頠�");
    }


    public void setCourse(int c){
        course = c;
        System.out.println("撠魚頠楊��身�"+course);
    }

}