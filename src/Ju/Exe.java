package Ju;

import java.util.List;

import org.junit.internal.runners.statements.Fail;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Exe {

	public static void main(String[] args) {
		Result rs = JUnitCore.runClasses(J.class,K.class);
		int ig = rs.getIgnoreCount();
		System.out.println("Ignore Count:"+ig);
		int fc = rs.getFailureCount();
		System.out.println("Failure Count:"+fc);
		int rc = rs.getRunCount();
		System.out.println("Run Count:"+rc);
		long rt = rs.getRunTime();
		System.out.println("Runtime Count:"+rt);
		List<Failure> failures = rs.getFailures();
		for(Failure failedTestCases:failures) {
		System.out.println("failedTestCases:"+failedTestCases);

	}

}
}