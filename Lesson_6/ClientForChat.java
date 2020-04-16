package Lesson_6;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientForChat {
    private static Socket clientSocket;
    private static BufferedReader reader;

    private static BufferedReader in;
    private static BufferedWriter out;

    public static void main(String[] args) throws IOException {
        try {
            try {

                clientSocket = new Socket("localhost", 8181);
                reader = new BufferedReader(new InputStreamReader(System.in));
                while (true) {
                    in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                    out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
                    System.out.println("Enter your message: ");
                    String word = reader.readLine();
                    out.write(word + "\n");
                    out.flush();
                    String serverWord = in.readLine();
                    System.out.println(serverWord);
                    if (word.equals("/end")) {
                        System.out.println("Client disconnected...");
                        clientSocket.close();
                        in.close();
                        out.close();
                    }
                }

                } catch(IOException e){
                    System.err.println(e);
                }
            } finally {
            clientSocket.close();
            in.close();
            out.close();
            }
        }
    }






