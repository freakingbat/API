/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diets.api;

//import client.Example;

import diets.objects.Advice;
import diets.objects.DietBase;
import diets.objects.Gym;
import diets.objects.RecipeDessert;
import diets.objects.RecipeDrink;
import diets.objects.RecipeMain;
import diets.objects.RecipeMeat;
import diets.objects.RecipeSoup;
import diets.objects.Shop;
import diets.objects.Shop1;
import diets.objects.User;
import java.util.List;

//import java.util.List;

/**
 *Этот класс описывает методы работы с базами данных
 * @author User
 */
public interface DataService {
 
   List<DietBase> getDietBases();
   DietBase getDiet(String name);
   void newDiet(DietBase diet);
   void updateDietBase(DietBase diet, Long id);
   
   List<Shop> getShop();
   void newShop(Shop shop);
   
   List<Shop1> getShop1();
   void newShop1(Shop1 shop1);
   
   List<Gym> getGym();
   void newGym(Gym gym);
   
   List<RecipeMeat> getRecipeMeat();
   void newRecipeMeat(RecipeMeat meat);

   List<RecipeMain> getRecipeMain();
   void newRecipeMain(RecipeMain main);
   
   List<RecipeDrink> getRecipeDrink();
   void newRecipeDrink(RecipeDrink drink);
   
   List<RecipeSoup> getRecipeSoup();
   void newRecipeSoup(RecipeSoup soup);
   
   List<RecipeDessert> getRecipeDessert();
   void newRecipeDessert(RecipeDessert dessert);
   
   List<Advice> getAdvice();
   void newAdvice(Advice advice);
   
   
}
