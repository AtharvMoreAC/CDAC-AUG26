import java.io.*;

public class FileEncryption {
	
	static void encryptFile() throws IOException {

	    FileReader fr = new FileReader("input.txt");
	    FileWriter fw = new FileWriter("encrypted.txt");

	    int ch;

	    while ((ch = fr.read()) != -1) {
	        fw.write(ch + 3);
	    }

	    fr.close();
	    fw.close();

	    System.out.println("File encrypted successfully.");
	}
	
	static void decryptFile() throws IOException {

	    FileReader fr = new FileReader("encrypted.txt");
	    FileWriter fw = new FileWriter("decrypted.txt");

	    int ch;

	    while ((ch = fr.read()) != -1) {
	        fw.write(ch - 3);
	    }

	    fr.close();
	    fw.close();

	    System.out.println("File decrypted successfully.");
	}

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        int choice;

        do {

            System.out.println("\n--- File Encryption and Decryption ---");
            System.out.println("1. Encrypt File");
            System.out.println("2. Decrypt File");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(br.readLine());

            switch (choice) {

                case 1:
                	encryptFile();
                    break;

                case 2:
                    System.out.println("Decryption selected");
                    break;

                case 3:
                    System.out.println("Program terminated.");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 3);
    }
}