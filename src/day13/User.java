package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String userName;
    private List<User> subscriptions;

    public User(String userName) {
        this.userName = userName;
        this.subscriptions = new ArrayList<>();
    }

    public String getUserName() {
        return userName;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void subscribe(User user) {
        subscriptions.add(user);


    }

    public boolean inSubscribed(User user) {
        for (User user1 : subscriptions) {
            if (user1.getUserName().equals(user.getUserName()))
                return true;
        }
        return false;
    }


    public boolean isFriend(User user) {
      return this.inSubscribed(user) && user.inSubscribed(this);


    }

    public void sendMessage(User user, String text) {
        MessageDatabase.setMessage(this, user, text);

    }

    @Override
    public String toString() {
        return userName;
    }
}
