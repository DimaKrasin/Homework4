package com.goit.homework;

import java.util.Scanner;

public class Homework4 {

    public static void main(String[] args) {
        general();
    }

    public static void general(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите номер метода корый хотите использовать(от 1 до 4): ");
        int choise = sc.nextInt();

        switch(choise){
            case 1:
                System.out.println("Введите x :");
                double x = sc.nextDouble();
                System.out.println(tox(x));
                System.out.println("\n Введите 1 если хотите продолжить \n Введите любое число чтобы закончить");
                double restart = sc.nextDouble();
                if (restart == 1) general();
                break;
            case 2:
                System.out.println("Введите ширину :");
                double h = sc.nextDouble();

                System.out.println("Введите высоту :");
                double w = sc.nextDouble();

                System.out.println(drawRectangle(w,h));
                System.out.println("\n Введите 1 если хотите продолжить \n Введите любое число чтобы закончить");
                restart = sc.nextDouble();
                if (restart == 1) general();
                break;
            case 3:
                System.out.println("Введите сторону :");
                double d = sc.nextDouble();
                drawRectangle(d);
                System.out.println("\n Введите 1 если хотите продолжить \n Введите любое число чтобы закончить");
                restart = sc.nextDouble();
                if (restart == 1) general();
                break;
            case 4:
                System.out.println("Введите первое число :");
                double a = sc.nextDouble();
                System.out.println("Введите второе число :");
                double b = sc.nextDouble();
                System.out.println(getMax(a,b));

                System.out.println("\n Введите 1 если хотите продолжить \n Введите любое число чтобы закончить");
                restart = sc.nextDouble();
                if (restart == 1) general();
                break;
            default:System.out.println("Вы ввели недопустимое число!");
        }
    }

    public static String tox (double d){
        if (d == 1) return "1.0";
        return tox(d-1) + " " + d;
    }

    public static String drawRectangle(double w,double h){
        if (w==1) return "\n"+drawRectangle2(h);
        return drawRectangle (w-1,h)+"\n"+drawRectangle2(h);
    }

    public static void drawRectangle(double w){
        for(int i =0;i<w;i++){
            System.out.print("\n");
            for(int d = 0;d<w;d++){
                System.out.print("+");
            }
        }
    }

    public static String drawRectangle2(double h){
        if (h==1) return "+";
        return drawRectangle2 (h-1)+"+";
    }

    public static double getMax(double a,double b){
        if(a>b)return a;
        if(a<b)return b;
        return a;
    }
}
