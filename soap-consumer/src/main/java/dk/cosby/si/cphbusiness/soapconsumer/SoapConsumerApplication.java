package dk.cosby.si.cphbusiness.soapconsumer;

import consumed.ISBNServiceLocator;
import consumed.ISBNServiceSoapType;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SoapConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SoapConsumerApplication.class, args);
    }

}
