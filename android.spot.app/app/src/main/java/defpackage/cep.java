package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cep extends mnp implements mol {
    final /* synthetic */ cfk a;
    final /* synthetic */ cfo b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cep(cfk cfkVar, cfo cfoVar, mmx mmxVar, int i) {
        super(2, mmxVar);
        this.c = i;
        this.a = cfkVar;
        this.b = cfoVar;
    }

    @Override // defpackage.mol
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.c != 0) {
            return ((cep) c((msw) obj, (mmx) obj2)).b(mlh.a);
        }
        return ((cep) c((msw) obj, (mmx) obj2)).b(mlh.a);
    }

    @Override // defpackage.mnj
    public final Object b(Object obj) {
        if (this.c != 0) {
            mjo.o(obj);
            this.a.h(this.b);
            return mlh.a;
        }
        mjo.o(obj);
        this.a.j(this.b);
        return mlh.a;
    }

    @Override // defpackage.mnj
    public final mmx c(Object obj, mmx mmxVar) {
        if (this.c != 0) {
            return new cep(this.a, this.b, mmxVar, 1, null);
        }
        return new cep(this.a, this.b, mmxVar, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cep(cfk cfkVar, cfo cfoVar, mmx mmxVar, int i, byte[] bArr) {
        super(2, mmxVar);
        this.c = i;
        this.a = cfkVar;
        this.b = cfoVar;
    }
}
