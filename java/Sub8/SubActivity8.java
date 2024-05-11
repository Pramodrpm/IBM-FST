package Sub8;

import org.testng.annotations.DataProvider;

public class SubActivity8 {
    @DataProvider(name = "Authentication")
    public static Object[][] credentials() {
        return new Object[][]{
                {"Pramod", "r","pr@gmail.com","1234567890","hii"},
                {"kiran", "r","pr@gmail.com","1234567899","hii"}
        };
    }
}
