import org.testng.annotations.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LongTest {

    @Test
    void resTime() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(("yyyy-MM-dd HH:mm:ss"));
        Date parse = sdf.parse("2019-12-10 00:00:00");
        System.out.println(parse.getTime());
    }
}
