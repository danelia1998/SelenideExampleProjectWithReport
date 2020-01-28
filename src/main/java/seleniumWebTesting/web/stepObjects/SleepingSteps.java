package seleniumWebTesting.web.stepObjects;

public class SleepingSteps {

    public void stopAction(Integer time) throws InterruptedException {

        Thread.sleep(time * 1000);
    }
}
