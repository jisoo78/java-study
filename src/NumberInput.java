import java.util.Scanner;

public class NumberInput {
    public static int resultNumber() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                return scanner.nextInt(); // 성공 시 바로 반환
            } catch (Exception e) {
                System.out.println("정수를 입력하시오");
                scanner.next(); // 잘못된 입력 버리기
            }
        }
    }
}
