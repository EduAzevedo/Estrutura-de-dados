

import java.util.Collections;
import java.util.Random;

public class CartelaSemRepeticao {
    private int numbers[][];
    private Random randomNumber = new Random();

    public CartelaSemRepeticao(int totalNum) {
        numbers = new int[totalNum][totalNum];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i][j] == 0) {
                    numbers[i][j] = verifyNumber(randomNumber.nextInt(59 + 1));
                } else {
                    numbers[i][j] = randomNumber.nextInt(59 + 1);
                }
            }
        }

    }

    private int verifyNumber(int tempNumber) {
        for (int column = 0; column < numbers.length; column++) {
            for (int line = 0; line < numbers.length; line++) {
                if (tempNumber == numbers[column][line]) {
                    return verifyNumber(randomNumber.nextInt(59 + 1));
                }
            }
        }
        return tempNumber;
    }

    public void showNumbers() {
        
        for (int i = 0; i < numbers.length; i++) {
            String line = "";
            for (int j = 0; j < numbers.length; j++) {
                line = line + " " + numbers[i][j];
            }
            System.out.println(line);

        }

    }
}
