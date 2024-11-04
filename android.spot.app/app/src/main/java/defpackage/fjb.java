package defpackage;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fjb implements fhr, fhs {
    public final fhm b;
    public final fik c;
    public final int f;
    public boolean g;
    public final /* synthetic */ fje k;
    public final gok l;
    private final fjv m;
    public final Queue a = new LinkedList();
    public final Set d = new HashSet();
    public final Map e = new HashMap();
    public final List h = new ArrayList();
    public ConnectionResult i = null;
    public int j = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public fjb(fje fjeVar, fhq fhqVar) {
        this.k = fjeVar;
        Looper looper = fjeVar.n.getLooper();
        fkp a = fhqVar.e().a();
        fhm a2 = ((fma) fhqVar.j.a).a(fhqVar.b, looper, a, fhqVar.d, this, this);
        bym bymVar = fhqVar.k;
        if (bymVar != null) {
            ((fkn) a2).p = bymVar;
        } else {
            String str = fhqVar.c;
            if (str != null) {
                ((fkn) a2).j = str;
            }
        }
        this.b = a2;
        this.c = fhqVar.e;
        this.l = new gok((byte[]) null);
        this.f = fhqVar.g;
        if (a2.p()) {
            this.m = new fjv(fjeVar.g, fjeVar.n, fhqVar.e().a());
        } else {
            this.m = null;
        }
    }

    private final Feature q(Feature[] featureArr) {
        if (featureArr != null && featureArr.length != 0) {
            Feature[] q = this.b.q();
            if (q == null) {
                q = new Feature[0];
            }
            rx rxVar = new rx(q.length);
            for (Feature feature : q) {
                rxVar.put(feature.a, Long.valueOf(feature.a()));
            }
            int length = featureArr.length;
            for (int i = 0; i < length; i = 1) {
                Feature feature2 = featureArr[0];
                Long l = (Long) rxVar.get(feature2.a);
                if (l == null || l.longValue() < feature2.a()) {
                    return feature2;
                }
            }
        }
        return null;
    }

    private final Status r(ConnectionResult connectionResult) {
        return fje.a(this.c, connectionResult);
    }

    private final void s(ConnectionResult connectionResult) {
        String str;
        for (fil filVar : this.d) {
            if (amr.g(connectionResult, ConnectionResult.a)) {
                str = this.b.i();
            } else {
                str = null;
            }
            filVar.a(this.c, connectionResult, str);
        }
        this.d.clear();
    }

    private final void t(Status status, Exception exc, boolean z) {
        boolean z2;
        fma.aI(this.k.n);
        boolean z3 = false;
        if (status != null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (exc == null) {
            z3 = true;
        }
        if (z2 != z3) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                fij fijVar = (fij) it.next();
                if (!z || fijVar.c == 2) {
                    if (status != null) {
                        fijVar.d(status);
                    } else {
                        fijVar.e(exc);
                    }
                    it.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }

    private final void u(fij fijVar) {
        fijVar.g(this.l, p());
        try {
            fijVar.f(this);
        } catch (DeadObjectException unused) {
            a(1);
            this.b.f("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    private final boolean v(fij fijVar) {
        if (!(fijVar instanceof fid)) {
            u(fijVar);
            return true;
        }
        fid fidVar = (fid) fijVar;
        Feature q = q(fidVar.b(this));
        if (q == null) {
            u(fijVar);
            return true;
        }
        Log.w("GoogleApiManager", this.b.getClass().getName() + " could not execute call because it requires feature (" + q.a + ", " + q.a() + ").");
        if (this.k.o && fidVar.a(this)) {
            fjc fjcVar = new fjc(this.c, q);
            int indexOf = this.h.indexOf(fjcVar);
            if (indexOf >= 0) {
                fjc fjcVar2 = (fjc) this.h.get(indexOf);
                this.k.n.removeMessages(15, fjcVar2);
                Handler handler = this.k.n;
                handler.sendMessageDelayed(Message.obtain(handler, 15, fjcVar2), 5000L);
                return false;
            }
            this.h.add(fjcVar);
            Handler handler2 = this.k.n;
            handler2.sendMessageDelayed(Message.obtain(handler2, 15, fjcVar), 5000L);
            Handler handler3 = this.k.n;
            handler3.sendMessageDelayed(Message.obtain(handler3, 16, fjcVar), 120000L);
            ConnectionResult connectionResult = new ConnectionResult(2, null);
            if (!w(connectionResult)) {
                this.k.h(connectionResult, this.f);
                return false;
            }
            return false;
        }
        fidVar.e(new fic(q));
        return true;
    }

    private final boolean w(ConnectionResult connectionResult) {
        synchronized (fje.c) {
            fje fjeVar = this.k;
            if (fjeVar.l == null || !fjeVar.m.contains(this.c)) {
                return false;
            }
            fix fixVar = this.k.l;
            kvw kvwVar = new kvw(connectionResult, this.f);
            if (a.q(fixVar.b, kvwVar)) {
                fixVar.c.post(new fiq(fixVar, kvwVar, 0));
            }
            return true;
        }
    }

    @Override // defpackage.fiv
    public final void a(int i) {
        if (Looper.myLooper() == this.k.n.getLooper()) {
            k(i);
            return;
        }
        fje fjeVar = this.k;
        fjeVar.n.post(new bth(this, i, 2, null));
    }

    @Override // defpackage.fiv
    public final void b() {
        if (Looper.myLooper() == this.k.n.getLooper()) {
            h();
            return;
        }
        fje fjeVar = this.k;
        fjeVar.n.post(new eta(this, 13, null));
    }

    public final void c() {
        fma.aI(this.k.n);
        this.i = null;
    }

    public final void d() {
        fma.aI(this.k.n);
        if (!this.b.m() && !this.b.n()) {
            try {
                fje fjeVar = this.k;
                frk frkVar = fjeVar.p;
                Context context = fjeVar.g;
                fhm fhmVar = this.b;
                fma.aR(context);
                fma.aR(fhmVar);
                int i = 0;
                if (fhmVar.o()) {
                    int a = fhmVar.a();
                    int f = frkVar.f(a);
                    if (f == -1) {
                        synchronized (frkVar.a) {
                            int i2 = 0;
                            while (true) {
                                if (i2 < ((SparseIntArray) frkVar.a).size()) {
                                    int keyAt = ((SparseIntArray) frkVar.a).keyAt(i2);
                                    if (keyAt > a && ((SparseIntArray) frkVar.a).get(keyAt) == 0) {
                                        break;
                                    } else {
                                        i2++;
                                    }
                                } else {
                                    i = -1;
                                    break;
                                }
                            }
                            if (i == -1) {
                                i = ((fgq) frkVar.b).g(context, a);
                            }
                            ((SparseIntArray) frkVar.a).put(a, i);
                        }
                    } else {
                        i = f;
                    }
                }
                if (i != 0) {
                    ConnectionResult connectionResult = new ConnectionResult(i, null);
                    Log.w("GoogleApiManager", "The service for " + this.b.getClass().getName() + " is not available: " + connectionResult.toString());
                    i(connectionResult);
                    return;
                }
                fje fjeVar2 = this.k;
                fhm fhmVar2 = this.b;
                fjd fjdVar = new fjd(fjeVar2, fhmVar2, this.c);
                if (fhmVar2.p()) {
                    fjv fjvVar = this.m;
                    fma.aR(fjvVar);
                    fxe fxeVar = fjvVar.e;
                    if (fxeVar != null) {
                        fxeVar.y();
                    }
                    fjvVar.d.g = Integer.valueOf(System.identityHashCode(fjvVar));
                    fma fmaVar = fjvVar.g;
                    Context context2 = fjvVar.a;
                    Handler handler = fjvVar.b;
                    fkp fkpVar = fjvVar.d;
                    fjvVar.e = (fxe) fmaVar.a(context2, handler.getLooper(), fkpVar, fkpVar.f, fjvVar, fjvVar);
                    fjvVar.f = fjdVar;
                    Set set = fjvVar.c;
                    if (set != null && !set.isEmpty()) {
                        fxe fxeVar2 = fjvVar.e;
                        fxeVar2.l(new fkk(fxeVar2));
                    } else {
                        fjvVar.b.post(new eta(fjvVar, 15, null));
                    }
                }
                try {
                    this.b.l(fjdVar);
                } catch (SecurityException e) {
                    j(new ConnectionResult(10), e);
                }
            } catch (IllegalStateException e2) {
                j(new ConnectionResult(10), e2);
            }
        }
    }

    public final void e(fij fijVar) {
        fma.aI(this.k.n);
        if (this.b.m()) {
            if (v(fijVar)) {
                m();
                return;
            } else {
                this.a.add(fijVar);
                return;
            }
        }
        this.a.add(fijVar);
        ConnectionResult connectionResult = this.i;
        if (connectionResult != null && connectionResult.a()) {
            i(connectionResult);
        } else {
            d();
        }
    }

    public final void f(Status status) {
        fma.aI(this.k.n);
        t(status, null, false);
    }

    public final void g() {
        ArrayList arrayList = new ArrayList(this.a);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            fij fijVar = (fij) arrayList.get(i);
            if (this.b.m()) {
                if (v(fijVar)) {
                    this.a.remove(fijVar);
                }
            } else {
                return;
            }
        }
    }

    public final void h() {
        c();
        s(ConnectionResult.a);
        o();
        Iterator it = this.e.values().iterator();
        while (it.hasNext()) {
            apc apcVar = (apc) it.next();
            if (q(((fjs) apcVar.c).b) != null) {
                it.remove();
            } else {
                try {
                    ((fjs) apcVar.c).b(this.b, new bym((int[]) null));
                } catch (DeadObjectException unused) {
                    a(3);
                    this.b.f("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException e) {
                    e = e;
                    Log.e("GoogleApiManager", "Failed to register listener on re-connection.", e);
                    it.remove();
                } catch (RuntimeException e2) {
                    e = e2;
                    Log.e("GoogleApiManager", "Failed to register listener on re-connection.", e);
                    it.remove();
                }
            }
        }
        g();
        m();
    }

    @Override // defpackage.fjr
    public final void i(ConnectionResult connectionResult) {
        j(connectionResult, null);
    }

    public final void j(ConnectionResult connectionResult, Exception exc) {
        fxe fxeVar;
        fma.aI(this.k.n);
        fjv fjvVar = this.m;
        if (fjvVar != null && (fxeVar = fjvVar.e) != null) {
            fxeVar.y();
        }
        c();
        this.k.p.e();
        s(connectionResult);
        if ((this.b instanceof flq) && connectionResult.c != 24) {
            fje fjeVar = this.k;
            fjeVar.f = true;
            Handler handler = fjeVar.n;
            handler.sendMessageDelayed(handler.obtainMessage(19), 300000L);
        }
        if (connectionResult.c == 4) {
            f(fje.b);
            return;
        }
        if (this.a.isEmpty()) {
            this.i = connectionResult;
            return;
        }
        if (exc != null) {
            fma.aI(this.k.n);
            t(null, exc, false);
            return;
        }
        if (!this.k.o) {
            f(r(connectionResult));
            return;
        }
        t(r(connectionResult), null, true);
        if (!this.a.isEmpty() && !w(connectionResult) && !this.k.h(connectionResult, this.f)) {
            if (connectionResult.c == 18) {
                this.g = true;
            }
            if (this.g) {
                fje fjeVar2 = this.k;
                fik fikVar = this.c;
                Handler handler2 = fjeVar2.n;
                handler2.sendMessageDelayed(Message.obtain(handler2, 9, fikVar), 5000L);
                return;
            }
            f(r(connectionResult));
        }
    }

    public final void k(int i) {
        c();
        this.g = true;
        String j = this.b.j();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (j != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(j);
        }
        this.l.r(true, new Status(20, sb.toString()));
        fje fjeVar = this.k;
        fik fikVar = this.c;
        Handler handler = fjeVar.n;
        handler.sendMessageDelayed(Message.obtain(handler, 9, fikVar), 5000L);
        fje fjeVar2 = this.k;
        fik fikVar2 = this.c;
        Handler handler2 = fjeVar2.n;
        handler2.sendMessageDelayed(Message.obtain(handler2, 11, fikVar2), 120000L);
        this.k.p.e();
        Iterator it = this.e.values().iterator();
        while (it.hasNext()) {
            Object obj = ((apc) it.next()).a;
        }
    }

    public final void l(ConnectionResult connectionResult) {
        fma.aI(this.k.n);
        fhm fhmVar = this.b;
        fhmVar.f("onSignInFailed for " + fhmVar.getClass().getName() + " with " + String.valueOf(connectionResult));
        i(connectionResult);
    }

    public final void m() {
        this.k.n.removeMessages(12, this.c);
        fje fjeVar = this.k;
        Handler handler = fjeVar.n;
        handler.sendMessageDelayed(handler.obtainMessage(12, this.c), fjeVar.e);
    }

    public final void n() {
        fma.aI(this.k.n);
        f(fje.a);
        this.l.r(false, fje.a);
        for (fjm fjmVar : (fjm[]) this.e.keySet().toArray(new fjm[0])) {
            e(new fii(fjmVar, new bym((int[]) null)));
        }
        s(new ConnectionResult(4));
        if (this.b.m()) {
            this.b.s(new njz(this, null));
        }
    }

    public final void o() {
        if (this.g) {
            fje fjeVar = this.k;
            fjeVar.n.removeMessages(11, this.c);
            fje fjeVar2 = this.k;
            fjeVar2.n.removeMessages(9, this.c);
            this.g = false;
        }
    }

    public final boolean p() {
        return this.b.p();
    }
}
