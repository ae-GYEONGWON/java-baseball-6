package baseball;

import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Integer> playerNumbers;
    private String playerNumbersString;
    private Validator validator;

    public Player() {
        playerNumbers = new ArrayList<>();
        validator = new Validator();
    }

    private void readPlayerNumbers() {
        playerNumbersString = Console.readLine();
    }

    private void setPlayerNumbers() {
        do  {
            readPlayerNumbers();
            convertStringToIntList();
        } while (!validatePlayerNumbers());
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
        return validator.isNumber(playerNumbersString) && validator.isThreeNumber(playerNumbers);
    }
}
