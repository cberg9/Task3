public abstract class Hero {


    protected String name;
    protected int health;
    protected int strength;
    protected int dexterity;
    protected int intelligence;
    protected int level;
    protected int maxItem;
    protected int currentExp;
    protected int damage;
    protected int reqXp=100;
    private final double LEVELUP_FACTOR=1.1;


    public Hero(String name, int health, int strength, int dexterity, int intelligence, int level, int maxItem, int currentExp, int damage) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.level = level;
        this.maxItem = maxItem;
        this.currentExp = currentExp;
        this.damage = damage;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public int setHealth(int health) {
        this.health = health;
        return health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getMaxItem() {
        return maxItem;
    }

    public abstract void levelUp();

    public void gainXp(int xp){
        currentExp+= xp;
     while (currentExp > reqXp){
         currentExp-=reqXp;
         levelUp();
         reqXp *= LEVELUP_FACTOR;
     }
    }
    public int getXpNextLvl(){
       return reqXp-currentExp;
    }

    public void setMaxItem(int maxItem) {
        this.maxItem = maxItem;
    }

    public int getCurrentExp() {
        return currentExp;
    }

    public void setCurrentExp(int currentExp) {
        this.currentExp = currentExp;
    }

    public void addCurrentExp(int value) {
        setCurrentExp(getCurrentExp() + value);
    }

    public String displayStats() {
        return "Health: " + health + "\nStrength: " + strength + "\nDexterity: " + dexterity + "\nIntelligence: " + intelligence + "\nLevel: " + level;
    }


}


