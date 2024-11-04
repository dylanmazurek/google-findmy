package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class jwd {
    static final jwd a;
    static final jwd b;
    final boolean c;
    final Throwable d;

    static {
        if (jwq.i) {
            b = null;
            a = null;
        } else {
            b = new jwd(false, null);
            a = new jwd(true, null);
        }
    }

    public jwd(boolean z, Throwable th) {
        this.c = z;
        this.d = th;
    }
}
