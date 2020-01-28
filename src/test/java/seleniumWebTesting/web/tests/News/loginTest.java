package seleniumWebTesting.web.tests.News;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import seleniumWebTesting.web.pageObjects.CommunityGroups;
import seleniumWebTesting.web.pageObjects.MassagePage;
import seleniumWebTesting.web.stepObjects.*;
import seleniumWebTesting.web.utils.ChromeRunner;
import static seleniumWebTesting.web.dataObjects.CommunityGroupsData.*;
import static seleniumWebTesting.web.dataObjects.UserData.*;


public class loginTest extends ChromeRunner {

    @BeforeMethod
    public void loginIntoSystem(){
        loginPageSteps step = new loginPageSteps();
        step.logginIntoSystem(excel.getCellDataNumber(1,0),
                excel.getCellDataString(1, 1));
        System.out.println(excel.getCellDataNumber(1,0));
        System.out.println(excel.getCellDataString(1, 1));

    }

    @AfterMethod
    public void afterMethod(){
        afterEachSteps closing = new afterEachSteps();
        closing.closeBrowserAndClearCookies();
    }

    @Test
    @Story("Playing Music")
    @Description("go to Music section and play searched by name music")
    @Severity(SeverityLevel.BLOCKER)
    public void playMusic() throws InterruptedException {

        MusicPageSteps step2 = new MusicPageSteps();
        step2.enterMusicSection();
        step2.searchingMusic(songName);
        step2.playSong();

        SleepingSteps waiting = new SleepingSteps();
        waiting.stopAction(10);
    }

    @Test
    @Story("shuffle mode")
    @Description("go to Music section and play music With shuffle mode")
    public void playMusicWithShuffle() throws InterruptedException {

        MusicPageSteps step2 = new MusicPageSteps();
        step2.enterMusicSection();
        step2.shuffleAll();

        SleepingSteps waiting = new SleepingSteps();
        waiting.stopAction(10);

    }


    @Test
    @Story("Sending Massage")
    @Description("go to Massage section and Send Massage")
    public void sendMassageToPerson() {

        MassagePageSteps step3 = new MassagePageSteps();
        step3.enterMassageSection();
        step3.searchPerson(nameOfPerson);
        step3.sendMassageToPerson(massage);
        step3.checkingIfMassageWasSendSuccessfully();

    }

    @Test
    @Story("Group search and openning Pics")
    @Description("go to Community Group search and open first n-numerate pics in timeline section")
    public void searchingCommunityAndWatchingSomeMemes() throws InterruptedException {

        CommunityGroupsSteps step1 = new CommunityGroupsSteps();
        step1.enterCommunitySection();
        step1.searchingCommunity(communityName);
        step1.choosingCommunity();
        step1.openingPicByIndexWithTiming(10,2);

    }

    @Test
    @Story("check if friend exists")
    @Description("go to Friends section and check if given friend exists")
    public void checkIfFriendExists() {

        FriendPageSteps step0 = new FriendPageSteps();
        step0.enterFriendsSection();
        step0.searchPerson(foundPersonName);
        step0.checkIfItsExists(foundPersonName);

    }

    @Test
    @Story("play music by my feelings")
    @Description("go to massagesm check last message, and see if its sad play shuffled songs from my sad album, but if its happy go to my happy music album and sheffled start some happy sonds.")
    public void playMusicLookingToMyMassageFeelings() throws InterruptedException {

        playMusicLookingToMyFeelingSteps step0 = new playMusicLookingToMyFeelingSteps();
        step0.enterProfile(someInteger);

    }
}
