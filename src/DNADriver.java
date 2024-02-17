import java.util.Scanner;
public class DNADriver {
    public static void main(String[] args) {
        Scanner uI = new Scanner(System.in);
        System.out.println("[?] - Please enter a sequence of nucleotides: ");
        DNA a1 = new DNA(uI.next());
        uI.close();

        System.out.println("[!] - Printing Helix Properties...");
        a1.print();
    }
}
