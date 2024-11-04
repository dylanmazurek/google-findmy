package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ccf extends mnp implements mom {
    int a;
    private /* synthetic */ Object b;

    public ccf(mmx mmxVar) {
        super(3, mmxVar);
    }

    @Override // defpackage.mom
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ((Boolean) obj2).booleanValue();
        ccf ccfVar = new ccf((mmx) obj3);
        ccfVar.b = (cbo) obj;
        return ccfVar.b(mlh.a);
    }

    @Override // defpackage.mnj
    public final Object b(Object obj) {
        mne mneVar = mne.a;
        int i = this.a;
        mjo.o(obj);
        if (i == 0) {
            Object obj2 = this.b;
            this.a = 1;
            cbo cboVar = (cbo) obj2;
            cboVar.b();
            obj = bsd.c(cboVar.a, new cbn(cboVar, (mmx) null, 0), this);
            if (obj == mneVar) {
                return mneVar;
            }
        }
        return obj;
    }
}
