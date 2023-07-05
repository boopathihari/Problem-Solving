import java.util.*;

public class MergeInterval {

    public static int[][] merge(int[][] intervals) {
        List<int[]> res = new ArrayList<>();

        if (intervals.length == 0 || intervals == null) {
            return res.toArray(new int[res.size()][]);
        }

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int[] arr : intervals) {
            if (arr[0] <= end) {
                end = Math.max(end, arr[1]);
            } else {
                res.add(new int[] { start, end });
                start = arr[0];
                end = arr[1];
            }
        }

        res.add(new int[] { start, end });

        return res.toArray(new int[res.size()][]);
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
        // int[][] arr = {};

        int[][] newres = merge(arr);

        for (int[] res : newres) {
            System.out.println(Arrays.toString(res) + "\n");
        }

    }

}
