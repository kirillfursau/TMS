package homeWork.homeWork6.human;

import homeWork.homeWork6.human.jackets.Jacket;
import homeWork.homeWork6.human.pants.Pants;
import homeWork.homeWork6.human.shoes.Shoe;

public class Human {
    private Jacket jacket;
    private Pants pants;
    private Shoe shoe;
    private String name;

    Human(String name, Jacket jacket, Pants pants, Shoe shoe) {
        setName(name);
        setJacket(jacket);
        setPants(pants);
        setShoe(shoe);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setJacket(Jacket jacket) {
        this.jacket = jacket;
    }

    public Jacket getJacket() {
        return jacket;
    }

    public void setPants(Pants pants) {
        this.pants = pants;
    }

    public Pants getPants() {
        return pants;
    }

    public void setShoe(Shoe shoe) {
        this.shoe = shoe;
    }

    public Shoe getShoe() {
        return shoe;
    }

    void putOnAllThings() {
        System.out.println(getName());
        jacket.putOnJacket();
        pants.putOnPants();
        shoe.putOnShoe();
        System.out.println();
    }

    void putOffAllThings() {
        System.out.println(getName());
        jacket.putOffJacket();
        pants.putOffPants();
        shoe.putOffShoe();
        System.out.println();
    }
}
