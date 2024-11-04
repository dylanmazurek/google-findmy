package defpackage;

import android.app.Application;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.adm.R;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import j$.util.Collection;
import j$.util.DesugarArrays;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eur extends eut implements frg {
    public static final jnk a = jnk.l("com/google/android/apps/adm/map/DeviceMapFragment");
    public lao af;
    int ah;
    int ai;
    int aj;
    public boolean ak;
    public eey am;
    public hpd an;
    public bym ao;
    public bso ap;
    public dhx aq;
    public gok ar;
    public elo as;
    public dyr b;
    public jer c;
    public euu d;
    public frk e;
    public int ag = 0;
    public boolean al = false;

    @Override // defpackage.ag
    public final View J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_device_map, viewGroup, false);
    }

    public final void a() {
        int dimensionPixelSize = z().getDimensionPixelSize(R.dimen.map_controls_extra_padding);
        frk frkVar = this.e;
        if (frkVar != null) {
            int i = this.aj + dimensionPixelSize;
            int i2 = this.ah + this.ag;
            int i3 = this.ai;
            try {
                Object obj = frkVar.a;
                Parcel a2 = ((duf) obj).a();
                a2.writeInt(i);
                a2.writeInt(i2);
                a2.writeInt(dimensionPixelSize);
                a2.writeInt(i3);
                ((duf) obj).c(39, a2);
            } catch (RemoteException e) {
                throw new fsc(e);
            }
        }
    }

    public final void aF(jjr jjrVar) {
        euu euuVar = this.d;
        euuVar.d.execute(new cui(euuVar, jjrVar, 20, (byte[]) null));
        jmw listIterator = jjrVar.listIterator();
        while (listIterator.hasNext()) {
            dya dyaVar = (dya) listIterator.next();
            if (dyaVar.a.a().equals(dxx.URL)) {
                dyaVar.a.e();
                final int bM = fma.bM(euuVar.a.getResources().getDisplayMetrics(), DesugarArrays.stream(euz.values()).mapToInt(new euy(0)).max().orElse(0));
                fma fmaVar = euuVar.e;
                final Application application = euuVar.a;
                final diz[] dizVarArr = {new dot()};
                ivc.N(bei.d(new bmh() { // from class: ezp
                    @Override // defpackage.bmh
                    public final Object a(bmf bmfVar) {
                        ((dhb) ((dhb) dgo.c(application).b().e(null).q(bM, bM)).u(dizVarArr[0])).i(new ezq(bmfVar));
                        return "GlideImageFetcher.load";
                    }
                }), new ems(2), euuVar.d);
            }
        }
        Collection.EL.stream(jjrVar).filter(new eju(12)).findAny().ifPresent(new ebd(this, 9));
    }

    public final boolean aG() {
        if (this.e != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [lqz, java.lang.Object] */
    public final void aH() {
        eey eeyVar = this.am;
        if (eeyVar != null) {
            ((ebf) eeyVar.b.a()).p(3);
        }
    }

    @Override // defpackage.ag
    public final void ad() {
        boolean z;
        dyr dyrVar = this.b;
        boolean z2 = true;
        if (dyrVar.c != null) {
            z = true;
        } else {
            z = false;
        }
        hwx.V(z, "ui not attached");
        if (dyrVar.c != this) {
            z2 = false;
        }
        hwx.K(z2, "detaching wrong UI");
        this.am = null;
        dyrVar.c = null;
        super.ad();
    }

    @Override // defpackage.ag
    public final void af() {
        boolean z;
        super.af();
        dyr dyrVar = this.b;
        if (dyrVar.c == null) {
            z = true;
        } else {
            z = false;
        }
        hwx.V(z, "ui already attached");
        dyrVar.c = this;
        this.am = dyrVar.d;
        if (dyrVar.a && dyrVar.i()) {
            dyrVar.e();
        }
    }

    @Override // defpackage.ag
    public final void ag(View view, Bundle bundle) {
        frp frpVar = new frp();
        f fVar = new f(G());
        fVar.w(R.id.support_map_fragment, frpVar);
        fVar.b();
        fma.aJ("getMapAsync must be called on the main thread.");
        fmk fmkVar = frpVar.a;
        gok gokVar = fmkVar.d;
        if (gokVar != null) {
            gokVar.m(this);
        } else {
            fmkVar.c.add(this);
        }
        ((cfk) this.an.k).g(O(), new euc(this, 8));
        ((cfk) this.an.g).g(O(), new euc(this, 9));
        ((cfk) this.an.j).g(O(), new euc(this, 10));
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.Map, java.lang.Object] */
    public final void d() {
        frk frkVar = this.e;
        if (frkVar != null) {
            try {
                Object obj = frkVar.a;
                ((duf) obj).c(14, ((duf) obj).a());
            } catch (RemoteException e) {
                throw new fsc(e);
            }
        }
        lao laoVar = this.af;
        if (laoVar != null) {
            lav lavVar = laoVar.b;
            lavVar.a();
            try {
                laq laqVar = lavVar.a;
                laq laqVar2 = ((lau) laqVar).a;
                synchronized (((las) laqVar2).c) {
                    ((las) laqVar2).b.clear();
                    lbp lbpVar = ((las) laqVar2).c;
                    lbpVar.c = null;
                    Set set = lbpVar.b;
                    if (set != null) {
                        set.clear();
                    }
                }
                ((lau) laqVar).d();
            } finally {
                lavVar.b();
            }
        }
        bso bsoVar = this.ap;
        if (bsoVar != null) {
            Collection.EL.forEach(bsoVar.a.values(), new emj(2));
            bsoVar.a.clear();
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [mys, java.lang.Object] */
    public final void e(double d, double d2, float f, boolean z) {
        fmn fmlVar;
        if (this.e != null) {
            if (this.ak && !z) {
                CameraPosition cameraPosition = (CameraPosition) this.an.e.c();
                LatLng latLng = cameraPosition.a;
                if (latLng.a == d && latLng.b == d2 && cameraPosition.b == f) {
                    return;
                }
            }
            LatLng latLng2 = new LatLng(d, d2);
            try {
                frq frqVar = frx.c;
                fma.aS(frqVar, "CameraUpdateFactory is not initialized");
                Parcel a2 = frqVar.a();
                duh.c(a2, latLng2);
                a2.writeFloat(f);
                Parcel b = frqVar.b(9, a2);
                IBinder readStrongBinder = b.readStrongBinder();
                if (readStrongBinder == null) {
                    fmlVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface instanceof fmn) {
                        fmlVar = (fmn) queryLocalInterface;
                    } else {
                        fmlVar = new fml(readStrongBinder);
                    }
                }
                b.recycle();
                fma.aR(fmlVar);
                if (z) {
                    try {
                        Object obj = this.e.a;
                        Parcel a3 = ((duf) obj).a();
                        duh.d(a3, fmlVar);
                        ((duf) obj).c(4, a3);
                        return;
                    } catch (RemoteException e) {
                        throw new fsc(e);
                    }
                }
                try {
                    Object obj2 = this.e.a;
                    fwo fwoVar = new fwo(this, 1);
                    Parcel a4 = ((duf) obj2).a();
                    duh.d(a4, fmlVar);
                    a4.writeInt(1000);
                    duh.d(a4, fwoVar);
                    ((duf) obj2).c(7, a4);
                    this.ak = true;
                } catch (RemoteException e2) {
                    throw new fsc(e2);
                }
            } catch (RemoteException e3) {
                throw new fsc(e3);
            }
        }
    }

    @Override // defpackage.ag
    public final void g(Bundle bundle) {
        super.g(bundle);
        this.d = (euu) new ddh((cgq) this).q(euu.class);
    }

    @Override // defpackage.frg
    public final void o() {
        lao laoVar = this.af;
        laoVar.getClass();
        laoVar.o();
        frk frkVar = this.e;
        frkVar.getClass();
        if (this.al) {
            this.an.g(frkVar.a());
            this.al = false;
        }
    }

    public final void p(CameraPosition cameraPosition) {
        if (aG() && cameraPosition != null) {
            LatLng latLng = cameraPosition.a;
            e(latLng.a, latLng.b, cameraPosition.b, false);
        }
    }

    /* JADX WARN: Type inference failed for: r8v3, types: [mys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v8, types: [mys, java.lang.Object] */
    public final void q(ewi ewiVar) {
        CameraPosition cameraPosition;
        this.ah = ewiVar.a;
        this.ai = ewiVar.b;
        this.aj = ewiVar.c;
        int i = ewiVar.d;
        a();
        if (((Boolean) this.an.b.c()).booleanValue() && (cameraPosition = (CameraPosition) this.an.e.c()) != null) {
            float f = cameraPosition.b;
            LatLng latLng = cameraPosition.a;
            e(latLng.a, latLng.b, f, true);
        }
    }
}
