package homework;

public class ReporterUser implements Reportable{
    private final User user;

    public ReporterUser(User user){
        this.user = user;
    }

    @Override
    public void report() {
        System.out.println("Report for user: " + user.getName());
    }

}
