package cn.edu.zafu.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * 通知工具类
 * @author lizhangqu
 *
 * 2015-2-12
 */
public class ToastUtil {
	public static boolean isShow=true;
	public static void show(Context context,CharSequence message,int duration){
		if(isShow)
			Toast.makeText(context, message, duration).show();
	}
	public static void showShort(Context context,CharSequence message){
		show(context, message, Toast.LENGTH_SHORT);
	}
	public static void showLong(Context context,CharSequence message){
		show(context, message, Toast.LENGTH_LONG);
	}

}
