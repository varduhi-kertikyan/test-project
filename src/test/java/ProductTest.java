import config.DriverUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductTest {

    @Test
    public void verifyTest() {
        BrochureMakerPage brochureMakerPage = new BrochureMakerPage();
        brochureMakerPage.openPage();
        EditorPage editorPage = brochureMakerPage.clickMakeABrochure();
        Assert.assertEquals(DriverUtils.getDriver().getCurrentUrl(), "https://picsartstage2.com/create/editor?customSize=2550x3300");

        DriverUtils.killDriver();
    }
}
