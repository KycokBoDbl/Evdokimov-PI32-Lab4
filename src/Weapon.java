public class Weapon extends Equipment {
    private Classes weaponClass;
    private int level;
    private double damage;

    public Weapon(String name, Classes weaponClass, int level, int cost, double damage) {
        super(name, cost);
        this.weaponClass = weaponClass;
        this.level = level;
        this.damage = damage;
    }

    public Classes getWeaponClass() {
        return weaponClass;
    }

    public void setWeaponClass(Classes weaponClass) {
        this.weaponClass = weaponClass;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    @Override
    public void showInfo() {
        System.out.println("Оружие: " + getName() + ", Класс: " + weaponClass.getClassName() + ", Уровень: " + level + ", Урон: " + damage + ", Стоимость: " + getCost());
    }
}