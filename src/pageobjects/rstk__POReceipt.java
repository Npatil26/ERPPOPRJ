package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__ PO Receipt"                                
               , summary=""
               , page="POReceipt"
               , namespacePrefix="rstk"
               , object="rstk__porcpt_ui__c"
               , connection="QARSFAdmin"
     )             
public class rstk__POReceipt {

	@ChoiceListType()
	@FindBy(name = "pg:fm:pb:pbs_Main:j_id119:porcv_pohdr__c:j_id121:j_id127")
	public WebElement OrderNumber;
	@TextType()
	@FindBy(id = "pg:fm:pb:pbs_Main:j_id137:porcv_packslipno__c")
	public WebElement packingSlipNumber;
	@ButtonType()
	@FindByLabel(label = "Perform Receipt")
	public WebElement performReceipt;
	@PageTable(row = Porcvlines.class)
	@VisualforceBy(componentXPath = "apex:pageBlockTable[@id='pbt_porcvlines']")
	public List<Porcvlines> porcvlines;
	@PageRow(byColumn = true)
	public static class Porcvlines {

		@TextType()
		@FindBy(xpath = "//td[6]/input")
		public WebElement receiptQty;
		@ChoiceListType()
		@FindBy(xpath = "//select/option")
		public WebElement locationID;
		@TextType()
		@FindBy(xpath = "//td[8]/input")
		public WebElement locationNumber;
	}
	
}
