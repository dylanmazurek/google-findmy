package com.bumptech.glide.manager;

import androidx.lifecycle.OnLifecycleEvent;
import defpackage.cev;
import defpackage.cew;
import defpackage.cex;
import defpackage.cfb;
import defpackage.cfc;
import defpackage.drj;
import defpackage.drk;
import defpackage.dtq;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class LifecycleLifecycle implements drj, cfb {
    private final Set a = new HashSet();
    private final cex b;

    public LifecycleLifecycle(cex cexVar) {
        this.b = cexVar;
        cexVar.a(this);
    }

    @Override // defpackage.drj
    public final void a(drk drkVar) {
        this.a.add(drkVar);
        cew cewVar = this.b.b;
        if (cewVar == cew.DESTROYED) {
            drkVar.h();
        } else if (cewVar.a(cew.STARTED)) {
            drkVar.i();
        } else {
            drkVar.j();
        }
    }

    @Override // defpackage.drj
    public final void b(drk drkVar) {
        this.a.remove(drkVar);
    }

    @OnLifecycleEvent(a = cev.ON_DESTROY)
    public void onDestroy(cfc cfcVar) {
        Iterator it = dtq.f(this.a).iterator();
        while (it.hasNext()) {
            ((drk) it.next()).h();
        }
        cfcVar.N().c(this);
    }

    @OnLifecycleEvent(a = cev.ON_START)
    public void onStart(cfc cfcVar) {
        Iterator it = dtq.f(this.a).iterator();
        while (it.hasNext()) {
            ((drk) it.next()).i();
        }
    }

    @OnLifecycleEvent(a = cev.ON_STOP)
    public void onStop(cfc cfcVar) {
        Iterator it = dtq.f(this.a).iterator();
        while (it.hasNext()) {
            ((drk) it.next()).j();
        }
    }
}
