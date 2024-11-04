package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fea extends fku {
    public fea(Context context, Looper looper, fkp fkpVar, fhr fhrVar, fhs fhsVar) {
        super(context, looper, 154, fkpVar, fhrVar, fhsVar);
    }

    @Override // defpackage.fku, defpackage.fkn, defpackage.fhm
    public final int a() {
        return 12200000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fkn
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.audit.internal.IAuditService");
        if (queryLocalInterface instanceof feb) {
            return (feb) queryLocalInterface;
        }
        return new feb(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fkn
    public final String c() {
        return "com.google.android.gms.audit.internal.IAuditService";
    }

    @Override // defpackage.fkn
    protected final String d() {
        return "com.google.android.gms.audit.service.START";
    }

    @Override // defpackage.fkn
    public final boolean e() {
        return true;
    }
}
