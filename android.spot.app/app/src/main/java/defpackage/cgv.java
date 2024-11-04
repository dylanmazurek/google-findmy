package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cgv extends cgu {
    public cgv() {
        this((byte[]) null);
    }

    @Override // defpackage.cgu
    public final Object a(cgt cgtVar) {
        return this.b.get(cgtVar);
    }

    public final void b(cgt cgtVar, Object obj) {
        this.b.put(cgtVar, obj);
    }

    public cgv(cgu cguVar) {
        cguVar.getClass();
        this.b.putAll(cguVar.b);
    }

    public /* synthetic */ cgv(byte[] bArr) {
        this(cgs.a);
    }
}
