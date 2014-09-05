package com.tutorialsdojo;

/*
 * This plain old java object is the 
 * spring java bean that MisterBean will call.  
 *  
*/

public class Hello {

   private String message;

   public void setMessage(String message){
      this.message  = message;
   }

   public String getMessage(){
      return message;
   }

}
