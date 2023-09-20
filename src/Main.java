import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = new int [] {1, 2, 3, 4};
        int[] arr2 = new int [] {1, 2, 3, 4};
        int[] arr3 = new int [] {1, 2, 4, 3};

        System.out.println("is arr1 equals to arr2 : " +
                Arrays.equals(arr1, arr2));
        System.out.println("is arr1 equals to arr3 : " +
                Arrays.equals(arr1, arr3)+"\n");


        Student [] arrays1 = {new Student(111, "bbbb", "london"),
                new Student(131, "aaaa", "nyc"),
                new Student(121, "cccc", "jaipur")};

        Student [] arrays2 = {new Student(111, "bbbb", "london"),
                new Student(131, "aaaa", "nyc"),
                new Student(121, "cccc", "jaipur")};

        Student [] arrays3 = {new Student(111, "bbbb", "london"),
                new Student(121, "dddd", "jaipur"),
                new Student(131, "aaaa", "nyc"),
        };

        System.out.println("is arr1 equals to arr2 : " +
                Arrays.equals(arrays1, arrays2));
        System.out.println("is arr1 equals to arr3 : " +
                Arrays.equals(arrays1, arrays3)+"\n");


        int[][] arr5 = { { 0, 1 }, { 1, 0 } };
        int[][] arr6 = { { 0, 1 }, { 1, 0 } };

        System.out.println("is arr1 equals to arr2 : "
                + Arrays.equals(arr5, arr6));
        System.out.println("is arr1 deepequals to arr2 : "
                + Arrays.deepEquals(arr5, arr6));
    }
}