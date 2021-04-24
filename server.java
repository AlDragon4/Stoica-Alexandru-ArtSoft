import java.net.*;
import java.io.*;


public class server{
    public static void main(String[] args) throws IOException{
        ServerSocket ss = new ServerSocket(4999);
        Socket s = ss.accept();

        System.out.println("client conected");
        boolean system1 = true;

        if(system1)
            {
                System.out.println("Waiting");
            }
    }

}