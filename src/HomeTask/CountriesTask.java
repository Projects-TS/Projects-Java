package HomeTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountriesTask {
    public static void main(String[] args) {
        List<String> countries = Arrays.asList("Japan", "United States", "Canada"
                , "Germany", "France", "Spain", "Italy", "Australia", "Brazil", "India");
        for (String country : countries) {
            System.out.println(country);
        }
        System.out.println("\nPrinting using forEach method:");

        List<String> list = new ArrayList<String>();
        list.add("United States");
        list.add("Brazil");
        list.add("Germany");
        list.add("Norway");
        list.add("Canada");
        list.add("Spain");
        list.add("Italy");
        list.add("Australia");
        list.add("India");
        list.add("Japan");

        list.forEach(
                (name) -> System.out.println(name)
        );
    }
}










