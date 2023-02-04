import javax.swing.*;

public class Exceptions {

    public static void main(String[] args) {
        // TODO: 03/02/23
        try {
            int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
            System.out.println("Hello your age is ".concat(String.valueOf(age)).concat(" years"));
        } catch (Exception exception) {
            System.out.println("Error to parse age");
        } finally {
            System.exit(0);
        }
    }
}
