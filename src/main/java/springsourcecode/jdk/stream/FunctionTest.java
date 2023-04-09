package springsourcecode.jdk.stream;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FunctionTest {

    public static String DateFormat(LocalDateTime dateTime, String pattern){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(pattern);
        return dateTimeFormatter.format(dateTime);
    }
}
