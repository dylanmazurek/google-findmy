package defpackage;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dfm extends Thread {
    public volatile boolean a = false;
    private final BlockingQueue b;
    private final ddh c;
    private final elo d;

    public dfm(BlockingQueue blockingQueue, elo eloVar, ddh ddhVar) {
        this.b = blockingQueue;
        this.d = eloVar;
        this.c = ddhVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00fb, code lost:            if (r11.a == false) goto L64;     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00fd, code lost:            r3 = r2.d;     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ff, code lost:            monitor-enter(r3);     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0100, code lost:            r4 = r2.j;     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0102, code lost:            monitor-exit(r3);     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0103, code lost:            if (r4 == false) goto L64;     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0105, code lost:            r2.l();        r2.h();     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0111, code lost:            r3 = r2.o(r11);        r4 = r2.h;     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0119, code lost:            if (r3.b == null) goto L67;     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x011b, code lost:            r2.c();     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x011e, code lost:            r2.g();        r17.c.k(r2, r3);        r4 = r2.d;     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0128, code lost:            monitor-enter(r4);     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0129, code lost:            r5 = r2.m;     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x012b, code lost:            monitor-exit(r4);     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x012c, code lost:            if (r5 == null) goto L149;     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x012e, code lost:            r4 = r3.b;     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0130, code lost:            if (r4 == null) goto L91;     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x013c, code lost:            if (((defpackage.dfh) r4).e >= java.lang.System.currentTimeMillis()) goto L77;     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x013f, code lost:            r4 = r2.c();     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0143, code lost:            monitor-enter(r5);     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0144, code lost:            r4 = (java.util.List) r5.b.remove(r4);     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x014c, code lost:            monitor-exit(r5);     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x014d, code lost:            if (r4 == null) goto L149;     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x014f, code lost:            r6 = defpackage.dga.a;        r4 = r4.iterator();     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0159, code lost:            if (r4.hasNext() == false) goto L181;     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x015b, code lost:            ((defpackage.ddh) r5.d).k((defpackage.dfq) r4.next(), r3);     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x016d, code lost:            r5.c(r2);     */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.Map, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a() {
        /*
            Method dump skipped, instructions count: 642
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dfm.a():void");
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.a) {
                    Thread.currentThread().interrupt();
                    return;
                }
                dga.b("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
