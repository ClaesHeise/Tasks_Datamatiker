// Taske 3:

// 3.a
color red = color(255, 0, 0);
color yellow = color(255, 255, 0);
color green = color(0, 255, 0);
color grey = color(125);
color black = color(0);

/* Millis(); starts a timer that counts how many milliseconds has gone by since the
program started and only stops again when the program stops. */
int timer = millis();

// Will be explained a few lines below
int substractTimer = 0;
void setup() {
  fullScreen();
  background(255);
}

void draw() {
  /* A timer, that makes the lights go from red-yellow-green-yellow and repeat,
  based on how long time has gone by (what the timer equals to), which is tracked with
  the millis() function. The substractTimer is there, so when the lights (timer) reaches
  yellow for the second time, the timer will essentially reset (go down to 0) again, and
  hence repeat the light cross indefinitely. */
  timer = millis() - substractTimer;
  // The rectangle (box) behind the lights
  fill(grey);
  rectMode(CENTER);
  rect(height/3, height/3, height/6, height/2);
  // The lights, without their respective lights on.
  fill(black);
  ellipse(height/3, height/6, height/6, height/6);
  ellipse(height/3, height/3, height/6, height/6);
  ellipse(height/3, height/2, height/6, height/6);
  /* Each light (red, yellow, green) will light up for 0,75 secounds (750 milliseconds),
  inbetween the lights there is a delay of 0.5 seconds (500 milliseconds) to make it more
  realistic */
  if(timer < 1250 && timer > 500){
    fill(red);
    ellipse(height/3, height/6, height/6, height/6);
    /* These fill(black) at the ends, is used so that the below boxes (lights)
    wont also be colored respectively red and yellow */
    fill(black);
  }
  if(timer < 1750 && timer > 1250){
    fill(black);
    ellipse(height/3, height/6, height/6, height/6);
  }
  if(timer < 2500 && timer > 1750 || timer < 5050 && timer > 4250){
    fill(yellow);
    ellipse(height/3, height/3, height/6, height/6);
    fill(black);
    /* This is what reset the timer, so when it reaches the end (yellow for the second time)
    it will make substractTimer equals millis(); and by substracting the actual timer with
    this, the timer will be 0 and then count up again */
    if(timer > 5000){
      substractTimer = millis();
    }
  }
  if(timer < 3000 && timer > 2500 || timer < 4250 && timer > 3750){
    fill(black);
    ellipse(height/3, height/3, height/6, height/6);
  }
  if(timer < 3750 && timer > 3000){
    fill(green);
    ellipse(height/3, height/2, height/6, height/6);
  }
}