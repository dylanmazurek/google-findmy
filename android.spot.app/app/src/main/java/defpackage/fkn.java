package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ConnectionInfo;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class fkn {
    private static final Feature[] s = new Feature[0];
    fkz a;
    public final Context b;
    final Handler c;
    protected fki f;
    public final int i;
    public volatile String j;
    public flg o;
    public volatile bym p;
    public final njz q;
    public final njz r;
    private final fkw u;
    private IInterface v;
    private fkj w;
    private final String x;
    private volatile String t = null;
    public final Object d = new Object();
    public final Object e = new Object();
    public final ArrayList g = new ArrayList();
    public int h = 1;
    public ConnectionResult k = null;
    public boolean l = false;
    public volatile ConnectionInfo m = null;
    protected final AtomicInteger n = new AtomicInteger(0);

    /* JADX INFO: Access modifiers changed from: protected */
    public fkn(Context context, Looper looper, fkw fkwVar, fgq fgqVar, int i, njz njzVar, njz njzVar2, String str) {
        fma.aS(context, "Context must not be null");
        this.b = context;
        fma.aS(looper, "Looper must not be null");
        fma.aS(fkwVar, "Supervisor must not be null");
        this.u = fkwVar;
        fma.aS(fgqVar, "API availability must not be null");
        this.c = new fkg(this, looper);
        this.i = i;
        this.r = njzVar;
        this.q = njzVar2;
        this.x = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(int i, IInterface iInterface) {
        boolean z;
        boolean z2;
        fkz fkzVar;
        boolean z3 = false;
        if (i != 4) {
            z = false;
        } else {
            z = true;
        }
        if (iInterface == null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z == z2) {
            z3 = true;
        }
        fma.aF(z3);
        synchronized (this.d) {
            this.h = i;
            this.v = iInterface;
            if (i != 1) {
                if (i != 2 && i != 3) {
                    if (i == 4) {
                        fma.aR(iInterface);
                        System.currentTimeMillis();
                    }
                } else {
                    fkj fkjVar = this.w;
                    if (fkjVar != null && (fkzVar = this.a) != null) {
                        Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + ((String) fkzVar.c) + " on " + ((String) fkzVar.d));
                        fkw fkwVar = this.u;
                        fkz fkzVar2 = this.a;
                        Object obj = fkzVar2.c;
                        Object obj2 = fkzVar2.d;
                        int i2 = fkzVar2.a;
                        w();
                        fkwVar.e((String) obj, fkjVar, this.a.b);
                        this.n.incrementAndGet();
                    }
                    fkj fkjVar2 = new fkj(this, this.n.get());
                    this.w = fkjVar2;
                    fkz fkzVar3 = new fkz(d(), g());
                    this.a = fkzVar3;
                    if (fkzVar3.b && a() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat((String) fkzVar3.c));
                    }
                    fkw fkwVar2 = this.u;
                    Object obj3 = fkzVar3.c;
                    Object obj4 = fkzVar3.d;
                    int i3 = fkzVar3.a;
                    String w = w();
                    boolean z4 = this.a.b;
                    F();
                    if (!fkwVar2.b(new fkv((String) obj3, z4), fkjVar2, w)) {
                        fkz fkzVar4 = this.a;
                        Log.w("GmsClient", "unable to connect to service: " + ((String) fkzVar4.c) + " on " + ((String) fkzVar4.d));
                        G(16, this.n.get());
                    }
                }
            } else {
                fkj fkjVar3 = this.w;
                if (fkjVar3 != null) {
                    fkw fkwVar3 = this.u;
                    fkz fkzVar5 = this.a;
                    Object obj5 = fkzVar5.c;
                    Object obj6 = fkzVar5.d;
                    int i4 = fkzVar5.a;
                    w();
                    fkwVar3.e((String) obj5, fkjVar3, this.a.b);
                    this.w = null;
                }
            }
        }
    }

    public final boolean A(int i, int i2, IInterface iInterface) {
        synchronized (this.d) {
            if (this.h != i) {
                return false;
            }
            M(i2, iInterface);
            return true;
        }
    }

    public final boolean B() {
        if (this.m != null) {
            return true;
        }
        return false;
    }

    public boolean C() {
        return false;
    }

    public Feature[] D() {
        throw null;
    }

    protected void F() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void G(int i, int i2) {
        this.c.sendMessage(this.c.obtainMessage(7, i2, -1, new fkm(this, i)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void H() {
        System.currentTimeMillis();
    }

    public int a() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract IInterface b(IBinder iBinder);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract String c();

    protected abstract String d();

    public boolean e() {
        return false;
    }

    public void f(String str) {
        this.t = str;
        y();
    }

    protected boolean g() {
        if (a() >= 211700000) {
            return true;
        }
        return false;
    }

    public Feature[] h() {
        return s;
    }

    public final String i() {
        fkz fkzVar;
        if (m() && (fkzVar = this.a) != null) {
            return (String) fkzVar.d;
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    public final String j() {
        return this.t;
    }

    public final void l(fki fkiVar) {
        this.f = fkiVar;
        M(2, null);
    }

    public final boolean m() {
        boolean z;
        synchronized (this.d) {
            if (this.h == 4) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public final boolean n() {
        boolean z;
        synchronized (this.d) {
            int i = this.h;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    public boolean o() {
        return true;
    }

    public boolean p() {
        return false;
    }

    public final Feature[] q() {
        ConnectionInfo connectionInfo = this.m;
        if (connectionInfo == null) {
            return null;
        }
        return connectionInfo.b;
    }

    public final void r(fla flaVar, Set set) {
        Object obj;
        String attributionTag;
        String attributionTag2;
        Bundle u = u();
        if (Build.VERSION.SDK_INT < 31) {
            attributionTag2 = this.j;
        } else if (this.p == null || (obj = this.p.a) == null) {
            attributionTag2 = this.j;
        } else {
            attributionTag = api$$ExternalSyntheticApiModelOutline0.m(obj).getAttributionTag();
            if (attributionTag != null) {
                attributionTag2 = api$$ExternalSyntheticApiModelOutline0.m(obj).getAttributionTag();
            } else {
                attributionTag2 = this.j;
            }
        }
        String str = attributionTag2;
        int i = this.i;
        int i2 = fgq.c;
        Scope[] scopeArr = GetServiceRequest.a;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.b;
        GetServiceRequest getServiceRequest = new GetServiceRequest(6, i, i2, null, null, scopeArr, bundle, null, featureArr, featureArr, true, 0, false, str);
        getServiceRequest.f = this.b.getPackageName();
        getServiceRequest.i = u;
        if (set != null) {
            getServiceRequest.h = (Scope[]) set.toArray(new Scope[0]);
        }
        if (p()) {
            Account t = t();
            if (t == null) {
                t = new Account("<<default account>>", "com.google");
            }
            getServiceRequest.j = t;
            if (flaVar != null) {
                getServiceRequest.g = flaVar.a;
            }
        } else if (C()) {
            getServiceRequest.j = t();
        }
        getServiceRequest.k = D();
        getServiceRequest.l = h();
        if (e()) {
            getServiceRequest.o = true;
        }
        try {
            synchronized (this.e) {
                flg flgVar = this.o;
                if (flgVar != null) {
                    flf flfVar = new flf(this, this.n.get());
                    Parcel obtain = Parcel.obtain();
                    Parcel obtain2 = Parcel.obtain();
                    try {
                        obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                        obtain.writeStrongBinder(flfVar);
                        obtain.writeInt(1);
                        fgz.a(getServiceRequest, obtain, 0);
                        flgVar.a.transact(46, obtain, obtain2, 0);
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                    } catch (Throwable th) {
                        obtain2.recycle();
                        obtain.recycle();
                        throw th;
                    }
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            Handler handler = this.c;
            handler.sendMessage(handler.obtainMessage(6, this.n.get(), 3));
        } catch (RemoteException e2) {
            e = e2;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            z(8, null, null, this.n.get());
        } catch (SecurityException e3) {
            throw e3;
        } catch (RuntimeException e4) {
            e = e4;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            z(8, null, null, this.n.get());
        }
    }

    public final void s(njz njzVar) {
        ((fjb) njzVar.a).k.n.post(new eta(njzVar, 14, null));
    }

    public Account t() {
        throw null;
    }

    protected Bundle u() {
        return new Bundle();
    }

    public final IInterface v() {
        IInterface iInterface;
        synchronized (this.d) {
            if (this.h != 5) {
                x();
                iInterface = this.v;
                fma.aS(iInterface, "Client is connected but service is null");
            } else {
                throw new DeadObjectException();
            }
        }
        return iInterface;
    }

    protected final String w() {
        String str = this.x;
        if (str == null) {
            return this.b.getClass().getName();
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void x() {
        if (m()) {
        } else {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public void y() {
        this.n.incrementAndGet();
        synchronized (this.g) {
            int size = this.g.size();
            for (int i = 0; i < size; i++) {
                ((fkh) this.g.get(i)).e();
            }
            this.g.clear();
        }
        synchronized (this.e) {
            this.o = null;
        }
        M(1, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void z(int i, IBinder iBinder, Bundle bundle, int i2) {
        this.c.sendMessage(this.c.obtainMessage(1, i2, -1, new fkl(this, i, iBinder, bundle)));
    }
}
