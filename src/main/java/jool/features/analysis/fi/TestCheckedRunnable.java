package jool.features.analysis.fi;

import org.jooq.lambda.fi.lang.CheckedRunnable;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * TODO: {@link org.jooq.lambda.fi.util.CheckedComparator} example impl
 */
public class TestCheckedRunnable {

    public static void main(String[] args) throws Throwable {
        CheckedRunnable checkedRunnable = () -> {
            File file = new File("/Users/vinayprajapati/Desktop/project/jool-hands-on/src/main/java/jool/features/analysis/fi/TestCheckedRunnable.java");

            InputStream inputStream = new FileInputStream(file);
            byte[] data = new byte[(int) file.length()];
            inputStream.read(data);
            inputStream.close();

            String str = new String(data, "UTF-8");
            System.out.println(str);
        };

        checkedRunnable.run(); //Sufficient to show should be used only when Runnable exected to throw checked exception

    }
}
