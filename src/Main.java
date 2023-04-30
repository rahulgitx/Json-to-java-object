import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String inputUrl="D:\\Incedo\\Java\\Gradle\\Json-to-java-object\\src\\inputFiles\\text.txt";
        String outputUrl="D:\\Incedo\\Java\\Gradle\\Json-to-java-object\\src\\outputfiles\\filename.txt";


        // Passing the path to the file that is to be read as a parameter
        FileReader fr = new FileReader(inputUrl);

        // creating a file
        try {
            File myObj = new File(outputUrl);
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            return;
        }

        BufferedReader reader = new BufferedReader(new FileReader(inputUrl));
        String line = reader.readLine();

        while (line != null) {
//            System.out.println(line);

            // algorithm logic on string line
            NewString newString = new NewString();
            String newLine = newString.getString(line);
            System.out.println(newLine);

            // append the modified line into new file
            FileOutputStream fos=new FileOutputStream(outputUrl, true);
            String str='\t'+newLine+'\n';
            byte[] b= str.getBytes();       //converts string into bytes
            fos.write(b);           //writes bytes into file
            fos.close();

            // read next line
            line = reader.readLine();
        }




    }
}