package homework;public class SaveUser implements Saveble{
    private final User user;

    public SaveUser(String userName){
        this.user = new User(userName);
    }

    @Override
    public void save(){
        System.out.println("Save user: " + user.getName());
    }
}
