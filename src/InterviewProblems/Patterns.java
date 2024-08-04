package InterviewProblems;
/*
 * Step 1: Run outer loop = no of rows patterns have or no of lines patterns have
 * Step 2: Identify for each row number how many columns are there and also find types of element in pattern
 * Step 3: what do you need to print
 * Note: Try to find formula relating to row and column
*/

public class Patterns {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Pattern 1:");
        pattern1(n);
        System.out.print("\n");
        
        System.out.println("Pattern 2:");
        pattern2(n);
        System.out.print("\n");
        
        System.out.println("Pattern 3:");
        pattern3(n);
        System.out.print("\n");
        
        System.out.println("Pattern 4:");
        pattern4(n);
        System.out.print("\n");
        
        System.out.println("Pattern 5:");
        pattern5(n);
        System.out.print("\n");
        
        System.out.println("Pattern 5a:");
        pattern5a(n);
        System.out.print("\n");
        
        System.out.println("Pattern 6:");
        pattern6(n);
        System.out.print("\n");
        
        System.out.println("Pattern 7:");
        pattern7(n);
        System.out.print("\n");
        
        System.out.println("Pattern 8:");
        pattern8(n);
        System.out.print("\n");
        
        System.out.println("Pattern 9:");
        pattern9(n);
        System.out.print("\n");
        
        System.out.println("Pattern 10:");
        pattern10(n);
        System.out.print("\n");
        
        System.out.println("Pattern 11:");
        pattern11(n);
        System.out.print("\n");
        
        System.out.println("Pattern 12:");
        pattern12(n);
        System.out.print("\n");
        
        System.out.println("Pattern 13:");
        pattern13(n);
        System.out.print("\n");
        
        System.out.println("Pattern 14:");
        pattern14(n);
        System.out.print("\n");
        
        System.out.println("Pattern 15:");
        pattern15(n);
        System.out.print("\n");
        
        System.out.println("Pattern 16:");
        pattern16(n);
        System.out.print("\n");
        
        System.out.println("Pattern 17:");
        pattern17(n);
        System.out.print("\n");

        System.out.println("Pattern 18:");
        pattern18(n);
        System.out.print("\n");

        System.out.println("Pattern 19:");
        pattern19(n);
        System.out.print("\n");

        System.out.println("Pattern 20:");
        pattern20(n);
        System.out.print("\n");

        System.out.println("Pattern 21:");
        pattern21(n);
        System.out.print("\n");

        System.out.println("Pattern 22:");
        pattern22(n);
        System.out.print("\n");

        System.out.println("Pattern 23:");
        pattern23(n);
        System.out.print("\n");

        System.out.println("Pattern 24:");
        pattern24(n);
        System.out.print("\n");

        System.out.println("Pattern 25:");
        pattern25(n);
        System.out.print("\n");

        System.out.println("Pattern 26:");
        pattern26(n);
        System.out.print("\n");

        System.out.println("Pattern 27:");
        pattern27(n);
        System.out.print("\n");

        System.out.println("Pattern 28:");
        pattern28(n);
        System.out.print("\n");

        System.out.println("Pattern 29:");
        pattern29(n);
        System.out.print("\n");

        System.out.println("Pattern 30:");
        pattern30(n);
        System.out.print("\n");

        System.out.println("Pattern 31:");
        pattern31(n);
        System.out.print("\n");

        System.out.println("Pattern 32:");
        pattern32(n);
        System.out.print("\n");

        System.out.println("Pattern 33:");
        pattern33(n);
        System.out.print("\n");

