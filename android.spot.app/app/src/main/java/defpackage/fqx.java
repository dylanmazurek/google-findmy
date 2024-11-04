package defpackage;

import android.os.Bundle;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class fqx implements fxi {
    private final /* synthetic */ int a;

    public /* synthetic */ fqx(int i) {
        this.a = i;
    }

    @Override // defpackage.fxi
    public final Object a(fxs fxsVar) {
        switch (this.a) {
            case 0:
                if (fxsVar.i()) {
                    fyj fyjVar = (fyj) ((lrs) fxsVar.e()).a;
                    fma.aR(fyjVar.a);
                    boolean z = true;
                    if (fyjVar.a.a != 1) {
                        z = false;
                    }
                    return fma.o(Boolean.valueOf(z));
                }
                Exception d = fxsVar.d();
                d.getClass();
                return fma.n(d);
            case 1:
                Executor executor = fgk.a;
                if (fxsVar.i()) {
                    return (Bundle) fxsVar.e();
                }
                throw new IOException("SERVICE_NOT_AVAILABLE", fxsVar.d());
            case 2:
                if (!fxsVar.i()) {
                    Exception d2 = fxsVar.d();
                    d2.getClass();
                    return fma.n(d2);
                }
                if (!((Boolean) fxsVar.e()).booleanValue()) {
                    return fma.m();
                }
                return fma.o(null);
            case 3:
                Bundle bundle = (Bundle) fxsVar.f(IOException.class);
                if (bundle != null) {
                    String string = bundle.getString("registration_id");
                    if (string != null || (string = bundle.getString("unregistered")) != null) {
                        return string;
                    }
                    String string2 = bundle.getString("error");
                    if (!"RST".equals(string2)) {
                        if (string2 != null) {
                            throw new IOException(string2);
                        }
                        Log.w("FirebaseInstanceId", "Unexpected response: ".concat(bundle.toString()), new Throwable());
                        throw new IOException("SERVICE_NOT_AVAILABLE");
                    }
                    throw new IOException("INSTANCE_ID_RESET");
                }
                throw new IOException("SERVICE_NOT_AVAILABLE");
            case 4:
                return ((ktd) fxsVar.e()).a;
            case 5:
                return 403;
            case 6:
                return -1;
            default:
                Bundle bundle2 = (Bundle) fxsVar.f(IOException.class);
                if (bundle2 != null) {
                    String string3 = bundle2.getString("registration_id");
                    if (string3 != null || (string3 = bundle2.getString("unregistered")) != null) {
                        return string3;
                    }
                    String string4 = bundle2.getString("error");
                    if (!"RST".equals(string4)) {
                        if (string4 != null) {
                            throw new IOException(string4);
                        }
                        Log.w("FirebaseMessaging", "Unexpected response: ".concat(bundle2.toString()), new Throwable());
                        throw new IOException("SERVICE_NOT_AVAILABLE");
                    }
                    throw new IOException("INSTANCE_ID_RESET");
                }
                throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }
}
