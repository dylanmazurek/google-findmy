package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ffv extends fku {
    public ffv(Context context, Looper looper, fkp fkpVar, fhr fhrVar, fhs fhsVar) {
        super(context, looper, 40, fkpVar, fhrVar, fhsVar);
    }

    @Override // defpackage.fku, defpackage.fkn, defpackage.fhm
    public final int a() {
        return 11925000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fkn
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
        if (queryLocalInterface instanceof ffx) {
            return (ffx) queryLocalInterface;
        }
        return new ffx(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fkn
    public final String c() {
        return "com.google.android.gms.clearcut.internal.IClearcutLoggerService";
    }

    @Override // defpackage.fkn
    protected final String d() {
        return "com.google.android.gms.clearcut.service.START";
    }

    @Override // defpackage.fkn
    public final Feature[] h() {
        return ffj.b;
    }
}
