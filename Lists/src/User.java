public class User {
    public String name;
    public int age;
    public Gender gender;
    User(String n, int a, Gender g){
        name = n;
        age = a;
        gender = g;
    }
    @Override
    public String toString() {
        return String.format("Name: %s Age: %d Gender: %s", name, age, gender);
    }
}

enum Gender{
    Man,
    Wooman
}