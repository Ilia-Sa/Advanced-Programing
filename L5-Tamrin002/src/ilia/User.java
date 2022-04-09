package ilia;

//creating a singleton class.
public class User {
    private String userName;
    private String passWord;
    private String firstName;
    private String lastName;
    private String confirmPass;
    //creating a private constructor.
    private User(){}

    public String getConfirmPass() {
        return confirmPass;
    }

    public void setConfirmPass(String confirmPass) {
        this.confirmPass = confirmPass;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //created a private object for the class.
    private static User user;
    //used the getInstance method.
    public static User getInstance(){
        if (user == null)
        {
            user = new User();
        }
        return user;
    }

    //prints user date.
        public void showUserInfo(){
            System.out.println("User information:");
            System.out.println("Username: " + User.getInstance().getUserName());
            System.out.println("First name: " + User.getInstance().getFirstName());
            System.out.println("Last name" + User.getInstance().getLastName());
            System.out.println("Password: " + User.getInstance().getPassWord());
        }
}
