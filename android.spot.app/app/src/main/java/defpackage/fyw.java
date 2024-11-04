package defpackage;

import android.content.ContentResolver;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fyw {
    public static ContentResolver a;
    public final String b;
    public final Object c;

    protected fyw(String str, Object obj) {
        this.b = str;
        this.c = obj;
    }

    public static void a(Context context) {
        a = context.getContentResolver();
    }

    public static fyw b(String str) {
        return new fyw(str, false);
    }
}
