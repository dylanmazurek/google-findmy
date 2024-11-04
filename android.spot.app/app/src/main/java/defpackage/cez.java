package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cez extends mnp implements mol {
    final /* synthetic */ Object a;
    private /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cez(ccd ccdVar, mmx mmxVar, int i) {
        super(2, mmxVar);
        this.c = i;
        this.a = ccdVar;
    }

    @Override // defpackage.mol
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.c != 0) {
            return ((cez) c((ccd) obj, (mmx) obj2)).b(mlh.a);
        }
        return ((cez) c((msw) obj, (mmx) obj2)).b(mlh.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, cfb] */
    @Override // defpackage.mnj
    public final Object b(Object obj) {
        if (this.c != 0) {
            mjo.o(obj);
            ccd ccdVar = (ccd) this.b;
            boolean z = false;
            if ((ccdVar instanceof cal) && ccdVar.c <= ((ccd) this.a).c) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        mjo.o(obj);
        msw mswVar = (msw) this.b;
        if (((cey) this.a).a.b.compareTo(cew.INITIALIZED) < 0) {
            mkm.aA(mswVar.b(), null);
        } else {
            ?? r3 = this.a;
            ((cey) r3).a.a(r3);
        }
        return mlh.a;
    }

    @Override // defpackage.mnj
    public final mmx c(Object obj, mmx mmxVar) {
        if (this.c != 0) {
            cez cezVar = new cez((ccd) this.a, mmxVar, 1);
            cezVar.b = obj;
            return cezVar;
        }
        cez cezVar2 = new cez((cey) this.a, mmxVar, 0);
        cezVar2.b = obj;
        return cezVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cez(cey ceyVar, mmx mmxVar, int i) {
        super(2, mmxVar);
        this.c = i;
        this.a = ceyVar;
    }
}
