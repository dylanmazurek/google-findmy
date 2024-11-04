package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hzm implements hzg {
    private final mko a;

    public hzm(mko mkoVar) {
        this.a = mkoVar;
    }

    @Override // defpackage.hzg
    public final void a() {
        final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: hzl
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th) {
                hzm.this.b(defaultUncaughtExceptionHandler, thread, th);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void b(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Thread thread, Throwable th) {
        boolean z;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            ArrayList arrayList = new ArrayList();
            if (thread == Looper.getMainLooper().getThread()) {
                try {
                    Set set = (Set) ((lsi) this.a).b;
                    ArrayList arrayList2 = new ArrayList(set.size());
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        try {
                            arrayList2.add(((hzk) it.next()).a());
                        } catch (Throwable th2) {
                            arrayList.add(th2);
                        }
                    }
                    jyz[] jyzVarArr = (jyz[]) arrayList2.toArray(new jyz[0]);
                    jyn jynVar = new jyn(jyzVarArr);
                    jin j = jis.j(jyzVarArr.length);
                    for (int i = 0; i < jyzVarArr.length; i++) {
                        j.h(new jym(jynVar));
                    }
                    jis g = j.g();
                    int i2 = 0;
                    while (i2 < jyzVarArr.length) {
                        jyzVarArr[i2].c(new oa(jynVar, g, i2, 14, (byte[]) null), jxv.a);
                        i2++;
                        jyzVarArr = jyzVarArr;
                    }
                    jmx it2 = g.iterator();
                    while (it2.hasNext()) {
                        jyz jyzVar = (jyz) it2.next();
                        try {
                            try {
                                try {
                                    long nanos = TimeUnit.MILLISECONDS.toNanos(4000 - (SystemClock.elapsedRealtime() - elapsedRealtime));
                                    long nanoTime = System.nanoTime() + nanos;
                                    z = false;
                                    while (true) {
                                        try {
                                            try {
                                                jyzVar.get(nanos, TimeUnit.NANOSECONDS);
                                                break;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                if (z) {
                                                    Thread.currentThread().interrupt();
                                                }
                                                throw th;
                                                break;
                                            }
                                        } catch (InterruptedException unused) {
                                            z = true;
                                            nanos = nanoTime - System.nanoTime();
                                        }
                                    }
                                    if (z) {
                                        Thread.currentThread().interrupt();
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    z = false;
                                }
                            } catch (TimeoutException e) {
                                arrayList.add(e);
                            }
                        } catch (Throwable th5) {
                            arrayList.add(th5);
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                    if (uncaughtExceptionHandler != null) {
                        uncaughtExceptionHandler.uncaughtException(thread, th);
                    }
                    throw th;
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                ((Throwable) it3.next()).printStackTrace();
            }
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        } catch (Throwable th7) {
            th = th7;
        }
    }
}
