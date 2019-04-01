package main;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class main {
	
	public static void main(String[] args){
		
		InetAddress equipo;
		
		try{
			equipo = InetAddress.getLocalHost();
			System.out.println("Mi IP es "+equipo.getHostAddress());
			String hostname = equipo.getHostName();
			System.out.println("Mi IP es "+hostname);
			InetAddress[] mis_ips = InetAddress.getAllByName(hostname);
			
			for (int i=0; i < mis_ips.length; i++){
				System.out.println(" La IP es "+mis_ips[i].getHostName());
			}
		} catch (UnknownHostException e){
			
		}
		
	}

}
