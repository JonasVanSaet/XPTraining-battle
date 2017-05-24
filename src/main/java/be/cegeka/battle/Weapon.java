package be.cegeka.battle;


public class Weapon {

    public String weaponName;

    public int weaponDamage;


    public Weapon(String weaponName, int weaponDamage) {

        this.weaponName = weaponName;
        this.weaponDamage = weaponDamage;
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
