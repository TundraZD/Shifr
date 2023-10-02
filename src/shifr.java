import java.util.Scanner;

public class shifr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the shift value (N): ");
        int shift = scanner.nextInt();
        scanner.nextLine(); // consume the newline character

        System.out.print("Enter the message to encrypt: ");
        String message = scanner.nextLine();

        String encryptedMessage = encryptMessage(message, shift);
        System.out.println("Encrypted message: " + encryptedMessage);
    }

    public static String encryptMessage(String message, int shift) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);

            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'а' : 'А';
                c = (char) (((c - base + shift) % 32) + base);
            }

            sb.append(c);
        }

        return sb.toString();
    }
}