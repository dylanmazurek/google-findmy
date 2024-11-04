package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bdv extends mnp implements mol {
    int a;
    final /* synthetic */ mpn b;
    final /* synthetic */ afn c;
    final /* synthetic */ cfc d;
    final /* synthetic */ bdw e;
    final /* synthetic */ View f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bdv(mpn mpnVar, afn afnVar, cfc cfcVar, bdw bdwVar, View view, mmx mmxVar) {
        super(2, mmxVar);
        this.b = mpnVar;
        this.c = afnVar;
        this.d = cfcVar;
        this.e = bdwVar;
        this.f = view;
    }

    @Override // defpackage.mol
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bdv) c((msw) obj, (mmx) obj2)).b(mlh.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [muf] */
    /* JADX WARN: Type inference failed for: r2v6 */
    @Override // defpackage.mnj
    public final Object b(Object obj) {
        muf mufVar;
        mys mysVar;
        Object obj2 = mne.a;
        ?? r2 = this.a;
        try {
            if (r2 != 0) {
                mufVar = (muf) this.g;
                mjo.o(obj);
            } else {
                mjo.o(obj);
                msw mswVar = (msw) this.g;
                try {
                    bcv bcvVar = (bcv) this.b.a;
                    if (bcvVar != null) {
                        Context applicationContext = this.f.getContext().getApplicationContext();
                        synchronized (bdz.a) {
                            Map map = bdz.a;
                            Object obj3 = map.get(applicationContext);
                            if (obj3 == null) {
                                ContentResolver contentResolver = applicationContext.getContentResolver();
                                Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                                mvy at = moz.at(-1, 0, 6);
                                mwo mwoVar = new mwo(new bdx(contentResolver, uriFor, new bdy(at, bpw.f(Looper.getMainLooper())), at, applicationContext, null));
                                mva mvaVar = new mva(null);
                                mst mstVar = mtj.a;
                                naj najVar = new naj(mjo.A(mvaVar, nbc.a));
                                int i = myk.a;
                                myk mykVar = myj.a;
                                obj3 = mpd.u(mwoVar, najVar, new myr(0L, Long.MAX_VALUE), Float.valueOf(Settings.Global.getFloat(applicationContext.getContentResolver(), "animator_duration_scale", 1.0f)));
                                map.put(applicationContext, obj3);
                            }
                            mysVar = (mys) obj3;
                        }
                        bcvVar.b(((Number) mysVar.c()).floatValue());
                        mufVar = mpp.q(mswVar, null, 0, new bdu(mysVar, bcvVar, (mmx) null, 0), 3);
                    } else {
                        mufVar = null;
                    }
                    afn afnVar = this.c;
                    this.g = mufVar;
                    this.a = 1;
                    Object l = mpp.l(afnVar.b, new afj(afnVar, new afl(afnVar, null), adl.a(o()), null), this);
                    Object obj4 = mne.a;
                    if (l != obj4) {
                        l = mlh.a;
                    }
                    if (l != obj4) {
                        l = mlh.a;
                    }
                    if (l == obj2) {
                        return obj2;
                    }
                } catch (Throwable th) {
                    th = th;
                    r2 = 0;
                    if (r2 != 0) {
                        r2.s(null);
                    }
                    this.d.N().c(this.e);
                    throw th;
                }
            }
            if (mufVar != null) {
                mufVar.s(null);
            }
            this.d.N().c(this.e);
            return mlh.a;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // defpackage.mnj
    public final mmx c(Object obj, mmx mmxVar) {
        bdv bdvVar = new bdv(this.b, this.c, this.d, this.e, this.f, mmxVar);
        bdvVar.g = obj;
        return bdvVar;
    }
}
