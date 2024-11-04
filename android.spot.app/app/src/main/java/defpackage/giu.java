package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class giu {
    public static final giu c(goa goaVar) {
        if (goaVar == null) {
            return gir.a;
        }
        return frx.L(goaVar);
    }

    public abstract goa a();

    public abstract int b();

    public final goa d() {
        if (b() - 1 != 0) {
            return null;
        }
        return a();
    }

    public final String e() {
        goa d = d();
        if (d != null) {
            return d.b;
        }
        return null;
    }
}
