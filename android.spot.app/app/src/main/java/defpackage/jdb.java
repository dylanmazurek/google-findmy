package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import com.google.ar.core.exceptions.UnavailableDeviceNotCompatibleException;
import com.google.ar.core.exceptions.UnavailableUserDeclinedInstallationException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class jdb {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static PendingIntent a(Context context) {
        try {
            Bundle call = context.getContentResolver().call(iuu.i(), "getSetupIntent", context.getPackageName(), (Bundle) null);
            if (call != null) {
                PendingIntent pendingIntent = (PendingIntent) call.getParcelable("intent");
                if (pendingIntent != null) {
                    return pendingIntent;
                }
                String string = call.getString("exceptionType", "");
                if (!string.isEmpty()) {
                    if (!string.equals(UnavailableDeviceNotCompatibleException.class.getName())) {
                        if (!string.equals(UnavailableUserDeclinedInstallationException.class.getName())) {
                            Class<? extends U> asSubclass = Class.forName(string).asSubclass(RuntimeException.class);
                            String string2 = call.getString("exceptionText", null);
                            if (string2 != null) {
                                throw ((RuntimeException) asSubclass.getConstructor(String.class).newInstance(string2));
                            }
                            throw ((RuntimeException) asSubclass.getConstructor(null).newInstance(null));
                        }
                        throw new UnavailableUserDeclinedInstallationException();
                    }
                    throw new UnavailableDeviceNotCompatibleException();
                }
            }
        } catch (ReflectiveOperationException | RuntimeException unused) {
        }
        return null;
    }
}
