package ilia;


public class User implements Cloneable {
    private String id;
    private String password;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }


    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }


//Overriding the clone method for creating a copy.
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
