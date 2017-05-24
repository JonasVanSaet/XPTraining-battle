package be.cegeka.battle;


public class Weapon {

    public String weaponName;

    public int weaponDamage;


    public Weapon() {
    }


    public int getWeaponDamage() {

        return weaponDamage;
    }


    public String getWeaponName() {
        return weaponName;
    }


    public void setWeaponDamage(int weaponDamage) {
        this.weaponDamage = weaponDamage;
    }


    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }


}
