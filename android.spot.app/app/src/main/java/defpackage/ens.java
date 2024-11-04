package defpackage;

import android.accounts.Account;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ens implements ihm {
    public static final jnk a = jnk.l("com/google/android/apps/adm/integrations/spot/clientactions/TriggerDeviceListRefreshClientActionHandler");
    public final Account b;
    public final evy c;
    public final ewg d;
    private final Executor e;

    public ens(Account account, evy evyVar, ewg ewgVar, Executor executor) {
        this.b = account;
        this.c = evyVar;
        this.d = ewgVar;
        this.e = executor;
    }

    @Override // defpackage.ihm
    public final jyz a(kxx kxxVar, ihn ihnVar, ihw ihwVar) {
        return iuu.l(new dzw(this, 13), this.e);
    }
}
