DiceCup cup;
// Used for how many dices is added to the cup, and how big the arrays should be
int dices = 10;
int size = 75;
int startX = int(size*1.5);
int startY = int(size*1.5);

void setup() {
  fullScreen();
  rectMode(CENTER);
  cup = new DiceCup();
  // Adds all the dices to the cup (class) through the function addDie
  for (int i = 0; i < dices; i++) {
    cup.addDie(new Die(255, 0));
  }
  // Shakes the cup when the program (sketch) starts
  cup.shake();
}

void draw() {
  // Continuesly draws the background and dices on top up it
  background(255);
  cup.drawMultipleDices(startX, startY, size);
}

void keyPressed() {
  /* Whenever a key/button is pressed/clicked it will roll all the dices
   and they will be drawn in void draw() */
  cup.shake();
}