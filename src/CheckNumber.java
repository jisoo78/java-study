public class CheckNumber {

    public static String checkNumber(int num) {

        if (num == 0) {
            return "0";
        }

        String result;

        if (num > 0) {
            result = "양수";
        } else {
            result = "음수";
        }

        if (num % 2 == 0) {
            result += " 짝수";
        } else {
            result += " 홀수";
        }

        return result;
    }
}
