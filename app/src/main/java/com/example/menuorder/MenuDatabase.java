package com.example.menuorder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MenuDatabase {

    public static Menu getMenuById(int menuID) {
        return menus.get(menuID);
    }

    public static ArrayList<Menu> getAllMenus() {
        return new ArrayList<Menu>((List) Arrays.asList(menus.values().toArray()));
    }

    public static ArrayList<Menu> getOrder() {
        return new ArrayList<Menu>((List) Arrays.asList(menus.values().toArray()));
    }




    // You can ignore everything below this for now.
    private static final HashMap<Integer, Menu> menus = new HashMap<>();

    static {
        menus.put(1, new Menu(
                1,
                "Big Mac",
                "It starts with two 100% Aussie beef patties.",
                "BIG MAC BUN: Wheat Flour (Vitamins (Thiamin, Folate, Niacin, Iron, Riboflavin), Enzymes), Water, Sugar, Canola Oil, Sesame Seeds, Potato Starch, Wheat Gluten, Glaze, Iodised Salt, Yeast, Sourdough Fermented Wheat Flour, Natural Flavours, Preservative (282), Emulsifiers (471, 472e), Improver (Wheat Flour, Malted Wheat Flour, Antioxidant (300), Enzymes).\n" +
                        "\n" +
                        "BEEF PATTY: Beef.\n" +
                        "\n" +
                        "LETTUCE: Iceberg Lettuce.\n" +
                        "\n" +
                        "BIG MAC SAUCE: Soybean Oil (Antioxidant (330)), Water, Relish, Pickles, Sugar, High Fructose Corn Syrup, Distilled Vinegar, Corn Syrup, Salt, Thickener (415), Preservative (202), Spice Extract, Emulsifier (433), Mustard, Water, Vinegar, Mustard Seed, Salt, Sugar, Colours (100, 150d), Spice], Salted Egg Yolks, Distilled Vinegar, Onion, Thickener (1442, 415, 405), Spices, Sugar, Salt, Hydrolyzed Proteins (Corn, Gluten, Wheat, Soy), Colours (160c, 150d, 100), Preservative (211), Emulsifier (433), Garlic, Antioxidant (385).\n" +
                        "\n" +
                        "CHEESE: Cheese (Milk, Salt, Culture, Enzyme (Rennet, Lipase)), Water, Milk Solids, Butter, Emulsifiers (340, 452, 331), Salt, Acidity Regulators (260, 330, 339), Colours (160b, 160c), Preservative (200), Soy Lecithin.\n" +
                        "\n" +
                        "PICKLES: Cucumber, Water, Vinegar, Salt, Preservatives (202, 211), Flavour.\n" +
                        "\n" +
                        "ONION: Water, Dehydrated White Onion.\n" +
                        "\n" +
                        "Contains gluten, egg, milk, sesame seeds and soy.\n" +
                        "\n" +
                        "BIG MAC BUNS are produced on equipment that also produces products containing soy.\n" +
                        "\n" +
                        "BEEF PATTY may be cooked on the same equipment as eggs or products containing gluten.\n" +
                        "\n" +
                        "BEEF PATTY seasoned after cooking: Salt, Pepper.",
                "6.30",
                R.drawable.menu1_image
        ));
        menus.put(2, new Menu(
                2,
                "McFeast",
                "The McFeast® burger is an Australian favourite. ",
                "BEEF PATTY: Beef. \n" +
                        "\n" +
                        "QUARTER BUN: Wheat Flour (Vitamins (Thiamin, Folate, Niacin, Iron, Riboflavin), Enzymes), Water, Sugar, Canola Oil, Sesame Seeds, Glaze, Iodised Salt, Natural Flavour, Wheat Gluten, Yeast, Preservative (282), Emulsifiers (472e, 471), Improver (Wheat Flour, Malted Wheat Flour, Antioxidant (300), Enzymes), Thickener (412), Antioxidant (300).\n" +
                        "\n" +
                        "LETTUCE: Iceberg Lettuce.\n" +
                        "\n" +
                        "TOMATO: Sliced Tomato.\n" +
                        "\n" +
                        "KETCHUP: Water, Tomato Paste, High Fructose Corn Syrup, Glucose Corn Syrup, Vinegar, Salt, Flavouring (Soybean Oil). \n" +
                        "\n" +
                        "CHEESE: Cheese (Milk, Salt, Culture, Enzyme (Rennet, Lipase)), Water, Milk Solids, Butter, Emulsifiers (340, 452, 331), Salt, Acidity Regulators (260, 330, 339), Colours (160b, 160c), Preservative (200), Soy Lecithin.\n" +
                        "\n" +
                        "MAYONNAISE: Water, Soybean Oil (Antioxidant (330)), Egg Yolks, Modified Corn Starch (1401, 1442), Corn Syrup Solids, Distilled Vinegar, Salt, Sugar, Mustard Flour, Thickener (415), Food Acid (270), Preservative (202).\n" +
                        "\n" +
                        "ONION: Slivered Onion.\n" +
                        "\n" +
                        "PICKLES: Cucumber, Water, Vinegar, Salt, Preservatives (202, 211), Flavour. \n" +
                        "\n" +
                        "MUSTARD: Water, Vinegar, Mustard Seed, Salt, Colour (100), Spice, Flavour.\n" +
                        "\n" +
                        "Contains gluten, egg, milk, sesame seeds and soy.\n" +
                        "\n" +
                        "QUARTER BUNS are produced on equipment that also produces products containing soy.\n" +
                        "\n" +
                        "BEEF PATTY may be cooked on the same equipment as eggs or products containing gluten.\n" +
                        "\n" +
                        "BEEF PATTY seasoned after cooking: Salt, Pepper.",
                "6.90",
                R.drawable.menu2_image
        ));
        menus.put(3, new Menu(
                3,
                "Quarter Pounder",
                "It's mighty simple, but it works. ",
                "QUARTER BUN: Wheat Flour (Vitamins (Thiamin, Folate, Niacin, Iron, Riboflavin), Enzymes), Water, Sugar, Canola Oil, Sesame Seeds, Glaze, Iodised Salt, Natural Flavour, Wheat Gluten, Yeast, Preservative (282), Emulsifiers (472e, 471), Improver (Wheat Flour, Malted Wheat Flour, Antioxidant (300), Enzymes), Thickener (412), Antioxidant (300).\n" +
                        "\n" +
                        "BEEF PATTY: Beef.\n" +
                        "\n" +
                        "CHEESE: Cheese (Milk, Salt, Culture, Enzyme (Rennet, Lipase)), Water, Milk Solids, Butter, Emulsifiers (340, 452, 331), Salt, Acidity Regulators (260, 330, 339), Colours (160b, 160c), Preservative (200), Soy Lecithin.\n" +
                        "\n" +
                        "KETCHUP: Water, Tomato Paste, High Fructose Corn Syrup, Glucose Corn Syrup, Vinegar, Salt, Flavouring (Soybean Oil).\n" +
                        "\n" +
                        "PICKLES: Cucumber, Water, Vinegar, Salt, Preservatives (202, 211), Flavour.\n" +
                        "\n" +
                        "ONION: Slivered Onion.\n" +
                        "\n" +
                        "MUSTARD: Water, Vinegar, Mustard Seed, Salt, Colour (100), Spice, Flavour.\n" +
                        "\n" +
                        "Contains gluten, milk, sesame seeds and soy.\n" +
                        "\n" +
                        "QUARTER BUNS are produced on equipment that also produces products containing soy.\n" +
                        "\n" +
                        "BEEF PATTY may be cooked on the same equipment as eggs or products containing gluten.\n" +
                        "\n" +
                        "BEEF PATTY seasoned after cooking: Salt, Pepper.",
                "7.80",
                R.drawable.menu3_image
        )); menus.put(4, new Menu(
                4,
                "Double Quarter Pounder",
                "Satisfy your ultimate hunger. ",
                "QUARTER BUN: Wheat Flour (Vitamins (Thiamin, Folate, Niacin, Iron, Riboflavin), Enzymes), Water, Sugar, Canola Oil, Sesame Seeds, Glaze, Iodised Salt, Natural Flavour, Wheat Gluten, Yeast, Preservative (282), Emulsifiers (472e, 471), Improver (Wheat Flour, Malted Wheat Flour, Antioxidant (300), Enzymes), Thickener (412), Antioxidant (300).\n" +
                        "\n" +
                        "BEEF PATTY: Beef.\n" +
                        "\n" +
                        "CHEESE: Cheese (Milk, Salt, Culture, Enzyme (Rennet, Lipase)), Water, Milk Solids, Butter, Emulsifiers (340, 452, 331), Salt, Acidity Regulators (260, 330, 339), Colours (160b, 160c), Preservative (200), Soy Lecithin.\n" +
                        "\n" +
                        "KETCHUP: Water, Tomato Paste, High Fructose Corn Syrup, Glucose Corn Syrup, Vinegar, Salt, Flavouring (Soybean Oil).\n" +
                        "\n" +
                        "PICKLES: Cucumber, Water, Vinegar, Salt, Preservatives (202, 211), Flavour.\n" +
                        "\n" +
                        "ONION: Slivered Onion.\n" +
                        "\n" +
                        "MUSTARD: Water, Vinegar, Mustard Seed, Salt, Colour (100), Spice, Flavour.\n" +
                        "\n" +
                        "Contains gluten, milk, sesame seeds and soy.\n" +
                        "\n" +
                        "QUARTER BUNS are produced on equipment that also produces products containing soy.\n" +
                        "\n" +
                        "BEEF PATTY may be cooked on the same equipment as eggs or products containing gluten.\n" +
                        "\n" +
                        "BEEF PATTY seasoned after cooking: Salt, Pepper.",
                "7.20",
                R.drawable.menu4_image
        )); menus.put(5, new Menu(
                5,
                "McChicken",
                "It's the simple things that matter.",
                "McCHICKEN PATTY: Chicken, Water, Flour (Wheat, Maize), Vegetable Oil (Canola), Thickeners (1401, 1400), Mineral Salts (508, 500, 450, 451), Starch (Maize, Wheat), Salt, Spice and Spice Extracts (including Pepper), Maltodextrin, Vegetable Powders (Garlic, Onion, Celery), Dextrose, Raising Agent (341), Emulsifiers (481,433), Herb, Yeast Extract, Natural Colours (100, 160c), Natural Flavouring, Food Acid (330).\n" +
                        "\n" +
                        "QUARTER BUN: Wheat Flour (Vitamins (Thiamin, Folate, Niacin, Iron, Riboflavin), Enzymes), Water, Sugar, Canola Oil, Sesame Seeds, Glaze, Iodised Salt, Natural Flavour, Wheat Gluten, Yeast, Preservative (282), Emulsifiers (472e, 471), Improver (Wheat Flour, Malted Wheat Flour, Antioxidant (300), Enzymes), Thickener (412), Antioxidant (300).\n" +
                        "\n" +
                        "MAYONNAISE: Water, Soybean Oil (Antioxidant (330)), Egg Yolks, Modified Corn Starch (1401, 1442), Corn Syrup Solids, Distilled Vinegar, Salt, Sugar, Mustard Flour, Thickener (415), Food Acid (270), Preservative (202).\n" +
                        "\n" +
                        "LETTUCE: Iceberg Lettuce.\n" +
                        "\n" +
                        "Contains gluten, egg, sesame seed and soy.\n" +
                        "\n" +
                        "QUARTER BUNS are produced on equipment that also produces products containing soy.\n" +
                        "\n" +
                        "McCHICKEN PATTY is cooked in a McDonald’s Vegetable Oil blend.",
                "6.90",
                R.drawable.menu5_image
        )); menus.put(6, new Menu(
                6,
                "Filet-o-Fish",
                "Dive in and enjoy our Filet-o-Fish.",
                "REGULAR BUN: Wheat Flour (Vitamins (Thiamin, Folate, Niacin, Iron, Riboflavin), Enzymes), Water, Sugar, Canola Oil, Glaze, Wheat Gluten, Iodised Salt, Yeast, Preservative (282), Emulsifiers (471, 472e), Improver (Wheat Flour, Malted Wheat Flour, Antioxidant (300), Enzymes.\n" +
                        "\n" +
                        "FISH PORTION: Fish (Pollock), Water, Wheat Flour, Modified Food Starch (1422), Yellow Corn Flour, Bleached Wheat Flour, Salt, Whey, Cellulose Gum, Dextrose, Dried Yeast, Sugar, Soybean Oil, Paprika Extract (160c) and Turmeric Extract (100), Black Pepper (Natural Flavouring). \n" +
                        "\n" +
                        "TARTAR SAUCE: Pickles, Water, Soybean Oil (Anti-oxidant (330)), Distilled Vinegar, Onions and Onion Extractives, Modified Corn Starch (1401, 1442), Egg Yolks, Corn Syrup Solids, Sugar, Salt, Spice, Thickener (415), Capers, Preservative (202), Dextrose, Dehydrated Parsley, Spice Extractives. \n" +
                        "\n" +
                        "CHEESE: Cheese (Milk, Salt, Culture, Enzyme (Rennet, Lipase)), Water, Milk Solids, Butter, Emulsifiers (340, 452, 331), Salt, Acidity Regulators (260, 330, 339), Colours (160b, 160c), Preservative (200), Soy Lecithin. \n" +
                        "\n" +
                        "Contains gluten, egg, fish, milk, sesame seeds and soy.\n" +
                        "\n" +
                        "REGULAR BUNS are produced on equipment that also produces products containing sesame seeds and soy.\n" +
                        "\n" +
                        "FISH PORTION is cooked in a McDonald’s Vegetable Oil blend.",
                "6.30",
                R.drawable.menu6_image
        )); menus.put(7, new Menu(
                7,
                "Cheeseburger",
                "A legendary combo of 100% Aussie beef, onions, pickle.",
                "REGULAR BUN: Wheat Flour (Vitamins (Thiamin, Folate, Niacin, Iron, Riboflavin), Enzymes), Water, Sugar, Canola Oil, Glaze, Wheat Gluten, Iodised Salt, Yeast, Preservative (282), Emulsifiers (471, 472e), Improver (Wheat Flour, Malted Wheat Flour, Antioxidant (300), Enzymes.\n" +
                        "\n" +
                        "BEEF PATTY: Beef.\n" +
                        "\n" +
                        "CHEESE: Cheese (Milk, Salt, Culture, Enzyme (Rennet, Lipase)), Water, Milk Solids, Butter, Emulsifiers (340, 452, 331), Salt, Acidity Regulators (260, 330, 339), Colours (160b, 160c), Preservative (200), Soy Lecithin. \n" +
                        "\n" +
                        "KETCHUP: Water, Tomato Paste, High Fructose Corn Syrup, Glucose Corn Syrup, Vinegar, Salt, Flavouring (Soybean Oil).\n" +
                        "\n" +
                        "PICKLES: Cucumber, Water, Vinegar, Salt, Preservatives (202, 211), Flavour.\n" +
                        "\n" +
                        "ONION: Water, Dehydrated White Onion.\n" +
                        "\n" +
                        "MUSTARD: Water, Vinegar, Mustard Seed, Salt, Colour (100), Spice, Flavour.\n" +
                        "\n" +
                        "Contains gluten, milk, sesame seeds and soy.\n" +
                        "\n" +
                        "REGULAR BUNS are produced on equipment that also produces products containing sesame seeds and soy.\n" +
                        "\n" +
                        "BEEF PATTY may be cooked on the same equipment as eggs or products containing gluten.\n" +
                        "\n" +
                        "BEEF PATTY seasoned after cooking: Salt, Pepper.",
                "6.90",
                R.drawable.menu7_image
        )); menus.put(8, new Menu(
                8,
                "Double Cheeseburger",
                "You really will be seeing double.",
                "REGULAR BUN: Wheat Flour (Vitamins (Thiamin, Folate, Niacin, Iron, Riboflavin), Enzymes), Water, Sugar, Canola Oil, Glaze, Wheat Gluten, Iodised Salt, Yeast, Preservative (282), Emulsifiers (471, 472e), Improver (Wheat Flour, Malted Wheat Flour, Antioxidant (300), Enzymes.\n" +
                        "\n" +
                        "BEEF PATTY: Beef.\n" +
                        "\n" +
                        "CHEESE: Cheese (Milk, Salt, Culture, Enzyme (Rennet, Lipase)), Water, Milk Solids, Butter, Emulsifiers (340, 452, 331), Salt, Acidity Regulators (260, 330, 339), Colours (160b, 160c), Preservative (200), Soy Lecithin.\n" +
                        "\n" +
                        "KETCHUP: Water, Tomato Paste, High Fructose Corn Syrup, Glucose Corn Syrup, Vinegar, Salt, Flavouring (Soybean Oil). \n" +
                        "\n" +
                        "PICKLES: Cucumber, Water, Vinegar, Salt, Preservatives (202, 211), Flavour.\n" +
                        "\n" +
                        "ONION: Water, Dehydrated White Onion.\n" +
                        "\n" +
                        "MUSTARD: Water, Vinegar, Mustard Seed, Salt, Colour (100), Spice, Flavour.\n" +
                        "\n" +
                        "Contains gluten, milk, sesame seeds and soy.\n" +
                        "\n" +
                        "REGULAR BUNS are produced on equipment that also produces products containing sesame seeds and soy.\n" +
                        "\n" +
                        "BEEF PATTY may be cooked on the same equipment as eggs or products containing gluten.\n" +
                        "\n" +
                        "BEEF PATTY seasoned after cooking: Salt, Pepper",
                "6.90",
                R.drawable.menu8_image
        )); menus.put(9, new Menu(
                9,
                "Triple Cheeseburger",
                "Triple the taste. With our 100% Aussie beef.",
                "REGULAR BUN: Wheat Flour (Vitamins (Thiamin, Folate, Niacin, Iron, Riboflavin), Enzymes), Water, Sugar, Canola Oil, Glaze, Wheat Gluten, Iodised Salt, Yeast, Preservative (282), Emulsifiers (471, 472e), Improver (Wheat Flour, Malted Wheat Flour, Antioxidant (300), Enzymes.\n" +
                        "\n" +
                        "BEEF PATTY: Beef.\n" +
                        "\n" +
                        "CHEESE: Cheese (Milk, Salt, Culture, Enzyme (Rennet, Lipase)), Water, Milk Solids, Butter, Emulsifiers (340, 452, 331), Salt, Acidity Regulators (260, 330, 339), Colours (160b, 160c), Preservative (200), Soy Lecithin.\n" +
                        "\n" +
                        "KETCHUP: Water, Tomato Paste, High Fructose Corn Syrup, Glucose Corn Syrup, Vinegar, Salt, Flavouring (Soybean Oil).\n" +
                        "\n" +
                        "PICKLES: Cucumber, Water, Vinegar, Salt, Preservatives (202, 211), Flavour.\n" +
                        "\n" +
                        "ONION: Water, Dehydrated White Onion.\n" +
                        "\n" +
                        "MUSTARD: Water, Vinegar, Mustard Seed, Salt, Colour (100), Spice, Flavour.\n" +
                        "\n" +
                        "Contains gluten, milk, sesame seeds and soy.\n" +
                        "\n" +
                        "REGULAR BUNS are produced on equipment that also produces products containing sesame seeds and soy.\n" +
                        "\n" +
                        "BEEF PATTY may be cooked on the same equipment as eggs or products containing gluten.\n" +
                        "\n" +
                        "BEEF PATTY seasoned after cooking: Salt, Pepper.",
                "6.90",
                R.drawable.menu9_image
        )); menus.put(10, new Menu(
                10,
                "Double Beef 'n' Bacon Burger",
                "For all the meat lovers out there.",
                "REGULAR BUN: Wheat Flour (Vitamins (Thiamin, Folate, Niacin, Iron, Riboflavin), Enzymes), Water, Sugar, Canola Oil, Glaze, Wheat Gluten, Iodised Salt, Yeast, Preservative (282), Emulsifiers (471, 472e), Improver (Wheat Flour, Malted Wheat Flour, Antioxidant (300), Enzymes.\n" +
                        "\n" +
                        "BEEF PATTY: Beef.\n" +
                        "\n" +
                        "CHEESE: Cheese (Milk, Salt, Culture, Enzyme (Rennet, Lipase)), Water, Milk Solids, Butter, Emulsifiers (340, 452, 331), Salt, Acidity Regulators (260, 330, 339), Colours (160b, 160c), Preservative (200), Soy Lecithin.\n" +
                        "\n" +
                        "BACON: Pork, Water, Salt, Sugar, Emulsifiers (451, 450), Dextrose (Maize, Tapioca), Antioxidant (316), Acidity Regulator (330), Sodium Nitrite (250), Rosemary Extract. Smoked.\n" +
                        "\n" +
                        "KETCHUP: Water, Tomato Paste, High Fructose Corn Syrup, Glucose Corn Syrup, Vinegar, Salt, Flavouring (Soybean Oil).\n" +
                        "\n" +
                        "ONION: Water, Dehydrated White Onion.\n" +
                        "\n" +
                        "MUSTARD: Water, Vinegar, Mustard Seed, Salt, Colour (100), Spice, Flavour.\n" +
                        "\n" +
                        "Contains gluten, milk, sesame seeds and soy.\n" +
                        "\n" +
                        "REGULAR BUNS are produced on equipment that also produces products containing sesame seeds and soy.\n" +
                        "\n" +
                        "BEEF PATTY may be cooked on the same equipment as eggs or products containing gluten.\n" +
                        "\n" +
                        "BEEF PATTY seasoned after cooking: Salt, Pepper.",
                "7.20",
                R.drawable.menu10_image
        )); menus.put(11, new Menu(
                11,
                "Hamburger",
                "It's simple. 100% Aussie beef, topped with onion.",
                "REGULAR BUN: Wheat Flour (Vitamins (Thiamin, Folate, Niacin, Iron, Riboflavin), Enzymes), Water, Sugar, Canola Oil, Glaze, Wheat Gluten, Iodised Salt, Yeast, Preservative (282), Emulsifiers (471, 472e), Improver (Wheat Flour, Malted Wheat Flour, Antioxidant (300), Enzymes. \n" +
                        "\n" +
                        "BEEF PATTY: Beef. \n" +
                        "\n" +
                        "KETCHUP: Water, Tomato Paste, High Fructose Corn Syrup, Glucose Corn Syrup, Vinegar, Salt, Flavouring (Soybean Oil). \n" +
                        "\n" +
                        "PICKLES: Cucumber, Water, Vinegar, Salt, Preservatives (202, 211), Flavour.  \n" +
                        "\n" +
                        "ONION: Water, Dehydrated White Onion.\n" +
                        "\n" +
                        "MUSTARD: Water, Vinegar, Mustard Seed, Salt, Colour (100), Spice, Flavour.\n" +
                        "\n" +
                        "Contains gluten, soy and sesame seeds.\n" +
                        "\n" +
                        "REGULAR BUNS are produced on equipment that also produces products containing sesame seeds and soy.\n" +
                        "\n" +
                        "BEEF PATTY may be cooked on the same equipment as eggs or products containing gluten.\n" +
                        "\n" +
                        "BEEF PATTY seasoned after cooking: Salt, Pepper.",
                "6.90",
                R.drawable.menu11_image
        )); menus.put(12, new Menu(
                12,
                "Chicken 'n' Cheese",
                "A delicious combination of crispy coated chicken.",
                "McCHICKEN PATTY: Chicken, Water, Flour (Wheat, Maize), Vegetable Oil (Canola), Thickeners (1401, 1400), Mineral Salts (508, 500, 450, 451), Starch (Maize, Wheat), Salt, Spice and Spice Extracts (including Pepper), Maltodextrin, Vegetable Powders (Garlic, Onion, Celery), Dextrose, Raising Agent (341), Emulsifiers (481,433), Herb, Yeast Extract, Natural Colours (100, 160c), Natural Flavouring, Food Acid (330).\n" +
                        "\n" +
                        "REGULAR BUN: Wheat Flour (Vitamins (Thiamin, Folate, Niacin, Iron, Riboflavin), Enzymes), Water, Sugar, Canola Oil, Glaze, Wheat Gluten, Iodised Salt, Yeast, Preservative (282), Emulsifiers (471, 472e), Improver (Wheat Flour, Malted Wheat Flour, Antioxidant (300), Enzymes.\n" +
                        "\n" +
                        "MAYONNAISE: Water, Soybean Oil (Antioxidant (330)), Egg Yolks, Modified Corn Starch (1401, 1442), Corn Syrup Solids, Distilled Vinegar, Salt, Sugar, Mustard Flour, Thickener (415), Food Acid (270), Preservative (202). \n" +
                        "\n" +
                        "CHEESE: Cheese (Milk, Salt, Culture, Enzyme (Rennet, Lipase)), Water, Milk Solids, Butter, Emulsifiers (340, 452, 331), Salt, Acidity Regulators (260, 330, 339), Colours (160b, 160c), Preservative (200), Soy Lecithin.\n" +
                        "\n" +
                        "Contains gluten, egg, milk, sesame seeds and soy.\n" +
                        "\n" +
                        "REGULAR BUNS are produced on equipment that also produces products containing sesame seeds and soy.\n" +
                        "\n" +
                        "McCHICKEN PATTY is cooked in a McDonald’s Vegetable Oil blend.",
                "6.90",
                R.drawable.menu12_image
        )); menus.put(13, new Menu(
                13,
                "Classic Angus",
                "100% Aussie Angus beef, classic cheese, tomato",
                "BEEF PATTY: Angus Beef \n" +
                        "\n" +
                        "BURGER BUN:  Wheat Flour (Vitamins (Thiamine, Folic Acid)), Water, Sugar, Glaze (Contains Wheat), Canola Oil, Iodised Salt, Yeast, Wheat Gluten, Natural Flavour, Improver (Soy Flour, Emulsifier (481), Mineral Salt (170), Antioxidant (300), Acidity Regulator (516), Wheat Malt Flour, Enzymes (1100)), Preservative (282), Emulsifier (472e).\n" +
                        "\n" +
                        "CHEESE: Cheese (Milk, Salt, Culture, Enzyme (Rennet, Lipase)), Water, Milk Solids, Butter, Emulsifiers (340, 452, 331), Salt, Acidity Regulators (260, 330, 339), Colours (160b, 160c), Preservative (200), Soy Lecithin.\n" +
                        "\n" +
                        "TOMATO: Tomato.\n" +
                        "\n" +
                        "MAYONNAISE: Water, Soybean Oil (Antioxidant (330)), Egg Yolks, Modified Corn Starch (1401,1442), Corn Syrup Solids, Distilled Vinegar, Salt, Sugar, Mustard Flour, Thickener (415), Food Acid (270), Preservative (202).\n" +
                        "\n" +
                        "WHOLE LEAF LETTUCE: Lettuce.\n" +
                        "\n" +
                        "RED ONION: Red Onion\n" +
                        "\n" +
                        "PICKLES: Cucumber, Water, Vinegar, Salt, Preservatives (202, 211), Flavour.\n" +
                        "\n" +
                        "MUSTARD: Water, Distilled Vinegar, Mustard Seed, Salt, Colour (100), Paprika, Flavouring.\n" +
                        "\n" +
                        "Contains gluten, egg, soy &  milk.\n" +
                        "\n" +
                        "ANGUS BEEF PATTY seasoned after cooking : Salt, Maltodextrin (Maize), Spices (Pepper), Dextrose (Tapioca, Maize), Dehydrated Vegetables, Flavours (Milk), Yeast Extract, Canola Oil, Worcestershire Sauce Powder, Sugar, Fruit Extract.\n" +
                        "\n" +
                        "GOURMET SOFT BUN may contain sesame seeds.\n" +
                        "\n" +
                        "Beef may be cooked on the same grill as egg or products containing gluten.",
                "6.90",
                R.drawable.menu13_image
        )); menus.put(14, new Menu(
                14,
                "BBQ Bacon Angus",
                "Our new gourmet BBQ sauce, crispy bacon.",
                "A hamburger (short: burger) is a sandwich consisting of one or more cooked patties of ground meat, usually beef, placed inside a sliced bread roll or bun. The patty may be pan fried, grilled, or flame broiled.",
                "12.00",
                R.drawable.menu14_image
        )); menus.put(15, new Menu(
                15,
                "Chicken Deluxe",
                "Grilled or Crispy 100% Aussie Chicken Breast, Cheese.",
                "CRISPY CHICKEN: Chicken, Flour (Wheat, Maize), Water, Vegetable Oil, Starch (Wheat, Maize, Tapioca), Thickeners (1420, 1422), Salt, Mineral Salts (450, 500), Gluten (Wheat), Soy Protein, Sugar, Yeast And Yeast Extract, Dehydrated Vegetables (Garlic, Onion), Hydrolysed Vegetable Protein (Wheat), Natural Flavour, Spice (Pepper), Wheat Fibre, Vegetable Gum (412), Dextrose, Citrus Extract.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "QUARTER BUN: Wheat Flour (Vitamins (Thiamin, Folate, Niacin, Iron, Riboflavin), Enzymes), Water, Sugar, Canola Oil, Sesame Seeds, Glaze, Iodised Salt, Natural Flavour, Wheat Gluten, Yeast, Preservative (282), Emulsifiers (472e, 471), Improver (Wheat Flour, Malted Wheat Flour, Antioxidant (300), Enzymes), Thickener (412), Antioxidant (300). \n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "GARLIC MAYONNAISE: Canola Oil [Antioxidant (307b, Soy), 319)], Water, Glucose Syrup (Wheat Derived), Egg Yolk, Whey Protein (Milk), Minced Garlic [Food Acids (260, 330)], Vinegar, Dijon Mustard [Acidity Regulator (260)], Acidity Regulator (575), Mustard [Food Acids (260, 330), Colours (150c, 160a)], Salt, Flavour Enhancer (635), Oat Fibre, Flavourings (Milk), Emulsifiers [(322, 435) (Soy)], Colour (171), Mineral Salt (508), Vegetable Gum (415), Preservatives (202, 211).  \n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "TOMATO: Tomato.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "AUSSIE JACK CHEESE: Pasteurised Milk, Salt, Starter Culture, Non-animal Rennet.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "DICED LETTUCE MIX: Iceberg Lettuce, Cos Lettuce.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "Contains gluten, egg, milk, sesame seeds and soy. \n" +
                        "\n" +
                        "GARLIC MAYONNAISE may contain TRACES of sulphites. \n" +
                        "\n" +
                        "CRIPSY CHICKEN FILLET is cooked in a McDonald's Vegetable Oil blend.\n" +
                        "\n" +
                        "CRISPY CHICKEN may be cooked in the same vat as products containing milk.",
                "7.00",
                R.drawable.menu15_image
        ));
    }
}
