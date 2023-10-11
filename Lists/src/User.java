import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.stream.Collectors;

public class User {
    public String name;
    public int age;
    Gender gender;
    public String email;
    public String phone;
    User(){
        name = "";
        age = 0;
    }
    User(String n, int a, Gender g, String e, String p){
        name = n;
        age = a;
        gender = g;
        email = e;
        phone = p;
    }
    public List<User> sortByGender(@NotNull List<User> list, @NotNull Gender gender){
        return list.stream().filter(user -> user.gender == gender).collect(Collectors.toList());
    }
    @Override
    public String toString() {
        return String.format("Name: %s, Age: %d, Gender: %s, Email: %s, Phone %s", name, age, gender, email, phone);
    }
}

enum Gender{
    Man,
    Wooman
}