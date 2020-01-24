package listenersPackage;


import org.testng.ISuite;
import org.testng.ISuiteListener;


public class CustomListener3 implements ISuiteListener {
    @Override
    public void onStart(ISuite suite) {
        // Before <Suite> in xml
        System.out.println("onStart: before suite starts");
    }

    @Override
    public void onFinish(ISuite suite) {
        // After <Suite> in xml
        System.out.println("onFinish: after suite starts");
    }
}
