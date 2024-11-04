package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class htz {
    private final nfd a;

    public htz(nfd nfdVar) {
        this.a = nfdVar;
    }

    public abstract long a(String str);

    public abstract nfd b(Long l);

    public abstract boolean c();

    public final nfd d() {
        nfd e = e(null);
        ljh ljhVar = (ljh) e.z(5);
        ljhVar.w(e);
        if (!ljhVar.b.y()) {
            ljhVar.t();
        }
        nfd nfdVar = (nfd) ljhVar.b;
        nfd nfdVar2 = nfd.d;
        nfdVar.a |= 2;
        nfdVar.b = -1L;
        return (nfd) ljhVar.q();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final nfd e(Long l) {
        nfd nfdVar = this.a;
        int J = a.J(nfdVar.c);
        if (J != 0 && J == 5 && l != null && l.longValue() != nfdVar.b) {
            ljh k = nfd.d.k();
            int J2 = a.J(this.a.c);
            if (J2 == 0) {
                J2 = 1;
            }
            if (!k.b.y()) {
                k.t();
            }
            nfd nfdVar2 = (nfd) k.b;
            nfdVar2.c = J2 - 1;
            nfdVar2.a |= 4;
            long longValue = l.longValue();
            if (!k.b.y()) {
                k.t();
            }
            nfd nfdVar3 = (nfd) k.b;
            nfdVar3.a |= 2;
            nfdVar3.b = longValue;
            return (nfd) k.q();
        }
        return this.a;
    }
}
