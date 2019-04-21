package ru.magev.moexagent.DataManipulation;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.widget.ImageView;

import ru.magev.moexagent.R;

public class ItemContainer {

    private  Context context;

    public ItemContainer(Context context)
    {
        this.context=context;
    }
    public ImageView getImage() {
        return image;
    }

    public void setImage(ImageView image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRate() {
        return Float.toString(rate);
    }

    public void setRate(String rate) {
        this.rate = Float.parseFloat(rate);
    }

    public Bitmap isDirection() {
        Bitmap bitmap;
        if(direction)
        {
            bitmap= BitmapFactory.decodeResource(context.getResources(),R.drawable.chart_up);
        }
        else
        {
            bitmap=BitmapFactory.decodeResource(context.getResources(),R.drawable.chart_down);
        }
        return bitmap;

    }

    public void setDirection(boolean direction) {
        this.direction = direction;
    }

    private ImageView image;
    private String name;
    private float rate;
    private boolean direction;

}
