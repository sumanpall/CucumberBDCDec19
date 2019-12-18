package stepDef13Dec19;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DefineStepdec19 {
	
	@Given("Sara purchased microwave for {int} dollors")
	public void sara_purchased_microwave_for_dollors(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.out.println("price:"+int1);
	}
	
	@Given("Mike provides customerdetails")
	public void mike_provides_customerdetails(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    //throw new cucumber.api.PendingException();
		        List<String> lcoll=dataTable.asList();
		        System.out.println(lcoll.size());
		        for(int i=0;i<=lcoll.size()-1;i++) {
		        	String lname=lcoll.get(i).toString();
		        	System.out.println(lname);
		        }
		        
		
		
		
	}

	@Given("online store is open")
	public void online_store_is_open() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}
	@Given("Mike purchased gift voucher")
	public void mike_purchased_gift_voucher() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Given("she has a receipt")
	public void she_has_a_receipt() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("Sara returns damaged microwave")
	public void sara_returns_damaged_microwave() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("Sara should get refund of {int} dollors")
	public void sara_should_get_refund_of_dollors(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

}
