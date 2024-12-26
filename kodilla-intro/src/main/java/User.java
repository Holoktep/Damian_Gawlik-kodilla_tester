public class User {
int age;
String name;

public User(int age, String name){
    this.name = name;
    this.age = age;
}
    public static void main(String[] args) {
    User[] users = new User[] {new User(26, "Damian"),new User(46, "Marek"), new User(66, "Andrzej")};
        int sum = 0;
        for (int i = 0; i < users.length; i ++) {
            sum += users[i].age;
        }
        double avgAge = (double) sum / users.length ;
        for (int i = 0; i < users.length; i ++) {
            int usersAge = users[i].age;
            if (usersAge < avgAge){
                System.out.println(users[i].name);
            }
        }
    }
}
