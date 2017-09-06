package task1;

/**
 * Representation of single review.
 */
public class Review {
	public String id,
	productId,
	userId,
	profileName,
	helpfulNessNumerator,
	helpfulnessDenominator,
	score,
	time,
	summary,
	text;

	public Review(String[] parsedStrings) {
		int i=0;
		id = parsedStrings[i++];
		productId = parsedStrings[i++];
		userId = parsedStrings[i++];
		profileName = parsedStrings[i++];
		helpfulNessNumerator = parsedStrings[i++];
		helpfulnessDenominator = parsedStrings[i++];
		score = parsedStrings[i++];
		time = parsedStrings[i++];
		summary = parsedStrings[i++];
		text = parsedStrings[i++];
	}

	@Override
	public String toString() {
		//For debug:
		return String.valueOf(id) + "," + userId;
	}
}
