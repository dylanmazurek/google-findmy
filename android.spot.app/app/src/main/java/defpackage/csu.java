package defpackage;

import android.content.Context;
import android.os.PowerManager;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class csu implements ctl, cxl {
    public final Context a;
    public final int b;
    public final cvk c;
    public final csy d;
    public int e;
    public final Executor f;
    public final Executor g;
    public PowerManager.WakeLock h;
    public boolean i;
    public final mst j;
    public volatile muf k;
    public final bet l;
    public final bet m;
    private final Object n;

    static {
        cqc.a("DelayMetCommandHandler");
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.concurrent.Executor, java.lang.Object] */
    public csu(Context context, int i, csy csyVar, bet betVar) {
        this.a = context;
        this.b = i;
        this.d = csyVar;
        this.c = (cvk) betVar.a;
        this.m = betVar;
        nca ncaVar = csyVar.e.k;
        eld eldVar = csyVar.j;
        this.f = eldVar.a;
        this.g = eldVar.c;
        this.j = (mst) eldVar.d;
        this.l = new bet(ncaVar);
        this.i = false;
        this.e = 0;
        this.n = new Object();
    }

    public final void a() {
        synchronized (this.n) {
            if (this.k != null) {
                this.k.s(null);
            }
            this.d.c.a(this.c);
            PowerManager.WakeLock wakeLock = this.h;
            if (wakeLock != null && wakeLock.isHeld()) {
                cqc.b();
                Objects.toString(this.h);
                Objects.toString(this.c);
                this.h.release();
            }
        }
    }

    @Override // defpackage.cxl
    public final void b(cvk cvkVar) {
        cqc.b();
        Objects.toString(cvkVar);
        cvkVar.toString();
        this.f.execute(new col(this, 5, null));
    }

    @Override // defpackage.ctl
    public final void e(cvu cvuVar, ctd ctdVar) {
        if (ctdVar instanceof ctg) {
            this.f.execute(new col(this, 6, null));
        } else {
            this.f.execute(new col(this, 5, null));
        }
    }
}
