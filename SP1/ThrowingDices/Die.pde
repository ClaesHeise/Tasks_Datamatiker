class Die {
  color diceColor;
  color eyeColor;
  int dieValue;

  /* When the Die class is instigated, it takes two color arguments, one for the
   color of the actual die and one for the color of the eyes. It is redundant though
   because of the below code code in roll(), but will keep it for safety measures,
   being that the assignment said it should be there. */
  Die(color diceColor_, color eyeColor_) {
    diceColor = diceColor_;
    eyeColor = eyeColor_;
  }

  /* A int function that rolls a die, using the random opperator, that gives a
   random number between 1 and 7 (7 not included) and returns the number, which also
   eqauls to the individual dies value. Also changes the colors of the die and its
   eyes with random color values. */
  int roll() {
    dieValue = int(random(1, 7));
    diceColor = color(random(255), random(255), random(255));
    eyeColor = color(random(255), random(255), random(255));
    return dieValue;
  }

  /* The function that takes a x- and y cord, aswell as a size of a die, and draws
   said die on the background (which technically happens in void Draw()). */
  void diceDisplay(int x, int y, int size) {
    /* Further below when the eyes (on a die) is being drawn, booleans are used
     to check whether a eye should be shown or completely transparent (invisible).
     This array of booleans technically sets all eyes on the die, to be invisible
     (false) when this method is called.*/
    boolean[] eyes = {false, false, false, false, false, false, false};
    /* This switch-case, takes the value of the die, and set the correct eyes to
     true (visible) depending on which value the dice is. */
    switch(dieValue) {
    case 1: 
      eyes[3] = true; 
      break;
    case 2: 
      eyes[2] = true;
      eyes[4] = true;
      break;
    case 3: 
      eyes[2] = true;
      eyes[3] = true;
      eyes[4] = true;
      break;
    case 4: 
      eyes[0] = true;
      eyes[2] = true;
      eyes[4] = true;
      eyes[6] = true;
      break;
    case 5:
      eyes[0] = true;
      eyes[2] = true;
      eyes[3] = true;
      eyes[4] = true;
      eyes[6] = true;
      break;
    case 6:
      eyes[0] = true;
      eyes[1] = true;
      eyes[2] = true;
      eyes[4] = true;
      eyes[5] = true;
      eyes[6] = true;
      break;
    }

    noStroke();
    // The actual dice
    fill(diceColor);
    rect(x, y, size, size);

    /*  All the eyes. Here the booleans are used, if the value is true, it sets
     the value of the transparency to 255 (fully visible), if it's false to 0
     (invivisible). That way you don't have to draw eyes upon eyes constantly. */
    // First eye on the top
    fill(eyeColor, (eyes[0] ? 255 : 0));
    ellipse(x-size/3, y-size/3, size/6, size/6);
    // Second eye on the top
    fill(eyeColor, (eyes[1] ? 255 : 0));
    ellipse(x, y-size/3, size/6, size/6);
    // Third eye on the top
    fill(eyeColor, (eyes[2] ? 255 : 0));
    ellipse(x+size/3, y-size/3, size/6, size/6);
    //Middle eye
    fill(eyeColor, (eyes[3] ? 255 : 0));
    ellipse(x, y, size/6, size/6);
    // First eye on the bottom
    fill(eyeColor, (eyes[4] ? 255 : 0));
    ellipse(x-size/3, y+size/3, size/6, size/6);
    // First eye on the bottom
    fill(eyeColor, (eyes[5] ? 255 : 0));
    ellipse(x, y+size/3, size/6, size/6);
    // First eye on the bottom
    fill(eyeColor, (eyes[6] ? 255 : 0));
    ellipse(x+size/3, y+size/3, size/6, size/6);
  }
}