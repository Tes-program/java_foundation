package Day2.FireDrill2;

import java.util.Scanner;

public class Nokia {
    public static void main(String... args) {
        Scanner inputCollector = new Scanner(System.in);        
        String prompt = """
		Welcome to your Nokia phone!
		Please Select a Menu Function
		Press 1 -> Phone book
		Press 2 -> Messages
		Press 3 -> Chat
		Press 4 -> Call Register
		Press 5 -> Tones
		Press 6 -> Settings
		Press 7 -> Call divert
		Press 8 -> Games
		Press 9 -> Calculator
		Press 10 -> Reminders
		Press 11 -> Clock
		Press 12 -> Profiles
		Press 13 -> SIM Services
			""";
        System.out.println(prompt);
	int userInput = inputCollector.nextInt();

	switch(userInput){
		case 1-> {
			System.out.println("Phone book");
			prompt = """
				Press 1 -> To Search 
				Press 2 -> Service Nos.
				Press 3 -> To Add name
				Press 4 -> To Erase
				Press 5 -> To Edit 
				Press 6 -> Assign tone
				Press 7 -> Send b'card
				Press 8 -> Options
				Press 9 -> Speed dials
				Press 10 -> Voice tags

			""";
			System.out.println(prompt);
			userInput = inputCollector.nextInt();
			
			switch(userInput){
				case 1 -> System.out.println("Search");
				case 2 -> System.out.println("Service Nos.");
				case 3 -> System.out.println("Add name");
				case 4 -> System.out.println("Erase");
				case 5 -> System.out.println("Edit");
				case 6 -> System.out.println("Assign tone");
				case 7 -> System.out.println("Send b'card");
				case 8 -> {
					System.out.println("Options");
					prompt = """
						Press 1 -> Type of view
						Press 2 -> Memory Status
					""";
					System.out.println(prompt);
					userInput = inputCollector.nextInt();
					switch(userInput){
						case 1 -> System.out.println("Type of view");
						case 2 -> System.out.println("Memory status");
						default -> System.out.println("Invalid Input");
					}
				}

				case 9 -> System.out.println("Speed dials");
				case 10 -> System.out.println("Voice tags");
				default -> System.out.println("Invalid Input");
			}
		}
		case 2-> {
			System.out.println("Messages");
			prompt = """
				Press 1 -> Write messages 
				Press 2 -> Inbox 
				Press 3 -> Outbox
				Press 4 -> Picture messages
				Press 5 -> Templates 
				Press 6 -> Smileys 
				Press 7 -> Message settings 
				Press 8 -> Info service
				Press 9 -> Voice mailbox number 
				Press 10 -> Service command editor

			""";
			System.out.println(prompt);
			userInput = inputCollector.nextInt();
			
			switch(userInput){
				case 1 -> System.out.println("Write messages");
				case 2 -> System.out.println("Inbox");
				case 3 -> System.out.println("Outbox");
				case 4 -> System.out.println("Picture messages");
				case 5 -> System.out.println("Templates");
				case 6 -> System.out.println("Smileys");
				case 7 -> {
					System.out.println("Message settings");
					prompt = """
						Press 1 -> Set 1
						Press 2 -> Common
					""";
					System.out.println(prompt);
					userInput = inputCollector.nextInt();
					switch(userInput){
						case 1 -> {
							System.out.println("Set 1");
							prompt = """
								Press 1 -> Message centre number
								Press 2 -> Message sent as
								Press 2 -> Message validity
							""";
							System.out.println(prompt);
							userInput = inputCollector.nextInt();
							switch(userInput){
								case 1 -> System.out.println("Message centre number");
								case 2 -> System.out.println("Message sent as");
								case 3 -> System.out.println("Message validity");
								default -> System.out.println("Invalid Input");
							}
						}
						case 2 -> {
							System.out.println("Common");
							prompt = """
								Press 1 -> Delivery reports 
								Press 2 -> Reply via same centre
								Press 2 -> Character support 
							""";
							System.out.println(prompt);
							userInput = inputCollector.nextInt();
							switch(userInput){
								case 1 -> System.out.println("Delivery reports");
								case 2 -> System.out.println("Reply via same centre");
								case 3 -> System.out.println("Character support ");
								default -> System.out.println("Invalid Input");
							}
						}
						default -> System.out.println("Invalid Input");
					}
				}
				case 8 -> System.out.println("Info service");
				case 9 -> System.out.println("Voice mailbox number");
				case 10 -> System.out.println("Service command editor");
				default -> System.out.println("Invalid Input");
			}
		}
		case 3 -> System.out.println("Chat");
		case 4-> {
			System.out.println("Call register");
			prompt = """
				Press 1 -> Missed calls 
				Press 2 -> Received calls
				Press 3 -> Dialled numbers
				Press 4 -> Erase recent call lists
				Press 5 -> Show call duration 
				Press 6 -> Show call costs
				Press 7 -> Call cost settings
				Press 8 -> Prepaid credit
			""";
			System.out.println(prompt);
			userInput = inputCollector.nextInt();
			
			switch(userInput){
				case 1 -> System.out.println("Missed calls");
				case 2 -> System.out.println("Received calls");
				case 3 -> System.out.println("Dialled calls");
				case 4 -> System.out.println("Erase recent call lists");
				case 5 -> {
					System.out.println("Show call duration");
					prompt = """
						Press 1 -> Last call duration
						Press 2 -> All calls' duration
						Press 3 -> Received calls' duration
						Press 4 -> Dialled calls' duration
						Press 5 -> Clear timers

					""";
					System.out.println(prompt);
					userInput = inputCollector.nextInt();
					switch(userInput){
						case 1 -> System.out.println("Last call duration");
						case 2 -> System.out.println("All calls' duration");
						case 3 -> System.out.println("Received calls' duration");
						case 4 -> System.out.println("Dialled calls' duration");
						case 5 -> System.out.println("Clear timers");
						default -> System.out.println("Invalid Input");
					}
				}
				case 6 -> {
					System.out.println("Show call costs");
					prompt = """
						Press 1 -> Last call cost
						Press 2 -> All calls' cost
						Press 3 -> Clear counters

					""";
					System.out.println(prompt);
					userInput = inputCollector.nextInt();
					switch(userInput){
						case 1 -> System.out.println("Last call cost");
						case 2 -> System.out.println("All calls' cost");
						case 3 -> System.out.println("Clear counters");

					}
				}
				case 7 -> {
					System.out.println("Call cost settings");
					prompt = """
						Press 1 -> Call cost limit
						Press 2 -> Show costs in

					""";
					System.out.println(prompt);
					userInput = inputCollector.nextInt();
					switch(userInput){
						case 1 -> System.out.println("Call cost limit");
						case 2 -> System.out.println("Show costs in");

					}
				}

				case 8 -> System.out.println("Prepaid credit");
				default -> System.out.println("Invalid Input");
			}
		}
		case 5-> {
			System.out.println("Tones");
			prompt = """
				Press 1 -> Ringing tone 
				Press 2 -> Ringing volume 
				Press 3 -> Incoming call alert 
				Press 4 -> Composer 
				Press 5 -> Message alert tone 
				Press 6 -> Keypad tones
				Press 7 -> Warning and game tones
				Press 8 -> Vibrating alert 
				Press 9 -> Screen saver
			""";
			System.out.println(prompt);
			userInput = inputCollector.nextInt();
			
			switch(userInput){
				case 1 -> System.out.println("Ringing tone"); 
				case 2 -> System.out.println("Ringing volume"); 
				case 3 -> System.out.println("Incoming call alert");
				case 4 -> System.out.println("Composer"); 
				case 5 -> System.out.println("Message alert tone"); 
				case 6 -> System.out.println("Keypad tones");
				case 7 -> System.out.println("Warning and game tones");
				case 8 -> System.out.println("Vibrating alert"); 
				case 9 -> System.out.println("Screen saver");
				default -> System.out.println("Invalid Input");
			}
		}
		case 6-> {
			System.out.println("Settings");
			prompt = """
				Press 1 -> Call settings  
				Press 2 -> Phone settings 
				Press 3 -> Security settings 
				Press 4 -> Restore factory settings 
			""";
			System.out.println(prompt);
			userInput = inputCollector.nextInt();
			
			switch(userInput){
				case 1 -> {
					System.out.println("Call settings");
					prompt = """
						Press 1 -> Automatic redial
						Press 2 -> Speed dialling 
						Press 3 -> Call waiting options 
						Press 4 -> Own number sending 
						Press 5 -> Phone line in use 
						Press 6 -> Automatic answer 
					""";
					System.out.println(prompt);
					userInput = inputCollector.nextInt();
					switch(userInput){
						case 1 -> System.out.println("Automatic redial");
						case 2 -> System.out.println("Speed dialling");
						case 3 -> System.out.println("Call waiting options");
						case 4 -> System.out.println("Own number sending");
						case 5 -> System.out.println("Phone line in use");
						case 6 -> System.out.println("Automatic answer");
						default -> System.out.println("Invalid Input");
					}
				}
				case 2 -> {
					System.out.println("Phone settings");
					prompt = """
						Press 1 -> Language 
						Press 2 -> Cell info display 
						Press 3 -> Welcome note  
						Press 4 -> Network selection 
						Press 5 -> Lights 
						Press 6 -> Confirm SIM service actions 
					""";
					System.out.println(prompt);
					userInput = inputCollector.nextInt();
					switch(userInput){
						case 1 -> System.out.println("Language");
						case 2 -> System.out.println("Cell info display");
						case 3 -> System.out.println("Welcome note");
						case 4 -> System.out.println("Network selection");
						case 5 -> System.out.println("Lights");
						case 6 -> System.out.println("Confirm SIM service actions");
						default -> System.out.println("Invalid Input");
					}
				}
				case 3 -> {
					System.out.println("Security settings");
					prompt = """
						Press 1 -> PIN code request 
						Press 2 -> Call barring service 
						Press 3 -> Fixed dialling   
						Press 4 -> Closed user group 
						Press 5 -> Phone security 
						Press 6 -> Change access codes  
					""";
					System.out.println(prompt);
					userInput = inputCollector.nextInt();
					switch(userInput){
						case 1 -> System.out.println("PIN code request");
						case 2 -> System.out.println("Call barring service");
						case 3 -> System.out.println("Fixed dialling");
						case 4 -> System.out.println("Closed user group");
						case 5 -> System.out.println("Phone security");
						case 6 -> System.out.println("Change access codes");
						default -> System.out.println("Invalid Input");
					}
				}

				case 4 -> System.out.println("Restore factoy settings");
				default -> System.out.println("Invalid Input");
			}
		}
		case 7 -> System.out.println("Call divert");
		case 8 -> System.out.println("Games");
		case 9 -> System.out.println("Calculator");
		case 10 -> System.out.println("Reminders");

		case 11-> {
			System.out.println("Clock");
			prompt = """
				Press 1 -> Alarm clock 
				Press 2 -> Clock settings  
				Press 3 -> Date setting 
				Press 4 -> Stopwatch 
				Press 5 -> Countdown timer  
				Press 6 -> Auto update of date and time
			""";
			System.out.println(prompt);
			userInput = inputCollector.nextInt();
			
			switch(userInput){
				case 1 -> System.out.println("Alarm clock"); 
				case 2 -> System.out.println("Clock settings"); 
				case 3 -> System.out.println("Date setting");
				case 4 -> System.out.println("Stopwatch"); 
				case 5 -> System.out.println("Countdown timer"); 
				case 6 -> System.out.println("Auto update of date and time");
				default -> System.out.println("Invalid Input");
			}
		}
		case 12 -> System.out.println("Profiles");
		case 13 -> System.out.println("SIM services");
		default -> System.out.println("Invalid Input");
	}
    }
}