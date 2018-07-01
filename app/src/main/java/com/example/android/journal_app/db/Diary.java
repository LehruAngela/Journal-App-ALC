package com.example.android.journal_app.db;

import android.provider.BaseColumns;

public class Diary {

    public static final String DB_NAME = "cas.example.con.diary_db";
    public static final int DB_VERSION = 1;

    public class DiaryEntry implements BaseColumns{
        public static final String TABLE = "diary";
        public static final String COL_DIARY_TITLE = "title";

    }

}
