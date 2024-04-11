import java.text.MessageFormat;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        //FileHelper.writeFile("abc.txt",true,"Uaychai is here \n");
        //FileHelper.writeFile("abc.txt",false,"Uaychai is here");
        //String result = FileHelper.readFile("abc.txt");
        //System.out.println(result);
        //----------------------------------
        // Person p1 = new Person("Yoda", "Naja", 65000.00);
        // String StringCSV = FileHelper.PersontoCSV(p1);
        // FileHelper.writeFile("xyz.txt",true,StringCSV);
        //----------------------------------
        List<Person> lps = FileHelper.readCSVFileToListPerson("xyz.txt");
        for (Person person : lps) {
            System.out.println(MessageFormat.format("{0} {1} {2}", person.FirstName,person.LastName,person.Salary));
        }
    }
}
