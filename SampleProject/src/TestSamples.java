import java.util.ArrayList;
import java.util.List;

public class TestSamples {

	public static void main(String[] args) {

		String sample ="  abc  ";
		String sample2 = sample.repeat(3);
		System.out.println(sample2);
		System.out.println(sample);
		
		String isBlankCheck = " ";
		String isEmptyCheck = "";
		System.out.println(isBlankCheck.isBlank()); // is Blank Return true for both " " and "";
		System.out.println(isEmptyCheck.isEmpty()); // isEmpty will only return true for "" not for " ";
		System.out.println("-----------");
		sample = "This\nis\na\nmultiline\ntext.";
		List<String> lines = new ArrayList<>();
		sample.lines().forEach( line -> lines.add(line));
		lines.forEach( line -> System.out.println(line));
		
	}

}
