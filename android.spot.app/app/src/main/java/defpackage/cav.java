package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cav extends mnp implements mol {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cav(beo beoVar, mmx mmxVar, int i) {
        super(2, mmxVar);
        this.b = i;
        this.a = beoVar;
    }

    @Override // defpackage.mol
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                return ((cav) c((ctd) obj, (mmx) obj2)).b(mlh.a);
            }
            return ((cav) c(Float.valueOf(((Number) obj).floatValue()), (mmx) obj2)).b(mlh.a);
        }
        return ((cav) c((mww) obj, (mmx) obj2)).b(mlh.a);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, muf] */
    @Override // defpackage.mnj
    public final Object b(Object obj) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                mjo.o(obj);
                String str = cxu.a;
                cqc.b();
                Objects.toString(this.a);
                return mlh.a;
            }
            mjo.o(obj);
            if (beg.c(null) == null) {
                ll.h("Required value was null.");
                throw new mks();
            }
            bfn bfnVar = bfj.a;
            throw null;
        }
        mjo.o(obj);
        this.a.dr();
        return mlh.a;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, muf] */
    @Override // defpackage.mnj
    public final mmx c(Object obj, mmx mmxVar) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                return new cav((cvu) this.a, mmxVar, 2);
            }
            cav cavVar = new cav((beo) this.a, mmxVar, 1);
            ((Number) obj).floatValue();
            return cavVar;
        }
        return new cav((muf) this.a, mmxVar, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cav(cvu cvuVar, mmx mmxVar, int i) {
        super(2, mmxVar);
        this.b = i;
        this.a = cvuVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cav(muf mufVar, mmx mmxVar, int i) {
        super(2, mmxVar);
        this.b = i;
        this.a = mufVar;
    }
}
