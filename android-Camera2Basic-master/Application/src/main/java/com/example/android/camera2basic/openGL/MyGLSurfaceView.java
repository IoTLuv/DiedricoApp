package com.example.android.camera2basic.openGL;

import android.content.Context;
import android.opengl.GLSurfaceView;

import java.util.List;

/**
 * Created by amil101 on 10/01/16.
 */
class MyGLSurfaceView extends GLSurfaceView {

    private final MyGLRenderer mRenderer;


    public MyGLSurfaceView(Context context, List<Double> coords){
        super(context);

        // Create an OpenGL ES 2.0 context
        setEGLContextClientVersion(2);

        mRenderer = new MyGLRenderer();
        mRenderer.setPointCoords(coords);

        // Set the Renderer for drawing on the GLSurfaceView
        setRenderer(mRenderer);
        // Render the view only when there is a change in the drawing data
        setRenderMode(GLSurfaceView.RENDERMODE_CONTINUOUSLY);

    }

    public void setRenderer(int progress){

        mRenderer.setZoom(progress);
        requestRender();
    }

    public void setPointCoords(List<Double> coords){
        mRenderer.setPointCoords(coords);

    }


}