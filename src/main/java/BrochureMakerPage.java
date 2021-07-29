import config.Configuration;
import config.DriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BrochureMakerPage extends BasePage {

    @FindBy(css = "[data-test='action-button-1-The-Professional-Brochure-Maker-That-Anyone-Can-Use']")
    WebElement makeABrochureButton;

    @Override
    public void openPage() {
        DriverUtils.getDriver().get(Configuration.ENVIRONMENT + "/brochure-maker");
    }

    public EditorPage clickMakeABrochure() {
        click(makeABrochureButton);
        return new EditorPage();
    }
}
