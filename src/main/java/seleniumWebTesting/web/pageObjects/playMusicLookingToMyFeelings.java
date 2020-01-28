package seleniumWebTesting.web.pageObjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class playMusicLookingToMyFeelings {

    protected SelenideElement
            enterMessagePage = $(byText("Messages")),
            clickProfile = $(byText("David Danelia")),
            checkingIfSadMusic = $(byText("sadMusic")),
            checkingIfHappyMusic = $(byText("happyMusic")),
            markingIfSad = $(byText("sadMusic")),
            markingIfHappy = $(byText("happyMusic")),
            deletingMassage = $(".im-page-action_delete"),
            musicButton = $(byText("Music")),
            seeAllButton = $(".audio_page_block__show_all_link"),
            chooseSadAlbum = $(byText("calm night mood songs")),
            chooseHappyAlbum = $(byText("Огненный хип-хоп")),
            shuffleAllSongs = $(".audio_shuffle_all_button");


}
