package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class zv {
    public static final zv a = new zv();

    private zv() {
    }

    public final long a(Context context, int i) {
        int color;
        color = context.getResources().getColor(i, context.getTheme());
        return jw.e(color);
    }
}
