package pl.gawly;

import java.util.Arrays;

public class Solution {

    public int solution(int[] A) {

        Arrays.sort(A);

        int productWithoutNeg = A[A.length-3] * A[A.length-2] * A[A.length-1];
        int productWithNegMaybe = A[0] * A[1] * A[A.length-1];

        return productWithoutNeg > productWithNegMaybe ? productWithoutNeg : productWithNegMaybe;
    }
}
