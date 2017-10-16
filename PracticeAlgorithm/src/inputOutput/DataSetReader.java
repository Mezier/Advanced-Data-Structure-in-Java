package inputOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class DataSetReader {
	private double[] data;

	public double[] readFile(String fileName) throws Exception {
		File inFile = new File(fileName);
		Scanner in = new Scanner(inFile);

		try {
			readData(in);
			return data;
		} finally {
			in.close();
		}
	}

	public void readData(Scanner in) throws Exception {
		if (!in.hasNext()) {
			throw new Exception("lenght excepted");
		}
		int numberOfVules = in.nextInt();
		data = new double[numberOfVules];
		for (int i = 0; i < numberOfVules; i++) {
			readValue(in, i);
		}
		if (in.hasNext()) {
			throw new Exception("exception");
		}
	}

	private void readValue(Scanner in, int i) throws BadDataException {
		if (!in.hasNextDouble())
			throw new BadDataException("Data value expected");
		data[i] = in.nextDouble();
	}

	public class BadDataException extends IOException {
		public BadDataException() {
		}

		public BadDataException(String message) {
			super(message);
		}
	}
}
