import javax.swing.*;

public class GameWindow extends JFrame {
    final static long serialVersionUID = 1l;

    private Canvas canvas;

    public GameWindow(String name) {
        super(name);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 480);
        setResizable(false);
        setVisible(true);

        canvas = new Canvas();
        // Render render = new Render() {
        //     public void draw(Graphics g) {
        //         g.setColor(new Color(0, 0, 0));
        //         g.drawRect(0, 0, 800, 600);
        //     }
        // };
        // canvas.load(render);
        add(canvas);

        render();
    }

    public GameWindow() {
        this("Graphics Prototype");
    }

    /**
     * Returns this GameWindow instance's Canvas.
     */
    public Canvas getCanvas() {
        return this.canvas;
    }

    /**
     * Repaints and revalidates this GameWindow instance, effectively moving forwards a frame.
     * A programmer must loop this function in order for the GameWindow to update; it does not do this by itself.
     * This makes sure that the programmer has maximum control over how frequently and when the GameWindow is updated.
     */
    public void render() {
        this.validate();
        this.repaint();
    }
}