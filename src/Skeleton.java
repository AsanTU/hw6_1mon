public class Skeleton extends Boss{
    private int arrows;

    public int getArrows() {
        return arrows;
    }

    public void setArrows(int arrows) {
        this.arrows = arrows;
    }

    public Skeleton(int arrows) {
        this.arrows = arrows;
    }

    @Override
    public String printInfo() {
        return "Skeleton Info: \nHealth: " + getHealth() +
                "\nDamage: " + getDamage() +
                "\nWeapon Type: " + getWeapon().getWeaponType() + "No Weapon" +
                "\nWeapon Name: " + getWeapon().getWeaponName() + "No Weapon Name" +
                "\nArrows: " + arrows;
    }
}
