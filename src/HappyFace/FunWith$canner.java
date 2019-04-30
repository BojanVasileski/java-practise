package HappyFace;

import java.util.*;

class FunWith$canner {
  public static void main(String[] args) {
    //DO NOT CHANGE
    int propertyPrice = 0; 
		int numberOfBedrooms, garageSpots;
		float metroAccessibility, schoolScore, highwayAccessibility;
		boolean backyard, smoking, garage;
		String houseType;
		Scanner scan = new Scanner(System.in);
		System.out.println("*****************************************");
		System.out.println("* Welcome to the RealEstate calculator! *");
		System.out.println("*****************************************");
    //WRITE YOUR CODE HERE
    
    System.out.println("Enter your property type:");
    houseType = scan.nextLine();
    
    System.out.println("How many bedrooms do you have?");
    numberOfBedrooms = scan.nextInt();
    
    System.out.println("Do you have a backyard?");
    backyard = scan.nextBoolean();
    if(houseType.equals("Condo")){
      System.out.println("Backyard is not available for condo!");
    }else if (houseType.equals("Townhouse")){
      propertyPrice += 5000;
    }else if (houseType.equals("Single Family Home")){
      propertyPrice += 5000;
    }
    
    System.out.println("Do you have garage?");
    garage =scan.nextBoolean();
    
    System.out.println("How many spots?");
    garageSpots = scan.nextInt();
    if(garageSpots > 10){
      System.out.println("Pardon,  it's not a public parking!");
    }
    
    
    System.out.println("How close is metro station?");
    metroAccessibility = scan.nextFloat();
    
    System.out.println("How close is highway?");
    highwayAccessibility = scan.nextFloat();
    
    System.out.println("What's the rating of nearest school?");
    schoolScore = scan.nextFloat();
  
    System.out.println("Does any of your family members smoking?");
    smoking = scan.nextBoolean();
    
    if(houseType.equals("Condo")){
      propertyPrice = 50000 + (numberOfBedrooms*30000);
      if(garage==true && garageSpots <= 10){
        propertyPrice += 20000* garageSpots;
        
      }else {
        propertyPrice=propertyPrice;
    }
    
    if (metroAccessibility <= 1){
      propertyPrice = propertyPrice + 10000;
    }else if(metroAccessibility >1 && metroAccessibility<3){
       propertyPrice = propertyPrice + 5000;
    }else{
      propertyPrice=propertyPrice;
    }
    
    if (highwayAccessibility <= 1){
      propertyPrice = propertyPrice + 15000;
    }else if(highwayAccessibility >1 && highwayAccessibility<5){
       propertyPrice = propertyPrice + 8000;
    }else if(highwayAccessibility >=5 && highwayAccessibility<=20){
       propertyPrice = propertyPrice + 4000;
    }else{
      propertyPrice=propertyPrice;
    }
    
    if(schoolScore >= 8 && schoolScore <= 10){
      propertyPrice += 45000;
    }else if(schoolScore >= 4 && schoolScore < 8) {
      propertyPrice += 20000;
    }else{
      propertyPrice += 5000;
    }
    
    if (smoking = true){
      propertyPrice -= 5000;
    }else{
      propertyPrice = propertyPrice;
    }
    
    }
    
    
    else if(houseType.equals("Townhouse")){
      propertyPrice = 75000 + (numberOfBedrooms*30000);
      if (backyard = true){
        propertyPrice +=5000;
      }else{
        propertyPrice=propertyPrice;
      }
      if(garage==true && garageSpots <= 10){
        propertyPrice += 20000* garageSpots;
        
      }else {
        propertyPrice=propertyPrice;
    }
    
    if (metroAccessibility <= 1){
      propertyPrice = propertyPrice + 10000;
    }else if(metroAccessibility >1 && metroAccessibility<3){
       propertyPrice = propertyPrice + 5000;
    }else{
      propertyPrice=propertyPrice;
    }
    
    if (highwayAccessibility <= 1){
      propertyPrice = propertyPrice + 15000;
    }else if(highwayAccessibility >1 && highwayAccessibility<5){
       propertyPrice = propertyPrice + 8000;
    }else if(highwayAccessibility >=5 && highwayAccessibility<=20){
       propertyPrice = propertyPrice + 4000;
    }else{
      propertyPrice=propertyPrice;
    }
    
    if(schoolScore >= 8 && schoolScore <= 10){
      propertyPrice += 45000;
    }else if(schoolScore >= 4 && schoolScore < 8) {
      propertyPrice += 20000;
    }else{
      propertyPrice += 5000;
    }
    
    if (smoking = true){
      propertyPrice -= 5000;
    }else{
      propertyPrice = propertyPrice;
    }
    
    
    
    
    
    } else if(houseType.equals("Single Family Home")){
      propertyPrice = 95000 + (numberOfBedrooms*30000);
        if (backyard = true){
        propertyPrice +=5000;
      }else{
        propertyPrice=propertyPrice;
      }
      if(garage==true && garageSpots <= 10){
        propertyPrice += 20000* garageSpots;
        
      }else {
        propertyPrice=propertyPrice;
    }
    
    if (metroAccessibility <= 1){
      propertyPrice = propertyPrice + 10000;
    }else if(metroAccessibility >1 && metroAccessibility<3){
       propertyPrice = propertyPrice + 5000;
    }else{
      propertyPrice=propertyPrice;
    }
    
    if (highwayAccessibility <= 1){
      propertyPrice = propertyPrice + 15000;
    }else if(highwayAccessibility >1 && highwayAccessibility<5){
       propertyPrice = propertyPrice + 8000;
    }else if(highwayAccessibility >=5 && highwayAccessibility<=20){
       propertyPrice = propertyPrice + 4000;
    }else{
      propertyPrice=propertyPrice;
    }
    
    if(schoolScore >= 8 && schoolScore <= 10){
      propertyPrice += 45000;
    }else if(schoolScore >= 4 && schoolScore < 8) {
      propertyPrice += 20000;
    }else{
      propertyPrice +=5000;
    }
    
    if (smoking = false ){
      propertyPrice = propertyPrice;
    }else{
     propertyPrice-=5000;
    }
    
    
    
    
    }
    
  System.out.println("Market report has been generated.\nYour estimate market price is: "+propertyPrice+"$");
    
  }
}