import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(10,20,45,66,36,99,78,95,48,33,20,31,789,65);

    }

    static void fun(int... item) {
        System.out.println(Arrays.toString(item));
    }
}
