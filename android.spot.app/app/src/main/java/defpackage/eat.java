package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eat extends mnp implements mol {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eat(eay eayVar, mmx mmxVar, int i) {
        super(2, mmxVar);
        this.b = i;
        this.a = eayVar;
    }

    @Override // defpackage.mol
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return ((eat) c((msw) obj, (mmx) obj2)).b(mlh.a);
                }
                return ((eat) c((msw) obj, (mmx) obj2)).b(mlh.a);
            }
            return ((eat) c((msw) obj, (mmx) obj2)).b(mlh.a);
        }
        return ((eat) c((msw) obj, (mmx) obj2)).b(mlh.a);
    }

    @Override // defpackage.mnj
    public final Object b(Object obj) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    mjo.o(obj);
                    return ((edp) this.a).a.c();
                }
                mjo.o(obj);
                ((eay) this.a).c.t(true);
                return mlh.a;
            }
            mjo.o(obj);
            ((eay) this.a).c.v();
            ((eay) this.a).c.u(false);
            return mlh.a;
        }
        mjo.o(obj);
        ((eay) this.a).c.j();
        return mlh.a;
    }

    @Override // defpackage.mnj
    public final mmx c(Object obj, mmx mmxVar) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return new eat((edp) this.a, mmxVar, 3);
                }
                return new eat((eay) this.a, mmxVar, 2, (char[]) null);
            }
            return new eat((eay) this.a, mmxVar, 1, (byte[]) null);
        }
        return new eat((eay) this.a, mmxVar, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eat(eay eayVar, mmx mmxVar, int i, byte[] bArr) {
        super(2, mmxVar);
        this.b = i;
        this.a = eayVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eat(eay eayVar, mmx mmxVar, int i, char[] cArr) {
        super(2, mmxVar);
        this.b = i;
        this.a = eayVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eat(edp edpVar, mmx mmxVar, int i) {
        super(2, mmxVar);
        this.b = i;
        this.a = edpVar;
    }
}
