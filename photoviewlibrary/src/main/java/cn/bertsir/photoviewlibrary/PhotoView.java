package cn.bertsir.photoviewlibrary;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

/**
 * Created by Bert on 2017/1/16.
 */
public class PhotoView extends FrameLayout {

    private float in_height;
    private float in_width;
    private ImageView ivIn;
    private ImageView ivOut;
    private static final String TAG = "PhotoView";

    public PhotoView(Context context) {
        this(context, null);

    }

    public PhotoView(Context context, AttributeSet attrs) {
        this(context, attrs, -1);
    }

    public PhotoView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.PhotoView);
        in_height = a.getDimension(R.styleable.PhotoView_inHeight, 20);
        in_width = a.getDimension(R.styleable.PhotoView_inWidth, 20);
        Log.e(TAG, "PhotoView: "+in_height+"--"+in_width );
        a.recycle();
        initView(context);
    }

    private void initView(Context mContext){
        View view = View.inflate(mContext, R.layout.photoview, this);
        ivIn = (ImageView) view.findViewById(R.id.iv_pv_in);
        ivOut = (ImageView) view.findViewById(R.id.iv_pv_out);
        FrameLayout.LayoutParams layoutParams = (LayoutParams) ivIn.getLayoutParams();
        layoutParams.height = (int)in_height;
        layoutParams.width = (int)in_width;
        ivIn.setLayoutParams(layoutParams);
    }

    public ImageView getInView(){
        return ivIn;
    }

    public ImageView getOutView(){
        return ivOut;
    }

}
