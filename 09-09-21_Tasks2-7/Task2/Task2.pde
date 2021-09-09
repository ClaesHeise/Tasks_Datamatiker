// Taske 2:
//2.a
String name = "Claes";
println(name);

//2.b
String age = "23";
println(age);

////2.c
boolean mood = false;
String stringMood = "";
///2.d

// overwrites the string stringMood based on whether I am happy or not
if(mood == false){
  stringMood = "dont";
}
else{
  stringMood = "do";
}
println("Hi, my name is "+name+"\nI am "+age+" years old\nI "+ stringMood+" clap my hands");