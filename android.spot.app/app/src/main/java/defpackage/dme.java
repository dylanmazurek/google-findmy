package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dme implements dmc {
    private final File a;
    private dhi b;
    private final elo d = new elo((byte[]) null, (byte[]) null, (byte[]) null);
    private final elo c = new elo((byte[]) null, (byte[]) null);

    @Deprecated
    public dme(File file) {
        this.a = file;
    }

    private final synchronized dhi c() {
        if (this.b == null) {
            File file = this.a;
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    dhi.e(file2, file3, false);
                }
            }
            dhi dhiVar = new dhi(file);
            if (dhiVar.b.exists()) {
                try {
                    dhiVar.c();
                    dhi.b(dhiVar.c);
                    Iterator it = dhiVar.g.values().iterator();
                    while (it.hasNext()) {
                        dhh dhhVar = (dhh) it.next();
                        if (dhhVar.f == null) {
                            for (int i = 0; i < dhiVar.d; i = 1) {
                                dhiVar.e += dhhVar.b[0];
                            }
                        } else {
                            dhhVar.f = null;
                            for (int i2 = 0; i2 < dhiVar.d; i2 = 1) {
                                dhi.b(dhhVar.c());
                                dhi.b(dhhVar.d());
                            }
                            it.remove();
                        }
                    }
                } catch (IOException e) {
                    System.out.println("DiskLruCache " + file.toString() + " is corrupt: " + e.getMessage() + ", removing");
                    dhiVar.close();
                    dhl.a(dhiVar.a);
                }
                this.b = dhiVar;
            }
            file.mkdirs();
            dhiVar = new dhi(file);
            dhiVar.d();
            this.b = dhiVar;
        }
        return this.b;
    }

    @Override // defpackage.dmc
    public final File a(dir dirVar) {
        try {
            dhx j = c().j(this.c.w(dirVar));
            if (j == null) {
                return null;
            }
            return ((File[]) j.a)[0];
        } catch (IOException e) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e);
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.concurrent.locks.Lock, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, java.util.Queue] */
    /* JADX WARN: Type inference failed for: r1v9, types: [dij, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.Map, java.lang.Object] */
    @Override // defpackage.dmc
    public final void b(dir dirVar, bso bsoVar) {
        njm njmVar;
        File d;
        elo eloVar = this.d;
        String w = this.c.w(dirVar);
        synchronized (eloVar) {
            njmVar = (njm) eloVar.a.get(w);
            if (njmVar == null) {
                Object obj = eloVar.b;
                synchronized (((dhx) obj).a) {
                    njmVar = (njm) ((dhx) obj).a.poll();
                }
                if (njmVar == null) {
                    njmVar = new njm(null, null);
                }
                eloVar.a.put(w, njmVar);
            }
            njmVar.a++;
        }
        njmVar.b.lock();
        try {
            try {
                dhi c = c();
                if (c.j(w) == null) {
                    dhg h = c.h(w);
                    if (h != null) {
                        try {
                            synchronized (h.d) {
                                dhh dhhVar = h.a;
                                if (dhhVar.f == h) {
                                    if (!dhhVar.e) {
                                        h.b[0] = true;
                                    }
                                    d = dhhVar.d();
                                    h.d.a.mkdirs();
                                } else {
                                    throw new IllegalStateException();
                                }
                            }
                            if (bsoVar.a.a(bsoVar.b, d, (div) bsoVar.c)) {
                                h.d.a(h, true);
                                h.c = true;
                            }
                        } finally {
                            h.b();
                        }
                    } else {
                        throw new IllegalStateException(a.ao(w, "Had two simultaneous puts for: "));
                    }
                }
            } catch (IOException e) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e);
                }
            }
        } finally {
            this.d.x(w);
        }
    }
}
