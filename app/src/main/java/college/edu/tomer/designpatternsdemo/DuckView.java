package college.edu.tomer.designpatternsdemo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.media.MediaPlayer;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by master on 15/06/16.
 */
public class DuckView extends View {
    private MediaPlayer player;
    private Bitmap bitmap;

    public DuckView(Context context) {
        this(context, null);
    }

    public DuckView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public DuckView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }


    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawBitmap(bitmap, 100, 100, null);
    }

    private void init() {
        player = MediaPlayer.create(getContext(), R.raw.mallard_duck);
        bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.mallard);
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        player.start();
        return true;
    }
}
