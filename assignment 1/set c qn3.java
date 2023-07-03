//Write a java program for union of two integer array.

class UnionX{
    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40, 50};
        int b[] = {20, 40, 60, 10, 80,120,160,15};
        int union2[] = new int[10];
        int insertionIndex = 0;
        for (int i = 0; i < a.length; i++) {
            int breakFlag = 0;
            for (int j = 0; j < union2.length; j++) {
                if (union2[j] == a[i]){
                    breakFlag = 1;
                    break;
                }
            }
            if (breakFlag == 0){
                union2[insertionIndex] = a[i];
                insertionIndex++;
            }
        }
        for (int i = 0; i < b.length; i++) {
            int breakFlag = 0;
            for (int j = 0; j < union2.length; j++) {
                if (union2[j] == b[i]){
                    breakFlag = 1;
                    break;
                }
            }
            if (breakFlag == 0){
                union2[insertionIndex] = b[i];
                insertionIndex++;
            }
        }
        for (int i = 0; i < union2.length; i++) {
            if (union2[i] == 0) continue;
            System.out.println(union2[i]+" ");
        }
    }
}