package behaivirol.memento;

public class Client {

    public static void main(String[] args) {
        Game game = new Game();

        game.setScore(100);

        GameSave savedGame = game.save();

        game.setScore(1);

        game.setScore(savedGame.getScore());

        System.out.println(game.getScore());
    }
}
