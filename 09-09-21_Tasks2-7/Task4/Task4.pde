// Task 4:

// 4a.
println("Using for-loop-1");
for (int i = 0; i < 21; i++) {
  /* Looks pretier and more organised on a single line,
   but with a space between each line*/
  print(i+" ");
}

// 4b.
println();
println("Using for-loop-2");
for (float i = 0; i < 21; i++) {
  /* the floor function helps us validate whether the input is even
   or not. Example: floor(9/2) = 4 which is not the same as 9/2 = 4.5,
   hence also why i is a float and not a int, because with int, each value
   that is divided by 2, would always be a whole number. So if this if-statement
   is true - it is a even number - it prints that number else it wont do anything.*/
  if (i/2 == floor(i/2)) {
    /* Just looks pretier when printed out as int,
     instead of there being a .0 at the end of the number*/
    print(int(i)+" ");
  }
}

// 4c.
println();
println("Using while-loop");
float value = 0;
/* Exactly same as above, just with a while-loop, where the value has been assigned globally
 and has to be incrementet at the end of the loop */
while (value < 21) {
  if (value/2 == floor(value/2)) {
    // same reasoning
    print(int(value)+" ");
  }
  value++;
}