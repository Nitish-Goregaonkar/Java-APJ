package Networking;
import java.io.*;
import java.net.*;
public class URLManipulation {
    public static void main(String[] args) {
        try {
            URL u = new URL("https://www.geeksforgeeks.org/computer-network-tutorials/");
            System.out.println(u.getProtocol());
            System.out.println(u.getHost());
            System.out.println(u.getPort());
            System.out.println(u.getFile());
        }
        catch(Exception e){

        }
    }
}
