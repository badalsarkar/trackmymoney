package ca.badalsarkar.trackmymoney;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tech.tablesaw.api.Table;

public class CsvLoader implements DataLoader {
	private static Logger logger = LoggerFactory.getLogger(CsvLoader.class);

	public Table load(String filePath) {
		Table table= null;
		try {
			logger.info("Initiating loading file" +filePath);
			table = Table.read().file(filePath);
			System.out.println(table);
		} catch (IOException iox) {
			//TODO: Handle it
			logger.error(iox.getMessage(), iox);
		} catch (Exception ex) {
			//TODO: handle it
			logger.error(ex.getMessage(), ex);
		}
		return table;
	}

}
