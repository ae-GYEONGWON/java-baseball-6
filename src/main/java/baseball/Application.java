package baseball;


import java.util.List;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        Player player = new Player();
        System.out.println("숫자를 입력하시오");
        player.setPlayerNumbers();
        System.out.println(player.getPlayerNumbers());
    }
}
