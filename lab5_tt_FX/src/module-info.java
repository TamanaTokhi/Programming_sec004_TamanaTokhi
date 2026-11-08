module lab5_tt_FX {
    requires javafx.controls;

    exports application;
    opens application to javafx.graphics;
}