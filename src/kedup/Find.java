package kedup;

public class Find {
    public static boolean find(int target, int[][] array) {
        if (array[0].length == 0 || array.length == 0 || array == null) {
            return false;
        }

        //确立边界条件
        int row = array.length;
        int col = array[0].length;

        //确立游标位置
        int r = 0, c = col - 1;
        while (r < row && c >= 0) {
            if (target == array[r][c]) {
                return true;
            } else if (target > array[r][c]) {
                r++;
            } else {
                c--;
            }
        }
        return false;

    }

    public static void main(String[] args) {

        int[][] array =
                {
                        {1, 4, 7, 11, 15},
                        {2, 5, 8, 12, 19},
                        {3, 6, 9, 16, 22},
                        {10, 13, 14, 17, 24},
                        {18, 21, 23, 26, 30}
                };
        int target = 30;
        System.out.println(find(target, array));
    }
}
