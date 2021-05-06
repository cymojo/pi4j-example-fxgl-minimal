package com.pi4j.minimal;

/*-
 * #%L
 * **********************************************************************
 * ORGANIZATION  :  FHNW
 * PROJECT       :  Pi4J :: FXGL  :: Minimal
 * FILENAME      :  FxglMinimal.java
 *
 * This file is part of the Pi4J project. More information about
 * this project can be found here:  https://pi4j.com/
 * **********************************************************************
 */

import com.almasb.fxgl.app.GameSettings;
import com.almasb.fxgl.entity.EntityFactory;
import com.pi4j.minimal.util.piMapping.PicadeGameApplication;

public class FxglMinimal extends PicadeGameApplication {


    /**
     * Main entry point where the application starts.
     *
     * @param args Start-up arguments
     */
    public static void main(String[] args) {
        // Launch the FXGL game application
        launch(args);
    }


    /**
     * General game settings. For now only the title is set, but a longer list of options is available.
     *
     * @param settings The settings of the game which can be further extended here.
     */
    @Override
    protected void initSettings(GameSettings settings) {
        settings.setWidth(600);
        settings.setHeight(400);
        settings.setTitle("FXGL Minimal");
    }


    /**
     * Initialization of the game by providing the {@link EntityFactory}.
     */
    @Override
    protected void initGame() {
        getConsole().println("Init game done");
    }
}