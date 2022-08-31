package enums;


/*
* enum keeps String representation of figures and name for some shapes.
* */
public enum Shapes {

    SHAPE(".", "Shape"),
    BIANGLE("◠\n" +
                  "◡\n", "Biangle"),
    CIRCLE("◜ ◝ \n" +
                "◟ ◞\n", "Circle"),
    OVAL("◜̅̅◝ \n" +
              "◟̲ ̲ ◞\n", "Oval"),
    RECTANGLE("┌--------┐\n" +
               "└--------┘\n", "Rectangle"),
    SQUARE( "┌--┐\n" +
            "└--┘\n", "Square"),
    TRIANGLE("╱ ╲\n" +
                  "___\n", "Triangle");

    private String form;
    private String name;

    Shapes(String form, String name) {
        this.form = form;
        this.name = name;
    }

    public String getForm() {
        return form;
    }

    public String getName() {
        return name;
    }
}
