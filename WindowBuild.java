import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Hashtable;
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
		helper.clearSpace();
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
	                            int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to sell the " 
	                            + inventory.get(x-1) + " for " + prices.get(inventory.get(x-1)) + "?");
	                            if (option == 0) {
	                                    int n = prices.get(inventory.get(x-1));
	                                    inventory.remove(x-1);
	                                    constants.money = constants.money + n;
	                                    JOptionPane.showMessageDialog(null,"Transaction successful. You now have " + constants.money + " dollars.");
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
                            } else if (constants.money < shopPrices.get(x-1)) {
                                JOptionPane.showMessageDialog(null,"You don't have enough money.");
                                continue;
                            }
                            int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to purchase "
                            		+ "the " + shop.get(x-1) + " for " + shopPrices.get(x-1) + "?");
                            if (choice == 0) {
                                int n = shopPrices.get(x-1);
                                inventory.add(shop.get(x-1));
                                shop.set(x-1, "Sold Out");
                                shopPrices.set(x-1, 999999);
                                constants.money = constants.money - n;
                                lblMessage.setText("Money: $" + constants.money + "     Items for Sale: ");
                                JOptionPane.showMessageDialog(null, "Transaction successful. You now have " + constants.money + " dollars.");
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
				helper.clearSpace();
				if (constants.money < 200) {
					JOptionPane.showMessageDialog(null, "You are able to buy Tier 1 items");
				} else if (constants.money < 1500) {
					JOptionPane.showMessageDialog(null, "You are able to buy Tier 2 items");
				} else if (constants.money < 5000) {
					JOptionPane.showMessageDialog(null, "You are able to buy Tier 3 items");
				} else if (constants.money < 40000) {
					JOptionPane.showMessageDialog(null, "You are able to buy Tier 4 items");
				}
				infoMessage.setText("Here you can buy any of three items for cash.");
				extra.setText("Topmost item is 1 and so on.");
				lblMessage.setText("Money: $" + constants.money + "     Items for Sale: ");
				
				
                shop.clear();
                shopPrices.clear();
                constants.item_alientech = 0;
                constants.item_reactorcore = 0;
                constants.item_compresseduranium = 0;
				String ultanswer = helper.generateShop(prices, shop, shopPrices, 
						constants.item_compresseduranium, constants.item_reactorcore, constants.item_compresseduranium);
				String ultanswer1 = helper.generateShop(prices, shop, shopPrices,
						constants.item_compresseduranium, constants.item_reactorcore, constants.item_compresseduranium);
				String ultanswer2 = helper.generateShop(prices, shop, shopPrices, 
						constants.item_compresseduranium, constants.item_reactorcore, constants.item_compresseduranium);
				shopit.setText(ultanswer);
				shopit1.setText(ultanswer1);
				shopit2.setText(ultanswer2);
				helper.addBuy();
				
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
				helper.clearSpace();
				infoMessage.setText("Please type the number of the item that you want to sell");
				lblMessage2.setText("Inventory:"  + inventory);
				extra.setText("Leftmost item is 1 and so on.");
				helper.addSell();
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
				helper.clearSpace();
				infoMessage.setText("Please type the number of the item that you want to learn more about.");
				lblMessage.setText("You currently have " + constants.money + " dollars");
				lblMessage2.setText("Inventory:" + inventory);
				extra.setText("Leftmost item is 1 and so on.");
				helper.addView();
			
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
	

//Source for all images used: iconarchive.com.

}
