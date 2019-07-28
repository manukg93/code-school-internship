package Homework7;

public class Contact {
    String email;
    int fixe;
    int mobile;
    public Contact(String email, int fixe, int mobile){
        this.email = email;
        this.fixe = fixe;
        this.mobile = mobile;
    }
    public String getEmail() { return email; }
    public int getFixe() { return fixe; }
    public int getMobile() { return mobile; }
    public void setEmail(String givenEmail) { this.email = givenEmail; }
    public void setFixe(int givenFixe) { this.fixe = givenFixe; }
    public void setMobile(int givenMobile) { this.mobile = givenMobile; }

    @Override
    public String toString() {
        return email + " " + fixe + " " + mobile;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
