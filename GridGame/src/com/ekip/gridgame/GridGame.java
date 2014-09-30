/** Deneme bir iki öhüm öhümmm.....*/
package com.ekip.gridgame;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.SurfaceHolder;

/**
 * 
 * @author Luna
 *
 */
public class GridGame {
	Context context;
	SurfaceHolder holder;
	Canvas canvas;

	/**
	 * GridGame constructor'u, context ve holder alıyor
	 */
	public GridGame(Context context, SurfaceHolder holder) {
		this.context = context;
		this.holder = holder;
	}
	
	/**
	 * Oyun'un başlama komutu, sadece bir kez çağırılacak
	 */
	public void onStart(){
		// deneme amaçlı çizim
		canvas=holder.lockCanvas();
		canvas.drawRGB(255, 160, 80);
		canvas.drawRect(20, 30, 40, 50, new Paint());
		holder.unlockCanvasAndPost(canvas);
	}

	/**
	 * Ekrana basıldığında çağırılacak fonksiyon
	 */
	public void onMouseDown(float x,float y){
		
	}

	/**
	 * Parmak sürüklendiğinde çağırılacak fonksiyon
	 */
	public void onMouseMove(float x,float y){
		
	}
	
	/**
	 * Parmak kaldırıldığında çağırılacak fonksiyon
	 */
	public void onMouseUp(float x,float y){
		
	}
}
