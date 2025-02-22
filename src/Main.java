import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arrayResult = new int[10];
        int count = 0;

        while (true) {
            System.out.println("첫번째 수를 입력해주세요.");
            int num1 = sc.nextInt();

            System.out.println("연산기호를 입력해주세요");
            String etc = sc.next();

            System.out.println("두번째 수를 입력해주세요");
            int num2 = sc.nextInt();

            System.out.println();

            int result = 0;
            boolean vaildation = true;

            if (etc.equals("+")) {
                result = num1 + num2;

                System.out.println(num1 + " + " + num2 + " = " + result + "입니다.");

            } else if (etc.equals("-")) {
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result + "입니다.");

            } else if (etc.equals("*")) {
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result + "입니다.");

            } else if (etc.equals("/")) {
                if(num2 == 0){
                    System.out.println("0으로 나눌 수 없습니다.");
                    vaildation = false;
                }
                result = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + result + "입니다.");

            } else if (etc.equals("%")) {
                result = num1 % num2;
                System.out.println(num1 + " % " + num2 + " = " + result + "입니다.");

            } else {
                System.out.println("입력 값이 잘못되었습니다.");
                vaildation = false;
            }

            if(vaildation && count < 10){
                arrayResult[count] = result;
                count++;
            } else if (count >= 10) {
                System.out.println("연산 결과가 가득 찼습니다 초기화를 원하십면 y를 눌러주세요");
                String arrayClear = sc.next();
                if(arrayClear.equals("y")){
                    arrayResult = new int[10];
                    count = 0;
                    System.out.println("초기화 되었습니다.");
                }
            }

            System.out.println("연산 결과를 확인하고 싶으면 y를 눌러주세요");
            String resultArray = sc.next();
            if(resultArray.equals("y")) {
                if (count > 0) {
                    for (int i = 0; i < count; i++) {
                        System.out.println((i + 1) + "번째 연산 결과 : " + arrayResult[i]);
                    }
                }
            } else{
                    System.out.println("연산 결과가 없습니다.");
                }

            System.out.println("프로그램을 다시 시작하려면 y or n 을 입력해주세요.");
            String answer = sc.next();
            if(answer.equals("n")){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}