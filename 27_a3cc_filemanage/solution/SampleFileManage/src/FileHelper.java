import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class FileHelper {
    public static void writeFile(String filepath, boolean isAppend, String content) throws IOException
    {
        File f1 = new File(filepath);
        FileWriter fw1;
        fw1 = new FileWriter(f1, isAppend);
        BufferedWriter bw1 = new BufferedWriter(fw1);
        bw1.write(content);
        bw1.flush();bw1.close();fw1.close();
    }
    public static String readFile(String filepath) throws IOException
    {
        File f1 = new File(filepath);
        FileReader fr1;
        String result=null;
        fr1 = new FileReader(f1);
        BufferedReader br1 = new BufferedReader(fr1);
        Stream<String> ss1 = br1.lines();
        result = String.join("\n",ss1.toList());
        ss1.close();br1.close();fr1.close();
        return result;
    }
    public static String PersontoCSV(Person p1){
        return p1.FirstName+","+p1.LastName+","+p1.Salary+"\n";
    }
    public static List<Person> readCSVFileToListPerson(String filepath) throws IOException
    {
        File f1= new File(filepath);
        ArrayList<Person> ps1 = new ArrayList<>();
        Person p1;
        Scanner sc1 = new Scanner(f1).useDelimiter("(\n|,)");
        do{
            p1 = new Person(sc1.next(), sc1.next(), sc1.nextDouble());
            ps1.add(p1);
        }while(sc1.hasNext());
        sc1.close();
        return  ps1;
    }
}
