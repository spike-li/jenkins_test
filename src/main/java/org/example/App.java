package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException {
        for (int i = 0; i < 20; i++) {
            Thread.sleep(1000);
            System.out.println("lxt-"+i);
        }
    }
}
