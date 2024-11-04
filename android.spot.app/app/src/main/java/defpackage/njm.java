package defpackage;

import com.google.android.gms.clearcut.internal.BatchedLogErrorParcelable;
import com.google.android.gms.clearcut.internal.LogErrorParcelable;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class njm {
    private static njm c;
    public int a;
    public final Object b;

    public njm() {
        this.b = new int[10];
    }

    public static synchronized njm n() {
        njm njmVar;
        synchronized (njm.class) {
            if (c == null) {
                c = new njm((byte[]) null);
            }
            njmVar = c;
        }
        return njmVar;
    }

    public final int a(int i) {
        return ((int[]) this.b)[i];
    }

    public final int b() {
        if ((this.a & 2) != 0) {
            return ((int[]) this.b)[1];
        }
        return -1;
    }

    public final int c() {
        if ((this.a & 128) != 0) {
            return ((int[]) this.b)[7];
        }
        return 65535;
    }

    public final int d() {
        if ((this.a & 16) != 0) {
            return ((int[]) this.b)[4];
        }
        return Integer.MAX_VALUE;
    }

    public final void e(njm njmVar) {
        njmVar.getClass();
        for (int i = 0; i < 10; i++) {
            if (njmVar.f(i)) {
                g(i, njmVar.a(i));
            }
        }
    }

    public final boolean f(int i) {
        if (((1 << i) & this.a) != 0) {
            return true;
        }
        return false;
    }

    public final void g(int i, int i2) {
        if (i >= 0 && i < 10) {
            this.a = (1 << i) | this.a;
            ((int[]) this.b)[i] = i2;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List, java.lang.Object] */
    public final ngq h() {
        if (i()) {
            ?? r0 = this.b;
            int i = this.a;
            this.a = i + 1;
            return (ngq) r0.get(i);
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    public final boolean i() {
        if (this.a < this.b.size()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.Map, java.lang.Object] */
    public final synchronized BatchedLogErrorParcelable j() {
        ArrayList arrayList;
        arrayList = new ArrayList(this.b.values());
        int i = this.a;
        if (i > 0) {
            arrayList.add(new LogErrorParcelable("UNKNOWN", 1002, i));
            this.a = 0;
        }
        this.b.clear();
        return new BatchedLogErrorParcelable(arrayList);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.Map, java.lang.Object] */
    public final synchronized void k(LogErrorParcelable logErrorParcelable) {
        bue bueVar = new bue(logErrorParcelable.a, Integer.valueOf(logErrorParcelable.b));
        LogErrorParcelable logErrorParcelable2 = (LogErrorParcelable) this.b.get(bueVar);
        if (logErrorParcelable2 != null) {
            logErrorParcelable2.c = iqg.q(logErrorParcelable2.c, logErrorParcelable.c);
            return;
        }
        ?? r1 = this.b;
        if (((ta) r1).d >= 100) {
            this.a = iqg.q(this.a, logErrorParcelable.c);
        } else {
            r1.put(bueVar, logErrorParcelable);
        }
    }

    public final Object l() {
        int i = this.a;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = (Object[]) this.b;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.a = i2;
        return obj;
    }

    public final void m(Object obj) {
        int i = this.a;
        if (i < 256) {
            ((Object[]) this.b)[i] = obj;
            this.a = i + 1;
        }
    }

    public njm(List list) {
        this.b = list;
    }

    public njm(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.b = new Object[256];
    }

    public njm(byte[] bArr, byte[] bArr2) {
        this.b = new ReentrantLock();
    }

    private njm(byte[] bArr) {
        this.a = 0;
        this.b = new rx();
    }
}
