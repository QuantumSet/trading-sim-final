import java.util.Scanner;
import java.util.Hashtable;
import java.util.ArrayList;
import java.util.Random;



public class Class1 {
    public static void main(String args[]) {
        int money = 100;
        int item_alientech = 0;
        int item_reactorcore = 0;
        int item_compresseduranium = 0;
        ArrayList<String> inventory = new ArrayList<String>();
        inventory.add("Iron teapot");
        inventory.add("Amethyst crystal");
        ArrayList<String> shop = new ArrayList<String>();
        ArrayList<String> tradeShop = new ArrayList<String>();
        ArrayList<String> tradeShopitems = new ArrayList<String>();
        ArrayList<Integer> shopPrices = new ArrayList<Integer>();
        Hashtable<String, Integer> prices = new Hashtable<String, Integer>();
        prices.put("Iron teapot", 30);
        prices.put("Iron spoon", 9);
        prices.put("Extremely dangerous Dihydrogen monoxide", 5);
        prices.put("Amethyst crystal", 150);
        prices.put("Opal gems", 500);
        prices.put("Book of the Dead", 1500);
        prices.put("2mg of plutonium", 8000);
        prices.put("Gravity ray", 7000);
        prices.put("Alien tech", 50000);
        prices.put("Canister of compressed uranium", 28000);
        prices.put("Arc reactor core", 40000);
        prices.put("Portable Galactic Star", 100000);
        Hashtable<String, String> itemInfo = new Hashtable<String, String>();
        itemInfo.put("Iron teapot", "It was made by a expert craftsman in Saudi Arabia.");
        itemInfo.put("Iron spoon", "Found on the side of the road and was cleaned.");
        itemInfo.put("Extremely dangerous Dihydrogen monoxide", "Really?");
        itemInfo.put("Amethyst crystal", "Obtained from the Orabos mining system.");
        itemInfo.put("Opal gems", "Obtained from the Czack mountains");
        itemInfo.put("Book of the Dead", "Crafted and written by witches and wizards.");
        itemInfo.put("2mg of plutonium", "The result of two months of extracting and excavation.");
        itemInfo.put("Gravity ray", "It was a small part of the alien tech that was isolated and reverse engineered.");
        itemInfo.put("Alien tech", "No one know where or how it came to be. It had been circulating around the market for quite a while now.");
        itemInfo.put("Canister of compressed uranium", "The result of a year of extracting and excavation.");
        itemInfo.put("Arc reactor core", "Very small but portable engine for energy. Can power up to one house.");
        itemInfo.put("Portable Galactic Star", "Used for creating essentially free energy through fusion. Can power around 50 nuclear plants. Don't worry, it will run out after 22000 years.");
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the trading hub!");
        while (true) {
            System.out.println("Type B to Buy, T to Trade, S to Sell, V to View, and I for Info. At anytime to exit or go back, type E.");
            String choice = scan.nextLine();
            
            if (choice.equals("B")) {
                int y = 0;
                shop.clear();
                shopPrices.clear();
                Random rand = new Random();
                item_alientech = 0;
                item_reactorcore = 0;
                item_compresseduranium = 0;
                System.out.println("The Buy option allows you to buy any of three items for cash. Type the number of the item from the top(Ex. First item from the top should be type as '1'). Type E to go back.");
                System.out.println("Items for sale: ");
                for (int x = 0; x < 3; x++) {
                    int random = rand.nextInt(101);
                    if (random < 40) {
                        int random2 = rand.nextInt(3);
                        if (random2 == 0) {
                            int flcost = rand.nextInt((prices.get("Iron teapot") - 15) + 1) + 15;
                            System.out.println("Iron teapot: " + flcost);
                            shop.add("Iron teapot");
                            shopPrices.add(flcost);
                        } 
                        else if (random2 == 1) {
                            int flcost2 = rand.nextInt((prices.get("Iron spoon") - 4) + 1) + 4;
                            System.out.println("Iron spoon: " + flcost2);
                            shop.add("Iron spoon");
                            shopPrices.add(flcost2);
                        }
                        else if (random2 == 2) {
                            int flcost3 = rand.nextInt((prices.get("Extremely dangerous Dihydrogen monoxide") - 1) + 1) + 1;
                            System.out.println("Extremely dangerous Dihydrogen monoxide: " + flcost3);
                            shop.add("Extremely dangerous Dihydrogen monoxide");
                            shopPrices.add(flcost3);
                        }
                    }
                    else if (random > 39 && random < 71) {
                        int random3 = rand.nextInt(2);
                        if (random3 == 0) {
                            int flcost4 = rand.nextInt((prices.get("Amethyst crystal") - 100) + 1) + 100;
                            System.out.println("Amethyst crystal: " + flcost4);
                            shop.add("Amethyst crystal");
                            shopPrices.add(flcost4);
                        } 
                        else if (random3 == 1) {
                            int flcost5 = rand.nextInt((prices.get("Opal gems") - 300) + 1) + 300;
                            System.out.println("Opal gems: " + flcost5);
                            shop.add("Opal gems");
                            shopPrices.add(flcost5);
                        }
                    }
                    else if (random > 70 && random < 91) {
                        int random4 = rand.nextInt(3);
                        if (random4 == 0) {
                            int flcost6 = rand.nextInt((prices.get("Book of the Dead") - 1000) + 1) + 1000;
                            System.out.println("Book of the Dead: " + flcost6);
                            shop.add("Book of the Dead");
                            shopPrices.add(flcost6);
                        } 
                        else if (random4 == 1) {
                            int flcost7 = rand.nextInt((prices.get("2mg of plutonium") - 4000) + 1) + 4000;
                            System.out.println("2mg of plutonium: " + flcost7);
                            shop.add("2mg of plutonium");
                            shopPrices.add(flcost7);
                        }
                        else if (random4 == 2) {
                            System.out.println("Gravity ray: " + prices.get("Gravity ray"));
                            shop.add("Gravity ray");
                            shopPrices.add(7000);
                        }                    
                    }
                    else if (random > 90 && random < 101) {
                        int random5 = rand.nextInt(3);
                        if (random5 == 0 && item_compresseduranium == 0) {
                            int flcost8 = rand.nextInt((prices.get("Canister of compressed uranium") - 19000) + 1) + 19000;
                            System.out.println("Canister of compressed uranium: " + flcost8);
                            shop.add("Canister of compressed uranium");
                            shopPrices.add(flcost8);
                            item_compresseduranium = 1;
                        } 
                        else if (random5 == 1 && item_reactorcore == 0) {
                            int flcost9 = rand.nextInt((prices.get("Arc reactor core") - 23000) + 1) + 23000;
                            System.out.println("Arc reactor core: " + flcost9);
                            shop.add("Arc reactor core");
                            shopPrices.add(flcost9);
                            item_reactorcore = 1;
                        }
                        else if (random5 == 2 && item_alientech == 0) {
                            int flcost10 = rand.nextInt((prices.get("Alien tech") - 30000) + 1) + 30000;
                            System.out.println("Alien tech: " + flcost10);
                            shopPrices.add(flcost10);
                            shop.add("Alien tech");
                            item_alientech = 1;
                        } 
                    }                    
                }
                while (y == 0) {
                    String numberBuy = scan.nextLine();
                    for (int x = 0; x < shop.size()+1; x++) {
                        String wordy = Integer.toString(x);
                        if (numberBuy.equals(wordy)) {
                            if (money < shopPrices.get(x-1)) {
                                System.out.println("You don't have enough money.");
                                continue;
                            }
                            System.out.println("Are you sure you want to purchase the " + shop.get(x-1) + " for " + shopPrices.get(x-1) + "? Type Y for Yes or N for No.");
                            String yn = scan.nextLine();
                            if (yn.equals("Y")) {
                                int n = shopPrices.get(x-1);
                                inventory.add(shop.get(x-1));
                                shop.remove(x-1);
                                shopPrices.remove(x-1);
                                money = money - n;
                                System.out.println("Transaction successful. You now have " + money + " dollars.");
                            } 
                        }
                        if (numberBuy.equals("E")) {
                            y = 1;
                            break;
                        }
                    }
                }
            }
            else if (choice.equals("T")) {
            	int y = 0;
                Random rand2 = new Random();
                tradeShop.clear();
                tradeShopitems.clear();
                System.out.println("The Trade option allows you to obtain rarer items by turning in 2-3 lesser items. Type the number of the item you want to trade for (Ex. For the first item from the top, type 1). Type E at any time to go back.");
                System.out.println("Items for trade: ");
                for (int x = 0; x < 3; x++) {
                	int trade = rand2.nextInt(101);
                    
                    if (trade < 61) {
                        int ultchoice = rand2.nextInt(2);
                        if (ultchoice == 0) {
                            System.out.println("Amethyst crystal: ");
                            tradeShop.add("Amethyst crysral");
                            for (int x1 = 0; x1 < 3; x1++) {
                                int choice2 = rand2.nextInt(3);
                                if (choice2 == 0) {
                                    System.out.println("    Iron teapot");
                                    tradeShopitems.add("Iron teapot");
                                }
                                else if (choice2 == 1) {
                                    System.out.println("    Iron spoon");
                                    tradeShopitems.add("Iron spoon");
                                }
                                else if (choice2 == 2) {
                                    System.out.println("    Extremely dangerous Dihydrogen monoxide");
                                    tradeShopitems.add("Extremely dangerous Dihydrogen monoxide");
                                }
                            }                           
                        }
                        else if (ultchoice == 1) {
                            System.out.println("Opal gems: ");
                            tradeShop.add("Opal gems");
                            for (int x1 = 0; x1 < 3; x1++) {
                                int choice2 = rand2.nextInt(3);
                                if (choice2 == 0) {
                                    System.out.println("    Iron teapot");
                                    tradeShopitems.add("Iron teapot");
                                }
                                else if (choice2 == 1) {
                                    System.out.println("    Iron spoon");
                                    tradeShopitems.add("Iron spoon");
                                }
                                else if (choice2 == 2) {
                                    System.out.println("    Extremely dangerous Dihydrogen monoxide");
                                    tradeShopitems.add("Extremely dangerous Dihydrogen monoxide");
                                }
                            }
                        }
                    }
                    else if (trade > 60 && trade < 91) {
                        int ultchoice2 = rand2.nextInt(3);
                        if (ultchoice2 == 0) {
                            System.out.println("Book of the Dead: ");
                            tradeShop.add("Book of the Dead");
                            for (int x1 = 0; x1 < 3; x1++) {
                                int choice2 = rand2.nextInt(10);
                                if (choice2 == 0) {
                                    System.out.println("    Iron teapot");
                                    tradeShopitems.add("Iron teapot");
                                }
                                else if (choice2 == 1) {
                                    System.out.println("    Iron spoon");
                                    tradeShopitems.add("Iron spoon");
                                }
                                else if (choice2 == 2) {
                                    System.out.println("    Extremely dangerous Dihydrogen monoxide");
                                    tradeShopitems.add("Extremely dangerous Dihydrogen monoxide");
                                }
                                else if (choice2 > 2 && choice2 < 7) {
                                    System.out.println("    Amethyst crystal");
                                    tradeShopitems.add("Amethyst crystal");                                
                                }
                                else if (choice2 > 6 && choice2 < 10) {
                                    System.out.println("    Opal gems");
                                    tradeShopitems.add("Opal gems");
                                }
                            }                           
                        }
                        else if (ultchoice2 == 1) {
                            System.out.println("2mg of plutonium: ");
                            tradeShop.add("2mg of plutonium");
                            for (int x1 = 0; x1 < 3; x1++) {
                                int choice2 = rand2.nextInt(9);
                                if (choice2 == 0) {
                                    System.out.println("    Iron teapot");
                                    tradeShopitems.add("Iron teapot");
                                }
                                else if (choice2 == 1) {
                                    System.out.println("    Iron spoon");
                                    tradeShopitems.add("Iron spoon");
                                }
                                else if (choice2 == 2) {
                                    System.out.println("    Extremely dangerous Dihydrogen monoxide");
                                    tradeShopitems.add("Extremely dangerous Dihydrogen monoxide");
                                }
                                else if (choice2 > 2 && choice2 < 7) {
                                    System.out.println("    Amethyst crystal");
                                    tradeShopitems.add("Amethyst crystal");                                
                                }
                                else if (choice2 > 6 && choice2 < 10) {
                                    System.out.println("    Opal gems");
                                    tradeShopitems.add("Opal gems");
                                }
                            }
                        }
                        else if (ultchoice2 == 2) {
                            System.out.println("Gravity ray: ");
                            tradeShop.add("Gravity ray");
                            for (int x1 = 0; x1 < 3; x1++) {
                                int choice2 = rand2.nextInt(9);
                                if (choice2 == 0) {
                                    System.out.println("    Iron teapot");
                                    tradeShopitems.add("Iron teapot");
                                }
                                else if (choice2 == 1) {
                                    System.out.println("    Iron spoon");
                                    tradeShopitems.add("Iron spoon");
                                }
                                else if (choice2 == 2) {
                                    System.out.println("    Extremely dangerous Dihydrogen monoxide");
                                    tradeShopitems.add("Extremely dangerous Dihydrogen monoxide");
                                }
                                else if (choice2 > 2 && choice2 < 7) {
                                    System.out.println("    Amethyst crystal");
                                    tradeShopitems.add("Amethyst crystal");                                
                                }
                                else if (choice2 > 6 && choice2 < 10) {
                                    System.out.println("    Opal gems");
                                    tradeShopitems.add("Opal gems");
                                }
                            }                            
                        }
                    }
                    else if (trade > 90 && trade < 96) {
                        int ultchoice3 = rand2.nextInt(3);
                        if (ultchoice3 == 0) {
                            System.out.println("Alien tech: ");
                            tradeShop.add("Alien tech");
                            for (int x1 = 0; x1 < 3; x1++) {
                                int choice2 = rand2.nextInt(3);
                                if (choice2 == 0) {
                                    System.out.println("    Book of the Dead");
                                    tradeShopitems.add("Book of the Dead");
                                }
                                else if (choice2 == 1) {
                                    System.out.println("    2mg of plutonium");
                                    tradeShopitems.add("2mg of plutonium");
                                }
                                else if (choice2 == 2) {
                                    System.out.println("    Gravity ray");
                                    tradeShopitems.add("Gravity ray");
                                }
                            }                           
                        }
                        else if (ultchoice3 == 1) {
                            System.out.println("Arc reactor core: ");
                            tradeShop.add("Arc reactor core");
                            for (int x1 = 0; x1 < 3; x1++) {
                                int choice2 = rand2.nextInt(3);
                                if (choice2 == 0) {
                                    System.out.println("    Book of the Dead");
                                    tradeShopitems.add("Book of the Dead");
                                }
                                else if (choice2 == 1) {
                                    System.out.println("    2mg of plutonium");
                                    tradeShopitems.add("2mg of plutonium");
                                }
                                else if (choice2 == 2) {
                                    System.out.println("    Gravity ray");
                                    tradeShopitems.add("Gravity ray");
                                }
                            }
                        }
                        else if (ultchoice3 == 1) {
                            System.out.println("Canister of compressed uranium: ");
                            tradeShop.add("Canister of compressed uranium");
                            for (int x1 = 0; x1 < 3; x1++) {
                                int choice2 = rand2.nextInt(3);
                                if (choice2 == 0) {
                                    System.out.println("    Book of the Dead");
                                    tradeShopitems.add("Book of the Dead");
                                }
                                else if (choice2 == 1) {
                                    System.out.println("    2mg of plutonium");
                                    tradeShopitems.add("2mg of plutonium");
                                }
                                else if (choice2 == 2) {
                                    System.out.println("    Gravity ray");
                                    tradeShopitems.add("Gravity ray");
                                }
                            }
                        }                    
                    }
                    else if (trade > 95 && trade < 101) {
                        System.out.println("Portable Galactic Star: ");
                        tradeShop.add("Portable Galactic star");
                        System.out.println("    Alien tech");
                        tradeShopitems.add("Alien tech");
                        System.out.println("    Arc reactor core");
                        tradeShopitems.add("Arc reactor core");
                        System.out.println("    Canister of compressed uranium");
                        tradeShopitems.add("Canister of copmpressed uranium");
                    }
                    
                }
                while (y == 0) {
                	String player = scan.nextLine();
                	for (int x1 = 0; x1 < tradeShop.size()+1; x1++) {
                		String wordx2 = Integer.toString(x1);
                    	if (player.equals(wordx2)) {
                    		System.out.println("Are you sure you want to purchase the " + tradeShop.get(x1-1) + " by turning in " + tradeShopitems.get((3*x1)-3) + ", " + tradeShopitems.get((3*(x1))-2) + " and " + tradeShopitems.get((3*x1)-1) + "? (Type Y for yes)");
                    		String nextchoice = scan.nextLine();
                    		if (nextchoice.equals("Y") && inventory.contains(tradeShopitems.get((3*x1)-3)) && inventory.contains(tradeShopitems.get((3*x1)-2)) && inventory.contains(tradeShopitems.get((3*x1)-1))) {
                    			inventory.add(tradeShop.get(x1-1));
                    			inventory.remove(tradeShopitems.get((3*x1)-3));
                    			inventory.remove(tradeShopitems.get((3*x1)-3));
                    			inventory.remove(tradeShopitems.get((3*x1)-3));
                    			System.out.println("Transaction successful, you have bought the " + tradeShop.get(x1-1) + ".");
                    			tradeShop.remove(x1-1);
                    			tradeShopitems.remove(tradeShopitems.get((3*x1)-3));
                    			tradeShopitems.remove(tradeShopitems.get((3*x1)-3));
                    			tradeShopitems.remove(tradeShopitems.get((3*x1)-3));
                    		}
                    		else if (nextchoice.equals("Y")) {
                    			System.out.println("Sorry but I don't think you have all the items.");
                    		}
                    		else if (nextchoice.equals("N")) {
                    			continue;
                    		}
                    	}
                    }
                    if (player.equals("E")) {
                    	y = 1;
                    	break;
                	}
                }
            }
                
            else if (choice.equals("S")) {
                int y = 0;
                System.out.println("The Sell option allows you to sell any items you have for cash.");
                System.out.println("Current inventory: ");
                System.out.println(inventory);
                System.out.println("Please type the number of the item that you want to sell (Ex. first item from the left means you have to type '1'). Type E to go back.");
                while (y == 0) {
                    String number = scan.nextLine();
                    for (int x = 0; x < inventory.size()+1; x++) {
                        String wordx = Integer.toString(x);
                        if (number.equals(wordx)) {
                            System.out.println("Are you sure you want to sell the " + inventory.get(x-1) + " for " + prices.get(inventory.get(x-1)) + "? Type Y for Yes or N for No.");
                            String yn = scan.nextLine();
                            if (yn.equals("Y")) {
                                    int n = prices.get(inventory.get(x-1));
                                    inventory.remove(x-1);
                                    money = money + n;
                                    System.out.println("Transaction successful. You now have " + money + " dollars.");
                            }
                        }
                    }
                    if (number.equals("E")) {
                        y = 1;
                        break;
                    }
                }


                
            }
            else if (choice.equals("V")) {
                System.out.println("The View option displays your current stats. Type anything to go back.");
                System.out.println("You currently have " + money + " dollars");
                System.out.println("Inventory: ");
                System.out.println(inventory);
                String back = scan.nextLine();
                if (back.equals("")) {
                    continue;
                }
            }
            else if (choice.equals("I")) {
                int y = 0;
                System.out.println("The Info option displays more information about items in your inventory");
                System.out.println("Current inventory: ");
                System.out.println(inventory);
                System.out.println("Please type the number of the item that you want to learn more about (Ex. first item from the left means you have to type '1'). Type E to go back.");
                while (y == 0) {
                    String info = scan.nextLine();
                    for (int x = 0; x < inventory.size()+1; x++) {
                        String wordx = Integer.toString(x);
                        if (info.equals(wordx)) {
                            System.out.println(inventory.get(x-1) + ": " + itemInfo.get(inventory.get(x-1)));
                        }
                        
                    }
                    if (info.equals("E")) {
                        y = 1;
                        break;
                    }
                }
            }
            else if(choice.equals("E")) {
                    System.out.println("Thanks for visiting!");
                scan.close();
                break;
            }
        }    
        
    }
}

