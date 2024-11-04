package defpackage;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class jnp implements jnx, jov {
    private static final String a = new String();
    public final long b;
    public jno c;
    public jof d;
    private final Level e;
    private jns f;
    private jpw g;
    private Object[] h;

    /* JADX INFO: Access modifiers changed from: protected */
    public jnp(Level level) {
        long b = jpu.b();
        this.c = null;
        this.f = null;
        this.d = null;
        this.g = null;
        this.h = null;
        level.getClass();
        this.e = level;
        this.b = b;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final void K(String str, Object... objArr) {
        lcs lcsVar;
        ldi ldiVar;
        this.h = objArr;
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj instanceof ghj) {
                lce lceVar = ((ghj) obj).a;
                StringBuilder sb = new StringBuilder();
                String str2 = "null";
                if ((lceVar.a & 2) != 0) {
                    lcd lcdVar = lceVar.b;
                    if (lcdVar == null) {
                        lcdVar = lcd.e;
                    }
                    if (lcdVar.b == 2) {
                        sb.append("Clearcut Logging UserInteraction [");
                        if (lcdVar.b == 2) {
                            ldiVar = (ldi) lcdVar.c;
                        } else {
                            ldiVar = ldi.n;
                        }
                        if ((ldiVar.a & 1) != 0) {
                            lde b = lde.b(ldiVar.b);
                            if (b == null) {
                                b = lde.INTERACTION_TYPE_UNSPECIFIED;
                            }
                            sb.append(b.name());
                        } else {
                            sb.append("null");
                        }
                        sb.append("]");
                    } else {
                        sb.append("Clearcut Logging NotificationFailure [");
                        if (lcdVar.b == 3) {
                            lcsVar = (lcs) lcdVar.c;
                        } else {
                            lcsVar = lcs.h;
                        }
                        if ((lcsVar.a & 1) != 0) {
                            lcr b2 = lcr.b(lcsVar.b);
                            if (b2 == null) {
                                b2 = lcr.NOTIFICATION_FAILURE_UNSPECIFIED;
                            }
                            sb.append(b2);
                        } else {
                            sb.append("null");
                        }
                        sb.append("]");
                    }
                    if ((lcdVar.a & 1) != 0) {
                        lcc lccVar = lcdVar.d;
                        if (lccVar == null) {
                            lccVar = lcc.l;
                        }
                        sb.append(" for client_id [");
                        sb.append(lccVar.c);
                        sb.append("], thread_ids [ ");
                        for (lcb lcbVar : lccVar.b) {
                            sb.append("<");
                            sb.append(lcbVar.b);
                            sb.append("> ");
                        }
                        sb.append("] ");
                    }
                }
                if ((lceVar.a & 4) != 0) {
                    sb.append("on env [");
                    int a2 = kzy.a(lceVar.c);
                    if (a2 != 0) {
                        switch (a2) {
                            case 2:
                                str2 = "DEV";
                                break;
                            case 3:
                                str2 = "AUTOPUSH";
                                break;
                            case 4:
                                str2 = "PRODUCTION";
                                break;
                            case 5:
                                str2 = "DAILY_0";
                                break;
                            case 6:
                                str2 = "DAILY_1";
                                break;
                            case 7:
                                str2 = "DAILY_2";
                                break;
                            case 8:
                                str2 = "DAILY_3";
                                break;
                            case 9:
                                str2 = "DAILY_4";
                                break;
                            case 10:
                                str2 = "DAILY_5";
                                break;
                            case 11:
                                str2 = "DAILY_6";
                                break;
                            case 13:
                                str2 = "STAGING";
                                break;
                            case 14:
                                str2 = "AUTOPUSH_QUAL_PLAYGROUND";
                                break;
                            case 15:
                                str2 = "STAGING_QUAL_QA";
                                break;
                        }
                    }
                    str2 = "UNKNOWN_ENVIRONMENT";
                    sb.append(str2);
                    sb.append("]");
                }
                objArr[i] = sb.toString();
            }
        }
        if (str != a) {
            this.g = new jpw(a(), str);
        }
        jqs k = jpu.k();
        if (!k.a()) {
            jqs jqsVar = (jqs) l().d(jnn.h);
            if (jqsVar != null && !jqsVar.a()) {
                k = k.a() ? jqsVar : new jqs(new jqq(k.c, jqsVar.c));
            }
            p(jnn.h, k);
        }
        jnb c = c();
        try {
            jrf jrfVar = (jrf) jrf.a.get();
            int i2 = jrfVar.b + 1;
            jrfVar.b = i2;
            if (i2 != 0) {
                try {
                    if (i2 <= 100) {
                        c.a.c(this);
                    } else {
                        jnb.i("unbounded recursion in log statement", this);
                    }
                    if (jrfVar != null) {
                        jrfVar.close();
                        return;
                    }
                    return;
                } finally {
                }
            }
            throw new AssertionError("Overflow of RecursionDepth (possible error in core library)");
        } catch (RuntimeException e) {
            try {
                c.a.b(e, this);
            } catch (jox e2) {
                throw e2;
            } catch (RuntimeException e3) {
                jnb.i(e3.getClass().getName() + ": " + e3.getMessage(), this);
                try {
                    e3.printStackTrace(System.err);
                } catch (RuntimeException unused) {
                }
            }
        }
    }

    private final boolean L() {
        int i;
        boolean z = true;
        if (this.f == null) {
            this.f = jpu.g().a(jnp.class, 1);
        }
        jnt jntVar = this.f;
        if (jntVar != jns.a) {
            jno jnoVar = this.c;
            if (jnoVar != null && (i = jnoVar.b) > 0) {
                jntVar.getClass();
                for (int i2 = 0; i2 < i; i2++) {
                    if (jnn.f.equals(jnoVar.c(i2))) {
                        Object e = jnoVar.e(i2);
                        if (e instanceof jny) {
                            jntVar = ((jny) e).b();
                        } else {
                            jntVar = new joj(jntVar, e);
                        }
                    }
                }
            }
        } else {
            jntVar = null;
        }
        boolean b = b(jntVar);
        jof jofVar = this.d;
        if (jofVar != null) {
            joe joeVar = (joe) joe.a.b(jntVar, this.c);
            int incrementAndGet = joeVar.c.incrementAndGet();
            int i3 = -1;
            if (jofVar != jof.c && joeVar.b.compareAndSet(false, true)) {
                try {
                    jofVar.a();
                    joeVar.b.set(false);
                    joeVar.c.addAndGet(-incrementAndGet);
                    i3 = (-1) + incrementAndGet;
                } catch (Throwable th) {
                    joeVar.b.set(false);
                    throw th;
                }
            }
            if (b && i3 > 0) {
                this.c.f(jnn.e, Integer.valueOf(i3));
            }
            if (i3 < 0) {
                z = false;
            }
            return b & z;
        }
        return b;
    }

    @Override // defpackage.jnx
    public final void A(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (L()) {
            K(str, obj, obj2, obj3, obj4);
        }
    }

    @Override // defpackage.jnx
    public final void B(String str, Object[] objArr) {
        if (L()) {
            K(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    @Override // defpackage.jnx
    public final boolean C() {
        if (!D() && !c().j(this.e)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.jov
    public final boolean D() {
        if (this.c != null && Boolean.TRUE.equals(this.c.d(jnn.g))) {
            return true;
        }
        return false;
    }

    @Override // defpackage.jov
    public final Object[] E() {
        if (this.g != null) {
            return this.h;
        }
        throw new IllegalStateException("cannot get arguments unless a template context exists");
    }

    @Override // defpackage.jnx
    public final jnx F() {
        joa joaVar = jnn.b;
        if (D()) {
            return d();
        }
        p(joaVar, 10);
        return d();
    }

    @Override // defpackage.jnx
    public final void G(byte b) {
        if (L()) {
            K("Unexpected ringing status %s", Byte.valueOf(b));
        }
    }

    @Override // defpackage.jnx
    public final void H(int i, boolean z) {
        if (L()) {
            K("Scan failed with code %s. Bluetooth enabled: %s", Integer.valueOf(i), Boolean.valueOf(z));
        }
    }

    @Override // defpackage.jnx
    public final void I(Object obj, long j) {
        if (L()) {
            K("Component-set %s found %d seconds after explode op", obj, Long.valueOf(j));
        }
    }

    @Override // defpackage.jnx
    public final void J(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        if (L()) {
            K("Calculated %d EIDs. (Exponent: %d Timestamp: %d Duration: %d Offset: %d Components: %d)", obj, obj2, obj3, obj4, obj5, obj6);
        }
    }

    protected abstract jra a();

    protected boolean b(jnt jntVar) {
        throw null;
    }

    protected abstract jnb c();

    protected abstract jnx d();

    @Override // defpackage.jov
    public final long e() {
        return this.b;
    }

    @Override // defpackage.jov
    public final jns f() {
        jns jnsVar = this.f;
        if (jnsVar != null) {
            return jnsVar;
        }
        throw new IllegalStateException("cannot request log site information prior to postProcess()");
    }

    @Override // defpackage.jnx
    public final jnx g(int i, TimeUnit timeUnit) {
        if (D()) {
            return d();
        }
        p(jnn.d, new jnf(i, timeUnit));
        return d();
    }

    @Override // defpackage.jnx
    public final jnx h(joa joaVar, Object obj) {
        joaVar.getClass();
        if (obj != null) {
            p(joaVar, obj);
        }
        return d();
    }

    @Override // defpackage.jnx
    public final jnx i(Throwable th) {
        return h(jnn.a, th);
    }

    @Override // defpackage.jnx
    public final jnx j(String str, String str2, int i, String str3) {
        jnr jnrVar = new jnr(str, str2, i, str3);
        if (this.f == null) {
            this.f = jnrVar;
        }
        return d();
    }

    @Override // defpackage.jnx
    public final jnx k(jok jokVar) {
        jokVar.getClass();
        if (jokVar != jok.NONE) {
            p(jnn.i, jokVar);
        }
        return d();
    }

    @Override // defpackage.jov
    public final jpa l() {
        jno jnoVar = this.c;
        if (jnoVar != null) {
            return jnoVar;
        }
        return joz.a;
    }

    @Override // defpackage.jov
    public final jpw m() {
        return this.g;
    }

    @Override // defpackage.jov
    public final Object n() {
        if (this.g == null) {
            return this.h[0];
        }
        throw new IllegalStateException("cannot get literal argument if a template context exists");
    }

    @Override // defpackage.jov
    public final Level o() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void p(joa joaVar, Object obj) {
        if (this.c == null) {
            this.c = new jno();
        }
        this.c.f(joaVar, obj);
    }

    @Override // defpackage.jnx
    public final void q() {
        if (L()) {
            K(a, "");
        }
    }

    @Override // defpackage.jnx
    public final void r(String str) {
        if (L()) {
            K(a, str);
        }
    }

    @Override // defpackage.jnx
    public final void s(String str, int i) {
        if (L()) {
            K(str, Integer.valueOf(i));
        }
    }

    @Override // defpackage.jnx
    public final void t(String str, long j) {
        if (L()) {
            K(str, Long.valueOf(j));
        }
    }

    @Override // defpackage.jnx
    public final void u(String str, Object obj) {
        if (L()) {
            K(str, obj);
        }
    }

    @Override // defpackage.jnx
    public final void v(String str, int i, int i2) {
        if (L()) {
            K(str, Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    @Override // defpackage.jnx
    public final void w(String str, int i, Object obj) {
        if (L()) {
            K(str, Integer.valueOf(i), obj);
        }
    }

    @Override // defpackage.jnx
    public final void x(String str, Object obj, int i) {
        if (L()) {
            K(str, obj, Integer.valueOf(i));
        }
    }

    @Override // defpackage.jnx
    public final void y(String str, Object obj, Object obj2) {
        if (L()) {
            K(str, obj, obj2);
        }
    }

    @Override // defpackage.jnx
    public final void z(String str, Object obj, Object obj2, Object obj3) {
        if (L()) {
            K(str, obj, obj2, obj3);
        }
    }
}
