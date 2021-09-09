// Task 6:

// 6.a
int a = 6;
int b = 4;

/* if a or b or the sum of a and b equals 10, it's a succes
if not, it's a failure */
if(a+b == 10 || a == 10 || b == 10){
  println("6.a: Succes!");
}
else{
  println("6.a: Failure!");
}

// 6.b

int x = 6;
int y = 9;
int z = 15;

/* Too long and kind of obvious to describe, but checks all the necessary
parameters with the use of && (and) and prints succes if it's true and fail if not*/
if(x+y+z == 30 && x != 10 && x != 20 && x != 30 && y != 10
  && y != 20 && y != 30 && z != 10 && z != 20 && z != 30){
  println("6.b: Succes!");
}
else{
  println("6.b: Failure!");
}

// // Testing, but holly molly does it print alot of stuff - not that, that's so surprising...
//for(int i = 1; i <= 30; i++){
//  for(int f = 1; f <= 30; f++){
//    for(int w = 1; w <= 30; w++){
//      if(i+f+w == 30 && i != 10 && i != 20 && i != 30 && f != 10
//        && f != 20 && f != 30 && w != 10 && w != 20 && w != 30){
//        print("Succes: x/i = "+i+" y/f = "+f+" z/w = "+w+" ");
//      }
//      else{
//        print("Fail: x/i = "+i+" y/f = "+f+" z/w = "+w+" ");
//      }
//    }
//  }
//}