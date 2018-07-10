package view;

import model.Snake;

/**
 * <h1>The Class ViewFacade provides a facade of the View component.</h1>
 *
 * @author Lotfi D Exia A1
 * @version 1.0
 */
public class ViewFacade {
	
	public Frame Frame;
	public RenderPanel RenderPanel;

    /**
     * Instantiates a new view facade.
     */
    public ViewFacade(Snake Snake) {
        Frame = new Frame(Snake); //Frame
        RenderPanel= new RenderPanel(Snake); //RenderPanel
    }

}
