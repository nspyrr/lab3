public class DNA {
    private String LtoRHelix;
    private String RtoLHelix;

    public DNA(){
        this.LtoRHelix = null;
        this.RtoLHelix = null;
    }

    public DNA (String strand){
        LtoRHelixpopulate(strand);
        RtoLHelixpopulate();
    }

    public void print(){

    }

    public void LtoRHelixpopulate (String strand){
        this.LtoRHelix = new NucleicAcid[strand.length()];

        for (int i = 0; i < strand.length(); i++){

        }
    }

    public void RtoLHelixpopulate(){
        this.RtoLHelix = new NucleicAcid[LtoRHelix.length];

        for (int i = 0; i < LtoRHelix.length; i++){

        }
    }

    public void highestMolarMass(){
        if(currMolarMass > highestMolarMass){
            highestMolarMass = currMolarMass;
            highestIndex=i;
        }
    }

    public void totalDensity(){

    }
}
