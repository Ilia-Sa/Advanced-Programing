package ilia;

public class WebUser {
    private int id;
    private String username;
    private String email;
    private String password;
    private int age;
    private String education;

    WebUser() {};

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    private static WebUser webUser;
    public static WebUser getInstance(){
        if (webUser == null)
        {
            webUser = new WebUser();
        }
        return webUser;
    }

}