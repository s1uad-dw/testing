import utils.StringGenerator;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        for (int i=0; i<10; i++){
            String name = new StringGenerator().generateRandomLetterString(5);
            int age = new Random().nextInt(100);
            User user = (Math.random()>0.5) ?
                    new User(name, age, Gender.Wooman) : new User(name, age, Gender.Man);
            users.add(user);
        }

        List<User> man = new ArrayList<>();
        List<User> wooman = new ArrayList<>();
        for (User user : users){
            if (user.gender == Gender.Man){
                man.add(user);
            }else{
                wooman.add(user);
            }
        }

        System.out.println("\nusers:");
        printList(users);

        System.out.println("\nusers sotet by streamAPI:");
        printList(new User().sortByGender(users, Gender.Wooman));

        System.out.println("\nman:");
        printList(man);

        System.out.println("\nwooman:");
        printList(wooman);

    }
    public static <T> void  printList(List<T> list){
        for (T item : list){
            System.out.println(item);
        }
    }
}
