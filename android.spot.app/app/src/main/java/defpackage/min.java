package defpackage;

import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class min implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    final /* synthetic */ Object f;
    private final /* synthetic */ int g;

    public /* synthetic */ min(hri hriVar, String str, String str2, String str3, String str4, boolean z, int i) {
        this.g = i;
        this.c = hriVar;
        this.f = str;
        this.b = str2;
        this.e = str3;
        this.d = str4;
        this.a = z;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [jfe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [jfe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.concurrent.Future, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        mca mcaVar;
        if (this.g != 0) {
            ((imq) ((hpd) ((hri) this.c).a.a()).j.a()).b(this.f, this.b, this.e, this.d, Boolean.valueOf(this.a));
            return;
        }
        for (mja mjaVar : this.b) {
            if (mjaVar != this.c) {
                mjaVar.a.h(mjc.c);
            }
        }
        ?? r0 = this.d;
        if (r0 != 0) {
            r0.cancel(false);
            if (!this.a && ((mjc) this.f).t.decrementAndGet() == Integer.MIN_VALUE) {
                ((mjc) this.f).g.execute(new mgs(this, 7));
            }
        }
        ?? r02 = this.e;
        if (r02 != 0) {
            r02.cancel(false);
        }
        Object obj = this.f;
        mgt mgtVar = ((mjc) obj).D.b.z;
        synchronized (mgtVar.a) {
            mgtVar.b.remove(obj);
            if (mgtVar.b.isEmpty()) {
                mcaVar = mgtVar.c;
                mgtVar.b = new HashSet();
            } else {
                mcaVar = null;
            }
        }
        if (mcaVar != null) {
            mgtVar.d.y.e(mcaVar);
        }
    }

    public min(mjc mjcVar, Collection collection, mja mjaVar, Future future, boolean z, Future future2, int i) {
        this.g = i;
        this.b = collection;
        this.c = mjaVar;
        this.d = future;
        this.a = z;
        this.e = future2;
        this.f = mjcVar;
    }
}
