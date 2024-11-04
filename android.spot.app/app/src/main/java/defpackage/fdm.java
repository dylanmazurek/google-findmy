package defpackage;

import android.util.Log;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class fdm {
    public static volatile nbw a = new nbw();

    public static void a(String str, Object obj) {
        fdn fdnVar = fdn.a;
        if (fdnVar != null) {
            fdnVar.v(str, obj);
        } else if (b()) {
            if (obj != null) {
                str = a.an((String) obj, str, ":");
            }
            Log.e((String) fdh.b.x(), str);
        }
    }

    public static boolean b() {
        if (a != null) {
            int i = a.a;
            return true;
        }
        return false;
    }
}
