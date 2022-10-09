package co.com.retoTecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class StepTwoYourAddress extends PageObject {
    public static final Target LABEL_AUTODETECTED=Target.the("autodetect field").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[1]/span[2]"));

    public static final Target INPUT_CITY=Target.the("locate field to write city address").
            located(By.name("city"));

    public static final Target INPUT_ZIPCODE=Target.the("locate field to write zipcode").
            located(By.name("zip"));

    public static final Target BUTTON_COUNTRY=Target.the("locate field to write country").
            located(By.name("countryId"));

    public static final Target INPUT_COUNTRY=Target.the("locate field to write country").
            located(By.xpath("//input[@type='search' and @placeholder='Select a country']"));

    public static final Target BUTTON_NEXT_DEVICES=Target.the("locate button to next stepTwo Devices").
            located(By.xpath("//div[@class='pull-right next-step']"));

}
