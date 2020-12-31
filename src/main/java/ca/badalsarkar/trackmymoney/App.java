package ca.badalsarkar.trackmymoney;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("/context.xml");
        new CsvLoader().load("/home/badal/Documents/finance/transactions/cibc/cibc.csv");
    }
}
