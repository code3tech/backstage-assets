package br.com.tlf.dip.customer.customerinformationmgmt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:spring-logs-dip-config.xml")
public class AsCustomerInformationSummaryApplication {

	public static void main(String[] args) {
		SpringApplication.run(AsCustomerInformationSummaryApplication.class, args);
	}

}
