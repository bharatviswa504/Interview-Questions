package bh.algo.area;

import java.util.Stack;

/**
 * Created by bharatviswanadham on 6/10/17.
 */
public class MaxRectangleAreaHistogram {

    public static void main(String args[]) throws Exception {
        int size = 5;
        int histo[] = new int[size];
        for (int i = 0; i < size; i++) {
            histo[i] = i + 1;
        }

        int area = maxRectAreainHistogram(histo, size);
        System.out.println("max rectangle area:" + area);

        int[] histo1 = new int[]{1, 2, 3, 4, 1};
        area = maxRectAreainHistogram(histo1, size);
        System.out.print("max rectangle area:" + area);

    }

    public static int maxRectAreainHistogram(final int histo[], int size) {
        Stack<Integer> stack = new Stack<>();
        int area = 0;
        int maxArea = -1;

        int i = 0;
        for (i = 0; i < size; ) {
            if (stack.isEmpty() || histo[i] >= histo[stack.peek()]) {
                stack.add(i++);
            } else {
                int top = stack.pop();
                if (stack.isEmpty()) {
                    area = histo[top] * i;
                } else {
                    area = histo[top] * (i - stack.peek() - 1);
                }
                if (area > maxArea) {
                    maxArea = area;
                }
            }
        }

        while (!stack.isEmpty()) {
            int top = stack.pop();
            if (stack.isEmpty()) {
                area = histo[top] * i;
            } else {
                area = histo[top] * (i - stack.peek() - 1);
            }
            if (area > maxArea) {
                maxArea = area;
            }
        }

        return maxArea;

    }
}
