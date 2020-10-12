public class Mage extends Hero {
    private final int hpGain =15;
    private final int strengthGain =1;
    private final int dexterityGain =2;
    private final int intelligenceGain =5;
    private final int levelGain = 1;
    public Mage(String name) {
        super(name, 100,2,3,10,1,4,0,0);
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


