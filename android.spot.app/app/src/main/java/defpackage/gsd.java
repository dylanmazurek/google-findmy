package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gsd extends mnp implements mol {
    int a;
    final /* synthetic */ int b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gsd(exl exlVar, int i, Account account, mmx mmxVar, int i2) {
        super(2, mmxVar);
        this.e = i2;
        this.d = exlVar;
        this.b = i;
        this.c = account;
    }

    @Override // defpackage.mol
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.e != 0) {
            return ((gsd) c((msw) obj, (mmx) obj2)).b(mlh.a);
        }
        return ((gsd) c((msw) obj, (mmx) obj2)).b(mlh.a);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [gwf, java.lang.Object] */
    @Override // defpackage.mnj
    public final Object b(Object obj) {
        if (this.e != 0) {
            mne mneVar = mne.a;
            int i = this.a;
            mjo.o(obj);
            if (i == 0) {
                Object obj2 = this.d;
                int i2 = this.b;
                Object obj3 = this.c;
                this.a = 1;
                if (((exl) obj2).d.g(i2, (Account) obj3, this) == mneVar) {
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
            String m = fzo.m(this.d, this.b);
            gsf.a.k().z("Cancelling a scheduled work request for package [%s] with ID: %s, type: %s", ((gsf) this.c).b.getApplicationContext().getPackageName(), m, new Integer(this.b));
            jyz jyzVar = ((cqi) bpe.f(((gsf) this.c).b).a(m)).c;
            this.a = 1;
            obj = mpd.p(jyzVar, this);
            if (obj == mneVar2) {
                return mneVar2;
            }
        }
        return obj;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [gwf, java.lang.Object] */
    @Override // defpackage.mnj
    public final mmx c(Object obj, mmx mmxVar) {
        if (this.e != 0) {
            return new gsd((exl) this.d, this.b, (Account) this.c, mmxVar, 1);
        }
        return new gsd((gsf) this.c, (gwf) this.d, this.b, mmxVar, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gsd(gsf gsfVar, gwf gwfVar, int i, mmx mmxVar, int i2) {
        super(2, mmxVar);
        this.e = i2;
        this.c = gsfVar;
        this.d = gwfVar;
        this.b = i;
    }
}
