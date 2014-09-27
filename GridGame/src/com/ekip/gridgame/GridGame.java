package com.ekip.gridgame;

import android.content.Context;
import android.view.SurfaceHolder;

/** Ana oyun class'ı */
public class GridGame {
	Context context;
	SurfaceHolder holder;

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
