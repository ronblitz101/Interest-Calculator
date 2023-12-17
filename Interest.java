public class Prob4_Interest {
    public static void main(String[] args) {
        double dblPrincipal = 30000, dblInterestRate = 12.0/100.0, dblWithholdingTaxPercentage = 10.0/100.0, dblWithholdingTax, dblNetInterest;
        int intInterestDays = 30;

        //A. Withholding Tax
        dblWithholdingTax = dblWithholdingTaxPercentage * (dblPrincipal * dblInterestRate * (intInterestDays / 365.0));
        System.out.printf("\n\tA) Withholding Tax:\t\tP%.4f", dblWithholdingTax);

        //B. Net Interest
        dblNetInterest = (dblPrincipal * dblInterestRate * (intInterestDays / 365.0)) - dblWithholdingTax;
        System.out.printf("\n\tB) Net Interest:\t\tP%.4f\n\n", dblNetInterest);
    }
}