package task1;

import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * Finds different statistics in reviews collection.
 */
public class ReviewsStatisticsAnalizer {

	List<Review> reviews;

	public ReviewsStatisticsAnalizer(List<Review> reviews) {
		this.reviews = reviews;
	}

	/**
	 * Prints the num most active users.
	 * @param num
	 */
	public void printActive(int num) {
		Map<String, Integer> user2Count = new HashMap<>();
		for (Review r : reviews) {
			int count = user2Count.containsKey(r.userId) ? user2Count.get(r.userId) : 0;
			user2Count.put(r.userId, count+1);
		}
		List<String> users = new ArrayList<>(user2Count.keySet());
		Collections.sort(users);
		System.out.println("The " + num + " top users:");
		for (int i=0; i<num && i<users.size(); i++) {
			System.out.println(users.get(i) + " (" + user2Count.get(users.get(i)) + ")");
		}
	}
}
