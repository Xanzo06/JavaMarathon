package day13;

public class Test {
    public static void main(String[] args) {
        User user1 = new User("Боря");
        User user2 = new User("Вася");
        User user3 = new User("Саша");

        user1.sendMessage(user2, "Привет");
        user1.sendMessage(user2, "Как дела?");

        user2.sendMessage(user1, "Привет");
        user2.sendMessage(user1, "Отлично, твои как?");
        user2.sendMessage(user1, "Новая фотка класс!");

        user3.sendMessage(user1, "Привет");
        user3.sendMessage(user1, "Как дела?");
        user3.sendMessage(user1, "Идёшь сегодня на футбол?");

        user1.sendMessage(user3, "Конечно иду!");
        user1.sendMessage(user3, "Во сколько встречаемся?");
        user1.sendMessage(user3, "Не забудь взять форму!");
        user3.sendMessage(user1, "В 18:00, возьму!");

        MessageDatabase.showDialog(user1, user3);


    }
}
