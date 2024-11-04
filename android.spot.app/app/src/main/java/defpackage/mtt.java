package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class mtt extends mto implements mtd {
    private final mro a;
    public final mrr c = new mrr(null, mrs.a);
    public final mrr d;

    public mtt() {
        mrs mrsVar = mrs.a;
        this.d = new mrr(null, mrsVar);
        this.a = new mro(false, mrsVar);
    }

    private final boolean y(Runnable runnable) {
        while (true) {
            Object obj = this.c.a;
            if (w()) {
                return false;
            }
            if (obj == null) {
                if (this.c.d(null, runnable)) {
                    return true;
                }
            } else if (obj instanceof nbb) {
                nbb nbbVar = (nbb) obj;
                int a = nbbVar.a(runnable);
                if (a == 0) {
                    return true;
                }
                if (a != 1) {
                    return false;
                }
                this.c.d(obj, nbbVar.c());
            } else {
                if (obj == mtu.b) {
                    return false;
                }
                nbb nbbVar2 = new nbb(8, true);
                nbbVar2.a((Runnable) obj);
                nbbVar2.a(runnable);
                if (this.c.d(obj, nbbVar2)) {
                    return true;
                }
            }
        }
    }

    @Override // defpackage.mst
    public final void a(mnb mnbVar, Runnable runnable) {
        h(runnable);
    }

    @Override // defpackage.mtd
    public final void c(long j, msd msdVar) {
        long a = mtu.a(j);
        if (a < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            mtp mtpVar = new mtp(this, a + nanoTime, msdVar);
            v(nanoTime, mtpVar);
            msz.v(msdVar, mtpVar);
        }
    }

    public mtl g(long j, Runnable runnable, mnb mnbVar) {
        return mtb.a.g(j, runnable, mnbVar);
    }

    public void h(Runnable runnable) {
        if (y(runnable)) {
            r();
        } else {
            mta.a.h(runnable);
        }
    }

    @Override // defpackage.mto
    public void j() {
        nbn nbnVar;
        ThreadLocal threadLocal = mvc.a;
        mvc.a.set(null);
        this.a.c();
        boolean z = msy.a;
        while (true) {
            Object obj = this.c.a;
            if (obj == null) {
                if (this.c.d(null, mtu.b)) {
                    break;
                }
            } else if (obj instanceof nbb) {
                ((nbb) obj).d();
                break;
            } else {
                if (obj == mtu.b) {
                    break;
                }
                nbb nbbVar = new nbb(8, true);
                nbbVar.a((Runnable) obj);
                if (this.c.d(obj, nbbVar)) {
                    break;
                }
            }
        }
        do {
        } while (k() <= 0);
        long nanoTime = System.nanoTime();
        while (true) {
            mts mtsVar = (mts) this.d.a;
            if (mtsVar != null) {
                synchronized (mtsVar) {
                    if (mtsVar.a() > 0) {
                        nbnVar = mtsVar.d(0);
                    } else {
                        nbnVar = null;
                    }
                }
                mtr mtrVar = (mtr) nbnVar;
                if (mtrVar != null) {
                    i(nanoTime, mtrVar);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    @Override // defpackage.mto
    public final long k() {
        long j;
        mtr mtrVar;
        nbn nbnVar;
        if (q()) {
            return 0L;
        }
        mts mtsVar = (mts) this.d.a;
        Runnable runnable = null;
        if (mtsVar != null && !mtsVar.g()) {
            long nanoTime = System.nanoTime();
            do {
                synchronized (mtsVar) {
                    nbn b = mtsVar.b();
                    if (b == null) {
                        nbnVar = null;
                    } else {
                        mtr mtrVar2 = (mtr) b;
                        if (nanoTime - mtrVar2.b >= 0 && y(mtrVar2)) {
                            nbnVar = mtsVar.d(0);
                        } else {
                            nbnVar = null;
                        }
                    }
                }
            } while (((mtr) nbnVar) != null);
        }
        mrr mrrVar = this.c;
        while (true) {
            Object obj = mrrVar.a;
            if (obj == null) {
                break;
            }
            if (obj instanceof nbb) {
                nbb nbbVar = (nbb) obj;
                Object b2 = nbbVar.b();
                if (b2 != nbb.a) {
                    runnable = (Runnable) b2;
                    break;
                }
                this.c.d(obj, nbbVar.c());
            } else {
                if (obj == mtu.b) {
                    break;
                }
                if (this.c.d(obj, null)) {
                    runnable = (Runnable) obj;
                    break;
                }
            }
        }
        if (runnable == null) {
            mlv mlvVar = this.b;
            if (mlvVar == null || mlvVar.isEmpty()) {
                j = Long.MAX_VALUE;
            } else {
                j = 0;
            }
            if (j == 0) {
                return 0L;
            }
            Object obj2 = this.c.a;
            if (obj2 != null) {
                if (obj2 instanceof nbb) {
                    if (!((nbb) obj2).e()) {
                        return 0L;
                    }
                } else {
                    if (obj2 != mtu.b) {
                        return 0L;
                    }
                    return Long.MAX_VALUE;
                }
            }
            mts mtsVar2 = (mts) this.d.a;
            if (mtsVar2 != null && (mtrVar = (mtr) mtsVar2.c()) != null) {
                return moz.af(mtrVar.b - System.nanoTime(), 0L);
            }
            return Long.MAX_VALUE;
        }
        runnable.run();
        return 0L;
    }

    public final mtl u(long j, Runnable runnable) {
        long a = mtu.a(j);
        if (a < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            mtq mtqVar = new mtq(a + nanoTime, runnable);
            v(nanoTime, mtqVar);
            return mtqVar;
        }
        return muu.a;
    }

    public final void v(long j, mtr mtrVar) {
        if (!w()) {
            mts mtsVar = (mts) this.d.a;
            mtr mtrVar2 = null;
            if (mtsVar == null) {
                this.d.d(null, new mts(j));
                Object obj = this.d.a;
                obj.getClass();
                mtsVar = (mts) obj;
            }
            synchronized (mtrVar) {
                if (mtrVar._heap != mtu.a) {
                    synchronized (mtsVar) {
                        mtr mtrVar3 = (mtr) mtsVar.b();
                        if (!w()) {
                            if (mtrVar3 == null) {
                                mtsVar.a = j;
                            } else {
                                long j2 = mtrVar3.b;
                                if (j2 - j < 0) {
                                    j = j2;
                                }
                                long j3 = mtsVar.a;
                                if (j - j3 > 0) {
                                    mtsVar.a = j;
                                } else {
                                    j = j3;
                                }
                            }
                            if (mtrVar.b - j < 0) {
                                mtrVar.b = j;
                            }
                            boolean z = msy.a;
                            mtrVar.d(mtsVar);
                            nbn[] nbnVarArr = mtsVar.b;
                            if (nbnVarArr == null) {
                                nbnVarArr = new nbn[4];
                                mtsVar.b = nbnVarArr;
                            } else if (mtsVar.a() >= nbnVarArr.length) {
                                int a = mtsVar.a();
                                Object[] copyOf = Arrays.copyOf(nbnVarArr, a + a);
                                copyOf.getClass();
                                nbnVarArr = (nbn[]) copyOf;
                                mtsVar.b = nbnVarArr;
                            }
                            int a2 = mtsVar.a();
                            mtsVar.e(a2 + 1);
                            nbnVarArr[a2] = mtrVar;
                            mtrVar.e(a2);
                            mtsVar.f(a2);
                            mts mtsVar2 = (mts) this.d.a;
                            if (mtsVar2 != null) {
                                mtrVar2 = (mtr) mtsVar2.c();
                            }
                            if (mtrVar2 == mtrVar) {
                                r();
                                return;
                            }
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
        }
        i(j, mtrVar);
    }

    public final boolean w() {
        return this.a.b();
    }

    public final boolean x() {
        if (!p()) {
            return false;
        }
        mts mtsVar = (mts) this.d.a;
        if (mtsVar != null && !mtsVar.g()) {
            return false;
        }
        Object obj = this.c.a;
        if (obj == null) {
            return true;
        }
        if (obj instanceof nbb) {
            return ((nbb) obj).e();
        }
        if (obj != mtu.b) {
            return false;
        }
        return true;
    }
}
