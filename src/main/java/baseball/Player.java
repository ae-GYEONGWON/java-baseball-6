package baseball;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Integer> playerNumbers;
    private String playerNumbersString;

    public Player() {
        playerNumbers = new ArrayList<>();
    }

    public String readPlayerNumbers() {
        playerNumbersString = Console.readLine();
        return playerNumbersString;
    }

    public List<Integer> getPlayerNumbers() {
        for (char ch : playerNumbersString.toCharArray()) {
            playerNumbers.add(Character.getNumericValue(ch));
        }
        return playerNumbers;
    }
}
