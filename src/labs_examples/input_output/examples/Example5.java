package labs_examples.input_output.examples;

/* Copy a text file.
   To use this program, specify the name
   of the source file and the destination file.
   For example, to copy a file called FIRST.TXT
   to a file called SECOND.TXT, use the following
   command line.

   java CopyFile FIRST.TXT SECOND.TXT
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class CopyFile {
    public static void main(String args[]) throws IOException
    {
        int i;

        String fileReadPath = "src/labs_examples/input_output/files/char_data.txt";
        String fileWritePath = "src/labs_examples/input_output/files/char_data_rewrite.txt";

        FileInputStream fin = null; //identifies an object, but doesn't create it.
        FileOutputStream fout = null;

        // Copy a File.
        try {
            // Attempt to open the files.
            fin = new FileInputStream(fileReadPath); //creates the object
            fout = new FileOutputStream(fileWritePath);

            do {
                i = fin.read();
                if(i != -1)
                    if ((char) i == '.')
                        i = '!';
                    fout.write(i);
            } while(i != -1);

        } catch(IOException exc) {
            System.out.println("I/O Error: " + exc);
        } finally {
            try {
                if(fin != null) { //if we created an object
                    fin.close();
                }
            } catch(IOException exc) {
                System.out.println("Error Closing Input File");
            }
            try {
                if(fout != null) {
                    fout.close();
                }
            } catch(IOException exc) {
                System.out.println("Error Closing Output File");
            }
        }
    }
}