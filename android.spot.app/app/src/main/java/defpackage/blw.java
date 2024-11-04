package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class blw {
    static final blw a;
    static final blw b;
    public final boolean c;
    final Throwable d;

    static {
        if (bme.a) {
            b = null;
            a = null;
        } else {
            b = new blw(false, null);
            a = new blw(true, null);
        }
    }

    public blw(boolean z, Throwable th) {
        this.c = z;
        this.d = th;
    }
}