        System.out.println("Pattern 34:");
        pattern34(n);
        System.out.print("\n");
    }

    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            // for each row, run the col
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            // when one row is printed we need to add a newline
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            // for each row, run the col
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            // when one row is printed we need to add a newline
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = n; col >= row; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Todo: Imp pattern
    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            // for each row, run the col
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            // when one row is printed we need to add a newline
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int row = 1; row <= n; row++) {
            // for each row, run the col
            for (int col = n; col >= row; col--) {
                System.out.print(col + " ");
            }
            // when one row is printed we need to add a newline
            System.out.println();
        }
    }

    static void pattern5a(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int row = 1; row <= n; row++) {
            for (int col = n; col >= row; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern7(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
        for (int row = 1; row <= n; row++) {
            for (int col = n; col >= row; col--) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    // dimond pattern
    static void pattern8(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalColsinRow = row > n ? 2 * n - row : row;
            int noOfSpaces = n - totalColsinRow;

            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalColsinRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // dimond pattern with numbers
    static void pattern9(int n) {
        for (int row = 1; row <= 2 * n; row++) {
            int totalColsinRow = row > n ? 2 * n - row : row;

            for (int s = 0; s < n - totalColsinRow; s++) {
                System.out.print("  ");
            }

            for (int col = totalColsinRow; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= totalColsinRow; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    // pyramid pattern
    static void pattern10(int n) {
        for (int row = 1; row <= n; row++) {
            for (int s = 0; s < n - row; s++) {
                System.out.print("  ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern11(int n) {
        int OriginalN = n;
        n = 2 * n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int atEveryIndex = OriginalN - Math.min(Math.min(row, col), Math.min(n - row, n - col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }

    static void pattern12(int n) {
        int c = 1;
        int l = 1;

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                if (j % 2 == 0) {
                    c = 0;
                } else {
                    c = 1;
                }
                System.out.print(c + " ");
            }
            for (int j = i + 1; j <= 2 * i && i > 1; j++) {
                if (j % 2 == 0) {
                    l = 1;
                } else {
                    l = 0;
                }
                System.out.print(l + " ");
            }
            System.out.println();
        }
    }

    static void pattern13(int n) {
        for (int i = 1; i <= n; i++) {
            for (int space = n - 1; space >= i; space--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern14(int n) {
        for (int i = 1; i <= n; i++) {
            for (int space = 1; space < i; space++) {
                System.out.print(" ");
            }
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern15(int n) {
        for (int i = 1; i <= n; i++) {
            for (int space = n - 1; space >= i; space--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void pattern16(int n) {
        for (int i = 1; i <= n; i++) {
            for (int space = n; space >= i; space--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern17(int n) {
        for (int i = 1; i <= n; i++) {
            for (int space = n; space >= i; space--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    static void pattern18(int n) {
        for (int i = 1; i <= n; i++) {
            for (int space = n; space >= i; space--) {
                System.out.print(" ");
            }
            for (int j = 1; j < i * 2; j++) {
                System.out.print(j + "");
            }
            System.out.println();
        }
    }

    static void pattern19(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i * j) < 10) {
                    System.out.print("0");
                }
                System.out.print((i * j) + " ");
            }
            System.out.println();
        }
    }

    static void pattern20(int n) {
        for (int i = 0; i < n; i++) {
            for (int space = 0; space < n - i - 1; space++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern21(int n) {
        for (int i = 0; i < n; i++) {
            for (int space = 0; space < i; space++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * n - (2 * i + 1)); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern22(int n) {
        for (int i = 0; i < n; i++) {
            for (int space = 0; space < n - i - 1; space++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int space = 0; space < i; space++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * n - (2 * i + 1)); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern23(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = i;
            if (i > n) {
                stars = 2 * n - i;
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern24(int n) {
        for (int i = 0; i < n; i++) {
            int start = 1;
            if (i % 2 == 0) {
                start = 1;
            } else {
                start = 0;
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(start + " ");
                start = 1 - start;
            }
            System.out.println();
        }
    }

    static void pattern25(int n) {
        int space = 2 * (n - 1);
        for (int i = 1; i <= n; i++) {
            // numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // spaces
            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            }

            // numbers
            for (int j = i; j >= 1; j--) {
                if (j == 1) {
                    System.out.print(j); // No space after the last number in the line
                } else {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
            space = space - 2;
        }
    }

    static void pattern26(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num = num + 1;
            }
            System.out.println();
        }
    }

    static void pattern27(int n) {
        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    static void pattern28(int n) {
        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch <= 'A' + (n - i - 1); ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    static void pattern29(int n) {
        for (int i = 0; i < n; i++) {
            char ch = (char) ('A' + i);
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    static void pattern30(int n) {
        for (int i = 0; i < n; i++) {
            for (int space = 0; space < n - i - 1; space++) {
                System.out.print("  ");
            }
            // Print characters
            char ch = 'A';
            int breakpoint = (2 * i + 1) / 2;
            for (int j = 0; j < (2 * i + 1); j++) {
                System.out.print(ch + " ");
                if (j < breakpoint)
                    ch++;
                else
                    ch--;
            }
            System.out.println();
        }
    }

    static void pattern31(int n) {
        for (int i = 0; i < n; i++) {
            for (char ch = (char) ('E' - i); ch <= 'E'; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    static void pattern32(int n) {
        int space = 0;
        for (int i = 0; i < n; i++) {
            // stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            // spaces
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            space += 2;
            System.out.println();
        }
        space = 2 * n - 2;
        for (int i = 1; i <= n; i++) {
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            space -= 2;
            System.out.println();
        }
    }

    static void pattern33(int n) {
        int spaces = 2 * n - 2;
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = i;
            if (i > n)
                stars = 2 * n - i;

            // stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            // spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
            if (i < n)
                spaces -= 2;
            else
                spaces += 2;
        }
    }

    static void pattern34(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i == 0 || j == 0 || i == n-1 || j == n-1) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}