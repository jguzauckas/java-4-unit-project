import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Setup {
    public static void writeStringToFile(String str) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("string.txt"));
        writer.write(str);
        writer.close();
    }

    public static void writeAnswerToFile(int partA, int partB) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("answer.txt"));
        String str = "Part A: You end up on floor " + partA + ".\nPart B: You first enter the basement on instruction number " + partB + ".";
        writer.write(str);
        writer.close();
    }

    public static void main(String[] args) {
        int size = 7000;
        String final_str = "";
        int floorCount = 0;
        int basementStep = -1;
        boolean basementYet = false;
        for (int i = 0; i < size; i++) {
            if (Math.random() >= 0.5) {
                final_str += "(";
                floorCount++;
            } else {
                final_str += ")";
                floorCount--;
            }
            if (!basementYet && floorCount == -1) {
                basementStep = i + 1;
                basementYet = true;
            }
        }
        try {
            writeStringToFile(final_str);
            writeAnswerToFile(floorCount, basementStep);    
        } catch (IOException e) {
            System.out.println("Error");
        } finally {
            System.out.println("Done");
        }
    }
}