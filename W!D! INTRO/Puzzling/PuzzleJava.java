import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava {

    public ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> randomRolls = new ArrayList<Integer>();
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            int roll = rand.nextInt(20) + 1; // Generates a random number between 1 and 20 inclusive
            randomRolls.add(roll);
        }

        return randomRolls;
    }

    public char getRandomLetter() {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        Random rand = new Random();
        int index = rand.nextInt(26); // Generates a random index between 0 and 25
        return alphabet[index];
    }

    public String generatePassword() {
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            password.append(getRandomLetter()); // Append 8 random letters to the password
        }
        return password.toString();
    }

    public ArrayList<String> getNewPasswordSet(int length) {
        ArrayList<String> passwordSet = new ArrayList<String>();
        for (int i = 0; i < length; i++) {
            passwordSet.add(generatePassword()); // Add a random password to the set 'length' times
        }
        return passwordSet;
    }

    public void shuffleArray(int[] arr) {
        Random rand = new Random();
        int n = arr.length;
        for (int i = n - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            // Swap arr[i] and arr[j]
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
