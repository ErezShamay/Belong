package CordioMedicalAutomationTestsForAndroid.AutomationTestsForAndroid;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class Log {

	static FileWriter fw;
	private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
	static Timestamp timeStamp = new Timestamp(System.currentTimeMillis());

	static File logFile = new File(
			"C:\\Users\\erez\\eclipse-workspace\\CordioMedicalAutomationTestsForAndroid\\Logs\\AutomationLogForAndroid "
					+ sdf.format(timeStamp) + ".log");

	public static void appendLogFile(String info) {
		if (!logFile.exists()) {
			try {
				logFile.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		try {
			timeStamp = new Timestamp(System.currentTimeMillis());
			BufferedWriter buf = new BufferedWriter(new FileWriter(logFile, true));
			buf.append(sdf.format(timeStamp)+" "+info);
			buf.newLine();
			buf.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void closeLog() throws IOException {
		fw.close();
	}
}