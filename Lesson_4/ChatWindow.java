package Lesson_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChatWindow extends JFrame {
    private JTextField messageInput;
    private JTextArea messageOutput;

    public ChatWindow() {
        setTitle("Chat Window");
        setBounds(400, 400, 500, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        messageOutput = new JTextArea();
        messageInput = new JTextField("Enter your message");
        messageOutput.setEditable(false);
        messageOutput.setLineWrap(true);

        messageOutput.setRows(10);
        messageOutput.setWrapStyleWord(true);

        JPanel bottomPanel = new JPanel(new BorderLayout());
        add(bottomPanel, BorderLayout.SOUTH);
        JButton sendMessage = new JButton("SEND");
        bottomPanel.add(sendMessage, BorderLayout.EAST);


        JScrollPane jScrollPane = new JScrollPane(messageOutput);
        add(jScrollPane, BorderLayout.CENTER);

        bottomPanel.add(messageInput, BorderLayout.CENTER);

        sendMessage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                if ((!messageInput.getText().trim().isEmpty())) ;
                messageOutput.append(String.format("> %s\n", messageInput.getText()));
                messageInput.setText(" ");
                messageInput.grabFocus();
            }
        });
        add(messageOutput);

        messageInput.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                while ((!messageInput.getText().trim().isEmpty())) {
                    messageOutput.append(String.format("> %s\n", messageInput.getText()));
                    messageInput.setText(" ");
                    messageInput.grabFocus();

                }
            }
        });
        add(messageOutput);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ChatWindow();
    }
}
