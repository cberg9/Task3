public class Weapon extends Item {
    private String weaponType;
    private int weaponLevelRequirement;
    private int meleeDamage;
    private int rangeDamage;
    private boolean melee;
    private boolean range;

    public Weapon(String itemName, String weaponType, int weaponLevelRequirement, int meleeDamage, int rangeDamage, boolean melee, boolean range) {
        super(itemName);
        this.weaponType = weaponType;
        this.weaponLevelRequirement = weaponLevelRequirement;
        this.meleeDamage = 15;
        this.rangeDamage = 5;
        this.melee = melee;
        this.range = range;
    }

    public String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    public int getWeaponLevel() {
        return weaponLevelRequirement;
    }

    public void setWeaponLevel(int weaponLevel) {
        this.weaponLevelRequirement = weaponLevel;
    }

    public int getMeleeDamage() {
        return meleeDamage;
    }

    public void setMeleeDamage(int meleeDamage) {
        this.meleeDamage = meleeDamage;
    }

    public int getRangeDamage() {
        return rangeDamage;
    }

    public void setRangeDamage(int meleeDamage) {
        this.rangeDamage= rangeDamage;
    }

    public boolean isMelee() {
        return melee;
    }

    public void setMelee(boolean melee) {
        this.melee = melee;
    }

    public boolean isRange() {
        return range;
    }

    public void setRange(boolean range) {
        this.range = range;
    }

    public String toString() {
        if (isMelee()) {
            return super.toString() + "is a melee weapon that has" + getMeleeDamage() + "in damage.";
        } else {
            return super.toString() + "Not melee-weapon";
        }


    }
}

