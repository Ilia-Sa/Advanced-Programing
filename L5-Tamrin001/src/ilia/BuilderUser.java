package ilia;

public class BuilderUser {
    private String username;
    private String name;
    private String family;
    private String password;
    private String address;
    private int age;
    private int number;
    private String education;

    public BuilderUser(String username, String name, String family, String password, int age, String address, int number, String education){
        this.username = username;
        this.name = name;
        this.password = username;
        this.family = family;
        this.address = address;
        this.age = age;
        this.number = number;
        this.education = education;
    }



    public String getUsername() {
        return username;
    }

    public BuilderUser setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getName() {
        return name;
    }

    public BuilderUser setName(String name) {
        this.name = name;
        return this;
    }

    public String getFamily() {
        return family;
    }

    public BuilderUser setFamily(String family) {
        this.family = family;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public BuilderUser setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public BuilderUser setAddress(String address) {
        this.address = address;
        return this;
    }

    public int getAge() {
        return age;
    }

    public BuilderUser setAge(int age) {
        this.age = age;
        return this;
    }

    public int getNumber() {
        return number;
    }

    public BuilderUser setNumber(int number) {
        this.number = number;
        return this;
    }

    public String getEducation() {
        return education;
    }

    public BuilderUser setEducation(String education) {
        this.education = education;
        return this;
    }
}
