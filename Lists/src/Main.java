import utils.StringGenerator;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<User>();
        for (int i=0; i<10; i++){
            String name = new StringGenerator().generateRandomLetterString(5);
            int age = new Random().nextInt(100);
            User user = (Math.random()>0.5) ?
                    new User(name, age, Gender.Wooman) : new User(name, age, Gender.Man);
            users.add(user);
        }

        ArrayList<User> man = new ArrayList<User>();
        ArrayList<User> wooman = new ArrayList<User>();
        for (User user : users){
            if (user.gender == Gender.Man){
                man.add(user);
            }else{
                wooman.add(user);
            }
        }

        System.out.println("\nusers:");
        printList(users);

        System.out.println("\nman:");
        printList(man);

        System.out.println("\nwooman:");
        printList(wooman);

    }
    public static <T> void  printList(ArrayList<T> list){
        for (T item : list){
            System.out.println(item);
        }
    }
}
