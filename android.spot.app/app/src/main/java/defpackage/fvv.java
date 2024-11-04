package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class fvv extends fvr {
    private final fip a;

    public fvv(fip fipVar) {
        this.a = fipVar;
    }

    @Override // defpackage.fvr
    public final void b(int i, Bundle bundle, DataHolder dataHolder) {
        fkb fkbVar;
        Status J = fvz.J(i, bundle);
        if (dataHolder == null) {
            fkbVar = null;
        } else {
            fkbVar = new fkb(dataHolder);
        }
        this.a.k(new fvx(J, fkbVar));
    }
}
