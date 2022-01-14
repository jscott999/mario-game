package jade;

public class Window {
    private int width, height;
    private String title;

    private static Window window = null;


    private Window() {
        this.width = 1920
        this.height = 1080
        this.title = "Mario"
    }

    public static Window get() {
        if (Window.window == null) {
            Window.window = new Window();
        }

        return Window.window
    }

    public void run{

        System.out.println("Hello LWJGL" + Runtime.Version.getVersion() + "!")

        init();
        loop();
    }

    public void init() {
        // Setup error callback
        GLFWErrorCallback.createPrint(System.er).set();

        // Initialize GLFW
            if (!glfwinit()) {
                throw new IllegalStateException("unable to initialize GLFW");
            }

            //configure GLFW
            glfwDefaultWindowHints();
            glfwWindowHint(GLFW VISBLE, GLFW_FALSE);
    }

    public void loop() {

    }


}


echo "# mario" >> README.md
        git init
        git add README.md
        git commit -m "first commit"
        git branch -M main
        git remote add origin git@github.com:jscott999/mario.git
        git push -u origin main
