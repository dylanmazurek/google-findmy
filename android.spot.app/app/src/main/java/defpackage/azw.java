package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class azw {
    public final anz a;
    private final moh c = awu.s;
    private final moh d = awu.t;
    public final moh b = awu.u;
    private final moh e = awu.o;
    private final moh f = awu.p;
    private final moh g = awu.q;
    private final moh h = awu.r;

    public azw(moh mohVar) {
        this.a = new anz(mohVar);
    }

    public final void a(ayr ayrVar, boolean z, mnw mnwVar) {
        if (z && ayrVar.e != null) {
            d(ayrVar, this.g, mnwVar);
        } else {
            d(ayrVar, this.f, mnwVar);
        }
    }

    public final void b(ayr ayrVar, boolean z, mnw mnwVar) {
        if (z && ayrVar.e != null) {
            d(ayrVar, this.h, mnwVar);
        } else {
            d(ayrVar, this.e, mnwVar);
        }
    }

    public final void c(ayr ayrVar, boolean z, mnw mnwVar) {
        if (z && ayrVar.e != null) {
            d(ayrVar, this.c, mnwVar);
        } else {
            d(ayrVar, this.d, mnwVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object[]] */
    public final void d(azv azvVar, moh mohVar, mnw mnwVar) {
        anv anvVar;
        long j;
        long[] jArr;
        Object obj;
        int i;
        long[] jArr2;
        anz anzVar = this.a;
        synchronized (anzVar.f) {
            aiu aiuVar = anzVar.e;
            int i2 = aiuVar.b;
            anv anvVar2 = null;
            if (i2 > 0) {
                ?? r5 = aiuVar.a;
                int i3 = 0;
                while (true) {
                    ?? r10 = r5[i3];
                    if (((anv) r10).a == mohVar) {
                        anvVar2 = r10;
                        break;
                    } else {
                        i3++;
                        if (i3 >= i2) {
                            break;
                        }
                    }
                }
            }
            anvVar = anvVar2;
            if (anvVar == null) {
                mohVar.getClass();
                mpp.g(mohVar, 1);
                anvVar = new anv(mohVar);
                anzVar.e.o(anvVar);
            }
        }
        anv anvVar3 = anzVar.h;
        long j2 = anzVar.i;
        if (j2 != -1 && j2 != alq.a()) {
            ael.a("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j2 + "), currentThread={id=" + alq.a() + ", name=" + Thread.currentThread().getName() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
        }
        try {
            anzVar.h = anvVar;
            anzVar.i = alq.a();
            moh mohVar2 = anzVar.d;
            Object obj2 = anvVar.b;
            sr srVar = anvVar.h;
            int i4 = anvVar.c;
            anvVar.b = azvVar;
            anvVar.h = (sr) anvVar.j.a(azvVar);
            if (anvVar.c == -1) {
                anvVar.c = anm.b().v();
            }
            acn acnVar = anvVar.e;
            aiu a = agl.a();
            try {
                a.o(acnVar);
                amy.e(mohVar2, mnwVar);
                a.b(a.b - 1);
                Object obj3 = anvVar.b;
                obj3.getClass();
                int i5 = anvVar.c;
                sr srVar2 = anvVar.h;
                if (srVar2 != null) {
                    try {
                        long[] jArr3 = srVar2.a;
                        int length = jArr3.length - 2;
                        if (length >= 0) {
                            int i6 = 0;
                            while (true) {
                                long j3 = jArr3[i6];
                                j = j2;
                                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i7 = ~(i6 - length);
                                    int i8 = 0;
                                    while (true) {
                                        char c = '\b';
                                        int i9 = i7;
                                        i = 8 - (i7 >>> 31);
                                        if (i8 >= i) {
                                            break;
                                        }
                                        if ((j3 & 255) < 128) {
                                            int i10 = (i6 << 3) + i8;
                                            try {
                                                Object obj4 = srVar2.b[i10];
                                                jArr2 = jArr3;
                                                if (srVar2.c[i10] != i5) {
                                                    anvVar.a(obj3, obj4);
                                                    srVar2.b(i10);
                                                }
                                                c = '\b';
                                            } catch (Throwable th) {
                                                th = th;
                                                j2 = j;
                                                anzVar.h = anvVar3;
                                                anzVar.i = j2;
                                                throw th;
                                            }
                                        } else {
                                            jArr2 = jArr3;
                                        }
                                        j3 >>= c;
                                        i8++;
                                        jArr3 = jArr2;
                                        i7 = i9;
                                    }
                                    jArr = jArr3;
                                    if (i != 8) {
                                        break;
                                    }
                                } else {
                                    jArr = jArr3;
                                }
                                if (i6 == length) {
                                    break;
                                }
                                i6++;
                                j2 = j;
                                jArr3 = jArr;
                            }
                            obj = obj2;
                            anvVar.b = obj;
                            anvVar.h = srVar;
                            anvVar.c = i4;
                            anzVar.h = anvVar3;
                            anzVar.i = j;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        anzVar.h = anvVar3;
                        anzVar.i = j2;
                        throw th;
                    }
                }
                j = j2;
                obj = obj2;
                anvVar.b = obj;
                anvVar.h = srVar;
                anvVar.c = i4;
                anzVar.h = anvVar3;
                anzVar.i = j;
            } catch (Throwable th3) {
                a.b(a.b - 1);
                throw th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
