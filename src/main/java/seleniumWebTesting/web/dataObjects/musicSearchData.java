package seleniumWebTesting.web.dataObjects;

import com.github.javafaker.Faker;

public interface musicSearchData {

    Faker faker = new Faker();

    String livingAddress = "Idumali str.5" + faker.number().digits(10);

}
