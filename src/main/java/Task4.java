public class Task4 {
    public static void main(String[] args) {
        int n = 1895627;
        for (int i = 2; i < n; i++) {   //harc
            if (n%i==0)
            {
                System.out.println("The number is not prime");
                break;
            }
            else
            {
                System.out.println("The number is prime");
                break;
            }

        }
    }
}
