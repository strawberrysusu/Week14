import java.io.File;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("경로를 입력해주세요! : ");
        String filePath = sc.nextLine();

        File file = new File(filePath);
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.length()+ " bytes");

    }
}