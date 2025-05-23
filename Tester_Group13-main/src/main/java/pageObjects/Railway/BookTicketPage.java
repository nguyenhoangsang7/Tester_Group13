package pageObjects.Railway;

import common.Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookTicketPage extends  GeneralPage{


    private  final  By  datePath = By.xpath("//select[@name='Date']");
    private final By departStation = By.xpath("//select[@name='DepartStation']");
    private final By arriveStation = By.xpath("//select[@name='ArriveStation']");
    private final By seatType = By.xpath("//select[@name='SeatType']");
    private final By ticketAmount = By.xpath("//select[@name='TicketAmount']");
    private final By btnBookTicket = By.xpath("//input[@value='Book ticket']");
    private final By ticketInformation = By.xpath("//tr[@class='OddRow']//td");
    private final By ticketInformationTitles = By.xpath("//tr[@class='TableSmallHeader']//th");
    private final By inForDepartStation = By.xpath("//select[@name='DepartStation']/option[@selected='selected']");
    private final By inForArriveStation = By.xpath("//select[@name='ArriveStation']/option[@selected='selected']");


    protected WebElement getDateSelectBox() {
        return Constant.WEBDRIVER.findElement(datePath);
    }
    protected WebElement getDepartStation() {
        return Constant.WEBDRIVER.findElement(departStation);
    }
    protected WebElement getArriveStation() {
        return Constant.WEBDRIVER.findElement(arriveStation);
    }
    protected WebElement getSeatType() {
        return Constant.WEBDRIVER.findElement(seatType);
    }
    protected WebElement getTicketAmount() {
        return Constant.WEBDRIVER.findElement(ticketAmount);
    }
    protected WebElement getBtnBookTicket() {
        return Constant.WEBDRIVER.findElement(btnBookTicket);
    }
    protected WebElement getInForDepartStation() {
        return Constant.WEBDRIVER.findElement(inForDepartStation);
    }
    protected WebElement getInForArriveStation() {
        return Constant.WEBDRIVER.findElement(inForArriveStation);
    }

    public void  selectDate(String date) {
        final  WebElement dateSelectBox =getDateSelectBox();
        Select select = new Select(dateSelectBox);
        select.selectByVisibleText(date);
    }
    public void  selectDepartStation(String departStation) {
        final  WebElement departStationBox =getDepartStation();
        Select select = new Select(departStationBox);
        select.selectByVisibleText(departStation);
    }
    public void  selectArriveStation(String arriveStation) {
        final  WebElement arriveStationBox =getArriveStation();
        Select select = new Select(arriveStationBox);
        select.selectByVisibleText(arriveStation);
    }
    public void selectSeatType(String seatStyle) {
        final  WebElement seatStyleBox = getSeatType();
        Select select = new Select(seatStyleBox);
        select.selectByVisibleText(seatStyle);
    }
    public void  selectTicketAmount(String ticketAmount) {
        final  WebElement ticketAmountBox =getTicketAmount();
        Select select = new Select(ticketAmountBox);
        select.selectByVisibleText(ticketAmount);
    }
    public Boolean isDepartValuesCorrect(String value) {
        return this.getInForDepartStation().getText().equals(value);
    }
    public Boolean isArriveValuesCorrect(String value) {
        return this.getInForArriveStation().getText().equals(value);
    }

    public BookTicketPage bookTicketPage(String date,String departStation,String arriveStation, String seatType, String ticketAmount) {
        this.selectDate(date);
        this.selectDepartStation(departStation);
        this.selectArriveStation(arriveStation);
        this.selectSeatType(seatType);
        this.selectTicketAmount(ticketAmount);
        JavascriptExecutor js = (JavascriptExecutor) Constant.WEBDRIVER;
        js.executeScript("arguments[0].scrollIntoView(true);", this.getBtnBookTicket());
        this.getBtnBookTicket().click();
        return  new BookTicketPage();

    }

    public Map<String,String> getTicketInformation() {
        Map<String,String> information = new HashMap<String,String>();

        List<WebElement> ticketInformationTitle =  Constant.WEBDRIVER.findElements(ticketInformationTitles);
        List<WebElement> ticketInformationValue =  Constant.WEBDRIVER.findElements(ticketInformation);


        if (ticketInformationTitle.size() == ticketInformationValue.size()) {
            for (int i = 0; i < ticketInformationTitle.size(); i++) {
                information.put(ticketInformationTitle.get(i).getText(), ticketInformationValue.get(i).getText());
            }
        }
        return  information;
    }
    public boolean isPageDisplayed() {
        return Constant.WEBDRIVER.getTitle().equals("Safe Railway - Book Ticket");
    }


}
