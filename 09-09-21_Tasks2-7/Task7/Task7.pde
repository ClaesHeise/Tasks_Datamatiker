// Task 7:

// 7.a + 7.b

/* Made it float instead, to make it so that if it was a uneven number
it could be properly halfed (have .5 at the end)*/
float input = 20;

// Used to check if the value were positive or not, used later on
boolean positive = true;

/* if-else statement, making sure that if the input value is negative
that it will become positive, so that the for-loop can actually run*/
if(input < 0){
  input *= -1;
  positive = false;
}
else{
  /* Making sure, if the program is first run with a negative and
  then a positive value, that the output (prints) wont be negative
  when the input is positive */
  positive = true;
}

// The magnificent for-loop doing all the necessary printing 
for(int i = 0; i <= input; i++){
  // If the input was negative, puts '-' infront of every number essentially
  if(positive == false){
    if(i == 6){
      print("six ");
    }
    /* If i is equal to half of the input (halfway there) prints the
    assigned "HALF!", the floor function makes sure, if it's an uneven number
    it will still get caught */
    else if(i == floor(input/2)){
      /* If it's an uneven number, makes sure it prints the full number as well
      as the .5 number. Example, if input is 17, half of that would be 8.5, so
      this makes sure it both prints 8 and thereafter 8.5 as half. */
      if(i != input/2){
        print(-i+" ");
        println();
        println("HALF! Value of input/2 is: "+input/2*-1);
      }
      // If it's an even number, just prints the whole number as an int
      else{
        println();
        println("HALF! Value of input/2 is: "+int(input/2*-1));
      }
    }
    // Prints the rest of the numbers
    else{
      print(-i+" ");
    }
    /* Makes sure to change the input to a negative again,
    when the for loop is done running*/
    if(i == input){
      input *= -1;
      //println();
      //print(int(input));
    }
  }
  // Does all of the above, just if the the input were positive
  else{
    if(i == 6){
      print("six ");
    }
    else if(i == floor(input/2)){
      if(i != input/2){
        print(i+" ");
        println();
        println("HALF! Value of input/2 is: "+input/2);
      }
      else{
        println();
        println("HALF! Value of input/2 is: "+input/2+ "");
      }
    }
    else{
      print(i+" ");
    }
  }
}