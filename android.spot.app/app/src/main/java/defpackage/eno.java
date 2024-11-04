package defpackage;

import android.accounts.Account;
import android.content.Context;
import java.io.IOException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eno {
    public static final jnk a = jnk.l("com/google/android/apps/adm/integrations/spot/clientactions/FmdSignedCommandHandlerForAccountFactory");
    public final Context b;
    public final evy c;
    public final ewg d;
    public final ele e;
    public final jzd f;
    public final jzd g;
    public final jzd h;
    public final Executor i;
    public final enh j;
    public final bym k;

    public eno(enh enhVar, Context context, evy evyVar, ewg ewgVar, bym bymVar, ele eleVar, jzd jzdVar, jzd jzdVar2, jzd jzdVar3, Executor executor) {
        this.j = enhVar;
        this.b = context;
        this.c = evyVar;
        this.d = ewgVar;
        this.k = bymVar;
        this.e = eleVar;
        this.f = jzdVar;
        this.g = jzdVar2;
        this.h = jzdVar3;
        this.i = executor;
    }

    public final jyz a(String str, Account[] accountArr, int i) {
        boolean z;
        fxs n;
        if (i < accountArr.length) {
            z = true;
        } else {
            z = false;
        }
        hwx.V(z, "Account with the OID provided in a client action command not found on this device.");
        Account account = accountArr[i];
        try {
            n = fma.o(fej.c((Context) this.k.a, account.name));
        } catch (fed | IOException e) {
            n = fma.n(e);
        }
        return jbx.d(fzo.b(n)).f(new enl(this, str, account, accountArr, i, 0), this.g).b(Exception.class, new enm(this, str, accountArr, i, 0), this.g);
    }
}
