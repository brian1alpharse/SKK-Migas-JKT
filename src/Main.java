public class Main {
    public static void main(String[] args) {
        System.out.println("====== No 1 ======");
        okYesFunction(15);
        System.out.println("====== No 2 ======");
        fourTypeFunction(5);
        System.out.println("====== No 3 ======");
        int[] n = {12, 9, 13, 6, 10, 4, 7, 2};
        arraySort(n);
    }

    private static void okYesFunction(int n) {
        int a = 3;
        int constantThree = 3;
        int b = 4;
        int constantFour = 4;
        for (int i = 1; i <= n; i++) {
            if (i == a && i == b){
                System.out.print("OKYES ");
                a += constantThree;
                b += constantFour;
            } else if (i == a){
                System.out.print("OK ");
                a += constantThree;
            } else if (i == b){
                System.out.print("YES ");
                b += constantFour;
            } else {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    private static void fourTypeFunction(int n) {
        int a = 1;
        System.out.println("Type A:");
        for (int i = 1; i <= n; i++) {
            if (i == a){
                for (int j = 1; j <= a; j++) {
                    System.out.print(a);
                }
                System.out.println();
            }
            a++;
        }
        System.out.println("Type B:");
        int bIncrease = 1;
        int bDecrease;
        int bConstant;
        for (int i = 1; i <= n; i++) {
            bConstant = bIncrease;
            if (i == bConstant){
                bDecrease = bConstant;
                for (int j = 1; j <= bConstant; j++) {
                    System.out.print(bDecrease);
                    bDecrease--;
                }
                System.out.println();
            }
            bIncrease++;
        }
        System.out.println("Type C:");
        int cIncrease = 1;
        int cSubIncrease = 1;
        int cDecrease = n;
        int cConstant;
        for (int i = 1; i <= n; i++) {
            cConstant = cIncrease;
            if (i == cConstant) {
                for (int j = 1; j <= cConstant; j++) {
                    if (cSubIncrease == n*2) {
                        cSubIncrease = 1;
                        cDecrease = n;
                        System.out.print(cSubIncrease+=1);
                    } else if (cSubIncrease >= n) {
                        System.out.print(cDecrease);
                        cDecrease--;
                    } else if (cDecrease > 0) {
                        System.out.print(cSubIncrease);
                    }
                    cSubIncrease++;
                }
                System.out.println();
            }
            cIncrease++;
        }
        System.out.println("Type D:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j % 2 == 0) {
                    System.out.print((j * n) - (i - 1) + " ");
                } else {
                    System.out.print(((j - 1) * n) + i + " ");
                }
            }
            System.out.println();
        }
    }

    private static void arraySort(int[] n) {
        int count = 0;
        for (int value : n) {
            if (value % 3 != 0) {
                count++;
            }
        }

        int[] filteredArray = new int[count];
        int index = 0;
        for (int value : n) {
            if (value % 3 != 0) {
                filteredArray[index++] = value;
            }
        }

        for (int i = 0; i < filteredArray.length - 1; i++) {
            for (int j = 0; j < filteredArray.length - i - 1; j++) {
                if (filteredArray[j] > filteredArray[j + 1]) {
                    int temp = filteredArray[j];
                    filteredArray[j] = filteredArray[j + 1];
                    filteredArray[j + 1] = temp;
                }
            }
        }

        System.out.println("Output array sorted:");
        for (int value : filteredArray) {
            System.out.print(value + " ");
        }
    }
}