package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ecq {
    public final int a;
    public final Drawable b;
    public String c;
    public boolean d;
    public boolean e;
    public final jer f;

    public ecq(int i, String str, Drawable drawable, jer jerVar) {
        this.a = i;
        this.c = str;
        this.b = drawable;
        this.d = true;
        this.e = true;
        this.f = jerVar;
    }

    public final void a() {
        this.e = false;
    }

    public final void b() {
        this.e = true;
    }

    public ecq(int i, String str, Drawable drawable) {
        this(i, str, drawable, jdl.a);
    }
}
