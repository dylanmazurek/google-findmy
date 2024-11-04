package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fqn extends fku {
    /* JADX INFO: Access modifiers changed from: protected */
    public fqn(Context context, Looper looper, fkp fkpVar, fiv fivVar, fjr fjrVar) {
        super(context, looper, 315, fkpVar, fivVar, fjrVar);
    }

    @Override // defpackage.fku, defpackage.fkn, defpackage.fhm
    public final int a() {
        return 17895000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fkn
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.inappreach.internal.IInAppReachService");
        if (queryLocalInterface instanceof fqm) {
            return (fqm) queryLocalInterface;
        }
        return new fqm(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fkn
    public final String c() {
        return "com.google.android.gms.inappreach.internal.IInAppReachService";
    }

    @Override // defpackage.fkn
    protected final String d() {
        return "com.google.android.gms.inappreach.service.START";
    }

    @Override // defpackage.fkn
    public final boolean e() {
        return true;
    }

    @Override // defpackage.fkn
    protected final boolean g() {
        return true;
    }

    @Override // defpackage.fkn
    public final Feature[] h() {
        return fpk.c;
    }
}
