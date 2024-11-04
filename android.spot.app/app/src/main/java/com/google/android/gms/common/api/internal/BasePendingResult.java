package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import defpackage.fht;
import defpackage.fhv;
import defpackage.fhw;
import defpackage.fhx;
import defpackage.fhz;
import defpackage.fia;
import defpackage.fib;
import defpackage.fis;
import defpackage.fit;
import defpackage.fiu;
import defpackage.fjf;
import defpackage.fka;
import defpackage.flb;
import defpackage.fma;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class BasePendingResult extends fhw {
    public static final ThreadLocal b = new fis();
    private final CountDownLatch a;
    public final Object c;
    protected final fit d;
    public fhz e;
    public boolean f;
    public flb g;
    private final ArrayList h;
    private fia i;
    private final AtomicReference j;
    private Status k;
    private volatile boolean l;
    private boolean m;
    private boolean n;
    private volatile fib o;
    private fiu resultGuardian;

    @Deprecated
    BasePendingResult() {
        this.c = new Object();
        this.a = new CountDownLatch(1);
        this.h = new ArrayList();
        this.j = new AtomicReference();
        this.f = false;
        this.d = new fit(Looper.getMainLooper());
        new WeakReference(null);
    }

    private final void c(fhz fhzVar) {
        this.e = fhzVar;
        this.k = fhzVar.b();
        this.g = null;
        this.a.countDown();
        if (this.m) {
            this.i = null;
        } else {
            fia fiaVar = this.i;
            if (fiaVar == null) {
                if (this.e instanceof fhx) {
                    this.resultGuardian = new fiu(this);
                }
            } else {
                this.d.removeMessages(2);
                this.d.a(fiaVar, q());
            }
        }
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((fhv) arrayList.get(i)).a(this.k);
        }
        this.h.clear();
    }

    public static void m(fhz fhzVar) {
        if (fhzVar instanceof fhx) {
            try {
                ((fhx) fhzVar).a();
            } catch (RuntimeException e) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(String.valueOf(fhzVar))), e);
            }
        }
    }

    private final fhz q() {
        fhz fhzVar;
        synchronized (this.c) {
            fma.aO(!this.l, "Result has already been consumed.");
            fma.aO(p(), "Result is not ready.");
            fhzVar = this.e;
            this.e = null;
            this.i = null;
            this.l = true;
        }
        fka fkaVar = (fka) this.j.getAndSet(null);
        if (fkaVar != null) {
            fkaVar.a();
        }
        fma.aR(fhzVar);
        return fhzVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract fhz a(Status status);

    @Override // defpackage.fhw
    public final void d(fhv fhvVar) {
        fma.aG(true, "Callback cannot be null.");
        synchronized (this.c) {
            if (p()) {
                fhvVar.a(this.k);
            } else {
                this.h.add(fhvVar);
            }
        }
    }

    @Override // defpackage.fhw
    public final void e() {
        synchronized (this.c) {
            if (!this.m && !this.l) {
                flb flbVar = this.g;
                if (flbVar != null) {
                    try {
                        flbVar.d(2, flbVar.a());
                    } catch (RemoteException unused) {
                    }
                }
                m(this.e);
                this.m = true;
                c(a(Status.f));
            }
        }
    }

    @Override // defpackage.fhw
    public final void f(fia fiaVar) {
        synchronized (this.c) {
            fma.aO(!this.l, "Result has already been consumed.");
            fma.aO(true, "Cannot set callbacks if then() has been called.");
            if (o()) {
                return;
            }
            if (p()) {
                this.d.a(fiaVar, q());
            } else {
                this.i = fiaVar;
            }
        }
    }

    @Override // defpackage.fhw
    public final void g(TimeUnit timeUnit) {
        fma.aO(!this.l, "Result has already been consumed.");
        fma.aO(true, "Cannot await if then() has been called.");
        try {
            if (!this.a.await(0L, timeUnit)) {
                l(Status.e);
            }
        } catch (InterruptedException unused) {
            l(Status.c);
        }
        fma.aO(p(), "Result is not ready.");
        q();
    }

    @Override // defpackage.fhw
    public final void h(fia fiaVar, TimeUnit timeUnit) {
        synchronized (this.c) {
            fma.aO(!this.l, "Result has already been consumed.");
            fma.aO(true, "Cannot set callbacks if then() has been called.");
            if (o()) {
                return;
            }
            if (p()) {
                this.d.a(fiaVar, q());
            } else {
                this.i = fiaVar;
                fit fitVar = this.d;
                fitVar.sendMessageDelayed(fitVar.obtainMessage(2, this), timeUnit.toMillis(3L));
            }
        }
    }

    @Deprecated
    public final void l(Status status) {
        synchronized (this.c) {
            if (!p()) {
                n(a(status));
                this.n = true;
            }
        }
    }

    public final void n(fhz fhzVar) {
        synchronized (this.c) {
            if (!this.n && !this.m) {
                p();
                fma.aO(!p(), "Results have already been set");
                fma.aO(!this.l, "Result has already been consumed");
                c(fhzVar);
                return;
            }
            m(fhzVar);
        }
    }

    public final boolean o() {
        boolean z;
        synchronized (this.c) {
            z = this.m;
        }
        return z;
    }

    public final boolean p() {
        if (this.a.getCount() == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BasePendingResult(fht fhtVar) {
        this.c = new Object();
        this.a = new CountDownLatch(1);
        this.h = new ArrayList();
        this.j = new AtomicReference();
        this.f = false;
        this.d = new fit(((fjf) fhtVar).a.f);
        new WeakReference(fhtVar);
    }
}
