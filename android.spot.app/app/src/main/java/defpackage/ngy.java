package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadFactory;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ngy {
    public static final ngy a = new ngy(new ktf((ThreadFactory) new ngs(String.valueOf(ngt.e).concat(" TaskRunner"), true)));
    public static final Logger b;
    public boolean c;
    public long d;
    public final ktf h;
    private int i = 10000;
    public final List e = new ArrayList();
    public final List f = new ArrayList();
    public final Runnable g = new mgs(this, 14);

    static {
        Logger logger = Logger.getLogger(ngy.class.getName());
        logger.getClass();
        b = logger;
    }

    public ngy(ktf ktfVar) {
        this.h = ktfVar;
    }

    public final ngx a() {
        int i;
        synchronized (this) {
            i = this.i;
            this.i = i + 1;
        }
        return new ngx(this, a.ae(i, "Q"));
    }

    public final void b(ngv ngvVar, long j) {
        byte[] bArr = ngt.a;
        ngx ngxVar = ngvVar.b;
        ngxVar.getClass();
        if (ngxVar.d == ngvVar) {
            boolean z = ngxVar.f;
            ngxVar.f = false;
            ngxVar.d = null;
            this.e.remove(ngxVar);
            if (j != -1 && !z && !ngxVar.c) {
                ngxVar.d(ngvVar, j, true);
            }
            if (!ngxVar.e.isEmpty()) {
                this.f.add(ngxVar);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final void c(ngx ngxVar) {
        byte[] bArr = ngt.a;
        if (ngxVar.d == null) {
            if (!ngxVar.e.isEmpty()) {
                List list = this.f;
                if (!list.contains(ngxVar)) {
                    list.add(ngxVar);
                }
            } else {
                this.f.remove(ngxVar);
            }
        }
        if (this.c) {
            notify();
        } else {
            this.h.l(this.g);
        }
    }
}
