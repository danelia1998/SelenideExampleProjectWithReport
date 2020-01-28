package seleniumWebTesting.web.stepObjects;

import io.qameta.allure.Step;
import seleniumWebTesting.web.pageObjects.playMusicLookingToMyFeelings;

import static com.codeborne.selenide.Selenide.$;

public class playMusicLookingToMyFeelingSteps extends playMusicLookingToMyFeelings {

    @Step
    public void enterProfile(Integer someInt) throws InterruptedException {
        $(enterMessagePage).click();
        $(clickProfile).click();

        if ($(checkingIfSadMusic).exists()) {

            SleepingSteps timering = new SleepingSteps();

            $(musicButton).click();
            $(seeAllButton).click();
            $(chooseSadAlbum).click();
            $(shuffleAllSongs).click();

            timering.stopAction(someInt);

        }

        if ($(checkingIfHappyMusic).exists()) {

            SleepingSteps timering = new SleepingSteps();

            $(musicButton).click();
            $(seeAllButton).click();
            $(chooseHappyAlbum).click();
            $(shuffleAllSongs).click();

            timering.stopAction(someInt);
        }
    }
}
