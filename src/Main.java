public class Main {
    public static void main(String[] args){
        Boss boss = new Boss();
        boss.setHealth(100);
        boss.setDamage(20);
        Weapon bossWeapon = new Weapon(WeaponType.SWORD, "Dragon Slayer");
        boss.setWeapon(bossWeapon);

        System.out.println(boss.printInfo());

        Skeleton skeleton1 = new Skeleton(30);
        skeleton1.setHealth(50);
        skeleton1.setDamage(10);
        skeleton1.setWeapon(new Weapon(WeaponType.BOW, "Short Bow"));

        Skeleton skeleton2 = new Skeleton(40);
        skeleton2.setHealth(60);
        skeleton2.setDamage(12);
        skeleton2.setWeapon(new Weapon(WeaponType.AXE, "Rusty Axe"));

        System.out.println(skeleton1.printInfo());
        System.out.println(skeleton2.printInfo());
    }
}