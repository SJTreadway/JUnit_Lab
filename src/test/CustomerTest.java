package test;

import core.Customer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CustomerTest {
	
	private Customer customer1, customer2, customer3;

	@BeforeEach
	public void setUp() throws Exception {
		customer1 = new Customer("Steven Treadway", "123 Bama Lane", "Birmingham", "AL", "35242");
		customer2 = new Customer("Steve Jobs", "111 Apple Dr", "Los Angeles", "CA", "90210");
		customer3 = new Customer("Mark Zuckerberg", "222 Facebook Ave", "San Diego", "CA", "91230");
	}

	@AfterEach
	public void tearDown() throws Exception {
		customer1 = null;
		customer2 = null;
		customer3 = null;
	}

	@Test
	public void testDisplayAddress() {
        assertEquals("123 Bama Lane Birmingham, AL 35242", customer1.displayAddress());
        assertEquals("111 Apple Dr Los Angeles, CA 90210", customer2.displayAddress());
        assertEquals("222 Facebook Ave San Diego, CA 91230", customer3.displayAddress());
    }

	@Test
	public void testDisplayAddressLabel() {
        assertEquals("Name: Steven Treadway\nAddress: 123 Bama Lane Birmingham, AL 35242", customer1.displayAddressLabel());
        assertEquals("Name: Steve Jobs\nAddress: 111 Apple Dr Los Angeles, CA 90210", customer2.displayAddressLabel());
        assertEquals("Name: Mark Zuckerberg\nAddress: 222 Facebook Ave San Diego, CA 91230", customer3.displayAddressLabel());
    }

}
