package RoundRadiusPackage;

import RoundRadiusPackage.RoundCounter.ConsoleColors;
import RoundRadiusPackage.RoundCounter.CountRound;
import RoundRadiusPackage.RoundCounter.CountRoundConsoleOutput;
import RoundRadiusPackage.RoundCounter.CountRoundFileOutput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Round {


    public static void main(String[] args) {
        String inputFile = null, outputFile = null;

        for (int i = 0; i < args.length; i += 2) {
            if (args[i].equals("-i")) inputFile = args[i+1];
            if (args[i].equals("-o")) outputFile = args[i+1];
        }

        CountRound countRound = countRoundFactory(inputFile, outputFile);

        countRound.fullOutput();
    }

    public static CountRound countRoundFactory(String inputFile, String outputFile) {
        if (outputFile != null && inputFile != null) return new CountRoundFileOutput(inputFile, outputFile);
        if (outputFile != null) return new CountRoundFileOutput(outputFile);
        if (inputFile != null) return new CountRoundConsoleOutput(inputFile);
        return new CountRoundConsoleOutput();
    }
}
