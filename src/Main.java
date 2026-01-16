//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("숫자를 입력하시오");

        int num = NumberInput.resultNumber();
        String result = CheckNumber.checkNumber(num);
        System.out.println(result);
    }
}
