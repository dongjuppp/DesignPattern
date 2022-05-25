package behaivirol.memento;

public class Game {

    private int score;

    public int getScore(){
        return this.score;
    }

    public void setScore(int score){
        this.score = score;
    }


    public GameSave save(){
        return new GameSave(this.score);
    }


}
