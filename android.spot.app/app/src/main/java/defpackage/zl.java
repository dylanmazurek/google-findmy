package defpackage;

import android.net.NetworkRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class zl extends mnp implements mol {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private /* synthetic */ Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zl(cpl cplVar, ctj ctjVar, mmx mmxVar, int i) {
        super(2, mmxVar);
        this.e = i;
        this.c = cplVar;
        this.b = ctjVar;
    }

    @Override // defpackage.mol
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.e;
        if (i != 0) {
            if (i != 1) {
                return ((zl) c((mwi) obj, (mmx) obj2)).b(mlh.a);
            }
            return ((zl) c((aen) obj, (mmx) obj2)).b(mlh.a);
        }
        return ((zl) c((auz) obj, (mmx) obj2)).b(mlh.a);
    }

    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, agt] */
    @Override // defpackage.mnj
    public final Object b(Object obj) {
        int i = this.e;
        if (i != 0) {
            if (i != 1) {
                mne mneVar = mne.a;
                int i2 = this.a;
                mjo.o(obj);
                if (i2 == 0) {
                    mwi mwiVar = (mwi) this.d;
                    NetworkRequest a = ((cpl) this.c).a();
                    if (a == null) {
                        mwiVar.u(null);
                        return mlh.a;
                    }
                    cti ctiVar = new cti(mpp.q(mwiVar, null, 0, new bdu((ctj) this.b, mwiVar, (mmx) null, 7), 3), mwiVar);
                    cqc.b();
                    long j = ctr.a;
                    ((ctj) this.b).a.registerNetworkCallback(a, ctiVar);
                    aqg aqgVar = new aqg(this.b, ctiVar, 7);
                    this.a = 1;
                    if (moz.ar(mwiVar, aqgVar, this) == mneVar) {
                        return mneVar;
                    }
                }
                return mlh.a;
            }
            mne mneVar2 = mne.a;
            if (this.a != 0) {
                mjo.o(obj);
            } else {
                mjo.o(obj);
                aen aenVar = (aen) this.d;
                mwo mwoVar = new mwo(new agp(new ob(this.c, 6), null));
                tr trVar = new tr(aenVar, (wi) this.c, this.b);
                this.a = 1;
                if (mwoVar.a(trVar, this) == mneVar2) {
                    return mneVar2;
                }
            }
            return mlh.a;
        }
        mne mneVar3 = mne.a;
        if (this.a != 0) {
            mjo.o(obj);
        } else {
            mjo.o(obj);
            auz auzVar = (auz) this.d;
            mjp mjpVar = new mjp(auzVar.u());
            zk zkVar = new zk((yx) this.b, mjpVar, (yw) this.c, null);
            this.a = 1;
            xm xmVar = new xm(o(), zkVar, null);
            mse mseVar = new mse(mjo.w(this), 1);
            mseVar.z();
            auy auyVar = new auy(auzVar, mseVar);
            synchronized (auzVar.e) {
                auzVar.e.o(auyVar);
                new mnd(mjo.w(mjo.v(xmVar, auyVar, auyVar)), mne.a).p(mlh.a);
            }
            mseVar.d(new zc(auyVar, 9));
            Object j2 = mseVar.j();
            if (j2 != mne.a) {
                j2 = mlh.a;
            }
            if (j2 == mneVar3) {
                return mneVar3;
            }
        }
        return mlh.a;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, agt] */
    @Override // defpackage.mnj
    public final mmx c(Object obj, mmx mmxVar) {
        int i = this.e;
        if (i != 0) {
            if (i != 1) {
                zl zlVar = new zl((cpl) this.c, (ctj) this.b, mmxVar, 2);
                zlVar.d = obj;
                return zlVar;
            }
            zl zlVar2 = new zl((wi) this.c, (agt) this.b, mmxVar, 1);
            zlVar2.d = obj;
            return zlVar2;
        }
        zl zlVar3 = new zl((yx) this.b, (yw) this.c, mmxVar, 0);
        zlVar3.d = obj;
        return zlVar3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zl(wi wiVar, agt agtVar, mmx mmxVar, int i) {
        super(2, mmxVar);
        this.e = i;
        this.c = wiVar;
        this.b = agtVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zl(yx yxVar, yw ywVar, mmx mmxVar, int i) {
        super(2, mmxVar);
        this.e = i;
        this.b = yxVar;
        this.c = ywVar;
    }
}
