package com.example.login_register;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


import androidx.annotation.Nullable;

public class DataBaseHelper extends SQLiteOpenHelper {
   public static final String DATABASE_NAME="register.db";
    public static final String TABLE_NAME="regiteruser";
    public static final String COL_1="ID";
    public static final String COL_2="username";
    public static final String COL_3="password";

    public DataBaseHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, version);
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
    sqLiteDatabase.execSQL("CREATE TABLE registeruser (ID INTEGER PRIMARY KEY AUTOINCREMENT,username TEXT,password TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
     sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
     onCreate(sqLiteDatabase);
    }
    public long adduser(String user,String password){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("username",user);
        contentValues.put("password",password);
        String table;
        long res = db.insert(table:"registeruser",contentValues);
        db.close();
        return res;

    }
    public boolean checkusers(String username, String password){
        String[] columns = { COL_1};
        SQLiteDatabase db=getReadableDatabase();
        String selectionArgs=COL_2 + "=?" and "+COL_3" =?";
    }
}
