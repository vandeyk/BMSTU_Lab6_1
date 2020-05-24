package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Init
        ArrayList<Integer> polynom1 = new ArrayList<Integer>();
        ArrayList<Integer> polynom2 = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        // In
        System.out.println("Enter the degree:");
        int deg = scan.nextInt();
        System.out.println("Enter the first polynomial:");
        for (int i = 0; i < deg + 1; i++) {
            int buf = scan.nextInt();
            polynom1.add(buf);
        }
        System.out.println("Enter the second polynomial:");
        for (int i = 0; i < deg + 1; i++) {
            int buf = scan.nextInt();
            polynom2.add(buf);
        }
        //Вывод многочленов
        System.out.println("Multiplying polynomials:");
        int deg_ = deg;
        for (int i = 0; i < deg + 1; i++) {
            if (i > 0 && polynom1.get(i) > 0) System.out.print("+");
            if (polynom1.get(i) == -1) System.out.print("-");
            if ((polynom1.get(i) == 1 || polynom1.get(i) == -1) && deg_ == 0) System.out.print("1");
            if (polynom1.get(i) != 0 && polynom1.get(i) != 1 && polynom1.get(i) != -1) System.out.print(polynom1.get(i));
            if (deg_ > 0 && polynom1.get(i) != 0) System.out.print("x");
            if (deg_ > 1 && polynom1.get(i) != 0) System.out.print("^" + deg_);
            deg_ --;
        }
        System.out.println();
        System.out.println("*");
        deg_ = deg;
        for (int i = 0; i < deg + 1; i++) {
            if (i > 0 && polynom2.get(i) > 0) System.out.print("+");
            if (polynom2.get(i) == -1) System.out.print("-");
            if ((polynom2.get(i) == 1 || polynom2.get(i) == -1) && deg_ == 0) System.out.print("1");
            if (polynom2.get(i) != 0 && polynom2.get(i) != 1 && polynom2.get(i) != -1) System.out.print(polynom2.get(i));
            if (deg_ > 0 && polynom2.get(i) != 0) System.out.print("x");
            if (deg_ > 1 && polynom2.get(i) != 0) System.out.print("^" + deg_);
            deg_ --;
        }
        System.out.println();
        System.out.println("=");
        //Умножаем
        for (int i = 0; i < deg + 1; i++) {
            for (int j = 0; j < deg + 1; j++) {
                int buf = polynom1.get(i) * polynom2.get(j); //Коэффициент
                int buf_ = (deg-i)+(deg-j); //Степень
                //System.out.print(buf + ":" + buf_ + "  ");
                if ((i > 0 || j > 0) && buf > 0) System.out.print("+");
                if (buf > 1) {
                    System.out.print(buf);
                    if (buf > 0 && buf_ > 0) System.out.print("x");
                    if (buf_ > 1) System.out.print("^" + buf_);
                }
            }
        }
        //
    }
}
