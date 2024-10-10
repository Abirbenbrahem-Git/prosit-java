package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic {
    protected float swimmingDepth;

    public Penguin() {
        super();
    }
    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    public String toString() {
        return "Penguin :" + "family='" + family  + ", name='" + name+ ", age=" + age + ", isMammal=" + isMammal + ", habitat='" + habitat + ", swimmingDepth=" + swimmingDepth ;
    }

    @Override
    public void swim() {
        System.out.println("This penguin is swimming");
    }

}
