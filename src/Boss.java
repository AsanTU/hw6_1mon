public class Boss extends GameEntity {
    String typeOfWeapons;

    String nameOfWeapons;

    public String getTypeOfWeapons() {
        return typeOfWeapons;
    }

    public void setTypeOfWeapons(String typeOfWeapons) {
        this.typeOfWeapons = typeOfWeapons;
    }

    public String getNameOfWeapons() {
        return nameOfWeapons;
    }

    public void setNameOfWeapons(String nameOfWeapons) {
        this.nameOfWeapons = nameOfWeapons;
    }

    public void setBossDefence(String physical) {
    }

    public void setDamage(int i) {
    }

    public void setHealth(int i) {
    }

    public String getHealth() {
        return null;
    }

    public String getDamage() {
        return null;
    }
    public String getBossDefence() {
        return null;
    }
}
