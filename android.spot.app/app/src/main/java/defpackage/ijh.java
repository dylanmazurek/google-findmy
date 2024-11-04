package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ijh extends jef {
    @Override // defpackage.jef
    protected final /* synthetic */ Object b(Object obj) {
        ijd ijdVar = (ijd) obj;
        lyn lynVar = new lyn((byte[]) null);
        if ((ijdVar.a & 1) != 0) {
            lynVar.p(ijdVar.b);
        }
        if ((ijdVar.a & 2) != 0) {
            lynVar.q(ijdVar.c);
        }
        return lynVar.o();
    }

    @Override // defpackage.jef
    protected final /* synthetic */ Object c(Object obj) {
        ijk ijkVar = (ijk) obj;
        ljh k = ijd.d.k();
        lim limVar = ijkVar.a;
        if (!k.b.y()) {
            k.t();
        }
        ljn ljnVar = k.b;
        ijd ijdVar = (ijd) ljnVar;
        limVar.getClass();
        ijdVar.a |= 1;
        ijdVar.b = limVar;
        lim limVar2 = ijkVar.b;
        if (!ljnVar.y()) {
            k.t();
        }
        ijd ijdVar2 = (ijd) k.b;
        limVar2.getClass();
        ijdVar2.a |= 2;
        ijdVar2.c = limVar2;
        return (ijd) k.q();
    }
}
