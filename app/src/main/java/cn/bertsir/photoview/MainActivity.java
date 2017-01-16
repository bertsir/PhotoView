package cn.bertsir.photoview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.bumptech.glide.Glide;

import cn.bertsir.photoviewlibrary.PhotoView;

/**
 * Bret
 */


public class MainActivity extends Activity {

    private PhotoView pv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pv = (PhotoView) this.findViewById(R.id.pv);
        Glide.with(this)
                .load(R.drawable.white)
                .into(pv.getOutView());
        Glide.with(this)
                .load(R.drawable.haimian)
                .into(pv.getInView());

    }

    /**
     * 显示方型头像
     * @param v
     */
    public void showf(View v){
        Glide.with(this)
                .load(R.drawable.white)
                .into(pv.getOutView());
        Glide.with(this)
                .load(R.drawable.haimian)
                .into(pv.getInView());
    }


    /**
     * 显示圆角头像
     * @param v
     */
    public void showround(View v){
        Glide.with(this)
                .load(R.drawable.white)
                .transform(new GlideCircleTransform(getApplicationContext()))
                .into(pv.getOutView());
        Glide.with(this)
                .load(R.drawable.haimian)
                .transform(new GlideCircleTransform(getApplicationContext()))
                .into(pv.getInView());
    }


    /**
     * 显示圆头像
     * @param v
     */
    public void showcricle(View v){
        Glide.with(this)
                .load(R.drawable.white)
                .transform(new GlideRoundTransform(getApplicationContext(),8))
                .into(pv.getOutView());
        Glide.with(this)
                .load(R.drawable.haimian)
                .transform(new GlideRoundTransform(getApplicationContext(),8))
                .into(pv.getInView());
    }
}
