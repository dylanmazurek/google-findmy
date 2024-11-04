package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eax extends mnp implements mol {
    int a;
    final /* synthetic */ Object b;
    private /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eax(dib dibVar, mmx mmxVar, int i) {
        super(2, mmxVar);
        this.d = i;
        this.b = dibVar;
    }

    @Override // defpackage.mol
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.d != 0) {
            return ((eax) c((msw) obj, (mmx) obj2)).b(mlh.a);
        }
        return ((eax) c((msw) obj, (mmx) obj2)).b(mlh.a);
    }

    @Override // defpackage.mnj
    public final Object b(Object obj) {
        msw mswVar;
        if (this.d != 0) {
            mne mneVar = mne.a;
            if (this.a != 0) {
                mswVar = (msw) this.c;
                mjo.o(obj);
            } else {
                mjo.o(obj);
                msw mswVar2 = (msw) this.c;
                moh mohVar = ((dia) ((dib) this.b).c).a;
                this.c = mswVar2;
                this.a = 1;
                Object a = mohVar.a(this);
                if (a != mneVar) {
                    mswVar = mswVar2;
                    obj = a;
                } else {
                    return mneVar;
                }
            }
            dig digVar = (dig) obj;
            mpn mpnVar = new mpn();
            Object obj2 = this.b;
            synchronized (mswVar) {
                ((dib) obj2).a = digVar;
                mpnVar.a = new ArrayList(((dib) obj2).b);
                ((dib) obj2).b.clear();
            }
            Iterator it = ((Iterable) mpnVar.a).iterator();
            while (it.hasNext()) {
                ((dso) it.next()).e(digVar.a, digVar.b);
            }
            return mlh.a;
        }
        mne mneVar2 = mne.a;
        if (this.a != 0) {
            mjo.o(obj);
        } else {
            mjo.o(obj);
            msw mswVar3 = (msw) this.c;
            Collection values = ((eay) this.b).b.values();
            ArrayList arrayList = new ArrayList(mkm.ap(values));
            Iterator it2 = values.iterator();
            while (it2.hasNext()) {
                arrayList.add(mpp.q(mswVar3, null, 0, new eau((ehw) it2.next(), (mmx) null, 4), 3));
            }
            this.a = 1;
            if (mpd.e(arrayList, this) == mneVar2) {
                return mneVar2;
            }
        }
        return mlh.a;
    }

    @Override // defpackage.mnj
    public final mmx c(Object obj, mmx mmxVar) {
        if (this.d != 0) {
            eax eaxVar = new eax((dib) this.b, mmxVar, 1);
            eaxVar.c = obj;
            return eaxVar;
        }
        eax eaxVar2 = new eax((eay) this.b, mmxVar, 0);
        eaxVar2.c = obj;
        return eaxVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eax(eay eayVar, mmx mmxVar, int i) {
        super(2, mmxVar);
        this.d = i;
        this.b = eayVar;
    }
}
