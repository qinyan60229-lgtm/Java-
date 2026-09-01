package tw.brad.tutor;

import java.io.BufferedReader;

import java.io.FileReader;


public class Brad43 {

	public static void main(String[] args) {
		try (FileReader fr = new FileReader("dir1/ns1hosp.csv");
				BufferedReader reader = new BufferedReader(fr);) {
			String line = reader.readLine();
//			System.out.println(line);

			while ((line = reader.readLine()) != null) {
				try {
					String[] data = line.split(",");
					System.out.println(data[2] + ":" + data[7]);
				} catch (Exception e) {
					System.err.println(e);
				}
			}

		} catch (Exception e) {
			System.err.println(e);
		}

	}

}
