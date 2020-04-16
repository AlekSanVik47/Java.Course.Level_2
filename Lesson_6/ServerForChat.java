package Lesson_6;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerForChat {
    private static Socket clientSocket;
    private static ServerSocket server;
    private static BufferedReader in;
    private static BufferedWriter out;
    private static BufferedReader reader;

    public static void main(String[] args) {
        try {
            try {
                server = new ServerSocket(8181);
                System.out.println("Server is running!");
                reader = new BufferedReader(new InputStreamReader(System.in));
                clientSocket = server.accept();
                try {
                    while (true) {
                        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                        out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
                        System.out.println("Enter your message to the client: ");
                        String word = in.readLine();
                        word = reader.readLine();
                        out.write(word + "\n");
                        out.flush();
                        System.out.println(word);
                            out.write("Server response, you wrote : " + word + "\n");
                            out.flush();
                        if (word.equals("/end")) {
                            System.out.println("Server is down!");
                            clientSocket.close();
                            in.close();
                            out.close();
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

            } catch (IOException ex) {
                ex.printStackTrace();
            } finally {
                    clientSocket.close();
                    in.close();
                    out.close();
                }
                server.close();

        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
