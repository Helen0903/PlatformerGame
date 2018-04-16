public class WindowTest {
    public static void main(String[] args) {
        GameWindow window = new GameWindow();
        Render render = new Render() {
            public void draw(Graphics g) {
                // Sets the draw color to black
                g.setColor(0, 0, 0);
                // Draws a rectangle the size of the window, effectively a background
                g.drawRect(0, 0, window.getSize().width, window.getSize().height);
            }
        };
        window.getCanvas().load(render);

        // Should display a window (600,  480) with a black background.
        window.render();
    }
}