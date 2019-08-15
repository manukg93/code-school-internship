package code.school.internship.classes_and_objects.homework.homework11;


public class User {
    String name;
    String email;
    String password;

    public User(String name, String email, String password) {
        if (!email.contains("@") || !email.contains("."))
        {
            throw new IllegalEmailException("Wrong email");
        }
        if (password.length() < 8)
        {
            throw new IllegalPasswordException("password length should be minimum 8 characters");
        }
        this.name = name;
        this.email = email;
        this.password = password;
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
        if (!email.contains("@") || !email.contains("."))
        {
            throw new IllegalEmailException("Wrong email");
        }
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() < 8)
        {
            throw new IllegalPasswordException("password length should be minimum 8 characters");
        }
        this.password = password;
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