package task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Reads and parses a CSV file.
 */
public class CsvParser {

	private final static String CSV_DELIM = ",";

	public CsvParser() {
		
	}

	/**
	 * Do the raw parsing of a CSV file. 
	 * @param fileName
	 * @return A list of string arrays. Each array represents one line.
	 */
	public List<String[]> readFile(String fileName) {
		List<String[]> res = new ArrayList<>();
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			String line = br.readLine();
			while ((line = br.readLine()) != null) {
			    String[] parsed = line.split(CSV_DELIM);
			    if (parsed.length == 0)
			    	continue;
			    res.add(parsed);
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
        return res;
	}

	/**
	 * Parse a CSV file into a list of Review objects.
	 * @param fileName
	 * @return
	 */
	public List<Review> readFileAsReviews(String fileName) {
		List<String[]> raw = readFile(fileName);
		List<Review> res = new ArrayList<>(raw.size());
		for (String[] parsed : raw) {
			res.add(new Review(parsed)); //(TODO - handle illegal input)
		}
		return res;
	}
}
