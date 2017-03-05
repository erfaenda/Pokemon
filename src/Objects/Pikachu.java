package Objects;
import java.util.Random;
/**
 * Created by alex on 05.03.2017.
 */
public class Pikachu  extends Pokemon {

    public Pikachu(String nation, String name, String element, int age, String size, int atk, int hp) {
        super(nation, name, element, age, size, atk, hp);
    }
    public void Energy_Atk(){
        Random rnd = new Random();
        int eatk = getAtk() + rnd.nextInt(12);
        System.out.println("Удар молнией " + eatk);
    }
    public void Attak() {
        System.out.println("Argh!!! Simple attak " + getAtk());
    }

}
