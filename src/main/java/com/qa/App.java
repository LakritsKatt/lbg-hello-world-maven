package com.qa;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(sayHello());
        System.out.println(sayHelloToSomeone("Sven"));
        System.out.println(sayHelloToSomeone("Nisse"));
        System.out.println(sayHelloToSomeone("Ola"));
        System.out.println(sayHelloToSomeone("Andreas"));
        System.out.println(sayHelloToSomeone("Faenia"));
        System.out.println(sayGoodbye());
    }

    public static String sayHello(){
        return "Hello World!";
    }

    public static String sayGoodbye(){
        return "Goodbye World!";
    }

    public static String sayHelloToSomeone(String name){
        return "Hello " + name ;
    }
}
