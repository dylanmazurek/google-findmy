package defpackage;

import android.accounts.Account;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class esa {
    public static final jnk a = jnk.l("com/google/android/apps/adm/integrations/spot/ownerkey/OwnerKeyCacheImpl");
    public final Executor b;
    public final Object c = new Object();
    public jer d;
    public jer e;
    public final ddg f;
    private final kuv g;

    public esa(kuv kuvVar, ddg ddgVar, Executor executor) {
        jdl jdlVar = jdl.a;
        this.d = jdlVar;
        this.e = jdlVar;
        this.g = kuvVar;
        this.f = ddgVar;
        this.b = executor;
    }

    public final boolean a(Account account) {
        boolean z;
        synchronized (this.c) {
            z = false;
            if (this.d.g() && ((Account) this.d.c()).equals(account)) {
                z = true;
            }
        }
        return z;
    }

    public final jyz b(gok gokVar) {
        return jbx.d(gokVar.A(this.g.u())).b(Exception.class, new etl(1), jxv.a).e(new emc(this, gokVar, 7), this.b);
    }
}
