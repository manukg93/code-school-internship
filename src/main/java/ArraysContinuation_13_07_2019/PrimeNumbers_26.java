package ArraysContinuation_13_07_2019;

public class PrimeNumbers_26 {
    public static void main(String[] args) {
        int i, number = 1, count;
        while(number <= 1000)
        {
            count = 0;
            i = 2;
            while(i <= number/2 )
            {
                if(number % i == 0)
                {
                    count++;
                    break;
                }
                i++;
            }
            if(count == 0 && number != 1 )
            {
                System.out.println(number + " ");
            }
            number++;
        }
    }
}
