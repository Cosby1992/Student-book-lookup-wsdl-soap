package example;

import consumed.ISBNServiceLocator;
import consumed.ISBNServiceSoapType;

import javax.management.remote.rmi.RMIConnection;
import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

public class HelloWorldClient {

    public static void main(String[] argv) {

        boolean isValidISBN10;
        boolean isValidISBN13;

        try {
            ISBNServiceLocator locator = new ISBNServiceLocator();
            ISBNServiceSoapType service = locator.getISBNServiceSoap();

            // this ISBN number is taken from a math formula collection book
            isValidISBN10 = service.isValidISBN10("87-88751-59-7");
            // this ISBN number is taken from the book "An Embarrassment of Witches"
            isValidISBN13 = service.isValidISBN13("978-1-60309-462-7");

            System.out.println(isValidISBN10);
            System.out.println(isValidISBN13);
        } catch (ServiceException | RemoteException ex) {
            ex.printStackTrace();
        }

  }

}
