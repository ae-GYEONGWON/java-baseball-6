package baseball;


import java.util.List;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        Player player = new Player();
        player.setPlayerNumbers();
        System.out.println(player.getPlayerNumbers());
    }
}
