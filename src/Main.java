public class Main {
    public static void main(String[] args){
        Boss boss = new Boss();
        boss.setBossDefence("Physical");
        boss.setDamage(100);
        boss.setHealth(3000);

        System.out.println("Boss Health: " + boss.getHealth() + "\n boss damage:" + boss.getDamage() + "\n type of boss defence" + boss.getBossDefence());
        for (int i = 0; i < createHeroas().length; i++) {
            System.out.println(createHeroas()[i].getHealth() + "," + createHeroas()[i].getDamage());
        }
    }

    private static Boss[] createHeroas() {
        return new Boss[0];
    }
}