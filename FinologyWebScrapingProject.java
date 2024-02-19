package package1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Project1 {
	
	@Test
	public void tcs() throws InterruptedException {
		WebDriver wd = new ChromeDriver();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		wd.get("https://ticker.finology.in/");
		Thread.sleep(3);
		wd.manage().window().maximize();
		
		wd.findElement(By.id("txtSearchComp")).sendKeys("Tata Consultancy Services Ltd");
		wd.findElement(By.xpath("//*[@id=\"frmTicker\"]/section/div/div/div/div/div[2]/div/a[1]")).click();
		
		WebElement a1 = wd.findElement(By.xpath("//*[@id=\"mainContent_ltrlCompName\"]"));
		System.out.println("Company Name : "+a1.getText());
		WebElement a2 = wd.findElement(By.xpath("//*[@id=\"mainContent_compinfoId\"]/strong[1]"));
		System.out.println("NSE Code : "+a2.getText());		
		WebElement a3 = wd.findElement(By.xpath("//*[@id=\"mainContent_compinfoId\"]/a"));
		System.out.println("Sector : "+a3.getText());
		WebElement a4 = wd.findElement(By.xpath("//*[@id=\"mainContent_clsprice\"]/span/span"));
		WebElement a5 = wd.findElement(By.xpath("//*[@id=\"mainContent_pnlPriceChange\"]"));
		WebElement a6 = wd.findElement(By.xpath("//*[@id=\"mainContent_clsprice\"]/small"));
		System.out.println("At time "+a6.getText()+", Share Price Rs. "+a4.getText()+" with Variations "+a5.getText());
		WebElement a7 = wd.findElement(By.xpath("//*[@id=\"mainContent_ltrlTodayHigh\"]"));
		WebElement a8 = wd.findElement(By.xpath("//*[@id=\"mainContent_ltrlTodayLow\"]"));
		WebElement a9 = wd.findElement(By.xpath("//*[@id=\"mainContent_ltrl52WH\"]"));
		WebElement a10 = wd.findElement(By.xpath("//*[@id=\"mainContent_ltrl52WL\"]"));
		System.out.println("Price Summary :  Today's High = Rs. "+a7.getText()+", Today's Low = Rs. "+a8.getText()+", 52 Week High = Rs. "+a9.getText()+", 52 Week Low = Rs. "+a10.getText());
		System.out.println("Company Essentials are as Follows : ");
		WebElement a11 = wd.findElement(By.xpath("//*[@id=\"mainContent_updAddRatios\"]/div[1]/p/span"));
		WebElement a12 = wd.findElement(By.xpath("//*[@id=\"mainContent_ltrlEntValue\"]/span"));
		WebElement a13 = wd.findElement(By.xpath("//*[@id=\"mainContent_updAddRatios\"]/div[3]/p/span"));
		System.out.println("Market Cap : Rs. "+a11.getText()+" Cr., Enterprise Value : Rs. "+a12.getText()+" Cr., No. of Shares : "+a13.getText()+" Cr.");
		WebElement a14 = wd.findElement(By.xpath("//*[@id=\"mainContent_updAddRatios\"]/div[4]/p"));
		WebElement a15 = wd.findElement(By.xpath("//*[@id=\"mainContent_updAddRatios\"]/div[5]/p"));
		WebElement a16 = wd.findElement(By.xpath("//*[@id=\"mainContent_updAddRatios\"]/div[6]/p"));
		System.out.println("P/E Ratio : "+a14.getText()+", P/B Ratio : "+a15.getText()+", Face Value : Rs. "+a16.getText());
		WebElement a17 = wd.findElement(By.xpath("//*[@id=\"mainContent_updAddRatios\"]/div[7]/p"));
		WebElement a18 = wd.findElement(By.xpath("//*[@id=\"mainContent_updAddRatios\"]/div[8]/p/span"));
		WebElement a19 = wd.findElement(By.xpath("//*[@id=\"mainContent_ltrlCash\"]/span"));
		System.out.println("Dividend Yeild : "+a17.getText()+", Book Value TTM : Rs. "+a18.getText()+", Cash : Rs. "+a19.getText()+" Cr.");
		WebElement a20 = wd.findElement(By.xpath("//*[@id=\"mainContent_ltrlDebt\"]/span"));
		WebElement a21 = wd.findElement(By.xpath("//*[@id=\"mainContent_updAddRatios\"]/div[11]/p"));
		WebElement a22 = wd.findElement(By.xpath("//*[@id=\"mainContent_updAddRatios\"]/div[12]/p/span"));
		System.out.println("Debt : Rs. "+a20.getText()+"Cr., Promotor Holding : "+a21.getText()+", EPS (TTM) : Rs. "+a22.getText());
		WebElement a23 = wd.findElement(By.xpath("//*[@id=\"mainContent_updAddRatios\"]/div[13]/p/span"));
		WebElement a24 = wd.findElement(By.xpath("//*[@id=\"mainContent_updAddRatios\"]/div[14]/p/span"));
		WebElement a25 = wd.findElement(By.xpath("//*[@id=\"mainContent_updAddRatios\"]/div[15]/p/span"));
		WebElement a26 = wd.findElement(By.xpath("//*[@id=\"mainContent_updAddRatios\"]/div[16]/p/span"));
		System.out.println("Sales Growth : "+a23.getText()+" %, ROE : "+a24.getText()+" %, ROCE : "+a25.getText()+" %, Profit Growth : "+a26.getText()+" %");
		WebElement a27 = wd.findElement(By.xpath("//*[@id=\"mainContent_divDebtEquity\"]/div/span/span"));
		WebElement a28 = wd.findElement(By.xpath("//*[@id=\"mainContent_divCash\"]/div/span/span"));
		WebElement a29 = wd.findElement(By.xpath("//*[@id=\"mainContent_divICR\"]/div/span/span"));
		WebElement a30 = wd.findElement(By.xpath("//*[@id=\"mainContent_divCFOPAT\"]/div/span/span"));
		System.out.println("Debt/Equity Ratio : "+a27.getText()+", Price to Cash Flow Ratio : "+a28.getText()+", Interest Cover Ratio : "+a29.getText()+", CFO/PAT Ratio (5 Yr. Avg.) : "+a30.getText());
		//wd.quit();
		System.out.println("=================================================================");
	}
	@Test
	public void adaniGreen() throws InterruptedException {
		WebDriver wd = new ChromeDriver();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		wd.get("https://ticker.finology.in/");
		Thread.sleep(3);
		wd.manage().window().maximize();
		
		wd.findElement(By.id("txtSearchComp")).sendKeys("Adani Green");
		wd.findElement(By.xpath("//*[@id=\"frmTicker\"]/section/div/div/div/div/div[2]/div/a[1]")).click();
		
		WebElement a1 = wd.findElement(By.xpath("//*[@id=\"mainContent_ltrlCompName\"]"));
		System.out.println("Company Name : "+a1.getText());
		WebElement a2 = wd.findElement(By.xpath("//*[@id=\"mainContent_compinfoId\"]/strong[1]"));
		System.out.println("NSE Code : "+a2.getText());		
		WebElement a3 = wd.findElement(By.xpath("//*[@id=\"mainContent_compinfoId\"]/a"));
		System.out.println("Sector : "+a3.getText());
		WebElement a4 = wd.findElement(By.xpath("//*[@id=\"mainContent_clsprice\"]/span/span"));
		WebElement a5 = wd.findElement(By.xpath("//*[@id=\"mainContent_pnlPriceChange\"]"));
		WebElement a6 = wd.findElement(By.xpath("//*[@id=\"mainContent_clsprice\"]/small"));
		System.out.println("At time "+a6.getText()+", Share Price Rs. "+a4.getText()+" with Variations "+a5.getText());
		WebElement a7 = wd.findElement(By.xpath("//*[@id=\"mainContent_ltrlTodayHigh\"]"));
		WebElement a8 = wd.findElement(By.xpath("//*[@id=\"mainContent_ltrlTodayLow\"]"));
		WebElement a9 = wd.findElement(By.xpath("//*[@id=\"mainContent_ltrl52WH\"]"));
		WebElement a10 = wd.findElement(By.xpath("//*[@id=\"mainContent_ltrl52WL\"]"));
		System.out.println("Price Summary :  Today's High = Rs. "+a7.getText()+", Today's Low = Rs. "+a8.getText()+", 52 Week High = Rs. "+a9.getText()+", 52 Week Low = Rs. "+a10.getText());
		System.out.println("Company Essentials are as Follows : ");
		WebElement a11 = wd.findElement(By.xpath("//*[@id=\"mainContent_updAddRatios\"]/div[1]/p/span"));
		WebElement a12 = wd.findElement(By.xpath("//*[@id=\"mainContent_ltrlEntValue\"]/span"));
		WebElement a13 = wd.findElement(By.xpath("//*[@id=\"mainContent_updAddRatios\"]/div[3]/p/span"));
		System.out.println("Market Cap : Rs. "+a11.getText()+" Cr., Enterprise Value : Rs. "+a12.getText()+" Cr., No. of Shares : "+a13.getText()+" Cr.");
		WebElement a14 = wd.findElement(By.xpath("//*[@id=\"mainContent_updAddRatios\"]/div[4]/p"));
		WebElement a15 = wd.findElement(By.xpath("//*[@id=\"mainContent_updAddRatios\"]/div[5]/p"));
		WebElement a16 = wd.findElement(By.xpath("//*[@id=\"mainContent_updAddRatios\"]/div[6]/p"));
		System.out.println("P/E Ratio : "+a14.getText()+", P/B Ratio : "+a15.getText()+", Face Value : Rs. "+a16.getText());
		WebElement a17 = wd.findElement(By.xpath("//*[@id=\"mainContent_updAddRatios\"]/div[7]/p"));
		WebElement a18 = wd.findElement(By.xpath("//*[@id=\"mainContent_updAddRatios\"]/div[8]/p/span"));
		WebElement a19 = wd.findElement(By.xpath("//*[@id=\"mainContent_ltrlCash\"]/span"));
		System.out.println("Dividend Yeild : "+a17.getText()+", Book Value TTM : Rs. "+a18.getText()+", Cash : Rs. "+a19.getText()+" Cr.");
		WebElement a20 = wd.findElement(By.xpath("//*[@id=\"mainContent_ltrlDebt\"]/span"));
		WebElement a21 = wd.findElement(By.xpath("//*[@id=\"mainContent_updAddRatios\"]/div[11]/p"));
		WebElement a22 = wd.findElement(By.xpath("//*[@id=\"mainContent_updAddRatios\"]/div[12]/p/span"));
		System.out.println("Debt : Rs. "+a20.getText()+"Cr., Promotor Holding : "+a21.getText()+", EPS (TTM) : Rs. "+a22.getText());
		WebElement a23 = wd.findElement(By.xpath("//*[@id=\"mainContent_updAddRatios\"]/div[13]/p/span"));
		WebElement a24 = wd.findElement(By.xpath("//*[@id=\"mainContent_updAddRatios\"]/div[14]/p/span"));
		WebElement a25 = wd.findElement(By.xpath("//*[@id=\"mainContent_updAddRatios\"]/div[15]/p/span"));
		WebElement a26 = wd.findElement(By.xpath("//*[@id=\"mainContent_updAddRatios\"]/div[16]/p/span"));
		System.out.println("Sales Growth : "+a23.getText()+" %, ROE : "+a24.getText()+" %, ROCE : "+a25.getText()+" %, Profit Growth : "+a26.getText()+" %");
		WebElement a27 = wd.findElement(By.xpath("//*[@id=\"mainContent_divDebtEquity\"]/div/span/span"));
		WebElement a28 = wd.findElement(By.xpath("//*[@id=\"mainContent_divCash\"]/div/span/span"));
		WebElement a29 = wd.findElement(By.xpath("//*[@id=\"mainContent_divICR\"]/div/span/span"));
		WebElement a30 = wd.findElement(By.xpath("//*[@id=\"mainContent_divCFOPAT\"]/div/span/span"));
		System.out.println("Debt/Equity Ratio : "+a27.getText()+", Price to Cash Flow Ratio : "+a28.getText()+", Interest Cover Ratio : "+a29.getText()+", CFO/PAT Ratio (5 Yr. Avg.) : "+a30.getText());
		//wd.quit();	
		System.out.println("=================================================================");
	}
	@Test
	public void ril() throws InterruptedException {
		WebDriver wd = new ChromeDriver();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		wd.get("https://ticker.finology.in/");
		Thread.sleep(3);
		wd.manage().window().maximize();
		
		wd.findElement(By.id("txtSearchComp")).sendKeys("Reliance");
		wd.findElement(By.xpath("//*[@id=\"frmTicker\"]/section/div/div/div/div/div[2]/div/a[1]")).click();
		
		WebElement a1 = wd.findElement(By.xpath("//*[@id=\"mainContent_ltrlCompName\"]"));
		System.out.println("Company Name : "+a1.getText());
		WebElement a2 = wd.findElement(By.xpath("//*[@id=\"mainContent_compinfoId\"]/strong[1]"));
		System.out.println("NSE Code : "+a2.getText());		
		WebElement a3 = wd.findElement(By.xpath("//*[@id=\"mainContent_compinfoId\"]/a"));
		System.out.println("Sector : "+a3.getText());
		WebElement a4 = wd.findElement(By.xpath("//*[@id=\"mainContent_clsprice\"]/span/span"));
		WebElement a5 = wd.findElement(By.xpath("//*[@id=\"mainContent_pnlPriceChange\"]"));
		WebElement a6 = wd.findElement(By.xpath("//*[@id=\"mainContent_clsprice\"]/small"));
		System.out.println("At time "+a6.getText()+", Share Price Rs. "+a4.getText()+" with Variations "+a5.getText());
		WebElement a7 = wd.findElement(By.xpath("//*[@id=\"mainContent_ltrlTodayHigh\"]"));
		WebElement a8 = wd.findElement(By.xpath("//*[@id=\"mainContent_ltrlTodayLow\"]"));
		WebElement a9 = wd.findElement(By.xpath("//*[@id=\"mainContent_ltrl52WH\"]"));
		WebElement a10 = wd.findElement(By.xpath("//*[@id=\"mainContent_ltrl52WL\"]"));
		System.out.println("Price Summary :  Today's High = Rs. "+a7.getText()+", Today's Low = Rs. "+a8.getText()+", 52 Week High = Rs. "+a9.getText()+", 52 Week Low = Rs. "+a10.getText());
		System.out.println("Company Essentials are as Follows : ");
		WebElement a11 = wd.findElement(By.xpath("//*[@id=\"mainContent_updAddRatios\"]/div[1]/p/span"));
		WebElement a12 = wd.findElement(By.xpath("//*[@id=\"mainContent_ltrlEntValue\"]/span"));
		WebElement a13 = wd.findElement(By.xpath("//*[@id=\"mainContent_updAddRatios\"]/div[3]/p/span"));
		System.out.println("Market Cap : Rs. "+a11.getText()+" Cr., Enterprise Value : Rs. "+a12.getText()+" Cr., No. of Shares : "+a13.getText()+" Cr.");
		WebElement a14 = wd.findElement(By.xpath("//*[@id=\"mainContent_updAddRatios\"]/div[4]/p"));
		WebElement a15 = wd.findElement(By.xpath("//*[@id=\"mainContent_updAddRatios\"]/div[5]/p"));
		WebElement a16 = wd.findElement(By.xpath("//*[@id=\"mainContent_updAddRatios\"]/div[6]/p"));
		System.out.println("P/E Ratio : "+a14.getText()+", P/B Ratio : "+a15.getText()+", Face Value : Rs. "+a16.getText());
		WebElement a17 = wd.findElement(By.xpath("//*[@id=\"mainContent_updAddRatios\"]/div[7]/p"));
		WebElement a18 = wd.findElement(By.xpath("//*[@id=\"mainContent_updAddRatios\"]/div[8]/p/span"));
		WebElement a19 = wd.findElement(By.xpath("//*[@id=\"mainContent_ltrlCash\"]/span"));
		System.out.println("Dividend Yeild : "+a17.getText()+", Book Value TTM : Rs. "+a18.getText()+", Cash : Rs. "+a19.getText()+" Cr.");
		WebElement a20 = wd.findElement(By.xpath("//*[@id=\"mainContent_ltrlDebt\"]/span"));
		WebElement a21 = wd.findElement(By.xpath("//*[@id=\"mainContent_updAddRatios\"]/div[11]/p"));
		WebElement a22 = wd.findElement(By.xpath("//*[@id=\"mainContent_updAddRatios\"]/div[12]/p/span"));
		System.out.println("Debt : Rs. "+a20.getText()+"Cr., Promotor Holding : "+a21.getText()+", EPS (TTM) : Rs. "+a22.getText());
		WebElement a23 = wd.findElement(By.xpath("//*[@id=\"mainContent_updAddRatios\"]/div[13]/p/span"));
		WebElement a24 = wd.findElement(By.xpath("//*[@id=\"mainContent_updAddRatios\"]/div[14]/p/span"));
		WebElement a25 = wd.findElement(By.xpath("//*[@id=\"mainContent_updAddRatios\"]/div[15]/p/span"));
		WebElement a26 = wd.findElement(By.xpath("//*[@id=\"mainContent_updAddRatios\"]/div[16]/p/span"));
		System.out.println("Sales Growth : "+a23.getText()+" %, ROE : "+a24.getText()+" %, ROCE : "+a25.getText()+" %, Profit Growth : "+a26.getText()+" %");
		WebElement a27 = wd.findElement(By.xpath("//*[@id=\"mainContent_divDebtEquity\"]/div/span/span"));
		WebElement a28 = wd.findElement(By.xpath("//*[@id=\"mainContent_divCash\"]/div/span/span"));
		WebElement a29 = wd.findElement(By.xpath("//*[@id=\"mainContent_divICR\"]/div/span/span"));
		WebElement a30 = wd.findElement(By.xpath("//*[@id=\"mainContent_divCFOPAT\"]/div/span/span"));
		System.out.println("Debt/Equity Ratio : "+a27.getText()+", Price to Cash Flow Ratio : "+a28.getText()+", Interest Cover Ratio : "+a29.getText()+", CFO/PAT Ratio (5 Yr. Avg.) : "+a30.getText());
		//wd.quit();	
		System.out.println("=================================================================");
	}
	@Test
	public void cil() throws InterruptedException {
		WebDriver wd = new ChromeDriver();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		wd.get("https://ticker.finology.in/");
		Thread.sleep(3);
		wd.manage().window().maximize();
		
		wd.findElement(By.id("txtSearchComp")).sendKeys("Coal");
		wd.findElement(By.xpath("//*[@id=\"frmTicker\"]/section/div/div/div/div/div[2]/div/a[1]")).click();
		
		WebElement a1 = wd.findElement(By.xpath("//*[@id=\"mainContent_ltrlCompName\"]"));
		System.out.println("Company Name : "+a1.getText());
		WebElement a2 = wd.findElement(By.xpath("//*[@id=\"mainContent_compinfoId\"]/strong[1]"));
		System.out.println("NSE Code : "+a2.getText());		
		WebElement a3 = wd.findElement(By.xpath("//*[@id=\"mainContent_compinfoId\"]/a"));
		System.out.println("Sector : "+a3.getText());
		WebElement a4 = wd.findElement(By.xpath("//*[@id=\"mainContent_clsprice\"]/span/span"));
		WebElement a5 = wd.findElement(By.xpath("//*[@id=\"mainContent_pnlPriceChange\"]"));
		WebElement a6 = wd.findElement(By.xpath("//*[@id=\"mainContent_clsprice\"]/small"));
		System.out.println("At time "+a6.getText()+", Share Price Rs. "+a4.getText()+" with Variations "+a5.getText());
		WebElement a7 = wd.findElement(By.xpath("//*[@id=\"mainContent_ltrlTodayHigh\"]"));
		WebElement a8 = wd.findElement(By.xpath("//*[@id=\"mainContent_ltrlTodayLow\"]"));
		WebElement a9 = wd.findElement(By.xpath("//*[@id=\"mainContent_ltrl52WH\"]"));
		WebElement a10 = wd.findElement(By.xpath("//*[@id=\"mainContent_ltrl52WL\"]"));
		System.out.println("Price Summary :  Today's High = Rs. "+a7.getText()+", Today's Low = Rs. "+a8.getText()+", 52 Week High = Rs. "+a9.getText()+", 52 Week Low = Rs. "+a10.getText());
		System.out.println("Company Essentials are as Follows : ");
		WebElement a11 = wd.findElement(By.xpath("//*[@id=\"mainContent_updAddRatios\"]/div[1]/p/span"));
		WebElement a12 = wd.findElement(By.xpath("//*[@id=\"mainContent_ltrlEntValue\"]/span"));
		WebElement a13 = wd.findElement(By.xpath("//*[@id=\"mainContent_updAddRatios\"]/div[3]/p/span"));
		System.out.println("Market Cap : Rs. "+a11.getText()+" Cr., Enterprise Value : Rs. "+a12.getText()+" Cr., No. of Shares : "+a13.getText()+" Cr.");
		WebElement a14 = wd.findElement(By.xpath("//*[@id=\"mainContent_updAddRatios\"]/div[4]/p"));
		WebElement a15 = wd.findElement(By.xpath("//*[@id=\"mainContent_updAddRatios\"]/div[5]/p"));
		WebElement a16 = wd.findElement(By.xpath("//*[@id=\"mainContent_updAddRatios\"]/div[6]/p"));
		System.out.println("P/E Ratio : "+a14.getText()+", P/B Ratio : "+a15.getText()+", Face Value : Rs. "+a16.getText());
		WebElement a17 = wd.findElement(By.xpath("//*[@id=\"mainContent_updAddRatios\"]/div[7]/p"));
		WebElement a18 = wd.findElement(By.xpath("//*[@id=\"mainContent_updAddRatios\"]/div[8]/p/span"));
		WebElement a19 = wd.findElement(By.xpath("//*[@id=\"mainContent_ltrlCash\"]/span"));
		System.out.println("Dividend Yeild : "+a17.getText()+", Book Value TTM : Rs. "+a18.getText()+", Cash : Rs. "+a19.getText()+" Cr.");
		WebElement a20 = wd.findElement(By.xpath("//*[@id=\"mainContent_ltrlDebt\"]/span"));
		WebElement a21 = wd.findElement(By.xpath("//*[@id=\"mainContent_updAddRatios\"]/div[11]/p"));
		WebElement a22 = wd.findElement(By.xpath("//*[@id=\"mainContent_updAddRatios\"]/div[12]/p/span"));
		System.out.println("Debt : Rs. "+a20.getText()+"Cr., Promotor Holding : "+a21.getText()+", EPS (TTM) : Rs. "+a22.getText());
		WebElement a23 = wd.findElement(By.xpath("//*[@id=\"mainContent_updAddRatios\"]/div[13]/p/span"));
		WebElement a24 = wd.findElement(By.xpath("//*[@id=\"mainContent_updAddRatios\"]/div[14]/p/span"));
		WebElement a25 = wd.findElement(By.xpath("//*[@id=\"mainContent_updAddRatios\"]/div[15]/p/span"));
		WebElement a26 = wd.findElement(By.xpath("//*[@id=\"mainContent_updAddRatios\"]/div[16]/p/span"));
		System.out.println("Sales Growth : "+a23.getText()+" %, ROE : "+a24.getText()+" %, ROCE : "+a25.getText()+" %, Profit Growth : "+a26.getText()+" %");
		WebElement a27 = wd.findElement(By.xpath("//*[@id=\"mainContent_divDebtEquity\"]/div/span/span"));
		WebElement a28 = wd.findElement(By.xpath("//*[@id=\"mainContent_divCash\"]/div/span/span"));
		WebElement a29 = wd.findElement(By.xpath("//*[@id=\"mainContent_divICR\"]/div/span/span"));
		WebElement a30 = wd.findElement(By.xpath("//*[@id=\"mainContent_divCFOPAT\"]/div/span/span"));
		System.out.println("Debt/Equity Ratio : "+a27.getText()+", Price to Cash Flow Ratio : "+a28.getText()+", Interest Cover Ratio : "+a29.getText()+", CFO/PAT Ratio (5 Yr. Avg.) : "+a30.getText());
		//wd.quit();	
		System.out.println("=================================================================");
	}
	@Test
	public void hul() throws InterruptedException {
		WebDriver wd = new ChromeDriver();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		wd.get("https://ticker.finology.in/");
		Thread.sleep(3);
		wd.manage().window().maximize();
		
		wd.findElement(By.id("txtSearchComp")).sendKeys("Hindustan Uni");
		wd.findElement(By.xpath("//*[@id=\"frmTicker\"]/section/div/div/div/div/div[2]/div/a[1]")).click();
		
		WebElement a1 = wd.findElement(By.xpath("//*[@id=\"mainContent_ltrlCompName\"]"));
		System.out.println("Company Name : "+a1.getText());
		WebElement a2 = wd.findElement(By.xpath("//*[@id=\"mainContent_compinfoId\"]/strong[1]"));
		System.out.println("NSE Code : "+a2.getText());		
		WebElement a3 = wd.findElement(By.xpath("//*[@id=\"mainContent_compinfoId\"]/a"));
		System.out.println("Sector : "+a3.getText());
		WebElement a4 = wd.findElement(By.xpath("//*[@id=\"mainContent_clsprice\"]/span/span"));
		WebElement a5 = wd.findElement(By.xpath("//*[@id=\"mainContent_pnlPriceChange\"]"));
		WebElement a6 = wd.findElement(By.xpath("//*[@id=\"mainContent_clsprice\"]/small"));
		System.out.println("At time "+a6.getText()+", Share Price Rs. "+a4.getText()+" with Variations "+a5.getText());
		WebElement a7 = wd.findElement(By.xpath("//*[@id=\"mainContent_ltrlTodayHigh\"]"));
		WebElement a8 = wd.findElement(By.xpath("//*[@id=\"mainContent_ltrlTodayLow\"]"));
		WebElement a9 = wd.findElement(By.xpath("//*[@id=\"mainContent_ltrl52WH\"]"));
		WebElement a10 = wd.findElement(By.xpath("//*[@id=\"mainContent_ltrl52WL\"]"));
		System.out.println("Price Summary :  Today's High = Rs. "+a7.getText()+", Today's Low = Rs. "+a8.getText()+", 52 Week High = Rs. "+a9.getText()+", 52 Week Low = Rs. "+a10.getText());
		System.out.println("Company Essentials are as Follows : ");
		WebElement a11 = wd.findElement(By.xpath("//*[@id=\"mainContent_updAddRatios\"]/div[1]/p/span"));
		WebElement a12 = wd.findElement(By.xpath("//*[@id=\"mainContent_ltrlEntValue\"]/span"));
		WebElement a13 = wd.findElement(By.xpath("//*[@id=\"mainContent_updAddRatios\"]/div[3]/p/span"));
		System.out.println("Market Cap : Rs. "+a11.getText()+" Cr., Enterprise Value : Rs. "+a12.getText()+" Cr., No. of Shares : "+a13.getText()+" Cr.");
		WebElement a14 = wd.findElement(By.xpath("//*[@id=\"mainContent_updAddRatios\"]/div[4]/p"));
		WebElement a15 = wd.findElement(By.xpath("//*[@id=\"mainContent_updAddRatios\"]/div[5]/p"));
		WebElement a16 = wd.findElement(By.xpath("//*[@id=\"mainContent_updAddRatios\"]/div[6]/p"));
		System.out.println("P/E Ratio : "+a14.getText()+", P/B Ratio : "+a15.getText()+", Face Value : Rs. "+a16.getText());
		WebElement a17 = wd.findElement(By.xpath("//*[@id=\"mainContent_updAddRatios\"]/div[7]/p"));
		WebElement a18 = wd.findElement(By.xpath("//*[@id=\"mainContent_updAddRatios\"]/div[8]/p/span"));
		WebElement a19 = wd.findElement(By.xpath("//*[@id=\"mainContent_ltrlCash\"]/span"));
		System.out.println("Dividend Yeild : "+a17.getText()+", Book Value TTM : Rs. "+a18.getText()+", Cash : Rs. "+a19.getText()+" Cr.");
		WebElement a20 = wd.findElement(By.xpath("//*[@id=\"mainContent_ltrlDebt\"]/span"));
		WebElement a21 = wd.findElement(By.xpath("//*[@id=\"mainContent_updAddRatios\"]/div[11]/p"));
		WebElement a22 = wd.findElement(By.xpath("//*[@id=\"mainContent_updAddRatios\"]/div[12]/p/span"));
		System.out.println("Debt : Rs. "+a20.getText()+"Cr., Promotor Holding : "+a21.getText()+", EPS (TTM) : Rs. "+a22.getText());
		WebElement a23 = wd.findElement(By.xpath("//*[@id=\"mainContent_updAddRatios\"]/div[13]/p/span"));
		WebElement a24 = wd.findElement(By.xpath("//*[@id=\"mainContent_updAddRatios\"]/div[14]/p/span"));
		WebElement a25 = wd.findElement(By.xpath("//*[@id=\"mainContent_updAddRatios\"]/div[15]/p/span"));
		WebElement a26 = wd.findElement(By.xpath("//*[@id=\"mainContent_updAddRatios\"]/div[16]/p/span"));
		System.out.println("Sales Growth : "+a23.getText()+" %, ROE : "+a24.getText()+" %, ROCE : "+a25.getText()+" %, Profit Growth : "+a26.getText()+" %");
		WebElement a27 = wd.findElement(By.xpath("//*[@id=\"mainContent_divDebtEquity\"]/div/span/span"));
		WebElement a28 = wd.findElement(By.xpath("//*[@id=\"mainContent_divCash\"]/div/span/span"));
		WebElement a29 = wd.findElement(By.xpath("//*[@id=\"mainContent_divICR\"]/div/span/span"));
		WebElement a30 = wd.findElement(By.xpath("//*[@id=\"mainContent_divCFOPAT\"]/div/span/span"));
		System.out.println("Debt/Equity Ratio : "+a27.getText()+", Price to Cash Flow Ratio : "+a28.getText()+", Interest Cover Ratio : "+a29.getText()+", CFO/PAT Ratio (5 Yr. Avg.) : "+a30.getText());
		//wd.quit();	
		System.out.println("=================================================================");
		
	}
}