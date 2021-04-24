import java.net.*;
import java.io.*;

import java.util.Scanner;
import java.time.*;


public class client{

    public static void login()
    {
        
        System.out.println("Introduceti numele");
        Scanner nm = new Scanner(System.in);
        String name = nm.nextLine();
        
        System.out.println("Introduceti parola");
        Scanner pr = new Scanner(System.in);
        String password = pr.nextLine();

        System.out.println("Nume: "+name);

        LocalTime time = LocalTime.now();
        System.out.println("Timp de logare: "+time);

    }
    public static void main(String[] args) throws IOException{
        Socket s = new Socket("localhost", 4999);
        login();
    }
}
