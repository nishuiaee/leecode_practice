package Sort;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-30 11:02
 **/
public class Contest11_30 {


    private void quickSort(String[][] students, int start, int end) {
        if (start < end) {
            String vot0 = students[start][0];
            String vot1 = students[start][1];
            int i = start;
            int j = end;
            while (i != j) {
                while (i < j && students[j][1].compareTo(vot1) <= 0) j--;
                if (i < j) {
                    students[i][0] = students[j][0];
                    students[i++][1] = students[j][1];
                }
                while (i < j && students[i][1].compareTo(vot1) >= 0) i++;
                if (i < j) {
                    students[j][0] = students[i][0];
                    students[j--][1] = students[j][1];
                }
            }
            students[i][0] = vot0;
            students[i][1] = vot1;
            quickSort(students, start, i - 1);
            quickSort(students, i + 1, end);
        }
    }


    public static void main(String[] args) {
        String[][] students = new String[4][2];
        for (int i = 0; i < 4; i++) {
            students[i][0] = Character.toString('a' + i);
            students[i][1] = Integer.toString(i + 10);
        }
        for (int i = 0; i < 4; i++) {
            System.out.println(students[i][0] + ":" + students[i][1]);
        }
        new Contest11_30().quickSort(students, 0, students.length - 1);
        for (int i = 0; i < 4; i++) {
            System.out.println(students[i][0] + ":" + students[i][1]);
        }

    }
}
