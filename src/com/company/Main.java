package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int count = 0;

        while (count <= 10)
        {
            sayHelloWorld();
            count++;
        }
    }

    private static void sayHelloWorld()
    {
        System.out.println("Hello, world!");
    }
}
