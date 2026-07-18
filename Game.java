import java.util.Scanner;

public class Game 
{
    // Random Game event Generator
      // Random Enemy Spawns to fight player
      // Pokimone type battle. While player health is above 0 and enemy health is above 0
        // Fight or Run
          // If fight, player and enemy attack each other until one of them has 0 health
            // Trade blows until one of them has 0 health 
            // Earn Coints per battle
          // If run, player has a chance to escape(per random number generator). If successful, return to main game loop. If not, enemy gets a free attack on player.
    public void battle(Scanner scanner, Player player, Enemy enemy)
    {
        while (player.getHealth() > 0 && enemy.getHealth() > 0)
        {

            //Check for 'run' or 'fight'
            System.out.println("Do you want to 'Fight' or 'Run'?");
            String input = scanner.nextLine().toLowerCase();;

            // Running action - Random chance of being sucessful
            if (input.toLowerCase().equals("run"))
            {
                if (Math.random()* 10 > 5)
                {
                    System.out.println("You successfully escaped!");
                    return;
                }
                else
                {
                    System.out.println("You couldn't escape!");
                    enemy.attack(player);
                    System.out.println("The enemy attacked you! Your health: " + player.getHealth() + "\n");
                }
            }
            else if (input.toLowerCase().equals("fight"))
            {
                //Player attacks
                player.attack(enemy);
                System.out.println("You attacked the enemy! Enemy health: " + enemy.getHealth() + "\n");

                //Enemy attacks
                if (enemy.getHealth() > 0)
                {
                    enemy.attack(player);
                    System.out.println("The enemy attacked you! Your health: " + player.getHealth() + "\n");
                }
            }

            // Print Winner
            if (player.getHealth() < 0)
            {
                System.out.println("You Lose.");
                return;
            }
            else if (enemy.getHealth() < 0)
            {
                System.out.println("You Win!");
                return;
            }

            
        }
    }
}