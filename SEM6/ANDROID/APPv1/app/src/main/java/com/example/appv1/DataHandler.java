package com.example.appv1;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DataHandler extends SQLiteOpenHelper {
    DataHandler(Context context){
        super( context, "Test", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        String set = "create table user(userName text, userPassword text, userMail text, userContact text)";
        db.execSQL(set);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){}

    public  boolean addData(String userName, String userPassword, String userMail, String userContact) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put("userName", userName);
        cv.put("userPassword", userPassword);
        cv.put("userMail", userMail);
        cv.put("userContact", userContact);
        int i = (int) db.insert("user", null, cv);
        Log.v("Inserted", "Record inserted:" + i);
        db.close();

        if (i > 0) {
            Log.v("result", "Result is:" + i);
            return true;
        } else {
            return false;
        }
    }
    public Cursor Login(String userName, String userPassword){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = db.query("user", new String[] {"userName", "userPassword"}, "userName=? and userPassword", new String[] {userName, userPassword}, null, null, null);
        return c;
    }
}
