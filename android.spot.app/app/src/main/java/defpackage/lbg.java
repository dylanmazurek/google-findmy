package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.VisibleRegion;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lbg implements Runnable {
    final Set a;
    public Runnable b;
    public lbo c;
    public float d;
    final /* synthetic */ lbi e;
    public bym f;

    public lbg(lbi lbiVar, Set set) {
        this.e = lbiVar;
        this.a = set;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LatLngBounds latLngBounds;
        ArrayList arrayList;
        if (!lbi.p(this.a).equals(lbi.p(this.e.i))) {
            lbe lbeVar = new lbe(this.e);
            float f = this.d;
            lbi lbiVar = this.e;
            float f2 = lbiVar.j;
            float f3 = f - f2;
            Set<lbf> set = lbiVar.h;
            try {
                try {
                    Object obj = this.f.a;
                    Parcel b = ((duf) obj).b(3, ((duf) obj).a());
                    VisibleRegion visibleRegion = (VisibleRegion) duh.a(b, VisibleRegion.CREATOR);
                    b.recycle();
                    latLngBounds = visibleRegion.e;
                } catch (RemoteException e) {
                    throw new fsc(e);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                LatLng latLng = new LatLng(0.0d, 0.0d);
                double d = latLng.a;
                double d2 = latLng.b;
                double min = Math.min(Double.POSITIVE_INFINITY, d);
                double max = Math.max(Double.NEGATIVE_INFINITY, d);
                double d3 = Double.NaN;
                if (Double.isNaN(Double.NaN)) {
                    d3 = d2;
                } else if (d2 < Double.NaN && d2 > Double.NaN) {
                    if (((Double.NaN - d2) + 360.0d) % 360.0d >= ((d2 + Double.NaN) + 360.0d) % 360.0d) {
                        d2 = Double.NaN;
                        d3 = d2;
                    }
                } else {
                    d2 = Double.NaN;
                }
                fma.aO(!Double.isNaN(d2), "no included points");
                latLngBounds = new LatLngBounds(new LatLng(min, d2), new LatLng(max, d3));
            }
            lbi lbiVar2 = this.e;
            ArrayList arrayList2 = null;
            if (lbiVar2.i != null && lbiVar2.e) {
                arrayList = new ArrayList();
                for (lam lamVar : this.e.i) {
                    if (this.e.c(lamVar) && latLngBounds.a(lamVar.b())) {
                        arrayList.add(this.c.b(lamVar.b()));
                    }
                }
            } else {
                arrayList = null;
            }
            Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
            for (lam lamVar2 : this.a) {
                boolean a = latLngBounds.a(lamVar2.b());
                if (f > f2 && a && this.e.e) {
                    lbm o = this.e.o(arrayList, this.c.b(lamVar2.b()));
                    if (o != null) {
                        lbeVar.e(true, new nmu(this.e, lamVar2, newSetFromMap, this.c.a(o)));
                    } else {
                        lbeVar.e(true, new nmu(this.e, lamVar2, newSetFromMap, null));
                    }
                } else {
                    lbeVar.e(a, new nmu(this.e, lamVar2, newSetFromMap, null));
                }
            }
            lbeVar.c();
            set.removeAll(newSetFromMap);
            if (this.e.e) {
                arrayList2 = new ArrayList();
                for (lam lamVar3 : this.a) {
                    if (this.e.c(lamVar3) && latLngBounds.a(lamVar3.b())) {
                        arrayList2.add(this.c.b(lamVar3.b()));
                    }
                }
            }
            for (lbf lbfVar : set) {
                boolean a2 = latLngBounds.a(lbfVar.b);
                if (f <= f2 && f3 > -3.0f && a2 && this.e.e) {
                    lbm o2 = this.e.o(arrayList2, this.c.b(lbfVar.b));
                    if (o2 != null) {
                        LatLng a3 = this.c.a(o2);
                        LatLng latLng2 = lbfVar.b;
                        lbeVar.a.lock();
                        lbd lbdVar = new lbd(lbeVar.c, lbfVar, latLng2, a3);
                        lbdVar.c = lbeVar.c.d.c;
                        lbdVar.a = true;
                        lbeVar.b.add(lbdVar);
                        lbeVar.a.unlock();
                    } else {
                        lbeVar.b(true, lbfVar.a);
                    }
                } else {
                    lbeVar.b(a2, lbfVar.a);
                }
            }
            lbeVar.c();
            lbi lbiVar3 = this.e;
            lbiVar3.h = newSetFromMap;
            lbiVar3.i = this.a;
            lbiVar3.j = f;
            this.b.run();
            return;
        }
        this.b.run();
    }
}
