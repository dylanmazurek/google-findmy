package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fkl extends fkf {
    public final IBinder g;
    final /* synthetic */ fkn h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fkl(fkn fknVar, int i, IBinder iBinder, Bundle bundle) {
        super(fknVar, i, bundle);
        this.h = fknVar;
        this.g = iBinder;
    }

    @Override // defpackage.fkf
    protected final void a(ConnectionResult connectionResult) {
        njz njzVar = this.h.q;
        if (njzVar != null) {
            njzVar.o(connectionResult);
        }
        System.currentTimeMillis();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [fiv, java.lang.Object] */
    @Override // defpackage.fkf
    protected final boolean c() {
        try {
            IBinder iBinder = this.g;
            fma.aR(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.h.c().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + this.h.c() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface b = this.h.b(this.g);
            if (b == null || (!this.h.A(2, 4, b) && !this.h.A(3, 4, b))) {
                return false;
            }
            fkn fknVar = this.h;
            fknVar.k = null;
            njz njzVar = fknVar.r;
            if (njzVar != null) {
                njzVar.a.b();
                return true;
            }
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
