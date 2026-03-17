package C02.SOLID.S.AFTER;

public class ServiciiAngajati {
    private final HR hr;
    private final CalculatorTaxe calculatorTaxe;

    public ServiciiAngajati(HR hr, CalculatorTaxe calculatorTaxe) {
        this.hr = hr;
        this.calculatorTaxe = calculatorTaxe;
    }

    public boolean esteEligibilPromovare(Angajat a) {
        return hr.esteEligibilPromovare(a);
    }

    public double calculeazaTaxe(Angajat a) {
        return calculatorTaxe.calculeazaTaxe(a);
    }
}
