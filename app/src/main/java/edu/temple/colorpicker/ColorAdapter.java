package edu.temple.colorpicker;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.content.Context;
import android.widget.TextView;

public class ColorAdapter extends BaseAdapter {

    Context context;
    String[] colorList;
    int selectedPos;


    public ColorAdapter(Context c, String[] l) {
        this.context = c;
        this.colorList = l;
        this.selectedPos = 0;
    }

    @Override
    public int getCount() {
        return colorList.length;
    }

    @Override
    public Object getItem(int i) {
        return colorList[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        TextView textView = new TextView(context);
        if(textView != null) {
            textView.setText(colorList[position]);
            textView.setBackgroundColor(Color.parseColor(colorList[position]));
            if(position == selectedPos) { //this color is selected, make it white
                textView.setBackgroundColor(Color.WHITE);
            }
        }
        return textView;
    }


}
