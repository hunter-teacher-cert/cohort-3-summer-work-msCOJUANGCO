
//COLLABORATORS: Marieke Thomas; Nicole Cojuangco

//STRATEGY : Starter/Skeleton Code

/*
  Blink

  Starter code turns an LED on for one second, then off for one second, repeatedly.
  Construct a circuit with an LED and 220-ohm resistor hooked up to pin 13 of your Arduino.
  Upload the starter code and verify that it blinks the LED on and off.
  Then complete the challenges.
  
*/

// the setup function runs once when you press reset or power the board
void setup() {
  // initialize digital pin 13 as an output.
  pinMode(13, OUTPUT);
}

// the loop function runs over and over again forever
void loop() {
  digitalWrite(LED_BUILTIN, HIGH);   // turn the LED on (HIGH is the voltage level)
  delay(1000);                       // wait for a second
  digitalWrite(LED_BUILTIN, LOW);    // turn the LED off by making the voltage LOW
  delay(1000);                       // wait for a second

  //1) Write code to blink the light on and off for 2 seconds

  //2) Add a second LED onto your breadboard. Modify your code so that both LEDs blink on and off simultaneously

  //3) Make the second LED blink opposite the first LED (when the first goes on, the second one goes off).

  //4) Make the first LED blink twice fast, and then make the second LED blink twice slowly.
  
  //5) CHALLENGE: Choose one of the challenges below:
  //5a) CHALLENGE! Code a light show that matches a 10-sec snippet of music (song used: ______)
  
  //5b) CHALLENGE! Instead of having the arduino just blink on and off, program it to gradually fade up and down
  
  //5c) CHALLEGE! Code your own pattern!
}




