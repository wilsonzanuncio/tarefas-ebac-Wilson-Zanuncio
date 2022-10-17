public class Person implements Comparable<Person> {
    private String name;
    private String gender;

    public Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public int compareTo(Person person) {
        return this.name.toLowerCase().compareTo(person.getName());
    }
}
