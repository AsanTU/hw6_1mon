public class Boss extends GameEntity {
    private Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String printInfo() {
        return "Boss Info: \nHealth: " + getHealth() +
                "\nDamage: " + getDamage() +
                "\nWeapon Type: " + weapon.getWeaponType() + "No Weapon" +
                "\nWeapon Name: " + weapon.getWeaponName() + "No Weapon Name";
    }
}