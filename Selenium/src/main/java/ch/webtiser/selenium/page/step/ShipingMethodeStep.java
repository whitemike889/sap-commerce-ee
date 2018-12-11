package ch.webtiser.selenium.page.step;

import ch.webtiser.selenium.model.DeliveryMethod;
import ch.webtiser.selenium.util.enums.Environment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ShipingMethodeStep extends AbstractStep<DeliveryMethod> {

    private static final By ELEMENT_DELIVERY_METHOD = By.id("delivery_method");

    public ShipingMethodeStep(WebDriver driver, Environment env) {
        super(driver, env);
    }

    @Override
    public String url() {
        return null;
    }

    @Override
    public String title() {
        return null;
    }

    @Override
    public void fill(DeliveryMethod object) {
        getDeliveryMethodSelect().selectByValue(object.toString());
    }

    private Select getDeliveryMethodSelect() {
        return new Select(getElementById(ELEMENT_DELIVERY_METHOD));
    }
}
