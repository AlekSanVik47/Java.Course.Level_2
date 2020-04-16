package Lesson_6;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerForChat {
    private static Socket clientSocket;
    private static ServerSocket server;
    private static BufferedReader in;
    private static BufferedWriter out;

    public static void main(String[] args) {
        try {
            try {
                server = new ServerSocket(8181);
                System.out.println("Server is running!");
                clientSocket = server.accept();
                try {
                    in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                    out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
                    String word = in.readLine();
                    System.out.println(word);
                    out.write("Server response, you wrote : " + word + "\n");
                    out.flush();

                } finally {
                    clientSocket.close();
                    in.close();
                    out.close();
                }
            } finally {
                System.out.println("Server is down!");
                server.close();
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
