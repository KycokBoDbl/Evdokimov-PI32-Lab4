import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private int slots;
    private List<Equipment> equipments;

    public Inventory() {
        this.slots = 0;
        this.equipments = new ArrayList<>();
    }

    // добавление оружия
    public void addWeapon(Weapon weapon) {
        if (slots < 100) {
            equipments.add(weapon);
            slots++;
        } else {
            System.out.println("Инвентарь полон");
        }
    }

    // добавление брони
    public void addArmor(Armor armor) {
        if (slots < 100) {
            equipments.add(armor);
            slots++;
        } else {
            System.out.println("Инвентарь полон");
        }
    }

    // добавление расходуемого предмета
    public void addItem(Item item) {
        if (slots < 100) {
            equipments.add(item);
            slots++;
        } else {
            System.out.println("Инвентарь полон");
        }
    }

    // показать содержимое
    public void showInventory() {
        System.out.println("Инвентарь:");
        for (Equipment equipment : equipments) {
            equipment.showInfo();
        }
    }
}