package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 2: File encryption
 *
 *      -Using the BufferedReader, read a file character by character and write an encrypted version to a new file.
 *      -For example, change every 'a' to '-' and every 'e' to '~' .
 *      -Make sure you close the connections to both files.
 *
 *      Then, ead back the encrypted file using the BufferedReader and
 *      print out the unencrypted version. Does it match the original file?
 *
 */
class Exercise_02 {
    public static void main(String[] args) {
        BufferedReader inputStream = null;
        BufferedReader inputStreamEncrypted = null;

        PrintWriter outputStream = null;
        try {

            inputStream = new BufferedReader(new FileReader("src/labs_examples/input_output/files/char_data.txt"));
            outputStream = new PrintWriter(new FileWriter("src/labs_examples/input_output/files/char_data_encrypted.txt"));
            inputStreamEncrypted = new BufferedReader(new FileReader("src/labs_examples/input_output/files/char_data_encrypted.txt"));

            String l;
            String p;
            while ((l = inputStream.readLine()) != null) {
                // write entire line to output stream
                l = l.replace("a", "$");
                l = l.replace("b", "#");
                l = l.replace("c", "@");
                l = l.replace("d", "!");
                l = l.replace("e", ")");
                l = l.replace("f", "*");
                l = l.replace("g", "(");
                l = l.replace("h", "^");
                l = l.replace("i", "-");
                l = l.replace("j", "#");
                l = l.replace("k", "=");
                l = l.replace("l", "+");
                l = l.replace("m", "`");
                l = l.replace("n", "~");
                l = l.replace("o", "?");
                l = l.replace("p", "|");
                l = l.replace("q", "'");
                l = l.replace("r", "/");
                l = l.replace("s", ">");
                l = l.replace("t", "<");
                l = l.replace("u", ".");
                l = l.replace("v", ",");
                l = l.replace("w", "&");
                l = l.replace("x", ";");
                l = l.replace("y", ":");
                l = l.replace("z", "]");
                outputStream.println(l);
                System.out.println(inputStream.readLine());
                System.out.println(inputStreamEncrypted.readLine());
            }


        } catch (IOException exc){
            System.out.println("An error occurred: " + exc.getMessage());
        } finally {
            // close connections
            try{
                inputStream.close();
            } catch(IOException exc){
                exc.printStackTrace();
            }
            outputStream.close();

        }
    }
}