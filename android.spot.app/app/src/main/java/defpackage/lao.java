package defpackage;

import android.content.Context;
import android.os.AsyncTask;
import com.google.android.gms.maps.model.CameraPosition;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lao implements frg, frj, frh {
    public lax a;
    public final lav b;
    public final lbk c;
    public final lbj d;
    public final lbj e;
    public njz f;
    public njz g;
    private final frk h;
    private CameraPosition i;
    private lan j;
    private final ReadWriteLock k;

    public lao(Context context, frk frkVar) {
        lbk lbkVar = new lbk(frkVar);
        this.k = new ReentrantReadWriteLock();
        this.h = frkVar;
        this.c = lbkVar;
        this.e = new lbj(lbkVar);
        this.d = new lbj(lbkVar);
        this.a = new lbi(context, frkVar, this);
        this.b = new lav(new lau(new las()));
        this.j = new lan(this);
        this.a.f();
    }

    @Override // defpackage.frh
    public final void a(fsa fsaVar) {
        this.c.a(fsaVar);
    }

    public final void b() {
        this.k.writeLock().lock();
        try {
            this.j.cancel(true);
            lan lanVar = new lan(this);
            this.j = lanVar;
            lanVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, Float.valueOf(this.h.a().b));
        } finally {
            this.k.writeLock().unlock();
        }
    }

    @Override // defpackage.frj
    public final void c(fsa fsaVar) {
        this.c.c(fsaVar);
    }

    @Override // defpackage.frg
    public final void o() {
        lax laxVar = this.a;
        if (laxVar instanceof frg) {
            ((frg) laxVar).o();
        }
        this.h.a();
        CameraPosition cameraPosition = this.i;
        if (cameraPosition != null) {
            if (cameraPosition.b == this.h.a().b) {
                return;
            }
        }
        this.i = this.h.a();
        b();
    }
}
