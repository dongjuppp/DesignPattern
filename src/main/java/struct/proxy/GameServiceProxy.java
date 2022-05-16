package struct.proxy;

public class GameServiceProxy implements GameService {

    private GameService gameService;

    public GameServiceProxy(GameService gameService) {
        this.gameService = gameService;
    }

    public void startGame() {
        System.out.println("LOG");
        gameService.startGame();
        System.out.println("LOG END");
    }
}
