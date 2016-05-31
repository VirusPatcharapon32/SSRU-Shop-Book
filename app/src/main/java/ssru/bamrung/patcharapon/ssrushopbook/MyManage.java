package ssru.bamrung.patcharapon.ssrushopbook;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by user on 31/5/2559.
 */
public class MyManage {

    private MyOpenHelper myOpenHelper;
    private SQLiteDatabase sqLiteDatabase;

    public MyManage(Context context) {

        myOpenHelper = new MyOpenHelper(context);
        sqLiteDatabase = myOpenHelper.getWritableDatabase();

    }   // Construtor
}   // Main Class
