package Listener;

	

	import org.testng.annotations.Test;
	import org.testng.Assert;
	import org.testng.annotations.Listeners;


	@Listeners(Listener.MyListeners.class)    //syntax @Listeners(packagename.classname.classKayeword)
	public class TSUITE 
{
		
		
		@Test
		public void r11() {
			
			System.out.println("method r11 is running");
		}
		
		@Test
	    public void r12() {
			
			System.out.println("method r12 is running");
			Assert.fail();
			
		}
		@Test
	     public void r13() {
			
			
			System.out.println("method r13 is running");
			
			
		}
		@Test
	     public void r14() {
	 		
	 		
	 		System.out.println("method r14 is running");
	 		
	 	
	 	}
		@Test
	     public void r15() {
	 		
	 		
	 		System.out.println("method r15 is running");
		}
		
		@Test
	    public void r16() {
			
			
			System.out.println("method r16 is running");
		}

		@Test
	    public void r17() {
			
			
			System.out.println("method r17 is running");
		}
		
		@Test
	    public void r18() {
			
			
			System.out.println("method r18 is running");
		}

		@Test
	    public void r19() {
			
		System.out.println("method r19 is running");
		}
	
}
