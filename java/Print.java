import org.junit.runners.Parameterized;
import org.testng.annotations.*;

public class Print {

    @BeforeClass
    public void beforClass(){
        System.out.println("before class");

    }

    @BeforeMethod
    public void beformethod(){
        System.out.println("before method");

    }

    @Parameterized.BeforeParam
    public void beforepara(){
        System.out.println("before parameter");

    }
    @BeforeSuite
    public void beforsuit(){
        System.out.println("before suit");

    }

    @BeforeGroups
    public void beforgroup(){
        System.out.println("before group");

    }

    @BeforeTest
    public void befortest(){
        System.out.println("before test");

    }
@Test
    public void test1(){
    System.out.println("test1");
}
}
