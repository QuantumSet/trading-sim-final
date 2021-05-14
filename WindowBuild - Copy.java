import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;

public class WindowBuild {

	private JFrame frame;
	private JLabel mainMessage;
	private static JLabel lblMessage;
	private JButton buttonB;
	private JButton buttonS;
	private JButton buttonV;
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
	private JLabel mainIcon;
    private static JLabel buyIcon;
    
	int money = 100;
    int item_alientech = 0;
    int item_reactorcore = 0;
    int item_compresseduranium = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowBuild window = new WindowBuild();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WindowBuild() {
		initialize();
		clearSpace();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.ORANGE);
		frame.setBounds(500, 400, 600, 330);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		ArrayList<String> inventory = new ArrayList<String>();
        inventory.add("Iron teapot");
        inventory.add("Amethyst crystal");
        ArrayList<String> shop = new ArrayList<String>();
        ArrayList<Integer> shopPrices = new ArrayList<Integer>();
        Hashtable<String, Integer> prices = new Hashtable<String, Integer>();
        prices.put("Iron teapot", 30);
        prices.put("Iron spoon", 9);
        prices.put("Dihydrogen monoxide", 5);
        prices.put("Amethyst crystal", 150);
        prices.put("Opal gems", 500);
        prices.put("Book of the Dead", 1500);
        prices.put("2mg of plutonium", 8000);
        prices.put("Gravity ray", 7000);
        prices.put("Alien tech", 50000);
        prices.put("Compressed uranium", 28000);
        prices.put("Arc reactor core", 40000);
        Hashtable<String, String> itemInfo = new Hashtable<String, String>();
        itemInfo.put("Iron teapot", "It was made by a expert craftsman in Saudi Arabia.");
        itemInfo.put("Iron spoon", "Found on the side of the road and was cleaned.");
        itemInfo.put("Dihydrogen monoxide", "Really?");
        itemInfo.put("Amethyst crystal", "Obtained from the Orabos mining system.");
        itemInfo.put("Opal gems", "Obtained from the Czack mountains");
        itemInfo.put("Book of the Dead", "Crafted and written by witches and wizards.");
        itemInfo.put("2mg of plutonium", "The result of two months of extracting and excavation.");
        itemInfo.put("Gravity ray", "Alien tech that was isolated and reverse engineered.");
        itemInfo.put("Alien tech", "No one know where or how it came to be.");
        itemInfo.put("Compressed uranium", "The result of a year of extracting and excavation.");
        itemInfo.put("Arc reactor core", "Very small but portable engine for energy. Can power up to one house.");
        itemInfo.put("Portable Galactic Star", "Used for creating essentially free energy through fusion. ");
		
