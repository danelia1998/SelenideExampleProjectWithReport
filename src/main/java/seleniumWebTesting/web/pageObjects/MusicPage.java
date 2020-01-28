package seleniumWebTesting.web.pageObjects;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static seleniumWebTesting.web.dataObjects.UserData.foundByName;

public class MusicPage {

    protected SelenideElement
            musicButton = $(byText("Music")),
            musicNameInput = $(By.id("audio_search")),
            musicNameInputEnter = $(By.id("audio_search")),
            firstMusicFromListPlay = $(byText(foundByName)),
            shuffleMusic = $(".audio_page__shuffle_all_button");

}
