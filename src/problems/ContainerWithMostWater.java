package problems;

public class ContainerWithMostWater {

    public static int maxArea(int[] height) {

        int maxArea = 0;

        for (int i = 0; i < height.length; i++) {
            for (int j = 0; j < height.length; j++) {
                maxArea = Math.max(maxArea, (Math.min(height[i], height[j]) * (j - i)));
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        System.out.print(maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }
}