		mainMessage = new JLabel("Welcome to the Trading Hub!");
		mainMessage.setFont(new Font("Tahoma", Font.PLAIN, 16));
		mainMessage.setBounds(201, -5, 228, 50);
		frame.getContentPane().add(mainMessage);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField.setBounds(149, 123, 137, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		infoMessage = new JLabel("");
		infoMessage.setFont(new Font("Tahoma", Font.PLAIN, 15));
		infoMessage.setBounds(10, 25, 504, 54);
		frame.getContentPane().add(infoMessage);
		
		extra = new JLabel("");
		extra.setFont(new Font("Tahoma", Font.PLAIN, 12));
		extra.setBounds(140, 76, 179, 50);
		frame.getContentPane().add(extra);
		
		btnEnterV = new JButton("Enter");
		btnEnterV.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnEnterV.setBackground(Color.LIGHT_GRAY);
		btnEnterV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int info = 0;
				try {
					info = Integer.parseInt(textField.getText());
					for (int x = 0; x < inventory.size()+1; x++) {				
	                     if (info == x) {
	                         viewInfo.setText(inventory.get(x-1) + ": " + itemInfo.get(inventory.get(x-1)));
	                     }
	                     
	                 }
					
				} catch(Exception some) {
					JOptionPane.showMessageDialog(null, "Please enter a valid number");
				}
				
			}
		});
		btnEnterV.setBounds(472, 230, 102, 54);
		frame.getContentPane().add(btnEnterV);
		
		btnEnterS = new JButton("Enter");
		btnEnterS.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnEnterS.setBackground(Color.LIGHT_GRAY);
		btnEnterS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int number = 0;
				try {
					number = Integer.parseInt(textField.getText());
					 for (int x = 0; x < inventory.size()+1; x++) {
	                        if (number == x) {
	                            int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to sell the " + inventory.get(x-1) + " for " + prices.get(inventory.get(x-1)) + "?");
	                            if (option == 0) {
	                                    int n = prices.get(inventory.get(x-1));
	                                    inventory.remove(x-1);
	                                    money = money + n;
	                                    JOptionPane.showMessageDialog(null,"Transaction successful. You now have " + money + " dollars.");
	                    				lblMessage2.setText("Inventory:"  + inventory);
	                            }
	                        }
	                    }
				} catch(Exception some) {
					JOptionPane.showMessageDialog(null, "Please enter a valid number");
				}
			}
		});
		btnEnterS.setBounds(472, 230, 102, 54);
		frame.getContentPane().add(btnEnterS);
		
		btnEnterB = new JButton("Enter");
		btnEnterB.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnEnterB.setBackground(Color.LIGHT_GRAY);
		btnEnterB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int numberB = 0;
				try {
					numberB = Integer.parseInt(textField.getText());
					for (int x = 0; x < shop.size()+1; x++) {
                        if (numberB == x) {
                            if (shopPrices.get(x-1) == 999999) {
                            	JOptionPane.showMessageDialog(null, "We're sold out for that item");
                            	continue;
                            } else if (money < shopPrices.get(x-1)) {
                                JOptionPane.showMessageDialog(null,"You don't have enough money.");
                                continue;
                            }
                            int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to purchase the " + shop.get(x-1) + " for " + shopPrices.get(x-1) + "?");
                            if (choice == 0) {
                                int n = shopPrices.get(x-1);
                                inventory.add(shop.get(x-1));
                                shop.set(x-1, "Sold Out");
                                shopPrices.set(x-1, 999999);
                                money = money - n;
                                JOptionPane.showMessageDialog(null, "Transaction successful. You now have " + money + " dollars.");
                                if (numberB == 1) {
                                	shopit.setText("Sold Out");
                                } else if (numberB == 2) {
                                	shopit1.setText("Sold Out");
                                } else {
                                	shopit2.setText("Sold Out");
                                }
                            } 
                        }
					}
				} catch (Exception some) {
					JOptionPane.showMessageDialog(null, "Please enter a valid number");
				}
			}
		});
		btnEnterB.setBounds(472, 230, 102, 54);
		frame.getContentPane().add(btnEnterB);
		
		
		
		
		
		
		buttonB = new JButton("Buy ");
		Image buyrealIcon = new ImageIcon(this.getClass().getResource("/cart-add-icon.png")).getImage();
		buttonB.setIcon(new ImageIcon(buyrealIcon));
		buttonB.setFont(new Font("Tahoma", Font.PLAIN, 13));
		buttonB.setBackground(Color.LIGHT_GRAY);
		buttonB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				clearSpace();
				if (money < 200) {
					JOptionPane.showMessageDialog(null, "You are able to buy Tier 1 items");
				} else if (money < 1500) {
					JOptionPane.showMessageDialog(null, "You are able to buy Tier 2 items");
				} else if (money < 5000) {
					JOptionPane.showMessageDialog(null, "You are able to buy Tier 3 items");
				} else if (money < 40000) {
					JOptionPane.showMessageDialog(null, "You are able to buy Tier 4 items");
				}
				infoMessage.setText("Here you can buy any of three items for cash.");
				extra.setText("Topmost item is 1 and so on.");
				lblMessage.setText("Money: $" + money + "     Items for Sale: ");
				
				
                shop.clear();
                shopPrices.clear();
                item_alientech = 0;
                item_reactorcore = 0;
                item_compresseduranium = 0;
				String ultanswer = generateShop(prices, shop, shopPrices, item_compresseduranium, item_reactorcore, item_compresseduranium);
				String ultanswer1 = generateShop(prices, shop, shopPrices, item_compresseduranium, item_reactorcore, item_compresseduranium);
				String ultanswer2 = generateShop(prices, shop, shopPrices, item_compresseduranium, item_reactorcore, item_compresseduranium);
				shopit.setText(ultanswer);
				shopit1.setText(ultanswer1);
				shopit2.setText(ultanswer2);
				addBuy();
				
			}
		});
		buttonB.setBounds(454, 70, 120, 60);
		frame.getContentPane().add(buttonB);
		
		
		
		
		
		buttonS = new JButton("Sell");
		Image sellIcon = new ImageIcon(this.getClass().getResource("/cart-remove-icon.png")).getImage();
		buttonS.setIcon(new ImageIcon(sellIcon));
		buttonS.setFont(new Font("Tahoma", Font.PLAIN, 13));
		buttonS.setBackground(Color.LIGHT_GRAY);
		buttonS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				clearSpace();
				infoMessage.setText("Please type the number of the item that you want to sell");
				lblMessage2.setText("Inventory:"  + inventory);
				extra.setText("Leftmost item is 1 and so on.");
				addSell();
			}
		});
		buttonS.setBounds(309, 70, 120, 60);
		frame.getContentPane().add(buttonS);
		
		
		
		
		lblMessage = new JLabel("");
		lblMessage.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMessage.setBounds(20, 160, 294, 52);
		frame.getContentPane().add(lblMessage);
		
		lblMessage2 = new JLabel("");
		lblMessage2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblMessage2.setBounds(20, 130, 825, 52);
		frame.getContentPane().add(lblMessage2);
		
		buttonV = new JButton("View");
		buttonV.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Image viewbut = new ImageIcon(this.getClass().getResource("/View-icon.png")).getImage();
		buttonV.setIcon(new ImageIcon(viewbut));
		buttonV.setBackground(Color.LIGHT_GRAY);
		buttonV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clearSpace();
				infoMessage.setText("Please type the number of the item that you want to learn more about.");
				lblMessage.setText("You currently have " + money + " dollars");
				lblMessage2.setText("Inventory:" + inventory);
				extra.setText("Leftmost item is 1 and so on.");
				addView();
			
			}
		});
		buttonV.setBounds(10, 70, 120, 60);
		frame.getContentPane().add(buttonV);
		
		viewInfo = new JLabel("");
		viewInfo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		viewInfo.setBounds(10, 230, 564, 50);
		frame.getContentPane().add(viewInfo);
		
		shopit = new JLabel("");
		shopit.setFont(new Font("Tahoma", Font.PLAIN, 15));
		shopit.setBounds(20, 190, 390, 50);
		frame.getContentPane().add(shopit);
		
		shopit1 = new JLabel("");
		shopit1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		shopit1.setBounds(20, 210, 390, 50);
		frame.getContentPane().add(shopit1);
		
		shopit2 = new JLabel("");
		shopit2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		shopit2.setBounds(20, 230, 390, 50);
		frame.getContentPane().add(shopit2);
		
		mainIcon = new JLabel("");
		mainIcon.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Image img = new ImageIcon(this.getClass().getResource("/shopping-cart-reg.png")).getImage();
		mainIcon.setIcon(new ImageIcon(img));
		mainIcon.setBounds(524, 11, 60, 50);
		frame.getContentPane().add(mainIcon);
		
		buyIcon = new JLabel("");
		Image img2 = new ImageIcon(this.getClass().getResource("/Buy-now-icon.png")).getImage();
		buyIcon.setIcon(new ImageIcon(img2));
		buyIcon.setBounds(240, 200, 102, 72);
		frame.getContentPane().add(buyIcon);
		
		

		
	}

	protected static void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
	


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

public static String generateShop(Hashtable<String, Integer> prices, ArrayList<String> shop, ArrayList<Integer> shopPrices, int item_compresseduranium, int item_reactorcore, int item_alientech) {
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





