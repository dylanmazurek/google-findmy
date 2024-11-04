package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fym extends fku {
    private final AtomicReference t;

    public fym(Context context, Looper looper, fkp fkpVar, fhr fhrVar, fhs fhsVar) {
        super(context, looper, 41, fkpVar, fhrVar, fhsVar);
        this.t = new AtomicReference();
    }

    public final void I(fwo fwoVar, fwo fwoVar2, fip fipVar) {
        fyl fylVar = new fyl((fyi) v(), fipVar, fwoVar2);
        if (fwoVar != null) {
            fyi fyiVar = (fyi) v();
            Parcel a = fyiVar.a();
            duh.d(a, fwoVar);
            duh.d(a, fylVar);
            fyiVar.c(10, a);
            return;
        }
        if (fwoVar2 == null) {
            fipVar.k(Status.b);
        } else {
            ((fyi) v()).e(fwoVar2, fylVar);
        }
    }

    @Override // defpackage.fku, defpackage.fkn, defpackage.fhm
    public final int a() {
        return 12600000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fkn
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.usagereporting.internal.IUsageReportingService");
        if (queryLocalInterface instanceof fyi) {
            return (fyi) queryLocalInterface;
        }
        return new fyi(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fkn
    public final String c() {
        return "com.google.android.gms.usagereporting.internal.IUsageReportingService";
    }

    @Override // defpackage.fkn
    protected final String d() {
        return "com.google.android.gms.usagereporting.service.START";
    }

    @Override // defpackage.fkn
    public final boolean e() {
        return true;
    }

    @Override // defpackage.fkn
    public final Feature[] h() {
        return fxy.e;
    }

    @Override // defpackage.fkn
    public final void y() {
        try {
            fwo fwoVar = (fwo) this.t.getAndSet(null);
            if (fwoVar != null) {
                fyk fykVar = new fyk();
                fyi fyiVar = (fyi) v();
                Parcel a = fyiVar.a();
                duh.d(a, fwoVar);
                duh.d(a, fykVar);
                fyiVar.c(5, a);
            }
        } catch (RemoteException e) {
            Log.e("UsageReportingClientImp", "disconnect(): Could not unregister listener from remote:", e);
        }
        super.y();
    }
}
