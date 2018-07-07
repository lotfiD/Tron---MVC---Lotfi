package view;

import javax.swing.JOptionPane;

/**
 * <h1>The Class ViewFacade provides a facade of the View component.</h1>
 *
 * @author Lotfi D Exia A1
 * @version 1.0
 */
public class ViewFacade implements IView {
	
	public Frame Frame;
	public RenderPanel RenderPanel;

    /**
     * Instantiates a new view facade.
     */
    public ViewFacade() {
        super();
        this.Frame = new Frame();//Frame
        this.RenderPanel= new RenderPanel();//RenderPanel
    }

    /*
     * (non-Javadoc)
     * @see view.IView#displayMessage(java.lang.String)
     */
    @Override
    public final void displayMessage(final String message) {
        JOptionPane.showMessageDialog(null, message);
    }

}
