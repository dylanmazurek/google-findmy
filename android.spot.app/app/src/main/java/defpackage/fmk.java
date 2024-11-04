package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fmk {
    public Bundle a;
    public LinkedList b;
    public final List c;
    public gok d;
    protected njz e;
    private final ag f;
    private Activity g;
    private final njz h;

    public fmk() {
        this.h = new njz(this, null);
    }

    public final void a(int i) {
        while (!this.b.isEmpty() && ((fmj) this.b.getLast()).a() >= i) {
            this.b.removeLast();
        }
    }

    public final void b(Bundle bundle, fmj fmjVar) {
        if (this.d != null) {
            fmjVar.b();
            return;
        }
        if (this.b == null) {
            this.b = new LinkedList();
        }
        this.b.add(fmjVar);
        if (bundle != null) {
            Bundle bundle2 = this.a;
            if (bundle2 == null) {
                this.a = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        this.e = this.h;
        c();
    }

    public final void c() {
        frt frtVar;
        Activity activity = this.g;
        if (activity != null && this.e != null && this.d == null) {
            try {
                frn.a(activity);
                frr a = fry.a(this.g, null);
                fmm fmmVar = new fmm(this.g);
                Parcel a2 = a.a();
                duh.d(a2, fmmVar);
                Parcel b = a.b(2, a2);
                IBinder readStrongBinder = b.readStrongBinder();
                if (readStrongBinder == null) {
                    frtVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
                    if (queryLocalInterface instanceof frt) {
                        frtVar = (frt) queryLocalInterface;
                    } else {
                        frtVar = new frt(readStrongBinder);
                    }
                }
                b.recycle();
                if (frtVar != null) {
                    njz njzVar = this.e;
                    gok gokVar = new gok(this.f, frtVar);
                    Object obj = njzVar.a;
                    ((fmk) obj).d = gokVar;
                    Iterator it = ((fmk) obj).b.iterator();
                    while (it.hasNext()) {
                        fmj fmjVar = (fmj) it.next();
                        Object obj2 = njzVar.a;
                        fmjVar.b();
                    }
                    ((fmk) njzVar.a).b.clear();
                    ((fmk) njzVar.a).a = null;
                    Iterator it2 = this.c.iterator();
                    while (it2.hasNext()) {
                        this.d.m((eur) it2.next());
                    }
                    this.c.clear();
                }
            } catch (RemoteException e) {
                throw new fsc(e);
            } catch (fhb unused) {
            }
        }
    }

    public final void d(Activity activity) {
        this.g = activity;
        c();
    }

    public fmk(ag agVar) {
        this.h = new njz(this, null);
        this.c = new ArrayList();
        this.f = agVar;
    }
}
