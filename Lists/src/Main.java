import utils.StringGenerator;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<User>();
        for (int i=0; i<10; i++){
            String name = new StringGenerator().generateRandomString(5);
            User user = (Math.random()>0.5) ?
                    new User(name, 100, Gender.Wooman) : new User(name, 100, Gender.Man);
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

        System.out.println("users:");
        printList(users);

        System.out.println("man:");
        printList(man);

        System.out.println("wooman:");
        printList(wooman);

    }
    public static <T> void  printList(ArrayList<T> list){
        for (T item : list){
            System.out.println(item);
        }
    }
}
