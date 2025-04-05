package Networking;
import java.io.*;
import java.net.*;

public class InetAdd {
    public static void main(String[] args) {
        try{
            InetAddress ip=InetAddress.getByName("www.geeksforgeeks.org");
            System.out.println("HostName:"+ip.getHostName());
            System.out.println("IP Address:"+ip.getHostAddress());
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
