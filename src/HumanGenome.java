public class HumanGenome {

    private String genomeName;
    private int geneNum;
    private int chromeNum;
    private int cellNum;

    public HumanGenome(String genomeName, int geneNum, int chromeNum, int cellNum){
        this.genomeName = genomeName;
        this.geneNum = geneNum;
        this.chromeNum = chromeNum;
        this.cellNum = cellNum;
    }

    public String getGenomeName() {
        return genomeName;
    }

    public void setGenomeName(String genomeName) {
        this.genomeName = genomeName;
    }

    public int getGeneNum() {
        return geneNum;
    }

    public void setGeneNum(int geneNum) {
        this.geneNum = geneNum;
    }

    public int getChromeNum() {
        return chromeNum;
    }

    public void setChromeNum(int chromeNum) {
        this.chromeNum = chromeNum;
    }

    public int getCellNum() {
        return cellNum;
    }

    public void setCellNum(int cellNum) {
        this.cellNum = cellNum;
    }

    public void print(){
        System.out.printf("%n");
        System.out.printf("Genome Name: %s%n" , genomeName);
        System.out.printf("Number of genes: %s%n", geneNum);
        System.out.printf("Number of chromosomes: %s%n", chromeNum);
        System.out.printf("Number of cells (in trillions): %s%n", cellNum);
        System.out.printf("%n");
    }

}
