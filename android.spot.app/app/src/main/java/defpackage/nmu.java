package defpackage;

import android.os.Build;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nmu {
    public final Object a;
    final Object b;
    final Object c;
    public final /* synthetic */ Object d;

    public nmu(lbi lbiVar, lam lamVar, Set set, LatLng latLng) {
        this.d = lbiVar;
        this.b = lamVar;
        this.a = set;
        this.c = latLng;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final void a(nmy nmyVar) {
        try {
            this.b.execute(new miy((nmx) this.d, nmyVar, 9));
        } catch (RejectedExecutionException e) {
            ((nmx) this.d).b(new nma("Exception posting task to executor", e));
        }
    }

    public final void b() {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        Object obj = this.d;
        ((nmx) obj).c.execute(new nmv(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        a(new nmn(this, 5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [lam, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [lam, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17, types: [lam, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [lam, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [lam, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [lam, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.Set, java.lang.Object] */
    public final void d(lbe lbeVar) {
        lbf lbfVar;
        lbf lbfVar2;
        if (!((lbi) this.d).c(this.b)) {
            for (dhx dhxVar : this.b.c()) {
                fsa g = ((lbi) this.d).k.g(dhxVar);
                if (g == null) {
                    MarkerOptions markerOptions = new MarkerOptions();
                    Object obj = this.c;
                    if (obj != null) {
                        markerOptions.a = (LatLng) obj;
                    } else {
                        markerOptions.a = dhxVar.n();
                        dhx.o();
                        markerOptions.m = dhx.o().floatValue();
                    }
                    ((lbi) this.d).d(dhxVar, markerOptions);
                    fsa b = ((lbi) this.d).d.d.b(markerOptions);
                    lbfVar2 = new lbf(b);
                    ((lbi) this.d).k.i(dhxVar, b);
                    Object obj2 = this.c;
                    if (obj2 != null) {
                        lbeVar.a(lbfVar2, (LatLng) obj2, dhxVar.n());
                    }
                } else {
                    lbfVar2 = new lbf(g);
                    ((lbi) this.d).e(dhxVar, g);
                }
                this.a.add(lbfVar2);
            }
            return;
        }
        Object obj3 = this.d;
        fsa g2 = ((lbi) obj3).l.g(this.b);
        if (g2 == null) {
            MarkerOptions markerOptions2 = new MarkerOptions();
            Object obj4 = this.c;
            if (obj4 == null) {
                obj4 = this.b.b();
            }
            markerOptions2.a = (LatLng) obj4;
            ((lbi) this.d).a(this.b, markerOptions2);
            fsa b2 = ((lbi) this.d).d.e.b(markerOptions2);
            Object obj5 = this.d;
            ((lbi) obj5).l.i(this.b, b2);
            lbfVar = new lbf(b2);
            Object obj6 = this.c;
            if (obj6 != null) {
                lbeVar.a(lbfVar, (LatLng) obj6, this.b.b());
            }
        } else {
            lbfVar = new lbf(g2);
            ((lbi) this.d).b(this.b, g2);
        }
        this.a.add(lbfVar);
    }

    public nmu(nmx nmxVar, UrlRequest.Callback callback, Executor executor) {
        this.d = nmxVar;
        this.a = new nni(callback);
        if (nmxVar.h) {
            this.b = executor;
            this.c = null;
        } else {
            this.b = new nna(executor, 0);
            this.c = executor;
        }
    }
}
