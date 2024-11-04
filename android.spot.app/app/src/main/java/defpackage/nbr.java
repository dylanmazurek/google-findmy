package defpackage;

import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.locks.LockSupport;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nbr implements Executor, Closeable {
    public static final nbj a = new nbj("NOT_IN_STACK");
    public final int b;
    public final int c;
    public final long d;
    public final String e;
    public final mrq f;
    public final nbf g;
    public final mrq h;
    public final ktf i;
    public final ktf j;
    private final mro k;

    public nbr(int i, int i2, long j, String str) {
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = str;
        if (i > 0) {
            if (i2 >= i) {
                if (i2 <= 2097150) {
                    if (j > 0) {
                        this.i = new ktf((char[]) null, (byte[]) null);
                        this.j = new ktf((char[]) null, (byte[]) null);
                        this.f = new mrq(0L, mrs.a);
                        int i3 = i + 1;
                        this.g = new nbf(i3 + i3);
                        mrs mrsVar = mrs.a;
                        this.h = new mrq(i << 42, mrsVar);
                        this.k = new mro(false, mrsVar);
                        return;
                    }
                    throw new IllegalArgumentException("Idle worker keep alive time " + j + " must be positive");
                }
                throw new IllegalArgumentException(a.am(i2, "Max pool size ", " should not exceed maximal supported number of threads 2097150"));
            }
            throw new IllegalArgumentException(a.ad(i, i2, "Max pool size ", " should be greater than or equals to core pool size "));
        }
        throw new IllegalArgumentException(a.am(i, "Core pool size ", " should be at least 1"));
    }

    public static /* synthetic */ void e(nbr nbrVar, Runnable runnable, boolean z, int i) {
        nbw nbwVar;
        boolean z2;
        if ((i & 2) != 0) {
            nbwVar = nby.f;
        } else {
            nbwVar = null;
        }
        if ((i & 4) != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        nbrVar.d(runnable, nbwVar, z & z2);
    }

    public static final void f(nbv nbvVar) {
        try {
            nbvVar.run();
        } catch (Throwable th) {
            Thread currentThread = Thread.currentThread();
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
        }
    }

    private final int g() {
        synchronized (this.g) {
            if (c()) {
                return -1;
            }
            long j = this.h.b;
            int i = (int) ((j & 4398044413952L) >> 21);
            int i2 = (int) (j & 2097151);
            int ac = moz.ac(i2 - i, 0);
            if (ac >= this.b) {
                return 0;
            }
            if (i2 >= this.c) {
                return 0;
            }
            int i3 = ((int) (this.h.b & 2097151)) + 1;
            if (this.g.a(i3) == null) {
                nbq nbqVar = new nbq(this, i3);
                this.g.b(i3, nbqVar);
                if (i3 == ((int) (2097151 & mrq.a.incrementAndGet(this.h)))) {
                    int i4 = ac + 1;
                    nbqVar.start();
                    return i4;
                }
                throw new IllegalArgumentException("Failed requirement.");
            }
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    private final nbq h() {
        nbq nbqVar;
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof nbq) {
            nbqVar = (nbq) currentThread;
        } else {
            nbqVar = null;
        }
        if (nbqVar == null || !amr.i(nbqVar.d, this)) {
            return null;
        }
        return nbqVar;
    }

    private final boolean i(long j) {
        if (moz.ac(((int) (j & 2097151)) - ((int) ((4398044413952L & j) >> 21)), 0) < this.b) {
            int g = g();
            if (g == 1) {
                if (this.b > 1) {
                    g();
                }
            } else if (g <= 0) {
            }
            return true;
        }
        return false;
    }

    private final boolean j() {
        nbq nbqVar;
        do {
            mrq mrqVar = this.f;
            while (true) {
                long j = mrqVar.b;
                nbqVar = (nbq) this.g.a((int) (2097151 & j));
                if (nbqVar == null) {
                    nbqVar = null;
                    break;
                }
                long j2 = 2097152 + j;
                int k = k(nbqVar);
                if (k >= 0 && this.f.c(j, (j2 & (-2097152)) | k)) {
                    nbqVar.nextParkedWorker = a;
                    break;
                }
            }
            if (nbqVar == null) {
                return false;
            }
        } while (!nbqVar.b.c(-1, 0));
        LockSupport.unpark(nbqVar);
        return true;
    }

    private static final int k(nbq nbqVar) {
        int i;
        do {
            Object obj = nbqVar.nextParkedWorker;
            if (obj == a) {
                return -1;
            }
            if (obj == null) {
                return 0;
            }
            nbqVar = (nbq) obj;
            i = nbqVar.indexInArray;
        } while (i == 0);
        return i;
    }

    public final void a(nbq nbqVar, int i, int i2) {
        while (true) {
            long j = this.f.b;
            long j2 = 2097152 + j;
            int i3 = (int) (2097151 & j);
            if (i3 == i) {
                if (i2 == 0) {
                    i3 = k(nbqVar);
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0 && this.f.c(j, (j2 & (-2097152)) | i3)) {
                return;
            }
        }
    }

    public final void b() {
        if (!j() && !i(this.h.b)) {
            j();
        }
    }

    public final boolean c() {
        return this.k.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        nbv nbvVar;
        if (!this.k.a(false, true)) {
            return;
        }
        nbq h = h();
        synchronized (this.g) {
            j = this.h.b & 2097151;
        }
        int i = (int) j;
        if (i > 0) {
            int i2 = 1;
            while (true) {
                Object a2 = this.g.a(i2);
                a2.getClass();
                nbq nbqVar = (nbq) a2;
                if (nbqVar != h) {
                    while (nbqVar.getState() != Thread.State.TERMINATED) {
                        LockSupport.unpark(nbqVar);
                        nbqVar.join(10000L);
                    }
                    boolean z = msy.a;
                    nca ncaVar = nbqVar.a;
                    ktf ktfVar = this.j;
                    nbv nbvVar2 = (nbv) ((mrr) ncaVar.b).a(null);
                    if (nbvVar2 != null) {
                        ktfVar.t(nbvVar2);
                    }
                    while (true) {
                        nbv c = ncaVar.c();
                        if (c == null) {
                            break;
                        } else {
                            ktfVar.t(c);
                        }
                    }
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        this.j.s();
        this.i.s();
        while (true) {
            if (h != null) {
                nbvVar = h.b(true);
                if (nbvVar != null) {
                    continue;
                    f(nbvVar);
                }
            }
            nbvVar = (nbv) this.i.r();
            if (nbvVar == null && (nbvVar = (nbv) this.j.r()) == null) {
                break;
            }
            f(nbvVar);
        }
        if (h != null) {
            h.d(5);
        }
        boolean z2 = msy.a;
        this.f.b = 0L;
        this.h.b = 0L;
    }

    public final void d(Runnable runnable, nbw nbwVar, boolean z) {
        nbv nbxVar;
        long j;
        boolean t;
        int i;
        String str = nby.a;
        long nanoTime = System.nanoTime();
        if (runnable instanceof nbv) {
            nbxVar = (nbv) runnable;
            nbxVar.g = nanoTime;
            nbxVar.h = nbwVar;
        } else {
            nbxVar = new nbx(runnable, nanoTime, nbwVar);
        }
        int i2 = nbxVar.h.a;
        if (i2 != 0) {
            j = this.h.a(2097152L);
        } else {
            j = 0;
        }
        nbq h = h();
        boolean z2 = true;
        if (h != null && (i = h.e) != 5 && (nbxVar.h.a != 0 || i != 2)) {
            h.c = true;
            nca ncaVar = h.a;
            if (z) {
                nbxVar = ncaVar.b(nbxVar);
            } else {
                nbv nbvVar = (nbv) ((mrr) ncaVar.b).a(nbxVar);
                if (nbvVar == null) {
                    nbxVar = null;
                } else {
                    nbxVar = ncaVar.b(nbvVar);
                }
            }
        }
        if (nbxVar != null) {
            if (nbxVar.h.a == 1) {
                t = this.j.t(nbxVar);
            } else {
                t = this.i.t(nbxVar);
            }
            if (!t) {
                throw new RejectedExecutionException(String.valueOf(this.e).concat(" was terminated"));
            }
        }
        if (!z || h == null) {
            z2 = false;
        }
        if (i2 != 0) {
            if (!z2 && !j() && !i(j)) {
                j();
                return;
            }
            return;
        }
        if (!z2) {
            b();
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        e(this, runnable, false, 6);
    }

    public final String toString() {
        int a2;
        ArrayList arrayList = new ArrayList();
        int length = this.g.array.length();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < length; i6++) {
            nbq nbqVar = (nbq) this.g.a(i6);
            if (nbqVar != null) {
                nca ncaVar = nbqVar.a;
                if (((mrr) ncaVar.b).a != null) {
                    a2 = ncaVar.a() + 1;
                } else {
                    a2 = ncaVar.a();
                }
                int i7 = nbqVar.e;
                int i8 = i7 - 1;
                if (i7 != 0) {
                    if (i8 != 0) {
                        if (i8 != 1) {
                            if (i8 != 2) {
                                if (i8 != 3) {
                                    if (i8 == 4) {
                                        i5++;
                                    }
                                } else {
                                    i4++;
                                    if (a2 > 0) {
                                        arrayList.add(a2 + "d");
                                    }
                                }
                            } else {
                                i3++;
                            }
                        } else {
                            arrayList.add(a2 + "b");
                            i2++;
                        }
                    } else {
                        arrayList.add(a2 + "c");
                        i++;
                    }
                } else {
                    throw null;
                }
            }
        }
        mrq mrqVar = this.h;
        String str = this.e;
        long j = mrqVar.b;
        String b = msz.b(this);
        int i9 = this.b;
        int i10 = this.c;
        ktf ktfVar = this.i;
        ktf ktfVar2 = this.j;
        long j2 = j & 2097151;
        long j3 = 4398044413952L & j;
        long j4 = j & 9223367638808264704L;
        return str + "@" + b + "[Pool Size {core = " + i9 + ", max = " + i10 + "}, Worker States {CPU = " + i + ", blocking = " + i2 + ", parked = " + i3 + ", dormant = " + i4 + ", terminated = " + i5 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + ktfVar.q() + ", global blocking queue size = " + ktfVar2.q() + ", Control State {created workers= " + ((int) j2) + ", blocking tasks = " + ((int) (j3 >> 21)) + ", CPUs acquired = " + (i9 - ((int) (j4 >> 42))) + "}]";
    }
}
