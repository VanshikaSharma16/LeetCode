class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top = 0, right = matrix[0].length - 1, bottom = matrix.length - 1, left = 0;
        // int l = matrix.length;
        List<Integer> arr1 = new ArrayList<>();
        if (matrix.length == 0)
            return arr1;

        while (top <= bottom && left <= right) {
            for (int j = left; j <= right; j++) {
                arr1.add(matrix[top][j]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                arr1.add(matrix[i][right]);
            }
            right--;
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    arr1.add(matrix[bottom][j]);
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    arr1.add(matrix[i][left]);
                }
                left++;
            }
        }
        return arr1;
    }
}