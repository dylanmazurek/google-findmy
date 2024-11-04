package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.IBinder;
import android.os.Process;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.nearby.uwb.internal.OnRangingInitializedParams;
import com.google.android.gms.signin.internal.SignInResponse;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fbh implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public fbh(fxv fxvVar, Callable callable, int i) {
        this.c = i;
        this.a = fxvVar;
        this.b = callable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v110, types: [fxi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [fxi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v35, types: [fdg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object, android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r0v9, types: [fxr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v102, types: [java.lang.Object, fxn] */
    /* JADX WARN: Type inference failed for: r1v106, types: [java.lang.Object, fxo] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, fxo] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, fxn] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, fxl] */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.lang.Object, fxo] */
    /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object, fxn] */
    /* JADX WARN: Type inference failed for: r1v30, types: [java.lang.Object, fxl] */
    /* JADX WARN: Type inference failed for: r1v36, types: [java.lang.Object, java.util.concurrent.Callable] */
    /* JADX WARN: Type inference failed for: r1v60, types: [java.lang.Object, fjn] */
    /* JADX WARN: Type inference failed for: r1v98, types: [java.lang.Object, fxm] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.c) {
            case 0:
                fbd fbdVar = (fbd) this.a;
                fbdVar.a.a(fbdVar);
                Iterator it = ((fbm) this.b).c.iterator();
                while (it.hasNext()) {
                    ((fbn) it.next()).a();
                }
                Object obj = this.a;
                fma.aM("deliver should be called from worker thread");
                fbd fbdVar2 = (fbd) obj;
                fma.aG(fbdVar2.b, "Measurement must be submitted");
                List<fbo> list = fbdVar2.h;
                if (!list.isEmpty()) {
                    HashSet hashSet = new HashSet();
                    for (fbo fboVar : list) {
                        Uri b = fboVar.b();
                        if (!hashSet.contains(b)) {
                            hashSet.add(b);
                            fboVar.e(fbdVar2);
                        }
                    }
                    return;
                }
                return;
            case 1:
                ((eyp) this.a).a.removeCallbacks(this.b);
                return;
            case 2:
                ((fcj) this.a).a.c(this.b);
                return;
            case 3:
                if (!((fcq) this.a).b.e()) {
                    ((fcq) this.a).b.r("Connected to service after a timeout");
                    Object obj2 = this.a;
                    Object obj3 = this.b;
                    fbm.b();
                    fcr fcrVar = ((fcq) obj2).b;
                    fcrVar.b = (fdk) obj3;
                    fcrVar.d();
                    fcj i = fcrVar.i();
                    fbm.b();
                    i.a.e();
                    return;
                }
                return;
            case 4:
                fbm.b();
                fcr fcrVar2 = ((fcq) this.b).b;
                if (fcrVar2.b != null) {
                    Object obj4 = this.a;
                    fcrVar2.b = null;
                    fcrVar2.z("Disconnected from device AnalyticsService", obj4);
                    fcrVar2.c();
                    return;
                }
                return;
            case 5:
                ?? r0 = this.a;
                Object obj5 = this.b;
                synchronized (obj5) {
                    try {
                        if (r0 == 0) {
                            ((fge) obj5).g("Null service connection");
                            return;
                        }
                        try {
                            ((fge) obj5).f = new gok((IBinder) r0);
                            ((fge) obj5).a = 2;
                            ((fge) obj5).a();
                            return;
                        } catch (RemoteException e) {
                            ((fge) obj5).g(e.getMessage());
                            return;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            case 6:
                ((fge) this.a).c(((fgg) this.b).a);
                return;
            case 7:
                fjd fjdVar = (fjd) this.b;
                fjb fjbVar = (fjb) fjdVar.e.k.get(fjdVar.b);
                if (fjbVar == null) {
                    return;
                }
                ConnectionResult connectionResult = (ConnectionResult) this.a;
                if (connectionResult.b()) {
                    fjd fjdVar2 = (fjd) this.b;
                    fjdVar2.d = true;
                    if (fjdVar2.a.p()) {
                        ((fjd) this.b).c();
                        return;
                    }
                    try {
                        fhm fhmVar = ((fjd) this.b).a;
                        fhmVar.r(null, fhmVar.k());
                        return;
                    } catch (SecurityException e2) {
                        Log.e("GoogleApiManager", "Failed to get service from broker. ", e2);
                        ((fjd) this.b).a.f("Failed to get service from broker.");
                        fjbVar.i(new ConnectionResult(10));
                        return;
                    }
                }
                fjbVar.i(connectionResult);
                return;
            case 8:
                Object obj6 = ((fjo) this.b).a;
                ?? r1 = this.a;
                if (obj6 == null) {
                    r1.b();
                    return;
                }
                try {
                    r1.a(obj6);
                    return;
                } catch (RuntimeException e3) {
                    r1.b();
                    throw e3;
                }
            case 9:
                SignInResponse signInResponse = (SignInResponse) this.b;
                ConnectionResult connectionResult2 = signInResponse.b;
                boolean b2 = connectionResult2.b();
                Object obj7 = this.a;
                if (b2) {
                    ResolveAccountResponse resolveAccountResponse = signInResponse.c;
                    fma.aR(resolveAccountResponse);
                    ConnectionResult connectionResult3 = resolveAccountResponse.c;
                    if (!connectionResult3.b()) {
                        String valueOf = String.valueOf(String.valueOf(connectionResult3));
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
                        fjv fjvVar = (fjv) obj7;
                        fjvVar.f.b(connectionResult3);
                        fjvVar.e.y();
                        return;
                    }
                    fjv fjvVar2 = (fjv) obj7;
                    fjd fjdVar3 = fjvVar2.f;
                    fla a = resolveAccountResponse.a();
                    Set set = fjvVar2.c;
                    if (a != null && set != null) {
                        fjdVar3.f = a;
                        fjdVar3.c = set;
                        fjdVar3.c();
                    } else {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        fjdVar3.b(new ConnectionResult(4));
                    }
                } else {
                    ((fjv) obj7).f.b(connectionResult2);
                }
                ((fjv) obj7).e.y();
                return;
            case 10:
                ((Activity) ((gok) this.b).a).startActivity((Intent) this.a);
                return;
            case 11:
                ((Activity) this.a).startActivityForResult((Intent) this.b, 123);
                return;
            case 12:
                ((fud) this.a).a.b(new fuq((OnRangingInitializedParams) this.b));
                return;
            case 13:
                if (((fxv) this.b).c) {
                    ((fxv) ((fxk) this.a).a).u();
                    return;
                }
                try {
                    ((fxv) ((fxk) this.a).a).s(((fxk) this.a).b.a((fxs) this.b));
                    return;
                } catch (fxq e4) {
                    if (e4.getCause() instanceof Exception) {
                        Object obj8 = this.a;
                        ((fxv) ((fxk) obj8).a).r((Exception) e4.getCause());
                        return;
                    }
                    ((fxv) ((fxk) this.a).a).r(e4);
                    return;
                } catch (Exception e5) {
                    ((fxv) ((fxk) this.a).a).r(e5);
                    return;
                }
            case 14:
                try {
                    fxs fxsVar = (fxs) ((fxp) this.a).b.a((fxs) this.b);
                    if (fxsVar == 0) {
                        ((fxp) this.a).c(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    fxsVar.o(fxu.b, this.a);
                    fxsVar.m(fxu.b, this.a);
                    fxsVar.j(fxu.b, this.a);
                    return;
                } catch (fxq e6) {
                    if (e6.getCause() instanceof Exception) {
                        Object obj9 = this.a;
                        ((fxp) obj9).a.r((Exception) e6.getCause());
                        return;
                    }
                    ((fxp) this.a).a.r(e6);
                    return;
                } catch (Exception e7) {
                    ((fxp) this.a).a.r(e7);
                    return;
                }
            case 15:
                synchronized (((fxk) this.a).a) {
                    ((fxk) this.a).b.a((fxs) this.b);
                }
                return;
            case 16:
                synchronized (((fxk) this.a).a) {
                    ?? r12 = ((fxk) this.a).b;
                    Exception d = ((fxs) this.b).d();
                    fma.aR(d);
                    r12.c(d);
                }
                return;
            case 17:
                synchronized (((fxk) this.a).a) {
                    ((fxk) this.a).b.d(((fxs) this.b).e());
                }
                return;
            case 18:
                try {
                    fxs a2 = ((fxp) this.a).b.a(((fxs) this.b).e());
                    a2.o(fxu.b, this.a);
                    a2.m(fxu.b, this.a);
                    a2.j(fxu.b, this.a);
                    return;
                } catch (fxq e8) {
                    if (e8.getCause() instanceof Exception) {
                        ((fxp) this.a).c((Exception) e8.getCause());
                        return;
                    }
                    ((fxp) this.a).c(e8);
                    return;
                } catch (CancellationException unused) {
                    ((fxp) this.a).a();
                    return;
                } catch (Exception e9) {
                    ((fxp) this.a).c(e9);
                    return;
                }
            case 19:
                try {
                    ((fxv) this.a).s(this.b.call());
                    return;
                } catch (Exception e10) {
                    ((fxv) this.a).r(e10);
                    return;
                } catch (Throwable th2) {
                    ((fxv) this.a).r(new RuntimeException(th2));
                    return;
                }
            default:
                Object obj10 = this.b;
                Object obj11 = this.a;
                int threadPriority = Process.getThreadPriority(0);
                try {
                    Process.setThreadPriority(10);
                    mko mkoVar = (mko) gqp.a((Context) obj11).i().get("systemtray");
                    if (mkoVar != null && mkoVar.a() != null) {
                        ((gov) mkoVar.a()).b((Intent) obj10, gnd.c(), TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis()));
                    }
                    return;
                } finally {
                    Process.setThreadPriority(threadPriority);
                }
        }
    }

    public fbh(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj2;
        this.b = obj;
    }

    public /* synthetic */ fbh(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    public fbh(Object obj, Object obj2, int i, char[] cArr) {
        this.c = i;
        this.b = obj2;
        this.a = obj;
    }

    public /* synthetic */ fbh(Object obj, Object obj2, int i, short[] sArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
