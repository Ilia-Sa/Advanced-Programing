package ilia;

public class User {
    private int eCode;
    private String name;
    private String lastName;
    private int nationalCode;
    private String father;
    private String designation;
    private int phone;
    private String background;


    private User() {}

    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String setLastName(String lastName) {
        this.lastName = lastName;
        return lastName;
    }

    public int getNationalCode() {
        return nationalCode;
    }

    public int setNationalCode(int nationalCode) {
        this.nationalCode = nationalCode;
        return nationalCode;
    }

    public String getFather() {
        return father;
    }

    public String setFather(String father) {
        this.father = father;
        return father;
    }

    public String getDesignation() {
        return designation;
    }

    public String setDesignation(String designation) {
        this.designation = designation;
        return designation;
    }

    public int getPhone() {
        return phone;
    }

    public int setPhone(int phone) {
        this.phone = phone;
        return 0;
    }

    public String getBackground() {
        return background;
    }

    public String setBackground(String background) {
        this.background = background;
        return background;
    }


    public int geteCode() {
        return eCode;
    }

    public int seteCode(int eCode) {
        this.eCode = eCode;
        return eCode;
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

}