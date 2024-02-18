public class DNA {
    // Property initialization; array of object NucleicAcid.
    private NucleicAcid[] LtoRHelix;
    private NucleicAcid[] RtoLHelix;

    // Default constructor initialization.
    public DNA() {

    }

    // Overloaded constructor containing the LtoRHelixPopulate method and code
    // to populate the RtoLHelix.
    public DNA(String strand) {
        LtoRHelixPopulate(strand);

        this.RtoLHelix = new NucleicAcid[strand.length()];

        for (int i = 0; i < strand.length(); i++) {
            char acidComp = strand.charAt(i);

            switch (acidComp) {
                case 'A': {
                    this.RtoLHelix[i] = new NucleicAcid("Thymine", "C5H6N2O2", 126.115f, 1.223f);
                    break;
                }
                case 'T': {
                    this.RtoLHelix[i] = new NucleicAcid("Adenine", "C5H5N5", 135.13f, 1.6f);
                    break;
                }
                case 'C': {
                    this.RtoLHelix[i] = new NucleicAcid("Guanine", "C5H5N5O", 151.13f, 2.200f);
                    break;
                }
                case 'G': {
                    this.RtoLHelix[i] = new NucleicAcid("Cytosine", "C4H5N3O", 111.10f, 1.55f);
                    break;
                }
                default:
                    throw new IllegalStateException("Unexpected value: " + acidComp);
            }
        }
    }


    // Method that utilizes the strand pulled via the DNADriver class.
    public void LtoRHelixPopulate(String strand) {
        this.LtoRHelix = new NucleicAcid[strand.length()];

        // A for-loop which parses the nucleic acids within and of the length of the strand;
        // utilizing a switch statement  to  assign the properties of the nucleic acids found in DNA and RNA.
        for (int i = 0; i < strand.length(); i++) {
            char currAcid = strand.charAt(i);

            switch (currAcid) {
                case 'A': {
                    this.LtoRHelix[i] = new NucleicAcid("Adenine", "C5H5N5", 135.13f, 1.6f);
                    break;
                }
                case 'T': {
                    this.LtoRHelix[i] = new NucleicAcid("Thymine", "C5H6N2O2", 126.115f, 1.223f);
                    break;
                }
                case 'C': {
                    this.LtoRHelix[i] = new NucleicAcid("Cytosine", "C4H5N3O", 111.10f, 1.55f);
                    break;
                }
                case 'G': {
                    this.LtoRHelix[i] = new NucleicAcid("Guanine", "C5H5N5O", 151.13f, 2.200f);
                    break;
                }
                default:
                    throw new IllegalStateException("Unexpected value: " + currAcid);
            }
        }
    }

    // Print method that prints out the properties of the nucleotides in both helical arrays.
    public void print() {
        System.out.println("[!] - Printing: Left to Right Helix Nucleotide Properties...");
        for (int i = 0; i < LtoRHelix.length; i++) {
            NucleicAcid lrProp = LtoRHelix[i];
            lrProp.nucPrint();
        }
        System.out.println("[!] - Completed!");

        System.out.println("[!] - Printing: Right to Left Helix Nucleotide Properties...");
        for (int i = 0; i < RtoLHelix.length; i++) {
            NucleicAcid rlProp = RtoLHelix[i];
            rlProp.nucPrint();
        }
        System.out.println("[!] - Completed!");
    }

    // Print method which parses through both helical arrays and determines the highest molar mass
    // at every index within the arrays, then prints out the first occurrence of the highest mass.
    public void highestMolarMass() {
        System.out.println("[!] - Printing: Molar Mass & Indices... ");
        int highestIndex = -1;
        float highestMass = 0;

        System.out.println("[!] - Printing: LtoR Helix Masses & Indices...");


        for (int i = 0; i < LtoRHelix.length; i++) {
            NucleicAcid lrMass = LtoRHelix[i];
            float mass = lrMass.getMolarMass();

            if (mass > highestMass) {
                highestMass = mass;
                highestIndex = 1;
            }

            System.out.println("The highest molar mass in the Left to Right helix at " + i + "  is... " + highestMass);
        }

        if (highestIndex != -1) { // Check if a higher mass was found
            System.out.println("The highest molar mass in the Left to Right helix is " + highestMass +
                    " at index " + highestIndex);
        }

        System.out.println("[!] - Completed!");

        System.out.println("[!] - Printing: RtoL Helix Masses & Indices...");

        for (int i = 0; i < RtoLHelix.length; i++) {
            NucleicAcid rlMass = RtoLHelix[i];
            float mass = rlMass.getMolarMass();

            if (mass > highestMass) {
                highestMass = mass;
                highestIndex = 1;
            }

            System.out.println("The highest molar mass in the Right to Left helix at " + i + "  is... " + highestMass);
        }

        if (highestIndex != -1) { // Check if a higher mass was found
            System.out.println("The highest molar mass in the Right to Left helix is " + highestMass +
                    " at index " + highestIndex);
        }

        System.out.println("[!] - Completed!");
    }

    // Final print method which summates the densities of all indices in each helical array.
    public void totalDensity(){
        System.out.println("[!] - Printing: Left to Right Helix Density...");

        float totalDensity = 0;
        for (int i = 0; i < LtoRHelix.length; i++) {
            NucleicAcid lrDens = LtoRHelix[i];
            float density = lrDens.getDensity();

            totalDensity += density;
        }

        System.out.println("[*] - The total density from left to right is... " + totalDensity + " g/cm3.");

        System.out.println("[!] - Printing: Right to Left Helix Density...");

        for (int i = 0; i < RtoLHelix.length; i++) {
            NucleicAcid rlDens = RtoLHelix[i];
            float density = rlDens.getDensity();

            totalDensity += density;
        }

        System.out.println("[*] - The total density from right to left is... " + totalDensity + " g/cm3.");
    }
}
