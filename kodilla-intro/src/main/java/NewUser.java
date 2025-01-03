public class NewUser {
    private double age;
    private double height;
    private String name;

    public NewUser(double age, double hight, String name){
        this.age = age;
        this.height = hight;
        this.name = name;
    }
    public void checkNewUser(){
        if (name != null) {
            if (age > 30 && height > 160) {
                System.out.println("User is older than 30 and taller than 160cm");
            } else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }
        }
    }
}
