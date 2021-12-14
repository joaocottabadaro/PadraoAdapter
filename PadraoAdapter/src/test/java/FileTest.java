import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FileTest {

    @Test
    public void deveRetornarJson() {
        Application application = new Application();
        application.setFile("JSON");

        assertEquals("JSON", application.getJson());
    }

    @Test
    public void deveRetornarXml() {
        Application application = new Application();
        application.setFile("XML");
        assertEquals("XML", application.getXml());

    }
}
