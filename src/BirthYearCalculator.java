import java.time.YearMonth;

public class BirthYearCalculator {
    public int getBirthYear(int age) throws Exception {
        if (age < 0) {
            throw new Exception("Exceptie: Varsta " + age + " este negativa!");
        }

        //if (age > 150) {
        //    throw new Exception("Exceptie: Varsta " + age + " este prea mare!");
        //}

        return (YearMonth.now().getYear() - age);
    }
}
