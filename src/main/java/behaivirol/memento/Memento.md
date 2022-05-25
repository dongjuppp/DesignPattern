메멘토 패턴
==

1. 캡슐화를 유지하면서 객체 내부 상태를 외부에 저장하는 방법
2. 객체 상태를 외부에 저장했다가 해당 상태로 다시 복구할 수 있다


상태를 저장할 클래스는 변경불가한 속성(immutable)을 가져야 한다

<br>

```java
public final class GameSave {

    private final int score;

    public GameSave(int score){
        this.score = score;
    }


    public int getScore(){
        return score;
    }
}
```

<br>
저장의 대상이 되는 것이 Memento를 내부에서 생성하여 반환한다.

```java
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
```

<br> 

실제 사용 클라이언트 부분 

```java
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
```