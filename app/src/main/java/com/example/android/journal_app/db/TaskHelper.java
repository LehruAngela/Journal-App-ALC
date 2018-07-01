package com.example.android.journal_app.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class TaskHelper extends SQLiteOpenHelper{

    public TaskHelper(Context context){
        super(context, Diary.DB_NAME, null, Diary.DB_VERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTable = "CREATE TABLE " + Diary.DiaryEntry.TABLE + " ( " +
                                               Diary.DiaryEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                                              Diary.DiaryEntry.COL_DIARY_TITLE + " TEXT NOT NULL);";

        db.execSQL(createTable);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL("DROP TABLE IF EXISTS " + Diary.DiaryEntry.TABLE);
        onCreate(db);


    }
}
