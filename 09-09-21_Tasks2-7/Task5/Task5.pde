void setup() {
  MethodOne(); 
  MethodTwo(); 
}

/*
  The following method has an error in it. Fix the error and run it. 
*/

void MethodOne()
{
  int i = 1000; // You are not allowed to change this line. 
  
  int max = 10;
  /* Created the output (String) variable out here instead so it could be
  called outside of the if-statement, and just changed inside the if-statement */
  String output = "";
  
  if (i > max)
  {
    // Changed from creating the variable to just changing it - works now
    output = "i is greater than "+max+".";   
  }
  
  println(output);
  println();
}
/* 
  Finish the following method so that we can change the number assigned 
  to the weekday and it prints the correct output.  
*/
void MethodTwo() 
{
  int weekDay = 5; // 0 = Monday, 6 = Sunday.
  // The day of the week as a string to be printed later
  String nameDay = "";
  
  boolean weekend = false;
  
  if (weekDay < 5)
  {
    weekend = false;
    /* Takes the weekday and checks which day it is, and changes our
    nameDay string, depending on which day it is */
    switch(weekDay){
      case 0: nameDay = "Monday";
      break;
      case 1: nameDay = "Tuesday";
      break;
      case 2: nameDay = "Wednesday";
      break;
      case 3: nameDay = "Thursday";
      break;
      case 4: nameDay = "Friday";
      break;
    }
  }
  else 
  {
    weekend = true;
    if(weekDay == 5){
      nameDay = "Saturday";
    }
    else{
      nameDay = "Sunday";
    }
  }
  
  // Print the name of the weekday here:
  println("Current weekday is: " + nameDay);
  
  println();
    
  // Print if it is weekend here:
  /* Calls the below string function weekEndOrNot with the boolean 'weekend'
  and the int 'weekDay' to get the proper string and more depending on whether
  it's weekend or not */
  println("Is it weekend right now?\n"+weekEndOrNot(weekend, weekDay));
  
}

/* This function given a boolean (whether it's weekend or not) and an int (which day it is)
returns a string. If it's not weekend it will return a string saying so, aswell as how many
days is left until weekend, if it is weekend, it will return a string saying just that. */
String weekEndOrNot(boolean endWeek, int day){
  if(endWeek == false){
    return "It is not currently weekend, but only "+(5-day)+" days until it is though!";
  }
  else{
    return "It certainly is weekend, party hardy!";
  }
}