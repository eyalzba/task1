package task1;

import java.util.List;

/**
 * Test main class.
 */
public class Test1 {

	public final static String FILE_NAME = "D:\\Reviews-demo.csv";

	public final static void main(String args[]) {
		System.out.println("Start task");

		String fileName = args.length >= 1 ? args[0] : FILE_NAME;
		List<Review> data = new CsvParser().readFileAsReviews(fileName);

//		for (Review r : data) {
//			System.out.println(r);
//		}
//		System.out.println("Total: " + data.size());

		new ReviewsStatisticsAnalizer(data).printActive(1000);

		System.out.println("End task");
	}
}
