package seleniumWebTesting.web.dataObjects;

import com.github.javafaker.Faker;
import seleniumWebTesting.web.exel.ExcelUtils;

public interface UserData {

    Faker faker = new Faker();

    String
            username = "995557345566",
            password = "daneliadavid",
            songName = "Instant Crush Daft Punk",
            foundByName = "Instant Crush",
            foundPersonName = "Ilia Danelia",
            nameOfPerson = "David Danelia",
            massage = "Idumali str.5" + faker.number().digits(10);


    Integer
            someInteger = 520;

    String fileName = "/src/main/java/seleniumWebTesting/web/exel/dataSaver.xls";
    ExcelUtils excel = new ExcelUtils(fileName,"Sheet1");
}

