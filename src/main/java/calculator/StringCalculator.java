package calculator;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {
	public static int splitAndSum(String input) {
		if (input == null || input.isEmpty()) {
			return 0;
		}

		String[] result = input.split(",|:");

		List<Integer> numbers = new ArrayList<>();
		for (String s : result) {
			numbers.add(Integer.parseInt(s));
		}

		if (numbers.isEmpty()) {
			throw new RuntimeException("전달된 배열에 원소가 없습니다.");
		}

		int sum = 0;
		for (Integer number : numbers) {
			if (number < 0) {
				throw new RuntimeException("음수 값은 포함될 수 없습니다.");
			}

			sum += number;
		}

		return sum;
	}
}
