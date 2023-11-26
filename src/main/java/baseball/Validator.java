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

    public boolean isThreeNumber(List<Integer> listData) {
        return listData.size() != 3;
    }
}
