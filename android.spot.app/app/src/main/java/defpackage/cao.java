package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cao extends mnp implements moh {
    int a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cao(cam camVar, mmx mmxVar, int i) {
        super(1, mmxVar);
        this.c = i;
        this.b = null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [moh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [moh, java.lang.Object] */
    @Override // defpackage.moh
    public final /* synthetic */ Object a(Object obj) {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                return new cao(this.b, (mmx) obj, 2, null).b(mlh.a);
            }
            return new cao((moh) this.b, (mmx) obj, 1).b(mlh.a);
        }
        return new cao((cam) null, (mmx) obj, 0).b(mlh.a);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [moh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7, types: [moh, java.lang.Object] */
    @Override // defpackage.mnj
    public final Object b(Object obj) {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                mne mneVar = mne.a;
                int i2 = this.a;
                mjo.o(obj);
                if (i2 == 0) {
                    ?? r4 = this.b;
                    this.a = 1;
                    obj = r4.a(this);
                    if (obj == mneVar) {
                        return mneVar;
                    }
                }
                return obj;
            }
            mne mneVar2 = mne.a;
            if (this.a != 0) {
                mjo.o(obj);
            } else {
                mjo.o(obj);
                ?? r42 = this.b;
                this.a = 1;
                obj = adl.b(r42, this);
                if (obj == mneVar2) {
                    return mneVar2;
                }
            }
            return obj;
        }
        if (this.a != 0) {
            mjo.o(obj);
            return mlh.a;
        }
        mjo.o(obj);
        this.a = 1;
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cao(moh mohVar, mmx mmxVar, int i) {
        super(1, mmxVar);
        this.c = i;
        this.b = mohVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cao(moh mohVar, mmx mmxVar, int i, byte[] bArr) {
        super(1, mmxVar);
        this.c = i;
        this.b = mohVar;
    }
}
