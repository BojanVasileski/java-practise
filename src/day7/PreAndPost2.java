package day7;

public class PreAndPost2 {
	public static void main(String[] args) {
		int messages =10;
		messages++;
		++messages;
		
		int readMessages = --messages;
		System.out.println("ReadMessages: " + readMessages);
		System.out.println("Messages: " + messages);
		
		int unreadMessages = readMessages--;
		
		System.out.println("unreadmessages: " + unreadMessages);
		System.out.println("readmessages: " + readMessages);
		
		int total = unreadMessages++ - readMessages--;
		
		System.out.println("unreadmessages: " + unreadMessages);
		System.out.println("readmessages: " + readMessages);
		System.out.println("total: " + total);
		
		
		int count = 20;
		int count2= 10;
		int totalCount = ++count + --count2;
		
		System.out.println("count: "+ count);
		System.out.println("count2: "+ count2);
		System.out.println("total count: "+ totalCount);
		
		int myCount = count++ + ++count;
		
	}
	
}
