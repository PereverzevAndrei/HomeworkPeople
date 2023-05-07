public class Main {
    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .setName("Anna")
                .setLastName("Wolf")
                .setAge(37)
                .setCityLiving("Sidney")
                .build();
        System.out.println(mom);

        Person son = mom.newChildBuilder("Jeremy");

        System.out.println(" У " + mom + " есть сын, " + son);

        try {
            new PersonBuilder().build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
        try {
            new PersonBuilder().setAge(-100).build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

    }
}
