import config.Configuration;
import config.DriverUtils;

public class EditorPage extends BasePage {

    @Override
    public void openPage() {
        DriverUtils.getDriver().get(Configuration.ENVIRONMENT + "/create/editor");
    }
}
