package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class glc {
    public static final /* synthetic */ int a = 0;
    private static final joo b = joo.m("GnpSdk");

    public static int a(Cursor cursor, String str) {
        try {
            return cursor.getColumnIndexOrThrow(str);
        } catch (IllegalArgumentException e) {
            throw new glb(str, e);
        }
    }

    public static jis b(hzp hzpVar, String str, String[] strArr) {
        int length = strArr.length;
        if (length <= 900) {
            kuv kuvVar = new kuv((char[]) null, (byte[]) null);
            if (!c(hzpVar)) {
                kuvVar.z(hzpVar.a, hzpVar.a());
                kuvVar.y(" AND ");
            }
            kuvVar.z(g(str, length), strArr);
            return jis.q(kuvVar.x());
        }
        jin jinVar = new jin();
        int i = 0;
        while (true) {
            int length2 = strArr.length;
            if (i < length2) {
                int i2 = i + 900;
                String[] strArr2 = (String[]) Arrays.copyOfRange(strArr, i, Math.min(i2, length2));
                kuv kuvVar2 = new kuv((char[]) null, (byte[]) null);
                if (!c(hzpVar)) {
                    kuvVar2.z(hzpVar.a, hzpVar.a());
                    kuvVar2.y(" AND ");
                }
                kuvVar2.z(g(str, strArr2.length), strArr2);
                jinVar.h(kuvVar2.x());
                i = i2;
            } else {
                return jinVar.g();
            }
        }
    }

    public static boolean c(hzp hzpVar) {
        if (hzpVar != null && !hzpVar.a.isEmpty()) {
            return false;
        }
        return true;
    }

    public static void d(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        kuv kuvVar = new kuv((char[]) null, (byte[]) null);
        kuvVar.y("ALTER TABLE ");
        kuvVar.y("threads");
        kuvVar.y(" ADD COLUMN ");
        kuvVar.y(str);
        kuvVar.y(" ");
        kuvVar.y(str2);
        hzp x = kuvVar.x();
        sQLiteDatabase.execSQL(x.a, x.a());
    }

    public static lkq e(Cursor cursor, lkq lkqVar, String str) {
        try {
            byte[] blob = cursor.getBlob(a(cursor, str));
            if (blob != null) {
                return lkqVar.cR().e(blob).q();
            }
            return null;
        } catch (ljy e) {
            ((jol) ((jol) ((jol) b.f()).i(e)).j("com/google/android/libraries/notifications/internal/storage/impl/DatabaseHelper", "safeParseMessage", 128, "DatabaseHelper.java")).y("Error parsing column %s for notification %s", str, cursor.getString(a(cursor, "thread_id")));
            return null;
        }
    }

    public static List f(Cursor cursor, lkq lkqVar, String str) {
        gxg gxgVar;
        ArrayList arrayList = new ArrayList();
        try {
            byte[] blob = cursor.getBlob(a(cursor, str));
            if (blob != null && (gxgVar = (gxg) ((ljh) gxg.b.k().e(blob)).q()) != null) {
                for (lia liaVar : gxgVar.a) {
                    lkp cR = lkqVar.cR();
                    cR.l(liaVar.a);
                    arrayList.add(cR.q());
                }
            }
        } catch (ljy e) {
            ((jol) ((jol) ((jol) b.f()).i(e)).j("com/google/android/libraries/notifications/internal/storage/impl/DatabaseHelper", "safeParseMessageList", 151, "DatabaseHelper.java")).y("Error parsing column %s for notification %s", str, cursor.getString(a(cursor, "thread_id")));
        }
        return arrayList;
    }

    private static String g(String str, int i) {
        if (i > 0 && !TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" IN (");
            for (int i2 = 1; i2 < i; i2++) {
                sb.append("?,");
            }
            sb.append("?)");
            return sb.toString();
        }
        ((jol) ((jol) ((jol) b.g()).i(new Exception())).j("com/google/android/libraries/notifications/internal/storage/impl/DatabaseHelper", "getInClause", 111, "DatabaseHelper.java")).w("Error creating IN clause for number: [%d], column [%s]", i, str);
        return "0";
    }
}
