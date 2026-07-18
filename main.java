import java.util.Scanner;

public class main
{
    public static void main(String[] args)
    {
        // Welcome Message
        System.out.println("Welcome to the Adventure Game!\n (Press 'Enter' to Continue, or type 'Quit' to exit the game)");

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);        
        String response = scanner.nextLine();

     
        while (!response.equalsIgnoreCase("quit") || !response.equalsIgnoreCase("enter"))
        {  
            System.out.println("Incorrect Response. To play: 'Enter' To exit: 'quit'");
            response = scanner.nextLine();

            if (response.equalsIgnoreCase("quit"))
            {
                System.out.println("Goodbye!");
                System.exit(0);
            }
            else if (response.equalsIgnoreCase("enter"))
            {
                // Continue to Game
                break;
            }
        }
        
        
        // Class Instatiation
        Game game = new Game();
        Player player = new Player();

        // Run Game
        while (player.getHealth() > 0)
        {   
            // GAME LOGIC
            System.out.print("Name: ");
            player.setName(scanner.nextLine());
            System.out.println("Hello, " + player.getName() + "! Your adventure begins now.....");

            //First Battle
            System.out.println("An enemy appears! Prepare for battle!");

            game.battle(scanner, player, new Enemy());
            
            //Check for "Quit" Player keyword
            if (scanner.nextLine().toLowerCase().equals("quit"))
            {
                System.out.println("Quitting Game...");
                return;
            }
        }
        scanner.close();
    }
}