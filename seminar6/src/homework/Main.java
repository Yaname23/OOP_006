package homework;

public class Main{
    public static void main(String[] args){
        User user = new User("Bob");


        Saveble saveUser = new SaveUser("Bob");
        saveUser.save();

        ReporterUser reporterUser = new ReporterUser(user);
        reporterUser.report();


    }
}