public class PersonBuilder {
    private String name;
    private String lastName;
    private int age;
    private String cityLiving;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0 || age > 130) {
            throw new IllegalArgumentException(
                    "Значение возраста не должно выходить за рамки допустимых значений: 0 - 130"
            );
        }
        this.age = age;
        return this;
    }

    public PersonBuilder setCityLiving(String cityLiving) {
        this.cityLiving = cityLiving;
        return this;
    }

    public Person build() {
        if (name == null) {
            throw new IllegalStateException(
                    "Поле Имя должно быть заполнено"
            );
        }
        if (lastName == null) {
            throw new IllegalStateException(
                    "Поле Фамилия должно быть заполнено"
            );
        }
        Person person;
        if (age == -1) {
            person = new Person(name, lastName);
        } else {
            person = new Person(name, lastName, age);
        }
        if (cityLiving != null) {
            person.setCityLiving(cityLiving);
        }
        return person;
    }

}