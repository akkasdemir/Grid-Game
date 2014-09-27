package com.ekip.gridgame;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class GameSurface extends SurfaceView {

	Context context; // Activity'yi tutuyoruz bunda
	SurfaceHolder holder; // Canvas'ı felan tutan surfaceholder
	
	/// Constructorlar
	public GameSurface(Context context) {
		super(context);
		_init(context);
	}

	public GameSurface(Context context, AttributeSet attrs) {
		super(context, attrs);
		_init(context);
	}

	public GameSurface(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		_init(context);
	}
	
	/**
	 * Amele amele tüm constructorlara aynı şeyi yazmayalım diye ortak çağırdığımız constructor
	 * İsme takılmayın
	 */
	public void _init(Context context){
		this.context=context;
	}
	
}
