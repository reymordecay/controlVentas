package OBJECTS;

public class User {

    private String name;
    private int code;
    private String password;
    private String userName;

    public User(String name, String password, String userName, int code) {
        this.name = name;
        this.password = password;
        this.userName = userName;
        this.code=code;
    }
    
    public boolean login(String username, String password) {
        if (username.equals(this.userName)) {
            if (password.equals(this.password)) {
                return true;
            }
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public String saludo(){
        return "Hola soy "+ this.name + ", y me da gusto saludarte.";
    }

}
