
import javax.swing.JButton;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class helper {

	private static JLabel lblMessage;
	private static JLabel lblMessage2;
	private static JLabel infoMessage;
    private static JLabel extra;
	private static JTextField textField;
	private static JButton btnEnterV;
	private static JButton btnEnterS;
	private static JButton btnEnterB;
	private static JLabel viewInfo;
    private static JLabel shopit;
    private static JLabel shopit1;
    private static JLabel shopit2;
    private static JLabel buyIcon;
    


public static void clearSpace() {
	lblMessage.setVisible(false);
	lblMessage2.setVisible(false);
	infoMessage.setVisible(false);
	extra.setVisible(false);
	textField.setVisible(false);
	btnEnterV.setVisible(false);
	btnEnterS.setVisible(false);
	btnEnterB.setVisible(false);
	viewInfo.setVisible(false);
	shopit.setVisible(false);
	shopit1.setVisible(false);
	shopit2.setVisible(false);
	buyIcon.setVisible(false);
}

public static void addView() {
	lblMessage.setVisible(true);
	lblMessage2.setVisible(true);
	infoMessage.setVisible(true);
	extra.setVisible(true);
	textField.setVisible(true);
	btnEnterV.setVisible(true);
	viewInfo.setVisible(true);
}

public static void addSell() {
	infoMessage.setVisible(true);
	lblMessage2.setVisible(true);
	textField.setVisible(true);
	extra.setVisible(true);
	btnEnterS.setVisible(true);
}

public static void addBuy() {
	lblMessage.setVisible(true);
	infoMessage.setVisible(true);
	shopit.setVisible(true);
	shopit1.setVisible(true);
	shopit2.setVisible(true);
	textField.setVisible(true);
	extra.setVisible(true);
	btnEnterB.setVisible(true);
	buyIcon.setVisible(true);
}

//Source for all images used: iconarchive.com.

public static String generateShop(Hashtable<String, Integer> prices, ArrayList<String> shop,
		ArrayList<Integer> shopPrices, int item_compresseduranium, int item_reactorcore, int item_alientech) {
	 Random rand = new Random();
	  int random = rand.nextInt(101);
      if (random < 40) {
          int random2 = rand.nextInt(3);
          if (random2 == 0) {
              int flcost = rand.nextInt((prices.get("Iron teapot")/2) + 1) + 15;
              shop.add("Iron teapot");
              shopPrices.add(flcost);
              return "Iron teapot: " + flcost;
          } 
          else if (random2 == 1) {
              int flcost2 = rand.nextInt((prices.get("Iron spoon")/2) + 1) + 4;
              shop.add("Iron spoon");
              shopPrices.add(flcost2);
              return "Iron spoon: " + flcost2;
          }
          else if (random2 == 2) {
              int flcost3 = rand.nextInt((prices.get("Dihydrogen monoxide") - 1) + 1) + 1;
              shop.add("Dihydrogen monoxide");
              shopPrices.add(flcost3);
              return "Dihydrogen monoxide: " + flcost3;
          }
      }
      else if (random > 39 && random < 71) {
          int random3 = rand.nextInt(2);
          if (random3 == 0) {
              int flcost4 = rand.nextInt((prices.get("Amethyst crystal")/2) + 1) + 100;
              shop.add("Amethyst crystal");
              shopPrices.add(flcost4);
              return "Amethyst crystal: " + flcost4;
          } 
          else if (random3 == 1) {
              int flcost5 = rand.nextInt((prices.get("Opal gems")/2) + 1) + 300;
              shop.add("Opal gems");
              shopPrices.add(flcost5);
              return "Opal gems: " + flcost5;
          }
      }
      else if (random > 70 && random < 91) {
          int random4 = rand.nextInt(3);
          if (random4 == 0) {
              int flcost6 = rand.nextInt((prices.get("Book of the Dead")/2) + 1) + 1000;
              shop.add("Book of the Dead");
              shopPrices.add(flcost6);
              return "Book of the Dead: " + flcost6;
          } 
          else if (random4 == 1) {
              int flcost7 = rand.nextInt((prices.get("2mg of plutonium")/2) + 1) + 4000;
              shop.add("2mg of plutonium");
              shopPrices.add(flcost7);
              return "2mg of plutonium: " + flcost7;
          }
          else if (random4 == 2) {
              shop.add("Gravity ray");
              shopPrices.add(7000);
            	return "Gravity ray: " + prices.get("Gravity ray");
          }                    
      }
      else if (random > 90 && random < 101) {
          int random5 = rand.nextInt(3);
          if (random5 == 0 && item_compresseduranium == 0) {
        	  int flcost8 = rand.nextInt((prices.get("Compressed uranium")/2) + 1) + 19000;
              shop.add("Compressed uranium");
              shopPrices.add(flcost8);
              item_compresseduranium = 1;
              return "Compressed uranium: " + flcost8;
          } 
          else if (random5 == 1 && item_reactorcore == 0) {
              int flcost9 = rand.nextInt((prices.get("Arc reactor core")/2) + 1) + 23000;
              shop.add("Arc reactor core");
              shopPrices.add(flcost9);
              item_reactorcore = 1;
              return "Arc reactor core: " + flcost9;
          }
          else if (random5 == 2 && item_alientech == 0) {
              int flcost10 = rand.nextInt((prices.get("Alien tech")/2) + 1) + 30000;
              shopPrices.add(flcost10);
              shop.add("Alien tech");
              item_alientech = 1;
              return "Alien tech: " + flcost10;
          } 
      }
	return null;                    
  }
}





