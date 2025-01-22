import java.util.Scanner;

public class CharacterFactory {
    public static Character createCharacter() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя: ");
        String name = scanner.nextLine();

        System.out.println("Выберите класс персонажа:\n1) Мечник\n2) Лучник\n3) Копейщик\n4) Вор\n5) Молотоборец\n6) Щитоносец");
        int classChoice;
        do {
            classChoice = scanner.nextInt();
        } while (classChoice < 1 || classChoice > 6);
        classChoice--;

        int health;
        int damage;
        int armor;
        int speed;
        switch (classChoice) {
            case 0: health = 100; damage = 4; armor = 5; speed = 4; break;
            case 1: health = 80; damage = 7; armor = 1; speed = 7; break;
            case 2: health = 100; damage = 6; armor = 3; speed = 4; break;
            case 3: health = 90; damage = 3; armor = 2; speed = 9; break;
            case 4: health = 110; damage = 6; armor = 5; speed = 2; break;
            default: health = 120; damage = 2; armor = 8; speed = 3; break;
        }

        return new Character(name, Classes.values()[classChoice], 1, health, damage, armor, speed);
    }
}
