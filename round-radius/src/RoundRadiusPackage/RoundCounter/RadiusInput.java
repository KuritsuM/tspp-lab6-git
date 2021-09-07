package RoundRadiusPackage.RoundCounter;

import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class RadiusInput {
    private static float scanRadius() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите радиус окружности: ");

        return scanner.nextFloat();
    }

    public static float inputRadiusFromConsole() {
        boolean invalidValue = false;
        float radius = 0;
        do {
            try {
                invalidValue = false;
                radius = scanRadius();
            }
            catch (InputMismatchException e) {
                System.out.println("Ошибка при вводе. Попробуйте снова!");
                invalidValue = true;
            }
        } while (invalidValue);

        return radius;
    }

    public static float inputRadiusFromFile(String fileName) {
        File file = new File(fileName);

        try  {
            Scanner scanner = new Scanner(file);
            if (scanner.hasNextFloat()) {
                return scanner.nextFloat();
            }
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            }
            if (scanner.hasNextDouble()) {
                return (float)scanner.nextDouble();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return -1;
    }
}
