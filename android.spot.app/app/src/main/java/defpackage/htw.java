package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class htw extends htz {
    private final boolean a;

    public htw(nfd nfdVar, boolean z) {
        super(nfdVar);
        this.a = z;
    }

    private final nfd f(Long l) {
        if (this.a) {
            return e(l);
        }
        return d();
    }

    @Override // defpackage.htz
    public final long a(String str) {
        nfd f = f(null);
        if (f.equals(nfd.d)) {
            return 1000L;
        }
        return f.b;
    }

    @Override // defpackage.htz
    public final nfd b(Long l) {
        return f(l);
    }

    @Override // defpackage.htz
    public final boolean c() {
        return this.a;
    }
}
