package com.example.libjava;

import java.util.Random;

public class MyJokeClass {


        private String[] jokes =

    {
        "Why can't a bicycle stand on its own? \n It's two tired",
        "What's a computer's favorite beat? \n An algo-rhythm!",
        "Did you hear about the hi-tech broom? \n It's sweeping the nation! .",
        "How do you get over a fear of elevators? \n Just take some steps to avoid them!",
        "What's a restaurant with no menu called? \n Karma. You get what you deserve",
        "How did the potato answer the phone? \n Aloo ;)"
    };

        public String tellJoke(){
         int i = new Random().nextInt(6);
         return jokes[i];
        }
}