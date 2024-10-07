package test10;

import java.util.regex.Pattern;

public class Customer {
	private String customerId;
	private String firstName;
	private String lastName;
	private String emailAddress;
	private String phoneNumber;
	private String address;

	public Customer() {
		this.customerId = "";
		this.firstName = "";
		this.lastName = "";
		this.emailAddress = "";
		this.phoneNumber = "";
		this.address = "";
	}

	public Customer(String customerId, String firstName, String lastName, String emailAddress, String phoneNumber,
			String address) {
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFullName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailId(String emailAddress) {
		if (isValidEmail(emailAddress)) {
			this.emailAddress = emailAddress;
		} else {
			System.out.println("Invalid email address");
		}
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		if (isValidPhoneNumber(phoneNumber)) {
			this.phoneNumber = phoneNumber;

		} else {
			System.out.println("Invalid Phone number");
		}
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	private boolean isValidEmail(String email) {
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
		Pattern pat = Pattern.compile(emailRegex);
		return pat.matcher(email).matches();
	}

	private boolean isValidPhoneNumber(String phone) {
		return phone.matches("\\d{10}");
	}

	// Print all customer details
	public void printCustomerDetails() {
		System.out.println("Customer ID: " + customerId);
		System.out.println("Name: " + firstName + " " + lastName);
		System.out.println("Email: " + emailAddress);
		System.out.println("Phone: " + phoneNumber);
		System.out.println("Address: " + address);
	}
}
