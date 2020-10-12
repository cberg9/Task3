public class Warrior extends Hero{
    private final int hpGain =30;
    private final int strengthGain =5;
    private final int dexterityGain =5;
    private final int intelligenceGain =1;
    private final int levelGain = 1;
    public Warrior(String name) {
        super(name, 150,10,3,1,1,4,0,0);
    }

    @Override
    public void levelUp() {
        health += hpGain;
        strength += strengthGain;
        dexterity += dexterityGain;
        intelligence += intelligenceGain;
        level += levelGain;
    }
}