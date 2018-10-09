import java.util.*;

class majority
{

public static void main(String[] args) 
{
 
 int[] array = { 6, 6, 2, 2, 6, 2, 2, 8, 2, 1 };
 System.out.println(Arrays.toString(array) + " \nMajority Element: " + getMajorityElement(array));

}

public static Integer getMajorityElement(int[] array) {
 
        if (array == null || array.length == 0) {
            return null;
        }
 
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if (count > array.length / 2) {
                return array[i];
            }
        }
        return null;
    }
}
 



