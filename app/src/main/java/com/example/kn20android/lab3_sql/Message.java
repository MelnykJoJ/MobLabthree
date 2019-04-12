package com.example.kn20android.lab3_sql;

/**
 * Created by Regenerationer on 5/1/2019.
 */
import android.content.Context;
import android.widget.Toast;

public class Message {
    public static void message(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }
}