package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cjm extends mnp implements mol {
    final /* synthetic */ moh a;
    private /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjm(mmx mmxVar, moh mohVar, int i) {
        super(2, mmxVar);
        this.c = i;
        this.a = mohVar;
    }

    @Override // defpackage.mol
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.c != 0) {
            return ((cjm) c((cic) obj, (mmx) obj2)).b(mlh.a);
        }
        return ((cjm) c((cic) obj, (mmx) obj2)).b(mlh.a);
    }

    @Override // defpackage.mnj
    public final Object b(Object obj) {
        if (this.c != 0) {
            mjo.o(obj);
            cic cicVar = (cic) this.b;
            cicVar.getClass();
            return this.a.a(cicVar.b());
        }
        mjo.o(obj);
        cic cicVar2 = (cic) this.b;
        cicVar2.getClass();
        return this.a.a(cicVar2.b());
    }

    @Override // defpackage.mnj
    public final mmx c(Object obj, mmx mmxVar) {
        if (this.c != 0) {
            cjm cjmVar = new cjm(mmxVar, this.a, 1, null);
            cjmVar.b = obj;
            return cjmVar;
        }
        cjm cjmVar2 = new cjm(mmxVar, this.a, 0);
        cjmVar2.b = obj;
        return cjmVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjm(mmx mmxVar, moh mohVar, int i, byte[] bArr) {
        super(2, mmxVar);
        this.c = i;
        this.a = mohVar;
    }
}
