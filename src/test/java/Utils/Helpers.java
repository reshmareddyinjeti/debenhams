package Utils;

import DebenamsTestSuites.Hooks;

public class Helpers  {
    public void Sleep(int min) {
        try {
            Thread.sleep(min);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}