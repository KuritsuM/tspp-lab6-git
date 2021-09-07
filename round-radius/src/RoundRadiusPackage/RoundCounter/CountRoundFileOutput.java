package RoundRadiusPackage.RoundCounter;

import java.io.*;

public class CountRoundFileOutput extends CountRoundImplementation{
    private String outputFileName;

    public CountRoundFileOutput(String inputFileName, String outputFileName) {
        super(RadiusInput.inputRadiusFromFile(inputFileName));
        this.outputFileName = outputFileName;
    }

    public CountRoundFileOutput(float radius, String outputFileName) {
        super(radius);
        this.outputFileName = outputFileName;
    }

    public CountRoundFileOutput(String outputFileName) {
        super(RadiusInput.inputRadiusFromConsole());
        this.outputFileName = outputFileName;
    }

    @Override
    public void squareOutput() {
        try {
            BufferedWriter output = new BufferedWriter(new FileWriter(outputFileName, true));

            output.write("Площадь окружности - " + countSquare());
            output.newLine();

            System.out.println(ConsoleColors.ANSI_GREEN + "Площадь успешно записана в файл!" + ConsoleColors.ANSI_RESET);

            output.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка - файл не найден: ");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void lengthOutput() {
        try {

            BufferedWriter output = new BufferedWriter(new FileWriter(outputFileName, true));

            output.write("Длина окружности - " + countLength());
            output.newLine();

            System.out.println(ConsoleColors.ANSI_GREEN + "Длина успешно записана в файл!" + ConsoleColors.ANSI_RESET);

            output.close();

        } catch (FileNotFoundException e) {
            System.out.println("Ошибка - файл не найден: ");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void fullOutput() {
        radiusOutput();
        lengthOutput();
        squareOutput();
    }

    @Override
    public void radiusOutput() {
        try {
            BufferedWriter output = new BufferedWriter(new FileWriter(outputFileName, true));

            output.write("Радиус окружности - " + super.radius);
            output.newLine();

            System.out.println(ConsoleColors.ANSI_GREEN + "Радиус успешно записан в файл!" + ConsoleColors.ANSI_RESET);

            output.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка - файл не найден: ");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
