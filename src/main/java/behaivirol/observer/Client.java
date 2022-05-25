package behaivirol.observer;

public class Client {

    public static void main(String[] args) {
        User taeyeon = new User("태연");
        User yoona = new User("윤아");
        User suzy = new User("수지");
        User iu = new User("아이유");

        ChatServer chatServer = new ChatServer();

        chatServer.subscript("방송",taeyeon);
        chatServer.subscript("방송",yoona);
        chatServer.subscript("방송",suzy);
        chatServer.subscript("방송",iu);

        chatServer.sendMessage(taeyeon, "방송", "안녕!");
    }
}
