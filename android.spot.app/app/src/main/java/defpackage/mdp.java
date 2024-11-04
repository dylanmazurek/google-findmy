package defpackage;

import java.nio.charset.Charset;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class mdp extends lyv {
    public static final double a;
    private static final Logger k = Logger.getLogger(mdp.class.getName());
    public final mbg b;
    public final Executor c;
    public final mdg d;
    public final lzi e;
    public mdj f;
    public lys g;
    public mdq h;
    public final ScheduledExecutorService i;
    public lzm j = lzm.b;
    private final boolean l;
    private final boolean m;
    private boolean n;
    private boolean o;
    private final mge p;

    static {
        "gzip".getBytes(Charset.forName("US-ASCII"));
        a = TimeUnit.SECONDS.toNanos(1L);
    }

    public mdp(mbg mbgVar, Executor executor, lys lysVar, mge mgeVar, ScheduledExecutorService scheduledExecutorService, mdg mdgVar) {
        lzc lzcVar = lzc.a;
        this.b = mbgVar;
        String str = mbgVar.b;
        System.identityHashCode(this);
        int i = mkl.a;
        if (executor == jxv.a) {
            this.c = new mjh();
            this.l = true;
        } else {
            this.c = new mjl(executor);
            this.l = false;
        }
        this.d = mdgVar;
        this.e = lzi.b();
        mbf mbfVar = mbgVar.a;
        this.m = mbfVar == mbf.UNARY || mbfVar == mbf.SERVER_STREAMING;
        this.g = lysVar;
        this.p = mgeVar;
        this.i = scheduledExecutorService;
    }

    private final void g(Object obj) {
        boolean z;
        if (this.h != null) {
            z = true;
        } else {
            z = false;
        }
        hwx.V(z, "Not started");
        hwx.V(!this.n, "call was cancelled");
        hwx.V(!this.o, "call was half-closed");
        try {
            mdq mdqVar = this.h;
            if (mdqVar instanceof mjc) {
                mjc mjcVar = (mjc) mdqVar;
                mix mixVar = mjcVar.q;
                if (mixVar.a) {
                    mixVar.f.a.v(mjcVar.e.b(obj));
                } else {
                    mjcVar.e(new mir(mjcVar, obj));
                }
            } else {
                mdqVar.v(this.b.b(obj));
            }
            if (!this.m) {
                this.h.r();
            }
        } catch (Error e) {
            this.h.h(mca.c.d("Client sendMessage() failed with Error"));
            throw e;
        } catch (RuntimeException e2) {
            this.h.h(mca.c.c(e2).d("Failed to stream message"));
        }
    }

    @Override // defpackage.lyv
    public final void a(mjo mjoVar, mbc mbcVar) {
        boolean z;
        boolean z2;
        mjd mjdVar;
        mdq mjcVar;
        ScheduledExecutorService scheduledExecutorService;
        double longValue;
        lys lysVar;
        int i = mkl.a;
        if (this.h == null) {
            z = true;
        } else {
            z = false;
        }
        hwx.V(z, "Already started");
        hwx.V(!this.n, "call was cancelled");
        mjoVar.getClass();
        mbcVar.getClass();
        mhb mhbVar = (mhb) this.g.e(mhb.a);
        if (mhbVar != null) {
            Long l = mhbVar.b;
            if (l != null) {
                long longValue2 = l.longValue();
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                mjo mjoVar2 = lzj.c;
                if (timeUnit != null) {
                    lzj lzjVar = new lzj(mjoVar2, System.nanoTime(), timeUnit.toNanos(longValue2));
                    lzj lzjVar2 = this.g.b;
                    if (lzjVar2 == null || lzjVar.compareTo(lzjVar2) < 0) {
                        lyq a2 = lys.a(this.g);
                        a2.a = lzjVar;
                        this.g = new lys(a2);
                    }
                } else {
                    throw new NullPointerException("units");
                }
            }
            Boolean bool = mhbVar.c;
            if (bool != null) {
                if (bool.booleanValue()) {
                    lyq a3 = lys.a(this.g);
                    a3.e = Boolean.TRUE;
                    lysVar = new lys(a3);
                } else {
                    lyq a4 = lys.a(this.g);
                    a4.e = Boolean.FALSE;
                    lysVar = new lys(a4);
                }
                this.g = lysVar;
            }
            Integer num = mhbVar.d;
            if (num != null) {
                lys lysVar2 = this.g;
                Integer num2 = lysVar2.e;
                if (num2 != null) {
                    this.g = lysVar2.b(Math.min(num2.intValue(), mhbVar.d.intValue()));
                } else {
                    this.g = lysVar2.b(num.intValue());
                }
            }
            Integer num3 = mhbVar.e;
            if (num3 != null) {
                lys lysVar3 = this.g;
                Integer num4 = lysVar3.f;
                if (num4 != null) {
                    this.g = lysVar3.c(Math.min(num4.intValue(), mhbVar.e.intValue()));
                } else {
                    this.g = lysVar3.c(num3.intValue());
                }
            }
        }
        lza lzaVar = lyz.a;
        lzm lzmVar = this.j;
        mbcVar.c(mfh.f);
        mbcVar.c(mfh.b);
        if (lzaVar != lyz.a) {
            mbcVar.e(mfh.b, "identity");
        }
        mbcVar.c(mfh.c);
        byte[] bArr = lzmVar.d;
        if (bArr.length != 0) {
            mbcVar.e(mfh.c, bArr);
        }
        mbcVar.c(mfh.d);
        mbcVar.c(mfh.e);
        lzj b = b();
        mfi mfiVar = null;
        if (b != null && b.equals(null)) {
            z2 = true;
        } else {
            z2 = false;
        }
        mdj mdjVar = new mdj(this, b, z2);
        this.f = mdjVar;
        if (b != null && mdjVar.c <= 0) {
            lyy[] i2 = mfh.i(this.g);
            String str = "Context";
            if (true != z2) {
                str = "CallOptions";
            }
            Long l2 = (Long) this.g.e(lyy.f);
            double d = this.f.c;
            double d2 = a;
            Double valueOf = Double.valueOf(d / d2);
            if (l2 == null) {
                longValue = 0.0d;
            } else {
                longValue = l2.longValue() / d2;
            }
            this.h = new mew(mca.e.d(String.format("ClientCall started after %s deadline was exceeded %.9f seconds ago. Name resolution delay %.9f seconds.", str, valueOf, Double.valueOf(longValue))), i2);
        } else {
            mge mgeVar = this.p;
            mbg mbgVar = this.b;
            lys lysVar4 = this.g;
            lzi lziVar = this.e;
            if (!mgeVar.b.N) {
                lyy[] i3 = mfh.i(lysVar4);
                lzi a5 = lziVar.a();
                try {
                    mjcVar = mgeVar.b.y.a(mbgVar, mbcVar, lysVar4, i3);
                } finally {
                    lziVar.c(a5);
                }
            } else {
                mhb mhbVar2 = (mhb) lysVar4.e(mhb.a);
                if (mhbVar2 == null) {
                    mjdVar = null;
                } else {
                    mjdVar = mhbVar2.f;
                }
                if (mhbVar2 != null) {
                    mfiVar = mhbVar2.g;
                }
                mjcVar = new mjc(mgeVar, mbgVar, mbcVar, lysVar4, mjdVar, mfiVar, lziVar);
            }
            this.h = mjcVar;
        }
        if (this.l) {
            this.h.s();
        }
        Integer num5 = this.g.e;
        if (num5 != null) {
            this.h.l(num5.intValue());
        }
        Integer num6 = this.g.f;
        if (num6 != null) {
            this.h.m(num6.intValue());
        }
        if (b != null) {
            this.h.j(b);
        }
        this.h.u(lzaVar);
        this.h.k(this.j);
        this.d.b();
        this.h.n(new mdo(this, mjoVar));
        mdj mdjVar2 = this.f;
        if (!mdjVar2.e) {
            if (mdjVar2.b && !mdjVar2.a && (scheduledExecutorService = mdjVar2.f.i) != null) {
                mdjVar2.d = scheduledExecutorService.schedule(new mfy(mdjVar2), mdjVar2.c, TimeUnit.NANOSECONDS);
            }
            mdp mdpVar = mdjVar2.f;
            lzi.d(jxv.a, "executor");
            if (mdjVar2.e) {
                mdjVar2.b();
            }
        }
    }

    public final lzj b() {
        lzj lzjVar = this.g.b;
        if (lzjVar == null) {
            return null;
        }
        return lzjVar;
    }

    @Override // defpackage.lyv
    public final void c(String str, Throwable th) {
        mca d;
        int i = mkl.a;
        if (str == null && th == null) {
            th = new CancellationException("Cancelled without a message or cause");
            k.logp(Level.WARNING, "io.grpc.internal.ClientCallImpl", "cancelInternal", "Cancelling without a message or cause is suboptimal", th);
        }
        if (!this.n) {
            this.n = true;
            try {
                if (this.h != null) {
                    mca mcaVar = mca.c;
                    if (str != null) {
                        d = mcaVar.d(str);
                    } else {
                        d = mcaVar.d("Call cancelled without message");
                    }
                    if (th != null) {
                        d = d.c(th);
                    }
                    this.h.h(d);
                }
                mdj mdjVar = this.f;
                if (mdjVar != null) {
                    mdjVar.b();
                }
            } catch (Throwable th2) {
                mdj mdjVar2 = this.f;
                if (mdjVar2 != null) {
                    mdjVar2.b();
                }
                throw th2;
            }
        }
    }

    @Override // defpackage.lyv
    public final void d() {
        boolean z;
        int i = mkl.a;
        if (this.h != null) {
            z = true;
        } else {
            z = false;
        }
        hwx.V(z, "Not started");
        hwx.V(!this.n, "call was cancelled");
        hwx.V(!this.o, "call already half-closed");
        this.o = true;
        this.h.i();
    }

    @Override // defpackage.lyv
    public final void e(int i) {
        boolean z;
        int i2 = mkl.a;
        if (this.h != null) {
            z = true;
        } else {
            z = false;
        }
        hwx.V(z, "Not started");
        hwx.K(true, "Number requested must be non-negative");
        this.h.t(i);
    }

    @Override // defpackage.lyv
    public final void f(Object obj) {
        int i = mkl.a;
        g(obj);
    }

    public final String toString() {
        jeq q = ivc.q(this);
        q.b("method", this.b);
        return q.toString();
    }
}
