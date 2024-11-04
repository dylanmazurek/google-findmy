package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gse extends mnp implements mol {
    int a;
    Object b;
    int c;
    final /* synthetic */ gry d;
    final /* synthetic */ gsf e;
    final /* synthetic */ gwf f;
    final /* synthetic */ Bundle g;
    final /* synthetic */ Long h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gse(gry gryVar, gsf gsfVar, gwf gwfVar, Bundle bundle, Long l, mmx mmxVar) {
        super(2, mmxVar);
        this.d = gryVar;
        this.e = gsfVar;
        this.f = gwfVar;
        this.g = bundle;
        this.h = l;
    }

    @Override // defpackage.mol
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gse) c((msw) obj, (mmx) obj2)).b(mlh.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // defpackage.mnj
    public final Object b(Object obj) {
        String m;
        byte[] marshall;
        cqh e;
        int i;
        Exception e2;
        mne mneVar = mne.a;
        if (this.c != 0) {
            i = this.a;
            m = this.b;
            try {
                mjo.o(obj);
                m = m;
            } catch (Exception e3) {
                e2 = e3;
                ((jol) gsf.a.g()).z("Failed to schedule a job for package [%s] with ID: %s, type: %s", this.e.b.getApplicationContext().getPackageName(), m, new Integer(i));
                return new gmy(e2);
            }
        } else {
            mjo.o(obj);
            gry gryVar = this.d;
            gwf gwfVar = this.f;
            int a = gryVar.a();
            m = fzo.m(gwfVar, a);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            box.m("com.google.android.libraries.notifications.platform.JOB_KEY", this.d.d(), linkedHashMap);
            box.m("com.google.android.libraries.notifications.platform.JOB_ID", m, linkedHashMap);
            Bundle bundle = this.g;
            bundle.getClass();
            if (bundle.isEmpty()) {
                marshall = null;
            } else {
                Parcel obtain = Parcel.obtain();
                obtain.getClass();
                bundle.writeToParcel(obtain, 0);
                marshall = obtain.marshall();
                obtain.recycle();
            }
            if (marshall != null) {
                box.l("com.google.android.libraries.notifications.platform.WORKER_PARAMS", marshall, linkedHashMap);
            }
            mjp mjpVar = new mjp((byte[]) null);
            mjpVar.n(2);
            cpl m2 = mjpVar.m();
            try {
                cpn i2 = box.i(linkedHashMap);
                gsf gsfVar = this.e;
                gsfVar.d.c(gsfVar.b.getPackageName(), true);
                gry gryVar2 = this.d;
                if (gryVar2.e()) {
                    gsf gsfVar2 = this.e;
                    Long l = this.h;
                    cqj cqjVar = new cqj(gsfVar2.c, gryVar2.b(), TimeUnit.MILLISECONDS);
                    cqjVar.d(i2);
                    cqjVar.b(m2);
                    fzo.n(cqjVar, l);
                    apc e4 = cqjVar.e();
                    cql f = bpe.f(this.e.b);
                    csb csbVar = (csb) f;
                    Object obj2 = csbVar.h.f;
                    ?? r10 = csbVar.i.a;
                    r10.getClass();
                    e = bpd.f((bop) obj2, "enqueueUniquePeriodic_".concat(m), r10, new azm(f, m, e4, 4, null));
                } else {
                    gsf gsfVar3 = this.e;
                    Long l2 = this.h;
                    cqd cqdVar = new cqd(gsfVar3.c);
                    cqdVar.d(i2);
                    cqdVar.b(m2);
                    fzo.n(cqdVar, l2);
                    e = bpe.f(this.e.b).e(m, cqdVar.e());
                }
                try {
                    jyz jyzVar = ((cqi) e).c;
                    this.b = m;
                    this.a = a;
                    this.c = 1;
                    if (mpd.p(jyzVar, this) != mneVar) {
                        i = a;
                        m = m;
                    } else {
                        return mneVar;
                    }
                } catch (Exception e5) {
                    i = a;
                    e2 = e5;
                    ((jol) gsf.a.g()).z("Failed to schedule a job for package [%s] with ID: %s, type: %s", this.e.b.getApplicationContext().getPackageName(), m, new Integer(i));
                    return new gmy(e2);
                }
            } catch (Exception e6) {
                gsf gsfVar4 = this.e;
                gsfVar4.d.c(gsfVar4.b.getPackageName(), false);
                return new gmy(e6);
            }
        }
        gsf.a.k().z("Successfully scheduled a job for package [%s], with ID: %s, type: %s", this.e.b.getApplicationContext().getPackageName(), m, new Integer(i));
        return new gnc(mlh.a);
    }

    @Override // defpackage.mnj
    public final mmx c(Object obj, mmx mmxVar) {
        return new gse(this.d, this.e, this.f, this.g, this.h, mmxVar);
    }
}
