package defpackage;

import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.nio.channels.ReadableByteChannel;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mgs implements Runnable {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public mgs(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ngv ngvVar;
        long j;
        boolean z;
        int i = 0;
        ngv ngvVar2 = null;
        switch (this.b) {
            case 0:
                ((mcw) this.a).f.f(mgu.c);
                return;
            case 1:
                Object obj = this.a;
                Collection collection = ((mgp) obj).f.c.w;
                if (collection != null) {
                    collection.remove(obj);
                    if (((mgp) this.a).f.c.w.isEmpty()) {
                        mgu mguVar = ((mgp) this.a).f.c;
                        mguVar.O.c(mguVar.x, false);
                        mgu mguVar2 = ((mgp) this.a).f.c;
                        mguVar2.w = null;
                        if (mguVar2.A.get()) {
                            Object obj2 = this.a;
                            mca mcaVar = mgu.b;
                            mgt mgtVar = ((mgp) obj2).f.c.z;
                            synchronized (mgtVar.a) {
                                if (mgtVar.c != null) {
                                    return;
                                }
                                mgtVar.c = mcaVar;
                                boolean isEmpty = mgtVar.b.isEmpty();
                                if (isEmpty) {
                                    mgtVar.d.y.e(mcaVar);
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            case 2:
                mhw mhwVar = (mhw) this.a;
                mhwVar.l = null;
                if (mhwVar.g.f()) {
                    ((mhw) this.a).e();
                    return;
                }
                return;
            case 3:
                ((mhw) this.a).e();
                return;
            case 4:
                ((mia) this.a).a.a();
                return;
            case 5:
                mil milVar = (mil) this.a;
                if (!milVar.e) {
                    milVar.f = null;
                    return;
                }
                long a = milVar.a();
                Object obj3 = this.a;
                mil milVar2 = (mil) obj3;
                long j2 = milVar2.d - a;
                if (j2 > 0) {
                    milVar2.f = milVar2.a.schedule(new mgs(obj3, 6), j2, TimeUnit.NANOSECONDS);
                    return;
                }
                milVar2.e = false;
                milVar2.f = null;
                milVar2.c.run();
                return;
            case 6:
                Object obj4 = this.a;
                ((mil) obj4).b.execute(new mgs(obj4, 5));
                return;
            case 7:
                ((mjc) ((min) this.a).f).z = true;
                mjc mjcVar = (mjc) ((min) this.a).f;
                mds mdsVar = mjcVar.v;
                bso bsoVar = mjcVar.F;
                mdsVar.a((mca) bsoVar.c, (mdr) bsoVar.a, (mbc) bsoVar.b);
                return;
            case 8:
                mjc mjcVar2 = (mjc) this.a;
                if (!mjcVar2.z) {
                    mjcVar2.v.d();
                    return;
                }
                return;
            case 9:
                kvo kvoVar = (kvo) this.a;
                ((miz) kvoVar.c).b.f((mja) kvoVar.b);
                return;
            case 10:
                ((miz) this.a).b.z = true;
                mjc mjcVar3 = ((miz) this.a).b;
                mds mdsVar2 = mjcVar3.v;
                bso bsoVar2 = mjcVar3.F;
                mdsVar2.a((mca) bsoVar2.c, (mdr) bsoVar2.a, (mbc) bsoVar2.b);
                return;
            case 11:
                mjc mjcVar4 = ((miz) this.a).b;
                if (!mjcVar4.z) {
                    mjcVar4.v.d();
                    return;
                }
                return;
            case 12:
                ((mbn) this.a).b();
                return;
            case 13:
                mjg mjgVar = ((mjf) this.a).a;
                mjgVar.c.b(new mgs(mjgVar, 12));
                return;
            case 14:
                break;
            case 15:
                ((nmp) this.a).g++;
                return;
            case 16:
                nmx nmxVar = (nmx) this.a;
                nmp nmpVar = nmxVar.y;
                if (nmpVar != null) {
                    try {
                        nmpVar.e();
                    } catch (IOException e) {
                        Log.e(nmx.a, "Exception when closing OutputChannel", e);
                    }
                }
                HttpURLConnection httpURLConnection = nmxVar.q;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                    nmxVar.q = null;
                    return;
                }
                return;
            case 17:
                nmx nmxVar2 = (nmx) this.a;
                nmxVar2.f.add(nmxVar2.m);
                nmxVar2.g();
                return;
            case 18:
                nmx nmxVar3 = (nmx) this.a;
                ReadableByteChannel readableByteChannel = nmxVar3.n;
                if (readableByteChannel != null) {
                    try {
                        readableByteChannel.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                    nmxVar3.n = null;
                    return;
                }
                return;
            case 19:
                ((nmx) this.a).w++;
                return;
            default:
                nmx nmxVar4 = (nmx) this.a;
                nmxVar4.m = nmxVar4.p;
                nmxVar4.p = null;
                nmxVar4.g();
                return;
        }
        while (true) {
            Object obj5 = this.a;
            synchronized (obj5) {
                byte[] bArr = ngt.a;
                while (true) {
                    if (((ngy) obj5).f.isEmpty()) {
                        ngvVar = ngvVar2;
                    } else {
                        long nanoTime = System.nanoTime();
                        Iterator it = ((ngy) obj5).f.iterator();
                        long j3 = Long.MAX_VALUE;
                        ngvVar = ngvVar2;
                        while (true) {
                            if (it.hasNext()) {
                                ngv ngvVar3 = (ngv) ((ngx) it.next()).e.get(i);
                                long max = Math.max(0L, ngvVar3.c - nanoTime);
                                if (max > 0) {
                                    j3 = Math.min(max, j3);
                                } else if (ngvVar != null) {
                                    z = true;
                                } else {
                                    ngvVar = ngvVar3;
                                }
                                i = 0;
                            } else {
                                z = false;
                            }
                        }
                        if (ngvVar != null) {
                            ngvVar.c = -1L;
                            ngx ngxVar = ngvVar.b;
                            ngxVar.getClass();
                            ngxVar.e.remove(ngvVar);
                            ((ngy) obj5).f.remove(ngxVar);
                            ngxVar.d = ngvVar;
                            ((ngy) obj5).e.add(ngxVar);
                            if (z || (!((ngy) obj5).c && !((ngy) obj5).f.isEmpty())) {
                                ((ngy) obj5).h.l(((ngy) obj5).g);
                            }
                        } else if (((ngy) obj5).c) {
                            if (j3 < ((ngy) obj5).d - nanoTime) {
                                obj5.notify();
                            }
                            ngvVar = null;
                        } else {
                            ((ngy) obj5).c = true;
                            ((ngy) obj5).d = nanoTime + j3;
                            try {
                                try {
                                    long j4 = j3 / 1000000;
                                    if (j4 > 0 || j3 > 0) {
                                        Long.signum(j4);
                                        obj5.wait(j4, (int) (j3 - (1000000 * j4)));
                                    }
                                    ((ngy) obj5).c = false;
                                } catch (InterruptedException unused) {
                                    int size = ((ngy) obj5).e.size();
                                    while (true) {
                                        size--;
                                        if (size >= 0) {
                                            ((ngx) ((ngy) obj5).e.get(size)).c();
                                        } else {
                                            int size2 = ((ngy) obj5).f.size();
                                            while (true) {
                                                size2--;
                                                if (size2 >= 0) {
                                                    ngx ngxVar2 = (ngx) ((ngy) obj5).f.get(size2);
                                                    ngxVar2.c();
                                                    if (ngxVar2.e.isEmpty()) {
                                                        ((ngy) obj5).f.remove(size2);
                                                    }
                                                } else {
                                                    ((ngy) obj5).c = false;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = 0;
                                ngvVar2 = null;
                            } catch (Throwable th) {
                                ((ngy) obj5).c = false;
                                throw th;
                            }
                        }
                    }
                }
            }
            if (ngvVar == null) {
                return;
            }
            ngx ngxVar3 = ngvVar.b;
            ngxVar3.getClass();
            Object obj6 = this.a;
            boolean isLoggable = ngy.b.isLoggable(Level.FINE);
            if (isLoggable) {
                j = System.nanoTime();
                mkm.bb(ngvVar, ngxVar3, "starting");
            } else {
                j = -1;
            }
            try {
                Thread currentThread = Thread.currentThread();
                String name = currentThread.getName();
                currentThread.setName(ngvVar.a);
                try {
                    long a2 = ngvVar.a();
                    synchronized (obj6) {
                        ((ngy) obj6).b(ngvVar, a2);
                    }
                    currentThread.setName(name);
                    if (isLoggable) {
                        mkm.bb(ngvVar, ngxVar3, "finished run in ".concat(mkm.ba(System.nanoTime() - j)));
                    }
                    i = 0;
                    ngvVar2 = null;
                } catch (Throwable th2) {
                    synchronized (obj6) {
                        ((ngy) obj6).b(ngvVar, -1L);
                        currentThread.setName(name);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    ((ngy) obj6).h.l(this);
                    throw th3;
                } catch (Throwable th4) {
                    if (isLoggable) {
                        mkm.bb(ngvVar, ngxVar3, "failed a run in ".concat(mkm.ba(System.nanoTime() - j)));
                    }
                    throw th4;
                }
            }
        }
    }

    public /* synthetic */ mgs(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
