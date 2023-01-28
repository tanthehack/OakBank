import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadData {
    public String accNo;
    public String pin;

    public String currentBal;

    public String savingsBal;

    public void read() throws Exception {
        java.io.File file = new java.io.File("src/data.txt");
        Scanner input = new Scanner(file);

        while(input.hasNext()){
            accNo = input.next();
            pin = input.next();
            currentBal = input.next();
            savingsBal = input.next();
        }

        input.close();

    }
}
