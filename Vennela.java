import java.io.*;
import java.lang.String;
import java.util.*;
import org.json.JSONObject; 
public class Vennela 
{
 static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 public void Insert( ) throws IOException
 {
   Scanner am = new Scanner (System.in);
  System.out.println("Enter the Country_Name: ");
	String country_Name=am.next();
	System.out.println("Enter the Country_capital: ");
	String country_capital=am.next();
	System.out.println("Enter the region: ");
	char  region=am.nextInt();
	System.out.println("Enter the language: ");
	char language=am.nextInt();     
  JSONObject cat=new JSONObject(); 
  cat.put("country_name",country_Name);    
  cat.put("country_capital",country_capital);    
  cat.put("region",region);
  cat.put("language",language);
  PrintWriter pm = new PrintWriter(new BufferedWriter(new FileWriter("Vennela.txt",true)));
  pm.print(cat);
  System.out.println("Details added successfully.");
  pm.close();
 }
public static void main(String args[]) throws IOException
{
  Vennela am = new Vennela();
  am.Insert();
}
 
}
