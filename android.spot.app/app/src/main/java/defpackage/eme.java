package defpackage;

import android.accounts.Account;
import android.content.Context;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eme implements ktv {
    public static final jen a = jen.b(' ');
    private static final long f = TimeUnit.MINUTES.toMillis(5);
    public final Object b = new Object();
    public final Map c = new HashMap();
    public final Map d = new HashMap();
    public final bym e;
    private final iaq g;

    public eme(iaq iaqVar, bym bymVar) {
        this.g = iaqVar;
        this.e = bymVar;
    }

    public final emd a(jjr jjrVar) {
        Account b = this.g.b();
        if (b != null) {
            HashSet hashSet = new HashSet(jjrVar);
            if (hashSet.remove("https://www.googleapis.com/auth/spot")) {
                hashSet.add("https://www.googleapis.com/auth/android_device_manager");
            }
            return new emd(b, "oauth2:".concat(a.c(hashSet)));
        }
        throw new ktw(new IllegalStateException("Current account is not set"));
    }

    public final ktx b(emd emdVar, boolean z) {
        jys q;
        jyz jyzVar;
        fxs n;
        Long l;
        try {
            synchronized (this.b) {
                jer h = jer.h((ktx) this.c.get(emdVar));
                if (h.g() && !z && (l = ((ktx) h.c()).c) != null && TimeUnit.SECONDS.toMillis(l.longValue()) - fma.i().toEpochMilli() > f) {
                    jyzVar = ivc.E((ktx) h.c());
                } else {
                    jer h2 = jer.h((jyz) this.d.get(emdVar));
                    if (h2.g()) {
                        jyzVar = (jyz) h2.c();
                    } else {
                        byte[] bArr = null;
                        if (h.g()) {
                            this.c.remove(emdVar);
                            try {
                                fej.e((Context) this.e.a, ((ktx) h.c()).a);
                                n = fma.o(null);
                            } catch (fed e) {
                                e = e;
                                n = fma.n(e);
                                q = jys.q(fzo.b(n));
                                jyz g = jwu.g(jwu.h(q, new ejc(this, emdVar, 4, bArr), jxv.a), new emc(this, emdVar, 0), jxv.a);
                                this.d.put(emdVar, g);
                                g.c(new cui(this, emdVar, 12), jxv.a);
                                jyzVar = g;
                                return (ktx) jyzVar.get();
                            } catch (IOException e2) {
                                e = e2;
                                n = fma.n(e);
                                q = jys.q(fzo.b(n));
                                jyz g2 = jwu.g(jwu.h(q, new ejc(this, emdVar, 4, bArr), jxv.a), new emc(this, emdVar, 0), jxv.a);
                                this.d.put(emdVar, g2);
                                g2.c(new cui(this, emdVar, 12), jxv.a);
                                jyzVar = g2;
                                return (ktx) jyzVar.get();
                            }
                            q = jys.q(fzo.b(n));
                        } else {
                            q = jys.q(jyv.a);
                        }
                        jyz g22 = jwu.g(jwu.h(q, new ejc(this, emdVar, 4, bArr), jxv.a), new emc(this, emdVar, 0), jxv.a);
                        this.d.put(emdVar, g22);
                        g22.c(new cui(this, emdVar, 12), jxv.a);
                        jyzVar = g22;
                    }
                }
            }
            return (ktx) jyzVar.get();
        } catch (ExecutionException e3) {
            throw new ktw(e3);
        }
    }
}
