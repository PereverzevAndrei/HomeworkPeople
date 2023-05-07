import javax.naming.Name;
import java.util.OptionalInt;

public class Person {
    private final String name;
    private final String lastName;
    private int age;
    private String cityLiving;

    public Person(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
        this.age = -1;
    }

    public boolean hasAge() {
        return age != -1;
    }


    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public OptionalInt getAge() {
        return hasAge() ? OptionalInt.of(age) : OptionalInt.empty();
    }

    public void setCityLiving(String cityLiving) {
        this.cityLiving = cityLiving;
    }

    public String getCityLiving() {
        return cityLiving;
    }

    public void happyBirthday() {
        age += age;
    }

    public Person newChildBuilder(String name) {
        Person child = new PersonBuilder()
                .setLastName(lastName)
                .setName(name)
                .setCityLiving(cityLiving)
                .build();
        return child;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Имя='" + name + '\'' +
                ", Фамилия='" + lastName + '\'' +
                ", Возраст=" + age +
                ", Живет в " + cityLiving +
                '}';
    }

//    @Override
//    public int hashCode() {
//    }
}
