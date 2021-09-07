package RoundRadiusPackage.RoundCounter;

public class CountRoundConsoleOutput extends CountRoundImplementation {
    public CountRoundConsoleOutput(float radius) {
        super(radius);
    }

    public CountRoundConsoleOutput() {
        super(RadiusInput.inputRadiusFromConsole());
    }

    public CountRoundConsoleOutput(String inputFileName) {
        super(RadiusInput.inputRadiusFromFile(inputFileName));
    }


    @Override
    public void squareOutput() {
        System.out.println(ConsoleColors.ANSI_RED + "Площадь окружности - " + ConsoleColors.ANSI_CYAN + countSquare() +
                ConsoleColors.ANSI_RESET);
    }

    @Override
    public void lengthOutput() {
        System.out.println(ConsoleColors.ANSI_RED + "Длина окружности - " + ConsoleColors.ANSI_CYAN + countLength() +
                ConsoleColors.ANSI_RESET);
    }

    @Override
    public void fullOutput() {
        radiusOutput();
        lengthOutput();
        squareOutput();
    }

    @Override
    public void radiusOutput() {
        System.out.println(ConsoleColors.ANSI_RED + "Радиус окружности - " + ConsoleColors.ANSI_CYAN + super.radius +
                ConsoleColors.ANSI_RESET);
    }
}
