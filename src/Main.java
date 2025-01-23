import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Character character = CharacterFactory.createCharacter();
        Player player = new Player(character);

        int choice;
        do {
            System.out.println("Список действий:");
            System.out.println("1) Посмотреть инвентарь");
            System.out.println("2) Посмотреть характеристики");
            System.out.println("3) Создать нового персонажа");
            System.out.println("4) Повысить уровень персонажу");
            System.out.println("5) Посмотреть количество созданных игроков");
            System.out.println("6) Просмотреть всех игроков");
            System.out.println("7) Завершение работы");

            do {
                choice = scanner.nextInt();
            } while (choice < 1 || choice > 7);

            switch (choice) {
                case 1:
                    player.getInventory().showInventory();
                    break;
                case 2:
                    player.showStats();
                    break;
                case 3: {
                    Character newCharacter = CharacterFactory.createCharacter();
                    Player newPlayer = new Player(newCharacter);
                    System.out.println("Новый персонаж создан");
                    break;
                }
                case 4:
                    player.getCharacter().levelUp();
                    break;
                case 5:
                    System.out.println("Количество созданных игроков: " + PlayerCount.getPlayerCount());
                    break;
                case 6:
                    List<Player> allPlayers = Player.getAllPlayers();
                    for (Player p : allPlayers) {
                        p.showStats();
                    }
                    break;
                default:
                    break;
            }
        } while (choice != 7);
    }
}
