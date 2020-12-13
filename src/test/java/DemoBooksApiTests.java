import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.get;
import static org.hamcrest.Matchers.is;

@Tag("api_tests")
public class DemoBooksApiTests {
    @Test
    void DemoBooksTest(){
        get("https://demoqa.com/BookStore/v1/Book?ISBN=9781449365035")
                .then()
                .body("website", is("http://speakingjs.com/"));
    }
}
