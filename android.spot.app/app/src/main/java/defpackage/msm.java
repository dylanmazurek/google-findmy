package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class msm {
    public final Throwable b;
    public final mro c;

    public msm(Throwable th, boolean z) {
        this.b = th;
        this.c = new mro(z, mrs.a);
    }

    public final boolean a() {
        return this.c.a(false, true);
    }

    public final String toString() {
        return msz.a(this) + "[" + this.b + "]";
    }

    public /* synthetic */ msm(Throwable th) {
        this(th, false);
    }
}
