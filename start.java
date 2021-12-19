package frontline;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;




public class start {

	int choice=0;
	static String cmd_Input=null;
static String menu_input;

static xploitframework  exploit=null;

static InetAddress addrs = null;


	

	private static void ask_ip_or_hostname()
			throws IOException {
		InputStreamReader isr =	new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
	
		
		System.out.println("1: enter ip \r\n");
		System.out.println("2: enter hostname \r\n");
		
		
		
		
		menu_input = br.readLine();
if(menu_input=="1")
{
System.out.print("-->");
cmd_Input=br.readLine();

InetAddress.getByAddress(cmd_Input.getBytes());



// process ip

}
else if(menu_input=="2")
{
System.out.print("-->");
cmd_Input=br.readLine();
// process hostname
InetAddress.getByName(cmd_Input);
}


System.out.println("data received! \r\n");




	}

	
	static // 1 pop3 attack, 2 ftp attack
int ask_attack_type()
		throws IOException {
	InputStreamReader isr =	new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);

	
	System.out.println("1: pop3 attack linux payload \r\n");
	System.out.println("2: ftp attack linux payload \r\n");
	
	
	
	
	menu_input = br.readLine();
if(menu_input=="1")
return 1;
else if(menu_input=="2")
return 2;


return 0;
}

	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome to FRONTLINE , \r\n");
		System.out.println("Multi protocol exploit tool \r\n");
	
			
		
		try {
			ask_ip_or_hostname();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// future additions use switch.
		
		
	try {
		if(	ask_attack_type()==1)
			exploit.exploitpop3(addrs);
		 else  	
			 exploit.exploitFtp(addrs);
		
		
	
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		
	
		
		
	
	
	
	}

}
