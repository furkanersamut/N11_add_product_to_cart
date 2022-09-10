package xpaths;

public interface HomeConstants {

    public String accountSıgnIn ="//a[@class='btnSignIn']";
    public String loginScreenControl = "//div[@class='blockWrap']/child::h2";
    public String searchBox="//input[@id='searchData']";
    public String searchButton="//*[@class='iconsSearch']";
    public String pageTwo="//a[@data-page='2']";
    public String choicePhone="(//*[@class='lazy cardImage'])[3]";
    public String addBasket="(//button[@class='addBasketUnify'])[1]";
    public String successMessageForAddBasket="//*[text()='Ürün sepetinize eklendi']";
    public String basket="//*[@class='iconsBasketWhite']";
    public String emptyBasket="//*[contains(text(),'Sepetin Boş Görünüyor')]";
    public String payButton="//*[contains(text(),'Ödemeye Geç')]";
    public String clearBasketButton="//*[@class='removeProd svgIcon svgIcon_trash']";
    public String deleteButton="//*[@id='deleteBtnDFLB']";
    public String basketNotEmpty="//h3[contains(text(),'Sepetim (1)')]";

}
