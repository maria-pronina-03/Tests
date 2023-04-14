package JavaTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;

public class Tests {
        @Test
        public void testCountOccurrences() {
            // Тестирование на обычных входных данных
            String str1 = "dfhjhghgh";
            String str2 = "df";
            int expected = 1;
            int actual = Javakol.countMatches(str1, str2);
            Assertions.assertEquals(expected, actual);
            System.out.println("Expected = " + expected + " Actual = " +actual);

            // Тестирование на входных данных, где вторая строка не содержится в первой
            str1 = "hjhjhj";
            str2 = "as";
            expected = 0;
            actual = Javakol.countMatches(str1, str2);
            Assertions.assertEquals(expected, actual);
            System.out.println("Expected = " + expected + " Actual = " +actual);

            // Тестирование на входных данных, где вторая строка содержится в первой несколько раз
            str1 = "GHGHFF";
            str2 = "GH";
            expected = 2;
            actual = Javakol.countMatches(str1, str2);
            Assertions.assertEquals(expected, actual);
            System.out.println("Expected = " + expected + " Actual = " +actual);

            // Тестирование на входных данных, где первая строка пустая
            str1 = "";
            str2 = "fg";
            expected = 0;
            actual = Javakol.countMatches(str1, str2);
            Assertions.assertEquals(expected, actual);
            System.out.println("Expected = " + expected + " Actual = " +actual);

            // Тестирование на входных данных, где вторая строка пустая
            str1 = "hghghg";
            str2 = "";
            expected = 0;
            actual = Javakol.countMatches(str1, str2);
            Assertions.assertEquals(expected, actual);
            System.out.println("Expected = " + expected + " Actual = " +actual);
        }
    }

