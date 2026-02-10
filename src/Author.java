public class Author {
    private String name;
    private String lastName;
    private int age;

    public Author(String name, String lastName, int age){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString(){
        return "Имя автора: " + name + " " + lastName + " возраст " + age;
    }
}
