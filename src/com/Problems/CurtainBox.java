package com.Problems;
//A furnishing company is manufacturing a new collection of curtains. The curtains are of two colors aqua(a)
// and black (b). The curtains color is represented as a string(str) consisting of a’s and b’s of length N.
// Then, they are packed (substring) into L number of curtains in each box. The box with the maximum number of
// ‘aqua’ (a) color curtains is labeled. The task here is to find the number of ‘aqua’ color curtains in the labeled
// box.
public class CurtainBox {

    public static int maxAquaCurtains(String str, int L) {
        int n = str.length();
        if (L > n) return 0;

        int maxAqua = 0;
        int currentAqua = 0;

        while(L<n) {
            int j=0;
            // Count 'a' in the first window
            for (int i = j; i < L; i++) {
                if (str.charAt(i) == 'a') {
                    currentAqua++;
                }

                if (currentAqua > maxAqua) {
                    maxAqua = currentAqua;
                }


            }
            j=j+L;
            if(L+L < n){
                L+=L;
            }else{
                L=n;
            }


        }

        return maxAqua;
    }

    public static void main(String[] args) {
        String str = "abbbaabbb";
        int L = 5;
        System.out.println("Max aqua curtains in any box: " + maxAquaCurtains(str, L));
    }
}
