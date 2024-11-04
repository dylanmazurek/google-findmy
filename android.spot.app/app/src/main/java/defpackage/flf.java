package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.ConnectionInfo;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class flf extends dug implements IInterface {
    private fkn a;
    private final int b;

    public flf(fkn fknVar, int i) {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        this.a = fknVar;
        this.b = i;
    }

    public final void b(int i, IBinder iBinder, Bundle bundle) {
        fma.aS(this.a, "onPostInitComplete can be called only once per call to getRemoteService");
        this.a.z(i, iBinder, bundle, this.b);
        this.a = null;
    }

    @Override // defpackage.dug
    protected final boolean y(int i, Parcel parcel, Parcel parcel2) {
        RootTelemetryConfiguration rootTelemetryConfiguration;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                int readInt = parcel.readInt();
                IBinder readStrongBinder = parcel.readStrongBinder();
                ConnectionInfo connectionInfo = (ConnectionInfo) duh.a(parcel, ConnectionInfo.CREATOR);
                duh.b(parcel);
                fkn fknVar = this.a;
                fma.aS(fknVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
                fma.aR(connectionInfo);
                fknVar.m = connectionInfo;
                if (fknVar.e()) {
                    ConnectionTelemetryConfiguration connectionTelemetryConfiguration = connectionInfo.d;
                    flk a = flk.a();
                    if (connectionTelemetryConfiguration == null) {
                        rootTelemetryConfiguration = null;
                    } else {
                        rootTelemetryConfiguration = connectionTelemetryConfiguration.a;
                    }
                    a.b(rootTelemetryConfiguration);
                }
                b(readInt, readStrongBinder, connectionInfo.a);
            } else {
                parcel.readInt();
                duh.b(parcel);
                Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
            }
        } else {
            int readInt2 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            Bundle bundle = (Bundle) duh.a(parcel, Bundle.CREATOR);
            duh.b(parcel);
            b(readInt2, readStrongBinder2, bundle);
        }
        parcel2.writeNoException();
        return true;
    }

    public flf() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }
}
