public class TowerOfHanoi {

    public static void hanoi(int n, char src, char dst, char aux){
        if(n==1){
            System.out.println(src + " -> " + dst);
            return;
        }
        hanoi(n-1, src, dst, aux);
        hanoi(1, src, aux, dst);
        hanoi(n-1, aux, src, dst);
    }
    public static void main(String[] args) {
        hanoi(3, 'A', 'B', 'C');
    }
}
