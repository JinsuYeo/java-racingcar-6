package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class RacingCars {

    private static final int START_NUM = 0;
    private static final int END_NUM = 9;

    private List<RacingCar> racingCars;

    public RacingCars(String[] carNames) {
        racingCars = new ArrayList<>();

        for (String carName : carNames) {
            racingCars.add(new RacingCar(carName));
        }
    }

    public void moveCars() {
        List<Result> results = new ArrayList<>();

        for (RacingCar racingCar : racingCars) {
            racingCar.move(Randoms.pickNumberInRange(START_NUM, END_NUM));
            results.add(racingCar.makeResult());
        }

        for (Result result : results) {
            System.out.println(result);
        }
        System.out.println();
    }
}
