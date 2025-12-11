package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    private static List<Message> messages = new ArrayList<>();

    public static void setMessage(User u1, User u2, String text) {
        messages.add(new Message(u1, u2, text));
    }

    public static List<Message> getMessages() {
        return messages;
    }

    public static void showDialog(User u1, User u2) {
        for (Message message : messages) {
            if ((message.getSender().getUserName().equals(u1.getUserName()) &&
                    message.getReceiver().getUserName().equals(u2.getUserName())) ||
                    (message.getSender().getUserName().equals(u2.getUserName()) &&
                            message.getReceiver().getUserName().equals(u1.getUserName()))) {
                System.out.println(message.getSender() + ":" + message.getText());
            }
        }

    }
}
