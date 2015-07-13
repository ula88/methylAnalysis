package methyl;

import java.io.IOException;

/**
 *
 * @author Ula
 */
public class Controller {

    String samples = "test1.CpG.txt,test2.CpG.txt,control1.CpG.txt,control2.CpG.txt";
    String treatment = "1,1,0,0";
    String mydiffFile = "proba1_diff.txt";
    String myDMRfile = "proba1_dmr.txt";

    public void runRscript() throws IOException, InterruptedException {
        String pathToScript = "/media/eternus/NGS_data/DMR/dmrWithParam.R";
        Process child = Runtime.getRuntime().exec("Rscript " + pathToScript + " "
                + samples + " " + treatment + " " + mydiffFile + " " + myDMRfile);
        child.waitFor();
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        Controller con = new Controller();
        con.runRscript();
    }
}
