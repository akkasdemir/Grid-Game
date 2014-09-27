package com.ekip.gridgame;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;

@SuppressLint("ClickableViewAccessibility") public class GameSurface extends SurfaceView {

	/** MainActivity'i bunda tutuyoruz */
	Context context;
	/** Canvas'ı felan tutan surfaceHolder */
	SurfaceHolder holder;
	/** Oyun objemiz */
	GridGame gridGame;

	// Constructorlar
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
	 * Amele amele tüm constructorlara aynı şeyi yazmayalım diye ortak
	 * çağırdığımız constructor, İsme takılmayın
	 */
	public void _init(Context context) {

		this.context = context;
		holder = getHolder();
		gridGame = new GridGame(context, holder);

		/**
		 * Eğer çizimleri direk başlatırsak null pointer verebiliyor. Listener
		 * ekliyoruz
		 * */
		holder.addCallback(new Callback() {
			@Override
			public void surfaceDestroyed(SurfaceHolder holder) {
			}

			@Override
			public void surfaceCreated(SurfaceHolder holder) {
				gridGame.onStart();
			}

			@Override
			public void surfaceChanged(SurfaceHolder holder, int format,
					int width, int height) {
			}
		});
	}

	@Override
	public boolean onTouchEvent(MotionEvent arg0) {
		switch (arg0.getAction()) {
		case MotionEvent.ACTION_DOWN:
			gridGame.onMouseDown(arg0.getX(), arg0.getY());
			break;
		case MotionEvent.ACTION_MOVE:
			gridGame.onMouseMove(arg0.getX(), arg0.getY());
			break;
		case MotionEvent.ACTION_UP:
			gridGame.onMouseUp(arg0.getX(), arg0.getY());
			break;
		}
		return true;
	}
}
