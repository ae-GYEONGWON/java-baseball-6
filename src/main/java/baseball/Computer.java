package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    private List<Integer> computerNumbers;

    public Computer() {
        computerNumbers = new ArrayList<>();
    }

    public List<Integer> getComputerNumbers() {
        computerNumbers = Randoms.pickUniqueNumbersInRange(1, 9, 3);
        return computerNumbers;
    }
}