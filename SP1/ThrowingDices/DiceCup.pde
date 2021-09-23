class DiceCup {
  // The amount of sides (values) a (regular) dice has
  int diceSides = 6;
  // A counter used for placing dices in the cup (array)
  int amountDices = 0;
  // A array of counters, used for when the dices is organised into different lines
  int[] counterDices = new int[diceSides];
  Die[] cup = new Die[dices];
  /* An array of arrays of dices, used for sorting the dices hence also
   why the amount of (inner) arrays can be set to 6, since there is only 6
   sides of a die. Both these inner arrays and the above cup, takes the global
   int dices as the length of the arrays. */
  Die[][] sortedDice = new Die[diceSides][dices];

  /* Function that takes a object of Die and adds it to the cup (array)
   uses the counter amountDices to see which spot in the array that the die
   should be added. */
  void addDie(Die die) {
    /* This if statement makes sure, a dice can't be added if the array would
     already be completely full. It's not really necesarry since we have the global
     value dices, that makes sure the added dices and the length of the arrays
     are the same, but it's always nice to have error handling */
    if (amountDices < cup.length) {
      cup[amountDices] = die;
      amountDices++;
    }
  }

  /* A function that calls the roll function from the class Die on all the
   dices in the cup. The sorting mechanism that sorts the dices into the 2D
   array sortedDice, has also been added here */
  void shake() {
    /* Reinstates the 2D array and the array of counters, so the previous dices
     are removed from the array and sketch and the new ones can be drawn. */
    sortedDice = new Die[diceSides][dices];
    counterDices = new int[diceSides];

    /* For-loop to roll all the dices in the cup. Here a (technically redundant)
     error handling mechanism has also been added, makes sure it only loops through
     the array equal to the amount of dices that has been added using MATH(!)
     (But currently the added dices and the length of the array, still equals each
     other of course, so...) */
    for (int i = 0; i < cup.length-(cup.length-amountDices); i++) {
      cup[i].roll();
    }
    sort();
  }

  void sort() {
    /* A sorting mechanism that loops through the cup (array) and add/sorts each
     die into one of the 6 arrays in sortedDice[][] based on their value, uses
     the array of counters (counterDices) just like amountDices is used in addDie */
    for (int i = 0; i < cup.length-(cup.length-amountDices); i++) {
      switch(cup[i].dieValue) {
      case 1: 
        sortedDice[0][counterDices[0]] = cup[i];
        counterDices[0]++;
        break;
      case 2: 
        sortedDice[1][counterDices[1]] = cup[i];
        counterDices[1]++;
        break;
      case 3: 
        sortedDice[2][counterDices[2]] = cup[i];
        counterDices[2]++;
        break;
      case 4: 
        sortedDice[3][counterDices[3]] = cup[i];
        counterDices[3]++;
        break;
      case 5: 
        sortedDice[4][counterDices[4]] = cup[i];
        counterDices[4]++;
        break;
      case 6: 
        sortedDice[5][counterDices[5]] = cup[i];
        counterDices[5]++;
        break;
      }
    }
  }

  /* A function that takes the x and y cords that the dice(s) should have aswell
   as the size of the dices and draws each value on their own line*/
  void drawMultipleDices(int x, int y, int dieSize) {
    // Used to draw the next value (array) on a different line/beneath the previous
    int placementY = y;
    // Loops through the 6 arrays (dice values) in sortedDice
    for (int i = 0; i < diceSides; i++) {
      /* If-statement to check if an array is empty, if it is, the program does
       nothing, if it isn't it draws a line with the dices of that specifik value */
      if (sortedDice[i][0] != null) {
        /* Here the error handling (MATH!) can actually be usefull, because
         the inner array in sortedDice will in most cases be bigger than the
         amount of dices added to it, hence this MATH! statement, makes sure
         it only loops through the spots in the array, where there is actually
         dices. */
        for (int f = 0; f < sortedDice[i].length-(sortedDice[i].length-counterDices[i]); f++) {
          /* Draws the dices using the draw/display function for the Die class.
           makes sure there is 0,5 die size space between each die, using the
           below equation (dieSize is timed with 1.5 because it goes from the center
           of a die to the center of the next die... hope that makes sense). */
          sortedDice[i][f].diceDisplay(int(x+f*dieSize*1.5), placementY, dieSize);
        }
        /* Changes the y cord, so the next value (array) will be drawn on the next
         line. Same argument as above, as for why dieSize*1.5 */
        placementY += dieSize*1.5;
      }
    }
  }
}