package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.List;

public class Computer {
    private static List<Integer> computerNumbers;

    public List<Integer> getComputerNumbers() {
        computerNumbers = Randoms.pickUniqueNumbersInRange(1, 9, 3);
        return computerNumbers;
    }
}
