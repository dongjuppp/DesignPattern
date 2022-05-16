package struct.proxy;

public class Client {

    public static void main(String[] args) {
        GameService gameService = new GameServiceProxy(new OriginGameService());

        gameService.startGame();
    }
}
