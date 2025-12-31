package DataDriveTestig;

import org.testng.annotations.Test;

import GeericLiraries.BaseClass;
import GeericLiraries.RetryAnalyzer;

public class SampleTest extends BaseClass {



    @Test(retryAnalyzer = GeericLiraries.RetryAnalyzer.class)
    public void sampleTest() {
        System.out.println("Executing test");
        int a = 10 / 0;   // intentionally failing
    }
}
