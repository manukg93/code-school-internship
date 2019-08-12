package homework11.ex2;

public class User {
    private String name;
    private String email;
    private String password;

    public User(){}

    public User(String name, String email, String password) {
        this.name = name;
        if (email.contains("@")) {
            this.email = email;
        }
        else throw new IllegalEmailException("illegal email");
        if (password.length() >= 8) {
            this.password = password;
        }
        else throw new IllegalPasswordException("illegal password");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email.contains("@")){
            this.email = email;
        }else
            throw new IllegalEmailException("illegal email");
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() >= 8) {
            this.password = password;
        }
        else throw new IllegalPasswordException("illegal password");
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
