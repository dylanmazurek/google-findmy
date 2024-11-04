package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cke {
    public final int b;

    public cke(int i) {
        this.b = i;
    }

    public static final void f(String str) {
        int i;
        if (!moz.v(str, ":memory:")) {
            int length = str.length() - 1;
            int i2 = 0;
            boolean z = false;
            while (i2 <= length) {
                if (true != z) {
                    i = i2;
                } else {
                    i = length;
                }
                int a = mpd.a(str.charAt(i), 32);
                if (!z) {
                    if (a > 0) {
                        z = true;
                    } else {
                        i2++;
                    }
                } else if (a > 0) {
                    break;
                } else {
                    length--;
                }
            }
            if (str.subSequence(i2, length + 1).toString().length() != 0) {
                Log.w("SupportSQLite", "deleting the database file: ".concat(str));
                try {
                    SQLiteDatabase.deleteDatabase(new File(str));
                } catch (Exception e) {
                    Log.w("SupportSQLite", "delete failed: ", e);
                }
            }
        }
    }

    public abstract void a(ckd ckdVar);

    public void b(ckd ckdVar, int i, int i2) {
        throw null;
    }

    public abstract void d(ckd ckdVar, int i, int i2);

    public void e() {
    }

    public void c(ckd ckdVar) {
    }
}
