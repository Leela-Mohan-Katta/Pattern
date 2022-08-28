public class Pattern {
    public static void main(String[] args) {
        Pattern7 p=new Pattern7();
        p.call();
    }
    public static class Pattern1 {
        /* printng pattern
         *****
         *****
         *****
         *****
         *****
         */
        void call() {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
    public static class Pattern2 {
        /* printng pattern
         *
         **
         ***
         ****
         */
        void call() {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
    public static class Pattern3 {
        /* printng pattern
            1
            12
            123
            1234
            12345
         */
        void call() {
            for (int i = 1; i < 7; i++) {
                for (int j = 1; j < i; j++) {
                    System.out.print(j);
                }
                System.out.println();
            }
        }
    }
    public static class Pattern4 {
        /* printng pattern
           1
           22
           333
           4444
           55555
         */
        void call() {
            int c=0;
            for (int i = 1; i < 7; i++) {
                for (int j = 1; j < i; j++) {
                    System.out.print(c);
                }
                c++;
                System.out.println();
            }
        }
    }
    public static class Pattern5 {
        /* printng pattern

         ******
         *****
         ****
         ***
         **
         *

         */
        void call() {
            int C=6;
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < C; j++) {
                    System.out.print("*");
                }
                C--;
                System.out.println();
            }
        }
    }
    public static class Pattern6 {
        /* printng pattern

         12345
         1234
         123
         12
         1

         */
        void call() {
            int C=6;
            for (int i = 0; i < 6; i++) {
                for (int j = 1; j < C; j++) {
                    System.out.print(j);
                }
                C--;
                System.out.println();
            }
        }
    }
    public static class Pattern7 {
        /* printng pattern
         *****
         *   *
         *   *
         *   *
         *****
         */
        void call() {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if(i==0 || j==0 || i==4 || j==4)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}
