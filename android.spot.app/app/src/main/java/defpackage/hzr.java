package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hzr {
    public static final hzr a;
    public final boolean b;
    public final boolean c = false;
    public final jis d;

    static {
        boolean z;
        kub kubVar = new kub((char[]) null);
        kubVar.h();
        a = kubVar.g();
        kub kubVar2 = new kub((char[]) null);
        kubVar2.h();
        hrc hrcVar = new hrc((byte[]) null);
        kubVar2.a.getClass();
        ((jin) kubVar2.b).h(hrcVar);
        kubVar2.g();
        kub kubVar3 = new kub((char[]) null);
        if (kubVar3.a == null) {
            z = true;
        } else {
            z = false;
        }
        hwx.V(z, "A SourcePolicy can only set internal() or external() once.");
        kubVar3.a = true;
        kubVar3.g();
    }

    public hzr(boolean z, jis jisVar) {
        this.b = z;
        this.d = jisVar;
    }
}
