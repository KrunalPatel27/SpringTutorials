package org.krunal.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

public class Restaurant {
   IHotDrink hotDrink;
   private List restaurantWaitersList;
   private String welcomeNote;

   Restaurant(IHotDrink hotDrink){
       this.hotDrink = hotDrink;
   }

   @PostConstruct
   public void init(){
       System.out.println("Restaurant Bean init");
   }
   @PreDestroy
   public void destroy(){
       System.out.println("Restaurant Bean destroy");
   }

   public void greetCustomer(){
       System.out.println(welcomeNote);
   }

   public void prepareHotDrink(){
       hotDrink.prepareHotDrink();
   }

    public void setRestaurantWaitersList(List restaurantWaitersList) {
        this.restaurantWaitersList = restaurantWaitersList;
    }
    public void displayWaitersNames(){
        System.out.println("Waiters working at Krunals Restaurant:" + restaurantWaitersList);
    }

    public void setWelcomeNote(String welcomeNote) {
        this.welcomeNote = welcomeNote;
    }
}
