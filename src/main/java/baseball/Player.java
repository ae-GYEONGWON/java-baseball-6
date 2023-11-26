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

    private void convertStringToIntList() {
        for (char ch : playerNumbersString.toCharArray()) {
            playerNumbers.add(Character.getNumericValue(ch));
        }
    }

    public List<Integer> getPlayerNumbers() {
        return playerNumbers;
    }

    private boolean validatePlayerNumbers() {
        return is_Number();
    }

    private boolean is_Number() {
        try{
            Integer.parseInt(playerNumbersString);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


}
