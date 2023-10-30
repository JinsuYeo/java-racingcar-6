package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class RacingCar {

    private static final int STANDARD = 4;

    private String name;
    private int advance;

    public RacingCar(String carName) {
        name = carName;
        advance = 0;
    }

    public boolean canMove(int moveNum) {
        return moveNum >= STANDARD;
    }

    public void move(int moveNum) {
        if (canMove(moveNum)) {
            advance++;
        }
    }

    public String makeResult() {
        return "-".repeat(advance);
    }

    public String reportResult() {
        return name + " : " + makeResult();
    }
}
