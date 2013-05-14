package edu.ucsb.cs56.projects.music.basic_synthesis_demo;

import java.util.ArrayList;

/**
    A Class that represents a Melody.
    
    
    @author Bronwyn Perry-Huston
    @version CS56 S13 for project 1 
*/

public class Melody extends ArrayList<Note>{


	/**
       no-arg constructor returns an empty melody
       
     */
	public Melody(){
		//call constructor for ArrayList<Note>, with capacity 1
		super(1);
	}

	/**
		void method to play the melody
		@param e the ADSREnvelopedContinuousSound that is used to play the note
		@param m the melody to be played
	*/
	public void play(ADSREnvelopedContinuousSound e, Melody m)
	{

		//create a new Audioformat
		//Create a new audioLine which goes to the system, the audio format specifys all the features of the line.

		
		//loop through every note in the melody

			// in each one, set the amplitude of the ADSREnvelopedContinuousSound by scaling my the vol of the note

			//open, start, load, and drain?

	}
	

	



}
