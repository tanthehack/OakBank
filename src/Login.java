import java.util.Arrays;
import java.util.Scanner;

public class Login {
    public boolean isPinCorrect(char[] input) {
        boolean isCorrect = true;
        ReadData data = new ReadData();
        try {
            data.read();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        char[] correctPassword = data.pin.toCharArray();

        if (input.length != correctPassword.length) {
            isCorrect = false;
        } else {
            isCorrect = Arrays.equals (input, correctPassword);
        }

        //Zero out the password.
        Arrays.fill(correctPassword,'0');
        return isCorrect;
    }
}
