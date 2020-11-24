package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        //Ввод с клавы
        Scanner sc =  new Scanner(System.in);
        String privet1 = null;
        privet1 = sc.nextLine();


        //Пишем ввод в файл
        FileWriter fw = new FileWriter("textfiletest.txt");
        fw.write(privet1);
        fw.close();

        //Читаем с клавы файл
        FileReader fr = new FileReader("textfiletest.txt");
        sc = new Scanner(fr);
        while (sc.hasNextLine())
            System.out.println(sc.nextLine());
        sc.close();
        fr.close();

        //Вводим новую информацию, записываем в файл
        sc = new Scanner(System.in);
        String privet2 = sc.nextLine();
        sc.close();

        fw = new FileWriter("textfiletest.txt");
        fw.write(privet2);
        fw.close();

        //читаем с файла
        fr = new FileReader("textfiletest.txt");
        sc = new Scanner(fr);
        while (sc.hasNextLine())
            System.out.println(sc.nextLine());
        System.out.println("\n");
        fr.close();
        sc.close();

        //Добавляем информацию в конец файла, читаем с файла
        fw = new FileWriter("textfiletest.txt", true);
        fw.append(" 12345");
        fw.close();

        fr = new FileReader("textfiletest.txt");
        sc = new Scanner(fr);
        while (sc.hasNextLine())
            System.out.println(sc.nextLine());
        fr.close();
        sc.close();
    }
}
