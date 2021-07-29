import config.DriverUtils;
import config.WaitHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public abstract void openPage();

    public BasePage() {
        DriverUtils.initDriver();
        PageFactory.initElements(DriverUtils.getDriver(), this);
    }

    protected void click(WebElement element) {
        WaitHelper.getWait().elementToBeClickable(element);
        click(element);
    }
}
