package baseball;


import java.util.List;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        Computer computer = new Computer();
        List<Integer> computerNumbers = computer.getComputerNumbers();
//        System.out.println(computerNumbers);
        Player player = new Player();
        player.readPlayerNumbers();
        System.out.println(player.getPlayerNumbers());
    }
}
