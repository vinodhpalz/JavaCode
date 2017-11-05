import java.util.regex.Pattern;
import java.util.regex.Matcher;
   
public class RegexFindText {
   public static void main(String[] args) {
   
      // Input for matching the regexe pattern
      String input = "This is an apple. These are 33 (thirty-three) apples";
      // Regexe to be matched
      String regexe = "[0-3]";
   
      // Step 1: Allocate a Pattern object to compile a regexe
      Pattern pattern = Pattern.compile(regexe);
      //Pattern pattern = Pattern.compile(regexe, Pattern.CASE_INSENSITIVE);  // case-insensitive matching
   
      // Step 2: Allocate a Matcher object from the compiled regexe pattern,
      //         and provide the input to the Matcher
      Matcher matcher = pattern.matcher(input);
   
      // Step 3: Perform the matching and process the matching result
   
      // Use method find()
      while (matcher.find()) {     // find the next match
         System.out.println("find() found the pattern \"" + matcher.group()
               + "\" starting at index " + matcher.start()
               + " and ending at index " + matcher.end());
      }
   
      // Use method matches()
      if (matcher.matches()) {
         System.out.println("matches() found the pattern \"" + matcher.group()
               + "\" starting at index " + matcher.start()
               + " and ending at index " + matcher.end());
      } else {
         System.out.println("matches() found nothing");
      }
   
      // Use method lookingAt()
      if (matcher.lookingAt()) {
         System.out.println("lookingAt() found the pattern \"" + matcher.group()
               + "\" starting at index " + matcher.start()
               + " and ending at index " + matcher.end());
      } else {
         System.out.println("lookingAt() found nothing");
      }
   }
}