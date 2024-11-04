package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ctn extends mnp implements mom {
    int a;
    /* synthetic */ Object b;
    private /* synthetic */ Object c;

    public ctn(mmx mmxVar) {
        super(3, mmxVar);
    }

    @Override // defpackage.mom
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ctn ctnVar = new ctn((mmx) obj3);
        ctnVar.c = (mww) obj;
        ctnVar.b = (Object[]) obj2;
        return ctnVar.b(mlh.a);
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, mww] */
    @Override // defpackage.mnj
    public final Object b(Object obj) {
        ctd ctdVar;
        mne mneVar = mne.a;
        int i = this.a;
        mjo.o(obj);
        if (i == 0) {
            ?? r7 = this.c;
            ctd[] ctdVarArr = (ctd[]) this.b;
            int length = ctdVarArr.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    ctdVar = ctdVarArr[i2];
                    if (!amr.i(ctdVar, ctg.a)) {
                        break;
                    }
                    i2++;
                } else {
                    ctdVar = null;
                    break;
                }
            }
            if (ctdVar == null) {
                ctdVar = ctg.a;
            }
            this.a = 1;
            if (r7.dt(ctdVar, this) == mneVar) {
                return mneVar;
            }
        }
        return mlh.a;
    }
}
