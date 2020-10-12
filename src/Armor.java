public class Armor extends Item {
    private int armorLevel;
    private int armorHp;
    private int armorDexterity;
    private int armorIntelligence;
    private boolean plate;
    private boolean leather;
    private boolean cloth;
    private boolean head;
    private boolean body;
    private boolean leg;


    public Armor(String itemName, int armorLevel, int armorHp, int armorDexterity, int armorIntelligence, boolean plate, boolean leather, boolean cloth, boolean head, boolean body, boolean leg) {
        super(itemName);
        this.armorLevel = armorLevel;
        this.armorHp = armorHp;
        this.armorDexterity = armorDexterity;
        this.armorIntelligence = armorIntelligence;
        this.plate = plate;
        this.leather = leather;
        this.cloth = cloth;
        this.head = head;
        this.body = body;
        this.leg = leg;
    }


    public int getArmorLevel() {
        return armorLevel;
    }

    public void setArmorLevel(int armorLevel) {
        this.armorLevel = armorLevel;
    }

    public int getArmorHp() {
        return armorHp;
    }

    public void setArmorHp(int armorHp) {
        this.armorHp = armorHp;
    }

    public int getArmorDexterity() {
        return armorDexterity;
    }

    public void setArmorDexterity(int armorDexterity) {
        this.armorDexterity = armorDexterity;
    }

    public int getArmorIntelligence() {
        return armorIntelligence;
    }

    public void setArmorIntelligence(int armorIntelligence) {
        this.armorIntelligence = armorIntelligence;
    }

    public boolean isPlate() {
        return plate;
    }

    public void setPlate(boolean plate) {
        this.plate = plate;
    }

    public boolean isLeather() {
        return leather;
    }

    public void setLeather(boolean leather) {
        this.leather = leather;
    }

    public boolean isCloth() {
        return cloth;
    }

    public void setCloth(boolean cloth) {
        this.leather = leather;
    }
    public boolean isHead() {
        return head;
    }

    public void setHead(boolean head) {
        this.head = leather;
    }
    public boolean isBody() {
        return body;
    }

    public void setBody(boolean body) {
        this.body = leather;
    }
    public boolean isLeg() {
        return leg;
    }

    public void setLeg(boolean leg) {
        this.leg = leather;
    }
}

