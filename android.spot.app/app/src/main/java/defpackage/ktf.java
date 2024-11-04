package defpackage;

import j$.util.DesugarCollections;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ktf {
    public static volatile ktf a;
    private static ktf c;
    public final Object b;

    public ktf(Object obj) {
        this.b = obj;
    }

    public static synchronized ktf h() {
        ktf ktfVar;
        synchronized (ktf.class) {
            if (c == null) {
                c = new ktf((byte[]) null);
            }
            ktfVar = c;
        }
        return ktfVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Set, java.lang.Object] */
    public final Set a() {
        Set unmodifiableSet;
        synchronized (this.b) {
            unmodifiableSet = DesugarCollections.unmodifiableSet(this.b);
        }
        return unmodifiableSet;
    }

    public final int b() {
        return ((ByteBuffer) this.b).position();
    }

    public final int c() {
        return ((ByteBuffer) this.b).remaining();
    }

    public final void d(byte[] bArr, int i, int i2) {
        ((ByteBuffer) this.b).put(bArr, i, i2);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, java.lang.Object] */
    public final synchronized List e() {
        return this.b;
    }

    public final synchronized void f() {
    }

    public final void g(Object obj, lsm lsmVar) {
        obj.getClass();
        lsmVar.getClass();
        ((LinkedHashMap) this.b).put(obj, lsmVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Set, java.lang.Object] */
    public final synchronized void i(ngq ngqVar) {
        this.b.remove(ngqVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Set, java.lang.Object] */
    public final synchronized void j(ngq ngqVar) {
        this.b.add(ngqVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Set, java.lang.Object] */
    public final synchronized boolean k(ngq ngqVar) {
        return this.b.contains(ngqVar);
    }

    public final void l(Runnable runnable) {
        runnable.getClass();
        ((ThreadPoolExecutor) this.b).execute(runnable);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Collection, java.lang.Object] */
    public final ngb m() {
        return new ngb((String[]) this.b.toArray(new String[0]));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List, java.lang.Object] */
    public final void n(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.b.add(str);
        this.b.add(moz.k(str2).toString());
    }

    public final void o(String str, String str2) {
        msz.B(str);
        msz.C(str2, str);
        p(str);
        n(str, str2);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List, java.lang.Object] */
    public final void p(String str) {
        int i = 0;
        while (i < this.b.size()) {
            if (moz.v(str, (String) this.b.get(i))) {
                this.b.remove(i);
                this.b.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }

    public final int q() {
        long j = ((nbb) ((mrr) this.b).a).b.b;
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j)));
    }

    public final Object r() {
        while (true) {
            nbb nbbVar = (nbb) ((mrr) this.b).a;
            Object b = nbbVar.b();
            if (b != nbb.a) {
                return b;
            }
            ((mrr) this.b).d(nbbVar, nbbVar.c());
        }
    }

    public final void s() {
        while (true) {
            nbb nbbVar = (nbb) ((mrr) this.b).a;
            if (nbbVar.d()) {
                return;
            }
            ((mrr) this.b).d(nbbVar, nbbVar.c());
        }
    }

    public final boolean t(Object obj) {
        while (true) {
            nbb nbbVar = (nbb) ((mrr) this.b).a;
            int a2 = nbbVar.a(obj);
            if (a2 == 0) {
                return true;
            }
            if (a2 != 1) {
                return false;
            }
            ((mrr) this.b).d(nbbVar, nbbVar.c());
        }
    }

    public final mrr u(int i) {
        return ((mrr[]) this.b)[i];
    }

    public final long v(long j) {
        return ((AtomicLong) this.b).addAndGet(j);
    }

    public ktf(jfe jfeVar) {
        this.b = jfeVar;
    }

    public ktf() {
        this.b = new HashSet();
    }

    public ktf(int i) {
        this.b = iqg.B(i);
    }

    public ktf(mca mcaVar, mbc mbcVar) {
        mcaVar.getClass();
        this.b = mcaVar;
        mbcVar.getClass();
    }

    public ktf(byte[] bArr) {
        this.b = Collections.emptyList();
    }

    public ktf(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        this.b = byteBuffer;
    }

    public ktf(char[] cArr, byte[] bArr, byte[] bArr2) {
        this.b = new AtomicLong();
    }

    public ktf(int i, byte[] bArr) {
        mrr[] mrrVarArr = new mrr[i];
        for (int i2 = 0; i2 < i; i2++) {
            mrrVarArr[i2] = new mrr(null, mrs.a);
        }
        this.b = mrrVarArr;
    }

    public ktf(byte[] bArr, char[] cArr) {
        this.b = new mrr(new nbb(8, false), mrs.a);
    }

    public ktf(char[] cArr, byte[] bArr) {
        this((byte[]) null, (char[]) null);
    }

    public ktf(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        timeUnit.getClass();
        this.b = new nhk(ngy.a, timeUnit);
    }

    public ktf(byte[] bArr, byte[] bArr2) {
        this.b = new ArrayList(20);
    }

    public ktf(ThreadFactory threadFactory) {
        this.b = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
    }

    public ktf(char[] cArr) {
        this.b = new LinkedHashSet();
    }
}
