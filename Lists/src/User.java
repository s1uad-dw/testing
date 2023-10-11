import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class User {
    public String name;
    public int age;
    public Gender gender;
    User(){
        name = "";
        age = 0;
    }
    User(String n, int a, Gender g){
        name = n;
        age = a;
        gender = g;
    }
    public List<User> sortByGender(List<User> list, Gender gender){
        return list.stream().filter(user -> user.gender == gender).collect(Collectors.toList());
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