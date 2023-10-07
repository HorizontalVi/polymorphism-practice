import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        // Как настоящие программисты мы имеем в виду, что исчисление начинается с 0
        System.out.format("У игрока %d слотов с оружием,"
                        + " введите номер, чтобы выстрелить,"
                        + " -1 чтобы выйти%n",
                player.getSlotsCount()
        );
        int slot;

        while (true) {
            System.out.println("Введите число: ");
            try {
                slot = scanner.nextInt();
                player.shotWithWeapon(slot);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Game over!");
                break;
            }
        }
    }
}