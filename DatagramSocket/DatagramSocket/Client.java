package Networking.DatagramSocket;
import java.io.*;
import java.net.*;
public class Client {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds=new DatagramSocket();
        byte[] sendData=new byte[1024];
        byte[] receiveData=new byte[1024];

        BufferedReader inFormUser=new BufferedReader(new InputStreamReader(System.in));
    InetAddress ipaddress=InetAddress.getByName("localhost");
    String sentence=inFormUser.readLine();
    sendData=sentence.getBytes();


        DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, ipaddress, 9876);
        ds.send(sendPacket);


        DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
        ds.receive(receivePacket);

        String modifiedSentence = new String(receivePacket.getData());

        System.out.println("FROM SERVER:" + modifiedSentence);

        ds.close();

    }
}



