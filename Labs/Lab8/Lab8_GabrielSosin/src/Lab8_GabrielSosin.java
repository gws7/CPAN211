import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;


//Gabriel Sosin
public class Lab8_GabrielSosin {
    public static void main(String[] args) throws Exception {
        //This will read words from files and stores them sets
        Set<String> nhlWords = setMaker("NHL.txt");
        Set<String> javaWords = setMaker("Java.txt");
        Set<String> javaCPPWords = setMaker("JavaCPP.txt");

        //This calls the comparison function to get the similarity between two sets 
        compareSets("NHL.txt", "Java.txt", nhlWords, javaWords);
        compareSets("NHL.txt", "JavaCPP.txt", nhlWords, javaCPPWords);
        compareSets("Java.txt", "JavaCPP.txt", javaWords, javaCPPWords);
    }

    private static Set<String> setMaker(String sourceFile){
        //Hashset does not allow duplicates
        Set<String> words = new HashSet<>();
    
        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFile))) {
            String line;
            //If this isn't here the tokenizer does not work, this will read the file line by line
            while ((line = reader.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(line, " .'\"-,:;()[]{}`/*+");
                while (st.hasMoreTokens()) {
                    String token = st.nextToken();
                    //Adds the word to the hashset
                    words.add(token);
                }                 
            }
        } 
        catch (Exception e) {
            e.printStackTrace();
        }

        return words;
    }

    private static void compareSets(String file1, String file2, Set<String> set1, Set<String> set2){
        //Creates the intersections between 2 sets
        Set<String> intersectionSets = new HashSet<>(set1);
        intersectionSets.retainAll(set2);

        //Creates the union between 2 sets
        Set<String> unionSets = new HashSet<>(set1);
        unionSets.addAll(set2);

        //Using the created union and intersection we calculate the similarity and print it
        double similarity = (double) intersectionSets.size() / unionSets.size();
        System.out.printf("Similarity: %.3f \n", similarity);
    }
}
