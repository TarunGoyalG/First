package Listener;


	import org.testng.ITestContext;
	import org.testng.ITestListener;
	import org.testng.ITestResult;
	import org.testng.annotations.Test;

	@Test
	public class MyListeners implements ITestListener{

		@Test
		@Override
		public void onTestStart(ITestResult result) {
			//System.out.println("Name of the test method started");
			System.out.println("name of the test method started  "+result.getName());
		}

		@Override
		public void onTestSuccess(ITestResult result) {
			
			//System.out.println("Name of the test method Success");
			System.out.println("Name of the test method Success  "+result.getName());
		}

		@Override
		public void onTestFailure(ITestResult result) {
			
			//System.out.println("Name of the test method failed");	
			System.out.println("Name of the test method failed  "+result.getName());
			
			
		}

		@Override
		public void onTestSkipped(ITestResult result) {
			
			//System.out.println("Name of the test method skipped");		
			System.out.println("Name of the test method skipped"+result.getName());
		}

		@Override
		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			
			
		}

		@Override
		public void onTestFailedWithTimeout(ITestResult result) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onStart(ITestContext context) {
			
			System.out.println("Started");		
		}

		@Override
		public void onFinish(ITestContext context) {
			System.out.println("finish");		
		}
		
		
		

	
}
