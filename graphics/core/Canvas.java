import javax.swing.*;

public class Canvas extends JPanel {
    final static long serialVersionUID = 1l;

    private Render render;
    /**
     * Sets this canvas' render object to the given argument.
     * A render is effectively a runnable which takes an extra argument (a Graphics instance) so that the programmer can define in that Render instance how to use this JPanel's graphics.
     */
    public void load(Render render) {
        this.render = renderer;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        render.draw(g);
    }
}