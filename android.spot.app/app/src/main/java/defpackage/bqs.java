package defpackage;

import android.content.Context;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bqs {
    public static Context a(Context context) {
        Context createDeviceProtectedStorageContext;
        createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
        return createDeviceProtectedStorageContext;
    }

    public static File b(Context context) {
        File dataDir;
        dataDir = context.getDataDir();
        return dataDir;
    }

    static boolean c(Context context) {
        boolean isDeviceProtectedStorage;
        isDeviceProtectedStorage = context.isDeviceProtectedStorage();
        return isDeviceProtectedStorage;
    }

    public boolean f() {
        return false;
    }

    public void d(boolean z) {
    }

    public void e(boolean z) {
    }
}
