package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ngx {
    public final ngy a;
    public final String b;
    public boolean c;
    public ngv d;
    public final List e = new ArrayList();
    public boolean f;

    public ngx(ngy ngyVar, String str) {
        this.a = ngyVar;
        this.b = str;
    }

    public final void a() {
        byte[] bArr = ngt.a;
        synchronized (this.a) {
            if (c()) {
                this.a.c(this);
            }
        }
    }

    public final void b() {
        byte[] bArr = ngt.a;
        synchronized (this.a) {
            this.c = true;
            if (c()) {
                this.a.c(this);
            }
        }
    }

    public final boolean c() {
        if (this.d != null) {
            this.f = true;
        }
        int size = this.e.size() - 1;
        boolean z = false;
        while (size >= 0) {
            ngv ngvVar = (ngv) this.e.get(size);
            if (ngy.b.isLoggable(Level.FINE)) {
                mkm.bb(ngvVar, this, "canceled");
            }
            this.e.remove(size);
            size--;
            z = true;
        }
        return z;
    }

    public final boolean d(ngv ngvVar, long j, boolean z) {
        String concat;
        ngx ngxVar = ngvVar.b;
        if (ngxVar != this) {
            if (ngxVar == null) {
                ngvVar.b = this;
            } else {
                throw new IllegalStateException("task is in multiple queues");
            }
        }
        long nanoTime = System.nanoTime();
        long j2 = nanoTime + j;
        int indexOf = this.e.indexOf(ngvVar);
        if (indexOf != -1) {
            if (ngvVar.c <= j2) {
                if (ngy.b.isLoggable(Level.FINE)) {
                    mkm.bb(ngvVar, this, "already scheduled");
                }
                return false;
            }
            this.e.remove(indexOf);
        }
        ngvVar.c = j2;
        if (ngy.b.isLoggable(Level.FINE)) {
            long j3 = j2 - nanoTime;
            if (z) {
                concat = "run again after ".concat(mkm.ba(j3));
            } else {
                concat = "scheduled after ".concat(mkm.ba(j3));
            }
            mkm.bb(ngvVar, this, concat);
        }
        Iterator it = this.e.iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (((ngv) it.next()).c - nanoTime > j) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i == -1) {
            i = this.e.size();
        }
        this.e.add(i, ngvVar);
        if (i != 0) {
            return false;
        }
        return true;
    }

    public final void e(ngv ngvVar) {
        ngvVar.getClass();
        synchronized (this.a) {
            if (this.c) {
                if (ngy.b.isLoggable(Level.FINE)) {
                    mkm.bb(ngvVar, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (d(ngvVar, 0L, false)) {
                    this.a.c(this);
                }
            }
        }
    }

    public final String toString() {
        return this.b;
    }
}
