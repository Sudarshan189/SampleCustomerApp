package com.sudarshan.customerapp.client;

import org.springframework.web.client.RestTemplate;

import com.sudarshan.customerapp.entity.Customer;

public class CustomerClient {
	public static final RestTemplate REST_TEMPLET = new RestTemplate();
	public static final String baseUrl = "http://localhost:9091/v1/";

	public static void main(String[] args) {
		String url = baseUrl + "customer";
		Customer customer = new Customer(12345, "Sudarshan Shanbhag", "sush14ec@cmrit.ac.in", "Airoli, Mumbai", "12");
		customer = addCustomer(url, customer);
		System.out.println(customer);

		url = baseUrl + "customer/12345";
		customer = new Customer(12345, "Sudarshan Shanbhag", "sush14ec@cmrit.ac.in", "Airoli, Mumbai", "12");
		deleteCustomer(url, customer);
		System.out.println(customer);
	}

	private static void deleteCustomer(String url, Customer customer) {
		 REST_TEMPLET.delete(url);
	}

	public static Customer addCustomer(String url, Customer customer) {
		return REST_TEMPLET.postForObject(url, customer, Customer.class);
	}

}
