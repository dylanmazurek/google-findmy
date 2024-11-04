package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class daq extends mnp implements moh {
    int a;
    final /* synthetic */ dat b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ boolean e;
    final /* synthetic */ day f;
    final /* synthetic */ cyb g;
    final /* synthetic */ float h;
    final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public daq(dat datVar, int i, int i2, boolean z, day dayVar, cyb cybVar, float f, int i3, mmx mmxVar) {
        super(1, mmxVar);
        this.b = datVar;
        this.c = i;
        this.d = i2;
        this.e = z;
        this.f = dayVar;
        this.g = cybVar;
        this.h = f;
        this.i = i3;
    }

    @Override // defpackage.moh
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new daq(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (mmx) obj).b(mlh.a);
    }

    /* JADX WARN: Finally extract failed */
    @Override // defpackage.mnj
    public final Object b(Object obj) {
        mnb mnbVar;
        mne mneVar = mne.a;
        try {
            if (this.a != 0) {
                mjo.o(obj);
            } else {
                mjo.o(obj);
                this.b.j(this.c);
                this.b.a.h(Integer.valueOf(this.d));
                this.b.b.h(Boolean.valueOf(this.e));
                this.b.d.h(Float.valueOf(1.0f));
                this.b.c.h(this.f);
                this.b.i(this.g);
                this.b.l(this.h);
                this.b.e.h(false);
                this.b.r(Long.MIN_VALUE);
                if (this.g == null) {
                    this.b.k(false);
                    return mlh.a;
                }
                if (Float.isInfinite(1.0f)) {
                    dat datVar = this.b;
                    datVar.l(datVar.b());
                    this.b.k(false);
                    this.b.j(this.d);
                    return mlh.a;
                }
                this.b.k(true);
                if (this.i - 1 != 1) {
                    mnbVar = mnc.a;
                } else {
                    mnbVar = mut.a;
                }
                dap dapVar = new dap(this.i, mkm.az(o()), this.d, this.c, this.b, null);
                this.a = 1;
                if (mpp.l(mnbVar, dapVar, this) == mneVar) {
                    return mneVar;
                }
            }
            mkm.aB(o());
            this.b.k(false);
            return mlh.a;
        } catch (Throwable th) {
            this.b.k(false);
            throw th;
        }
    }
}
