package Objects;

/**
 * Created by alex on 05.03.2017.
 */
public class Pokemon {

    private String nation;
    private String name;
    private String element;
    private int age;
    private String size;
    private int atk;
    private int hp;

    public Pokemon(String nation, String name, String element, int age, String size, int atk, int hp) {
        this.nation = nation;
        this.name = name;
        this.element = element;
        this.age = age;
        this.size = size;
        this.atk = atk;
        this.hp = hp;
    }

    public void Gritings(){
        System.out.println("Im a strong pokemon! My statistic is: " + nation + element + age + size + atk + hp);
    }
    public void Attak() {
        System.out.println("Argh!!! Simple attak " + atk);
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
