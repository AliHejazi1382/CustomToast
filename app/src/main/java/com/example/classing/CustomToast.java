package com.example.classing;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.classing.R;

public class CustomToast {

    private Context context;//for getting the main context of target class
    private int padding;//for setting padding in colored simple toasts
    private View view;//for setting view of colored simple toasts
    private LayoutInflater layoutInflater;
    private RelativeLayout relativeLayout;//relative layout in toast_layout.xml
    private ImageView imgIcon;//imageView in toast_layout.xml
    private TextView textView;//textVeiw layout in toast_layout.xml
    private View view1;
    private Toast toast;//toast of super toasts
    public CustomToast(Context context, int padding){
        this.context = context;
        this.padding =(int)(context.getResources().getDisplayMetrics().density*padding) ;
        this.layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.view1 = layoutInflater.inflate(R.layout.toast_layout, null);
        this.imgIcon = view1.findViewById(R.id.img);
        this.textView = view1.findViewById(R.id.txt);
        this.relativeLayout = view1.findViewById(R.id.layout);
        this.toast = new Toast(context);
    }

    private View getToastView(Toast toast){//for getting layout(view) of colored simple toasts
        return (toast == null) ? null : toast.getView();
    }

    public Toast makeRedToast(Toast toast){//for making red simple toast
        this.view = this.getToastView(toast);
        if (view != null){
            view.setBackgroundResource(R.drawable.red_background);
            view.setPadding(padding, padding, padding, padding);
        }
        return toast;
    }

    public Toast makeGreenToast(Toast toast){//for making green simple toast
        this.view = this.getToastView(toast);
        if (view != null){
            view.setBackgroundResource(R.drawable.green_background);
            view.setPadding(padding, padding, padding, padding);
        }
        return toast;
    }

    public Toast makeBlueToast(Toast toast){//for making blue simple toast
        this.view = this.getToastView(toast);
        if (view != null){
            view.setBackgroundResource(R.drawable.blue_background);
            view.setPadding(padding, padding, padding, padding);
        }
        return toast;
    }

    public Toast makeOrangeToast(Toast toast){//for making orange simple toast
        this.view = this.getToastView(toast);
        if (view != null){
            view.setBackgroundResource(R.drawable.orange_background);
            view.setPadding(padding, padding, padding, padding);
        }
        return toast;
    }

    public Toast makeYellowToast(Toast toast){//for making yellow simple toast
        this.view = this.getToastView(toast);
        if (view != null){
            view.setBackgroundResource(R.drawable.yellow_background);
            view.setPadding(padding, padding, padding, padding);
        }
        return toast;
    }

    public Toast makeErrorToast(String text){//for making error super toast
        this.relativeLayout.setBackgroundResource(R.drawable.red_background);
        this.imgIcon.setImageResource(R.drawable.error);
        this.textView.setText(text);
        this.toast.setView(this.view1);
        return this.toast;
    }

    public Toast makeWaringToast(String text){//for making warning super toast
        this.relativeLayout.setBackgroundResource(R.drawable.yellow_background);
        this.imgIcon.setImageResource(R.drawable.warning);
        this.textView.setText(text);
        this.toast.setView(this.view1);
        return this.toast;
    }

    public Toast makeSuccessfulToast(String text){//for making successful super toast
        this.relativeLayout.setBackgroundResource(R.drawable.green_background);
        this.imgIcon.setImageResource(R.drawable.successful);
        this.textView.setText(text);
        this.toast.setView(this.view1);
        return this.toast;
    }

    public Toast makeInfoToast(String text){//for making info super toast
        this.relativeLayout.setBackgroundResource(R.drawable.blue_background);
        this.imgIcon.setImageResource(R.drawable.info);
        this.textView.setText(text);
        this.toast.setView(this.view1);
        return this.toast;
    }

}
