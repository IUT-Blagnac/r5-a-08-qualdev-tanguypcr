package hellocucumber;

public class IsItFriday {
    public static String isItFriday(String today) {
        return "Vendredi".equals(today) ? "Oui" : "Non";
    }
}