package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class mem implements mhf {
    public final mcf b;
    public Runnable c;
    public Runnable d;
    public Runnable e;
    public mhe f;
    private final Executor j;
    private final lzz i = lzz.a(mem.class, null);
    public final Object a = new Object();
    public Collection g = new LinkedHashSet();
    public volatile mrx h = new mrx((maq) null, (mca) null);

    public mem(Executor executor, mcf mcfVar) {
        this.j = executor;
        this.b = mcfVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x006b, code lost:            return r3;     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003e, code lost:            r3 = new defpackage.mel(r2, r0, r6);        r2.g.add(r3);        r5 = r2.a;     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:            monitor-enter(r5);     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004b, code lost:            r0 = r2.g.size();     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0051, code lost:            monitor-exit(r5);     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:            if (r0 != 1) goto L22;     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0055, code lost:            r2.b.b(r2.c);     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005c, code lost:            r5 = r6.length;        r0 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005e, code lost:            if (r0 >= r5) goto L46;     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0060, code lost:            r1 = r6[r0];        r0 = r0 + 1;     */
    @Override // defpackage.mdt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.mdq a(defpackage.mbg r3, defpackage.mbc r4, defpackage.lys r5, defpackage.lyy[] r6) {
        /*
            r2 = this;
            man r0 = new man     // Catch: java.lang.Throwable -> L75
            mhp r1 = new mhp     // Catch: java.lang.Throwable -> L75
            r1.<init>()     // Catch: java.lang.Throwable -> L75
            r0.<init>(r3, r4, r5, r1)     // Catch: java.lang.Throwable -> L75
            mrx r3 = r2.h     // Catch: java.lang.Throwable -> L75
        Lc:
            java.lang.Object r4 = r3.a     // Catch: java.lang.Throwable -> L75
            if (r4 == 0) goto L18
            mew r3 = new mew     // Catch: java.lang.Throwable -> L75
            mca r4 = (defpackage.mca) r4     // Catch: java.lang.Throwable -> L75
            r3.<init>(r4, r6)     // Catch: java.lang.Throwable -> L75
            goto L66
        L18:
            java.lang.Object r4 = r3.b     // Catch: java.lang.Throwable -> L75
            if (r4 == 0) goto L37
            maq r4 = (defpackage.maq) r4     // Catch: java.lang.Throwable -> L75
            mam r4 = r4.a()     // Catch: java.lang.Throwable -> L75
            boolean r1 = r5.f()     // Catch: java.lang.Throwable -> L75
            mdt r4 = defpackage.mfh.c(r4, r1)     // Catch: java.lang.Throwable -> L75
            if (r4 == 0) goto L37
            mbg r3 = r0.c     // Catch: java.lang.Throwable -> L75
            mbc r5 = r0.b     // Catch: java.lang.Throwable -> L75
            lys r0 = r0.a     // Catch: java.lang.Throwable -> L75
            mdq r3 = r4.a(r3, r5, r0, r6)     // Catch: java.lang.Throwable -> L75
            goto L66
        L37:
            java.lang.Object r4 = r2.a     // Catch: java.lang.Throwable -> L75
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L75
            mrx r1 = r2.h     // Catch: java.lang.Throwable -> L72
            if (r3 != r1) goto L6f
            mel r3 = new mel     // Catch: java.lang.Throwable -> L72
            r3.<init>(r2, r0, r6)     // Catch: java.lang.Throwable -> L72
            java.util.Collection r5 = r2.g     // Catch: java.lang.Throwable -> L72
            r5.add(r3)     // Catch: java.lang.Throwable -> L72
            java.lang.Object r5 = r2.a     // Catch: java.lang.Throwable -> L72
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L72
            java.util.Collection r0 = r2.g     // Catch: java.lang.Throwable -> L6c
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L6c
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L6c
            r5 = 1
            if (r0 != r5) goto L5c
            mcf r5 = r2.b     // Catch: java.lang.Throwable -> L72
            java.lang.Runnable r0 = r2.c     // Catch: java.lang.Throwable -> L72
            r5.b(r0)     // Catch: java.lang.Throwable -> L72
        L5c:
            int r5 = r6.length     // Catch: java.lang.Throwable -> L72
            r0 = 0
        L5e:
            if (r0 >= r5) goto L65
            r1 = r6[r0]     // Catch: java.lang.Throwable -> L72
            int r0 = r0 + 1
            goto L5e
        L65:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L72
        L66:
            mcf r4 = r2.b
            r4.a()
            return r3
        L6c:
            r3 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L6c
            throw r3     // Catch: java.lang.Throwable -> L72
        L6f:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L72
            r3 = r1
            goto Lc
        L72:
            r3 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L72
            throw r3     // Catch: java.lang.Throwable -> L75
        L75:
            r3 = move-exception
            mcf r4 = r2.b
            r4.a()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mem.a(mbg, mbc, lys, lyy[]):mdq");
    }

    @Override // defpackage.mhf
    public final Runnable b(mhe mheVar) {
        throw null;
    }

    @Override // defpackage.mad
    public final lzz c() {
        return this.i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(maq maqVar) {
        Runnable runnable;
        synchronized (this.a) {
            this.h = new mrx(maqVar, (mca) this.h.a);
            if (maqVar != null && f()) {
                ArrayList arrayList = new ArrayList(this.g);
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    mel melVar = (mel) arrayList.get(i);
                    man manVar = melVar.a;
                    mam a = maqVar.a();
                    lys lysVar = melVar.a.a;
                    mdt c = mfh.c(a, lysVar.f());
                    if (c != null) {
                        Executor executor = this.j;
                        Executor executor2 = lysVar.c;
                        Runnable b = melVar.b(c);
                        if (b != null) {
                            if (executor2 != null) {
                                executor = executor2;
                            }
                            executor.execute(b);
                        }
                        arrayList2.add(melVar);
                    }
                }
                synchronized (this.a) {
                    if (!f()) {
                        return;
                    }
                    this.g.removeAll(arrayList2);
                    if (this.g.isEmpty()) {
                        this.g = new LinkedHashSet();
                    }
                    if (!f()) {
                        this.b.b(this.d);
                        if (this.h.a != null && (runnable = this.e) != null) {
                            this.b.b(runnable);
                            this.e = null;
                        }
                    }
                    this.b.a();
                }
            }
        }
    }

    @Override // defpackage.mhf
    public final void e(mca mcaVar) {
        Runnable runnable;
        synchronized (this.a) {
            if (this.h.a != null) {
                return;
            }
            this.h = new mrx((maq) this.h.b, mcaVar);
            this.b.b(new meg(this, 6));
            if (!f() && (runnable = this.e) != null) {
                this.b.b(runnable);
                this.e = null;
            }
            this.b.a();
        }
    }

    public final boolean f() {
        boolean z;
        synchronized (this.a) {
            z = !this.g.isEmpty();
        }
        return z;
    }
}
