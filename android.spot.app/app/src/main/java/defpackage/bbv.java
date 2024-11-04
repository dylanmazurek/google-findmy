package defpackage;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbv extends mst {
    public static final mkt a = new mla(bbi.i);
    public static final ThreadLocal b = new bbt();
    public final Choreographer c;
    public final Handler d;
    public boolean h;
    public final adk j;
    private boolean n;
    public final Object e = new Object();
    private final mlv m = new mlv();
    public List f = new ArrayList();
    public List g = new ArrayList();
    public final bbu i = new bbu(this);

    public bbv(Choreographer choreographer, Handler handler) {
        this.c = choreographer;
        this.d = handler;
        this.j = new bbx(choreographer, this);
    }

    private final Runnable e() {
        Runnable runnable;
        synchronized (this.e) {
            runnable = (Runnable) this.m.a();
        }
        return runnable;
    }

    @Override // defpackage.mst
    public final void a(mnb mnbVar, Runnable runnable) {
        synchronized (this.e) {
            this.m.addLast(runnable);
            if (!this.n) {
                this.n = true;
                this.d.post(this.i);
                if (!this.h) {
                    this.h = true;
                    this.c.postFrameCallback(this.i);
                }
            }
        }
    }

    public final void b() {
        boolean z;
        do {
            Runnable e = e();
            while (e != null) {
                e.run();
                e = e();
            }
            synchronized (this.e) {
                if (this.m.isEmpty()) {
                    z = false;
                    this.n = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }
}
