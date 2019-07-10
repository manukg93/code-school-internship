package homework3;

public class Ex23PrintAlphabets {
    public static void main(String[] args) {
        char x=65,y=97;
        while(x<=90 && y<=122){
            System.out.print(x+"-->"+y+"  ");
            x++;
            y++;
        }
    }
}
