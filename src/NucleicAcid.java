public class NucleicAcid {
    private String name;
    private String chemicalFormula;
    private float molarMass;
    private float density;

    public NucleicAcid(String name, String chemicalFormula, float molarMass, float density){
        this.name = name;
        this.chemicalFormula = chemicalFormula;
        this.molarMass = molarMass;
        this.density = density;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChemicalFormula() {
        return chemicalFormula;
    }

    public void setChemicalFormula(String chemicalFormula) {
        this.chemicalFormula = chemicalFormula;
    }

    public float getMolarMass() {
        return molarMass;
    }

    public void setMolarMass(float molarMass) {
        this.molarMass = molarMass;
    }

    public float getDensity() {
        return density;
    }

    public void setDensity(float density) {
        this.density = density;
    }

    public void print(){
        System.out.printf("%n");
        System.out.printf("[%s]%n", name);
        System.out.printf("Chemical Formula - [%s]%n", chemicalFormula);
        System.out.printf("Molar Mass - [%.5f] g/mol%n", molarMass);
        System.out.printf("Density - [%.3f] g/cm3%n", density);
        System.out.printf("%n");
    }
}
