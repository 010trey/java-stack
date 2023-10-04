import java.util.ArrayList;

public class TestPuzzleJava {

    public static void main(String[] args) {
        PuzzleJava generator = new PuzzleJava();

        // Test getTenRolls
        ArrayList<Integer> randomRolls = generator.getTenRolls();
        System.out.println("Ten random rolls between 1 and 20 inclusive: " + randomRolls);

        // Test getRandomLetter
        char randomLetter = generator.getRandomLetter();
        System.out.println("Random letter: " + randomLetter);

        // Test generatePassword
        String password = generator.generatePassword();
        System.out.println("Generated password: " + password);

        // Test getNewPasswordSet
        ArrayList<String> passwordSet = generator.getNewPasswordSet(5);
        System.out.println("Generated password set: " + passwordSet);

        // Test shuffleArray (Sensei Bonus)
        int[] arr = { 1, 2, 3, 4, 5 };
        generator.shuffleArray(arr);
        System.out.println("Shuffled array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
