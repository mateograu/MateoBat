public class Runner {


    public boolean loneTeen(int a, int b) {
        boolean aTeen = (a >= 13 && a <= 19);
        boolean bTeen = (b >= 13 && b <= 19);

        return (aTeen && !bTeen) || (!aTeen && bTeen);
    }

    public boolean arrayFront9(int[] nums) {
        if (nums.length == 0) {
            return false;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9 && i < 4) {
                return true;
            }
        }
        return false;
    }

    public String helloName(String name) {
        return "Hello " + name + "!";

    }


    public boolean lucky13(int[] nums) {
        boolean result = true;
        for (int i = 0; i < nums.length; i++)
            if (nums[i] == 1 || nums[i] == 3)

                return false;
        return true;
    }


    public int sum2(int[] nums) {
        if (nums.length == 0)
            return 0;
        if (nums.length == 1)
            return nums[0];
        else {
            return nums[0] + nums[1];
        }
    }


    public int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++)
            if (str.substring(i, i + 2).equals("hi"))
                count += 1;
        return count;
    }


    public int sortaSum(int a, int b) {
        return (a + b >= 10 && a + b <= 19) ? 20 : a + b;
    }

    public int countYZ(String str) {
        int count = 0;
        str = str.toLowerCase() + " ";
        for (int i = 0; i < str.length() - 1; i++)
            if ((str.charAt(i) == 'y' || str.charAt(i) == 'z') && !Character.isLetter(str.charAt(i + 1)))
                count++;
        return count;
    }

    public boolean canBalance(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int j = 0, l = 0;

            for (int k = 0; k < nums.length; k++) {
                if (k > i) {
                    l += nums[k];
                } else {
                    j += nums[k];
                }
            }
            if (j == l) {
                return true;
            }
        }

        return false;
    }

}