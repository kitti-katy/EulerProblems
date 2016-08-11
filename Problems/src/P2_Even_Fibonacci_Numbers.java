/**
 * Created by Yekaterina on 8/11/2016.
 */
public class P2_Even_Fibonacci_Numbers {
    public static void main(String[] args) {
        System.out.println(sum());
    }


    static int sum(){
        return sum(1,2);
    }
    static int sum(int first, int second){
        if(first<=4000000)
        return (first%2==0? first: 0) + sum(second, first+second);
        return 0;
    }
}
