public class Ranger extends Hero{
    private final int hpGain =20;
    private final int strengthGain =2;
    private final int dexterityGain =5;
    private final int intelligenceGain =1;
    private final int levelGain = 1;
    public Ranger(String name) {
        super(name, 120,5,10,2,1,4,0,0);
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