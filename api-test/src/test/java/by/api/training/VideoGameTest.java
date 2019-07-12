package by.api.training;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class VideoGameTest {

    @BeforeClass
    public void setUp() {
        RestAssured.baseURI = "localhost";
    }

    @Test
    public void getGameById() {

        VideoGame videoGame = new VideoGame()
                .id(18)
                .reviewScore("99")
                .releaseDate("2019-07-12")
                .name("Mortal Kombat")
                .rating("best")
                .category("mature");



    }
}
