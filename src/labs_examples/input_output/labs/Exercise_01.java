package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 1: File input/output
 *
 *      Using the BufferedInputStream, read a text file 5 bytes at a time and write each byte to a new file.
 *      Make sure you close the connections to both files.
 *
 *
 */

class Example {
    public static void main(String[] args) throws IOException {
        FileOutputStream out = null;
        BufferedInputStream bufferedIn = null;
        String filePathIn = "src/labs_examples/input_output/files/byte_data";
        String filePathOut = "src/labs_examples/input_output/files/outputFile.txt";


        try {
            bufferedIn = new BufferedInputStream(new FileInputStream(filePathIn));
            out = new FileOutputStream(filePathOut);
            byte[] buffer = new byte[5];
            int bytesRead = 0;
            int c;

        while ((c = bufferedIn.read()) != -1) {
            out.write(c);

        }
        } catch (IOException exc){
            System.out.println("An error occurred: " + exc.getMessage());
        } finally {
            // close connections to files
            if (bufferedIn != null) {
                bufferedIn.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}