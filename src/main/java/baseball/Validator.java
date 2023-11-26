package baseball;

import java.util.List;

public class Validator {
    public boolean isNumber(String numberString) {
        try{
            Integer.parseInt(numberString);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public boolean isThreeNumberInList(List<Integer> Numbers) {
        return Numbers.size() == 3;
    }

    public boolean includeZero(List<Integer> Numbers) {
        for (int number : Numbers) {
            if (number == 0) {
                return true;
            }
        }
        return false;
    }
}
