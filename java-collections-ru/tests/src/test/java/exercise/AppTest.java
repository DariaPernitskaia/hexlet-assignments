package exercise;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;


class AppTest {

    @Test
    void testTake() {
        // BEGIN
        List<Integer> input1 = Arrays.asList(1, 2, 3, 4, 5);
        int n1 = 3;
        List<Integer> expected1 = Arrays.asList(1, 2, 3);
        List<Integer> result1 = Take.take(input1, n1);
        System.out.println(result1.equals(expected1));


        List<Integer> input2 = Arrays.asList(1, 2, 3);
        int n2 = 5;
        List<Integer> expected2 = Arrays.asList(1, 2, 3);
        List<Integer> result2 = Take.take(input2, n2);
        System.out.println(result2.equals(expected2));


        List<Integer> input3 = Arrays.asList(1, 2, 3, 4, 5);
        int n3 = 0;
        List<Integer> expected3 = new ArrayList<>();
        List<Integer> result3 = Take.take(input3, n3);
        System.out.println(result3.equals(expected3));


        List<Integer> input4 = new ArrayList<>();
        int n4 = 3;
        List<Integer> expected4 = new ArrayList<>();
        List<Integer> result4 = Take.take(input4, n4);
        System.out.println(result4.equals(expected4));
    }
}
