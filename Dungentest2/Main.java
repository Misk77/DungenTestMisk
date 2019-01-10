import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {

	private static int heroesHealth;
	private static int menu;

	private static String input;
	private static String skattvarde;
	private static int tresuaresscore;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// system object
		Scanner sc = new Scanner(System.in);

		Random rand = new Random();

		// Game var först,hältar sedan monste, sedan skatter

		String[] hero = { "Riddaren ", "Trollkarlen ", "Tjuven " };
		int heroHealth = 100;
		int heroattackDamage = 20;
		int heroskattPoang = 0;

		// players choose of character
		String[] riddaren = { "Riddaren" };
		int riddareInitiativ = 5;
		int riddaretTålighet = 9;
		int riddareAttack = 6;
		int riddareSmidighet = 4;
		int rhealth = 100;
		/*
		 * Specialförmåga: Sköldblock. Riddaren blockerar alltid första attacken per
		 * strid med sin sköld, och behöver därför varken undvika eller ta någon skada.
		 */
		String[] trollkarlen = { "Trollkarlen" };
		int trollkarlinitiativ = 5;
		int trollkarltålighet = 9;
		int trollkarlattack = 6;
		int trollkarlsmidighet = 4;
		int trohealth = 100;
		/*
		 * Specialförmåga: Ljussken. Trollkarlen kan göra monster blinda och har därför
		 * alltid 80% chans att fly från strider
		 */
		String[] tjuven = { "Tjuven" };
		int tjuvinitiativ = 5;
		int tjuvtålighet = 9;
		int tjuvattack = 6;
		int tjuvsmidighet = 4;
		int tjhealth = 100;

		/*
		 * Specialförmåga: Kritisk träff. Tjuven har 25% chans att göra dubbel skada
		 * varje gång tjuven attackerar.
		 */
		//// Random enemy use instead of above for this test
		String heros = hero[rand.nextInt(hero.length)];

//Monster
		String[] spindel = { "Jättespindel " };
		int spindelInitiativ = 5;
		int spindelTålighet = 9;
		int spindelAttack = 6;
		int spindelSmidighet = 4;
		double spindelVanlighet = 1.20;
		String[] skelett = { "Skelett " };
		int skelettInitiativ = 4;
		int SkelettTålighet = 2;
		int skelettAttack = 3;
		int skelettSmidighet = 3;
		double skelettVanlighet = 1.15;
		String[] osc = { "Orc " };
		int orcInitiativ = 6;
		int orcTålighet = 3;
		int orcAttack = 4;
		int orcSmidighet = 4;
		double orcVanlighet = 1.10;
		String[] troll = { "Troll " };
		int trollInitiativ = 2;
		int trollTålighet = 4;
		int trollAttack = 7;
		int trollSmidighet = 2;
		double trollVanlighet = 1.05;
		// Random enemy use instead of above for this test
		String[] monster = { "Jättespindel ", "Skelett ", "Orc ", "Troll " };
		int maxMonsterHealth = 75; // Must have this so it can get new health each round 75 going into every new
									// monster anf then randommize
		int monsterAttackDamage = 20;

		// Skatter
		String[] slantar = { "Slantar " };
		int slantValue = 5;
		double slantVanlighet = 20;
		String[] pengapung = { "Pengapung " };
		int pengapungValue = 5;
		double pengapungVanlighet = 20;
		String[] guldsmycken = { "Guldsmycken " };
		int guldsmyckenValue = 5;
		double guldsmyckenVanlighet = 20;
		String[] adelsten = { "Ädelsten " };
		int adelstenValue = 5;
		double sadelstenVanlighet = 20;
		String[] skattkista = { "Skattkista " };
		int skattkistaValue = 5;
		double skattkistaVanlighet = 20;

		// Random Skatter use instead of above for this test
		String[] skatter = { "Lösa slantar  ", "Pengapung ", "Guldsmycken  ", "Ädelsten  ", "Liten skattkista  " };
		int skattvarde = 25;
		int skattvanlighet = 20;
		// Random skatter efter varje gång man startar om spelet
		String skatten = skatter[rand.nextInt(skatter.length)]; // behövs nog inte när det bara finns ett värde på
																// skatterna

		System.out.println("Welcome to the Dungeon Game By Michel");
		Thread.sleep(300);
		System.out.println("Let the Adventure BEGIN!.......");
		Thread.sleep(300);
		System.out.println("Enter the Dungeon now....[Y]es or [N]o");
		input = sc.next();

		if (input.equalsIgnoreCase("Y")) {
			System.out.println("Du tryckte Y: Adventures Begins...");

			Thread.sleep(300);

			Thread.sleep(300);

		} else if (input.equalsIgnoreCase("N")) {
			System.out.println("Come back then you dare to enter the dungeons.....");
			System.exit(0);

		}

		// Game start

		boolean running = true;
		GAME: while (running) {
			System.out.println();
			System.out.println("============================== Lets FIGHT! ===================================");
			Thread.sleep(1000);
			System.out.println();

			System.out.println("Welcome to the game, \nMr." + heros);
			System.out.println();
			Thread.sleep(1000);
			System.out.println("In the darkness something are waiting.......");
			Thread.sleep(300);
			Thread.sleep(300);
			System.out.println("Something in the dark starring.......");
			Thread.sleep(300);

			Thread.sleep(300);
			int monsterHealth = rand.nextInt(maxMonsterHealth);// 75 in here and then get random to monsterhealth
			String skatt = skatter[rand.nextInt(skatter.length)];
			String enemy = monster[rand.nextInt(monster.length)];
			Thread.sleep(1000);
			System.out.printf("Ouch.... a.... \n" + enemy + "....\n");
			Thread.sleep(1000);
			System.out.println("come out from the dark\n");
			Thread.sleep(1000);
			System.out.println("Be ready for some action...\n");
			Thread.sleep(1000);
			System.out.println("Press a key then you are ready to make a choose to save your life...\n");
			sc.nextLine();

			while (monsterHealth > 0) {
				Thread.sleep(1000);
				System.out.println();
				System.out.println("╔═══════════════════════════════════════════╗\n");
				System.out.println("║" + heros + "'s health is: " + heroHealth);
				System.out.println("╚═══════════════════════════════════════════╝\n");
				System.out.println("║" + heros + "'s score is " + tresuaresscore);
				System.out.println("╚═════════════════════════════════════════╝\n");
				Thread.sleep(1000);
				System.out.println();

				System.out.println("╔══════════════════════════════════════════════╗\n");
				System.out.println("║" + enemy + "'s health is: " + monsterHealth);
				System.out.println("╚══════════════════════════════════════════════╝\n");
				Thread.sleep(900);
				System.out.println();
				System.out.println("\n|============================|");
				System.out.println("\n|-------   What you ---------|");
				System.out.println("\n|--------- wanna do? --------|");
				System.out.println("\n|============================|");
				Thread.sleep(1000);
				System.out.println("[A]ttack?");
				System.out.println("[R]un? ");
				System.out.println("[S]katten ");

				input = sc.next();
				sc.nextLine();

				if (input.equalsIgnoreCase("A")) {
					System.out.println("Du tryckte A: Attack");
					int damageAgainstMonster = rand.nextInt(heroattackDamage);
					int damageMosterGive = rand.nextInt(monsterAttackDamage);
					monsterHealth -= damageAgainstMonster;
					heroHealth -= damageMosterGive;
					Thread.sleep(900);
					System.out.println("" + heros + " attack the " + enemy + " and damaged: " + damageAgainstMonster);
					Thread.sleep(1000);
					System.out.println("" + enemy + " attack the " + heros + " and damaged: " + damageMosterGive);
					Thread.sleep(900);
					if (heroHealth < 1) {
						System.out.println("Our hero, the " + heros + " Died!");
						break;
					}
					Thread.sleep(900);
					Thread.sleep(900);

					if (rand.nextInt(100) < skattvanlighet && monsterHealth < 1) {

						tresuaresscore += skattvarde;
						System.out.println();
						Thread.sleep(900);
						System.out.println(
								"╔══════════════════════════════════════════════════════════════════════════════════╗\n");
						System.out.println(
								"" + heros + "'s hittade: " + skatt + "total skattsumma: " + tresuaresscore + " ");
						System.out.println(
								"╚══════════════════════════════════════════════════════════════════════════════════╝\n");
						break;
					}
				}

				else if (input.equalsIgnoreCase("S")) {

					tresuaresscore++;
					// heroskattPoang += tresuaresscore;
					System.out.println("Du tryckte S: Skatten");
					System.out.println();
					System.out.println(heros + " får se vilken skatt som finns i rummet ");
					Thread.sleep(900);
					System.out.println();
					System.out.println("╔══════════════════════════════════════════════════════════════════╗\n");
					System.out.println(heros + "see a gliming " + skatt + "behind the " + enemy);
					System.out.println("╚══════════════════════════════════════════════════════════════════╝\n");

				} else if (input.equalsIgnoreCase("R")) {
					System.out.println("Du tryckte R: Run");
					System.out.println(heros + " run away to safety\n from the  " + enemy);
					System.out.println(" You leave this room with ");
					System.out.println("╔══════════════════════════════════════════╗\n");
					System.out.println("║" + heros + "'s health is: " + heroHealth);
					System.out.println("╚══════════════════════════════════════════╝\n");
					System.out.println("╔══════════════════════════════════════════╗\n");
					System.out.println("║" + heros + "'s score is " + heroskattPoang);
					System.out.println("╚══════════════════════════════════════════╝\n");
					Thread.sleep(900);
					System.out.println();
					// tresuaresscore += skattvarde; Tjuven goud get som of this sometime
					// heroskattPoang += tresuaresscore;
					if (rand.nextInt(100) < (skattvanlighet = 20)) {// 20 procent att man får med den?? stämmer detta?el
																	// inte procent utan chans??

						tresuaresscore += skattvarde;
						System.out.println();
						Thread.sleep(900);
						System.out.println(
								"╔══════════════════════════════════════════════════════════════════════════════════════════════════╗\n");
						System.out.println(heros + "'s hann Stjäla med sig: " + skatt + "total skattsumma: "
								                                 + tresuaresscore + "  "

								+ "╚════════════════════════════════════════════════════════════════════════════════════════════════╝\n");

					}

					continue GAME;

				} else {

					System.out.println("Ogiltigt val");

				}

			}
			Thread.sleep(900);
			System.out.println();
			System.out.println("╔════════════════════════════════════════════╗\n");
			System.out.println("║" + heros + "'s has defeated the: " + enemy);
			System.out.println("╚════════════════════════════════════════════╝\n");
			System.out.println();
			Thread.sleep(900);
			System.out.println(" You leave this room with ");
			System.out.println("╔═══════════════════════════════════════════╗\n");
			System.out.println("║" + heros + "'s health is: " + heroHealth);
			System.out.println("╚═══════════════════════════════════════════╝\n");
			System.out.println("╔═══════════════════════════════════════════╗\n");
			System.out.println("║" + heros + "'s score is " + tresuaresscore);
			System.out.println("╚═══════════════════════════════════════════╝\n");
			Thread.sleep(900);
			System.out.println();
			tresuaresscore += skattvarde;
			System.out.println();
			Thread.sleep(900);
			System.out.println(
					"╔══════════════════════════════════════════════════════════════════════════════════════════════v═══════════════════════╗\n");
			System.out.println("║" + heros + "'s reward after the battle was the:" + skatt
					+ "\ntotal tresuaresscore is: " + tresuaresscore + "  " + "║");
			System.out.println("║" + "║"
					+ "╚════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝\n");
			Thread.sleep(900);
			System.out.println();
		}
		// After a battle
		while (!input.equalsIgnoreCase("R") && !input.equalsIgnoreCase("E")) {
			System.out.println("Ogiligt val");
			input = sc.next();
			sc.nextLine();
		}
		System.out.println("\n|============================|");
		System.out.println("\n|-------   What you ---------|");
		System.out.println("\n|--------- wanna do? --------|");
		System.out.println("\n|============================|");

		System.out.println("[R]eturn To the Dungeon");
		System.out.println("[E]xit ");
		sc.nextLine();
		while (!input.equals("1") && !input.equals("2")) {
			System.out.println("Något gick fel...\nFörsök igen");
			sc.nextLine();
		}
		if (input.equals("R")) {
			System.out.println("well lets go......\n Back to the Dungeon....");

		} else if (input.equals("E")) {
			System.out.println("You at least alive and exit the dungeon");
			System.out.println("You at least alive and exit the dungeon");
			System.exit(0);
		}
		// main metoden d�r man skriver in till texten och som h�mtar metoden i
		// writefile classen

	}// Main method

	public static int getHeroesHealth() {
		return heroesHealth;
	}

	public static void setHeroesHealth(int heroesHealth) {
		Main.heroesHealth = heroesHealth;
	}

	public static int getMenu() {
		return menu;
	}

	public static void setMenu(int menu) {
		Main.menu = menu;
	}

	public static String getInput() {
		return input;
	}

	public static void setInput(String input) {
		Main.input = input;
	}

	public static String getSkattvarde() {
		return skattvarde;
	}

	public static void setSkattvarde(String skattvarde) {
		Main.skattvarde = skattvarde;
	}

	public static int getTresuaresscore() {
		return tresuaresscore;
	}

	public static void setTresuaresscore(int tresuaresscore) {
		Main.tresuaresscore = tresuaresscore;
	}

	@Override
	public String toString() {
		return "Main [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}// CLASS MAIN ENDS HERE
