package seleniumWebTesting.web.stepObjects;

import io.qameta.allure.Step;
import seleniumWebTesting.web.pageObjects.MusicPage;
import java.util.concurrent.TimeUnit;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MusicPageSteps extends MusicPage {

    @Step
    public void enterMusicSection() {
        $(musicButton).click();
    }

    @Step
    public void searchingMusic(String songName) {
        $(musicNameInput).setValue(songName);
        $(musicNameInputEnter).pressEnter();
    }

    @Step
    public void playSong() {

        $(firstMusicFromListPlay).click();
    }

    @Step
    public void shuffleAll() {
        $(shuffleMusic).click();
    }
}
