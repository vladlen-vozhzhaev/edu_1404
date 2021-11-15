/* Здоровье (hp) персонажа, не может превышать 100ед. */

public class Main {
    public static void main(String[] args) {
        Person person5 = new Person("Igor", "Petrov", 80,null, null);
        Person person4 = new Person("Eva", "Ivanova", 70, null, null);
        Person person3 = new Person("Ivan", "Ivanov", 45, person4, null);
        Person person2 = new Person("Olga", "Ivanova", 44, null, person5);
        Person person1 = new Person("Oleg", "Ivanov", 19, person2, person3);
        person1.info();
    }
}

class Person{
    private String name;
    private String lastname;
    private int age;
    private int hp;
    private Person mother;
    private Person father;
    public Person(String name, String lastname, int age, Person mother, Person father) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.hp = 100;
        this.mother = mother;
        this.father = father;
    }
    public void info(){
        String result = "Меня зовут "+this.name+"\n";
        if(this.mother != null){
            result += "Мою маму зовут "+this.mother.getName()+"\n";
            if (this.mother.father != null){
                result += "Моего дедушку по маиной линии зовут "+this.mother.father.getName()+"\n";
            }
        }
        if (this.father != null){
            result += "Моего папу зовут "+this.father.getName()+"\n";
            if (this.father.mother != null){
                result+= "Мою бабушку по папиной линии зовут "+this.father.mother.getName()+"\n";
            }
        }

        System.out.println(result);
    }
    public int getHp() {
        return hp;
    }

    void setHp(int hp){
        if(this.hp + hp >= 100) this.hp = 100;
        else this.hp = this.hp + hp;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    void sayHi(String name){
        System.out.println("Привет "+name+", меня зовут "+this.name);
    }
}
