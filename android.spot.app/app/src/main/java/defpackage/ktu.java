package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ktu implements kvm {
    public static final lyr a = new lyr("com.google.frameworks.client.data.android.auth.AuthContextInterceptor", false);
    private static final maz b = new max("Authorization", mbc.b);
    private static final maz c = new max("X-Auth-Time", mbc.b);
    private final jiy d;
    private jyz e;

    public ktu(jiy jiyVar) {
        this.d = jiyVar;
    }

    @Override // defpackage.kvm
    public final /* synthetic */ kvy a() {
        return kvy.a;
    }

    @Override // defpackage.kvm
    public final /* synthetic */ kvy b() {
        return kvy.a;
    }

    @Override // defpackage.kvm
    public final kvy f(nqe nqeVar) {
        try {
            ktx ktxVar = (ktx) ivc.M(this.e);
            Object obj = nqeVar.c;
            maz mazVar = b;
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= ((mbc) obj).e) {
                    break;
                }
                if (Arrays.equals(mazVar.b, ((mbc) obj).f(i))) {
                    z = true;
                    break;
                }
                i++;
            }
            hwx.V(!z, "Already attached auth token");
            ((mbc) nqeVar.c).e(b, a.ao(ktxVar.a, "Bearer "));
            ((mbc) nqeVar.c).e(c, Long.toString(ktxVar.b));
            return kvy.a;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof ktw) {
                mbx mbxVar = mbx.UNAUTHENTICATED;
                List list = mca.a;
                return kvy.b(mbxVar.a().c(cause.getCause()), new mbc());
            }
            return kvy.b(mca.b(cause), new mbc());
        }
    }

    @Override // defpackage.kvm
    public final kvy g(nqe nqeVar) {
        ktt kttVar = (ktt) ((lys) nqeVar.d).e(ktt.a);
        kttVar.getClass();
        if (!this.d.containsKey(kttVar.b)) {
            boolean z = false;
            if (!kttVar.b.equals("incognito") && !kttVar.b.equals("pseudonymous")) {
                z = true;
            }
            hwx.V(z, "Used non-google account without enabling API Key fallback");
            ktv ktvVar = ((ktl) ((lys) nqeVar.d).e(ktm.a)).f;
            Set c2 = ((kto) ((lys) nqeVar.d).e(kto.a)).c();
            jax c3 = jbu.c("AuthContextInterceptor#tokenFuture");
            try {
                jza jzaVar = new jza(jbn.g(new cye(nqeVar, ktvVar, c2, 5)));
                c3.a(jzaVar);
                ((ktl) ((lys) nqeVar.d).e(ktm.a)).d.execute(jzaVar);
                this.e = jzaVar;
                kvy c4 = kvy.c(jzaVar);
                c3.close();
                return c4;
            } catch (Throwable th) {
                try {
                    c3.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        Object obj = ((ktd) this.d.get(kttVar.b)).a;
        throw null;
    }

    @Override // defpackage.kvm
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.kvm
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.kvm
    public final /* synthetic */ void e(ktf ktfVar) {
    }
}
