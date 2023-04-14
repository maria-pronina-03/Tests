package JavaTests;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Javakol {

        public static boolean isEmpty(String s) {
            return s == null || s.length() == 0;
        }

        public static int countMatches(String text, String str)
        {
            if (isEmpty(text) || isEmpty(str)) {
                return 0;
            }

            Matcher matcher = Pattern.compile(str).matcher(text);

            int count = 0;
            while (matcher.find()) {
                count++;
            }

            return count;
        }


    }

