public class DNA {
    private NucleicAcid[] LtoRHelix;
    private NucleicAcid[] RtoLHelix;

    public DNA() {

    }

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


    public void LtoRHelixPopulate(String strand) {
        this.LtoRHelix = new NucleicAcid[strand.length()];


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

   /*public void highestMolarMass(){
        System.out.println("[!] - Printing: Indice )
        if(currMolarMass > highestMolarMass){
            highestMolarMass = currMolarMass;
            highestIndex=i;
        }
    }
    */
    public void totalDensity(){
        for (int i = 0; i < LtoRHelix.length; i++){

        }
    }
}
