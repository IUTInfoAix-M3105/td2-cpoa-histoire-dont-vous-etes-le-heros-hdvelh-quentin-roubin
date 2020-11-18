/**
 * File: NodeMultipleEvents.java
 * Creation: 7 nov. 2020, Jean-Philippe.Prost@univ-amu.fr
 * Template étudiants
 */
package pracHDVELH;

import java.util.Scanner;

import myUtils.ErrorNaiveHandler;

/**
 * @author prost
 *
 */
public class Event extends NodeMultiple {
	public static final String ERROR_MSG_UNEXPECTED_END = "Sorry, for some unexpected reason the story ends here...";
	public static final String PROMPT_ANSWER = "Answer: ";
	public static final String WARNING_MSG_INTEGER_EXPECTED = "Please input a integer within range!";
	private String playerAnswer;
	private Scanner reader;
	private int chosenPath;
	private GUIManager gui;
	private int id;

	/**
	 * @return the playerAnswer
	 */
	public String getPlayerAnswer() {
		/* TO BE COMPLETED */
		return playerAnswer;
	}

	/**
	 * @param playerAnswer the playerAnswer to set
	 */
	public void setPlayerAnswer(String playerAnswer) {
		/* TO BE COMPLETED */
		this.playerAnswer=playerAnswer;
	}

	/**
	 * @return the reader
	 */
	public Scanner getReader() {
		/* TO BE COMPLETED */
		return reader;
	}

	/**
	 * @param reader the reader to set
	 */
	public void setReader(Scanner reader) {
		/* TO BE COMPLETED */
		this.reader=reader;
	}

	/**
	 * @return the chosenPath
	 */
	public int getChosenPath() {
		/* TO BE COMPLETED */
		return chosenPath;
	}

	/**
	 * @param chosenPath the chosenPath to set
	 */
	public void setChosenPath(int chosenPath) {
		/* TO BE COMPLETED */
		this.chosenPath=chosenPath;
	}

	/* Methods */
	/**
	 * @see pracHDVELH.NodeMultiple#getData()
	 */
	public String getData() {
		/* TO BE COMPLETED */
		//il faudrait passer la méthode en static?
		//return pracHDVELH.NodeMultiple.getData();
	}

	/**
	 * @see pracHDVELH.NodeMultiple#setData(Object)
	 * @param data
	 */
	public void setData(String data) {
		/* TO BE COMPLETED */
		//il faudrait passer la méthode en static?
		//pracHDVELH.NodeMultiple.setData(data);
	}

	/**
	 * @see pracHDVELH.NodeMultiple#getDaughter(int)
	 */
	@Override
	public Event getDaughter(int i) {
		/* TO BE COMPLETED */
		//il faudrait passer la méthode en static?
		//return pracHDVELH.NodeMultiple.getDaughter(i);
	}

	/**
	 * @see pracHDVELH.NodeMultiple#setDaughter(NodeMultiple, int)
	 * @param daughter
	 * @param i
	 */
	public void setDaughter(Event daughter, int i) {
		/* TO BE COMPLETED */
		//il faudrait passer la méthode en static?
		//pracHDVELH.NodeMultiple.setDaughter(daughter, i);
	}

	/**
	 * @return the gui
	 */
	public GUIManager getGui() {
		/* TO BE COMPLETED */
		return gui;
	}

	/**
	 * @param gui the gui to set
	 */
	public void setGui(GUIManager gui) {
		/* TO BE COMPLETED */
		this.gui=gui;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		/* TO BE COMPLETED */
		return id;
	}

	/* Methods */
	/* TO BE COMPLETED */
	public Event(){
		playerAnswer=new String();
		//reader=new Scanner();
	}


	public void run(){
		//à faire
	}
}


// eof