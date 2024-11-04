package com.google.vr.dynamite.client;

import android.content.Context;
import android.os.RemoteException;
import android.util.ArrayMap;
import android.util.Log;
import dalvik.system.DexClassLoader;
import defpackage.der;
import defpackage.lnu;
import defpackage.lnv;
import defpackage.lnw;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class DynamiteClient {
    private static final ArrayMap a = new ArrayMap();

    private DynamiteClient() {
    }

    public static synchronized int checkVersion(Context context, String str, String str2, String str3) {
        synchronized (DynamiteClient.class) {
            lnw lnwVar = new lnw(str, str2);
            lnv remoteLibraryLoaderFromInfo = getRemoteLibraryLoaderFromInfo(lnwVar);
            try {
                INativeLibraryLoader newNativeLibraryLoader = remoteLibraryLoaderFromInfo.b(context).newNativeLibraryLoader(new ObjectWrapper(remoteLibraryLoaderFromInfo.a(context)), new ObjectWrapper(context));
                if (newNativeLibraryLoader == null) {
                    Log.e("DynamiteClient", der.c(lnwVar, "Failed to load native library ", " from remote package: no loader available."));
                    return -1;
                }
                return newNativeLibraryLoader.checkVersion(str3);
            } catch (RemoteException | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError | lnu e) {
                Log.e("DynamiteClient", der.c(lnwVar, "Failed to load native library ", " from remote package:\n  "), e);
                return -1;
            }
        }
    }

    public static synchronized ClassLoader getRemoteClassLoader(Context context, String str, String str2) {
        synchronized (DynamiteClient.class) {
            Context remoteContext = getRemoteContext(context, str, str2);
            if (remoteContext == null) {
                return null;
            }
            return remoteContext.getClassLoader();
        }
    }

    public static synchronized Context getRemoteContext(Context context, String str, String str2) {
        Context a2;
        synchronized (DynamiteClient.class) {
            lnw lnwVar = new lnw(str, str2);
            try {
                a2 = getRemoteLibraryLoaderFromInfo(lnwVar).a(context);
            } catch (lnu e) {
                Log.e("DynamiteClient", der.c(lnwVar, "Failed to get remote Context", " from remote package:\n  "), e);
                return null;
            }
        }
        return a2;
    }

    public static synchronized ClassLoader getRemoteDexClassLoader(Context context, String str) {
        synchronized (DynamiteClient.class) {
            Context remoteContext = getRemoteContext(context, str, null);
            if (remoteContext == null) {
                return null;
            }
            try {
                return new DexClassLoader(remoteContext.getPackageCodePath(), context.getCodeCacheDir().getAbsolutePath(), remoteContext.getApplicationInfo().nativeLibraryDir, context.getClassLoader());
            } catch (RuntimeException e) {
                Log.e("DynamiteClient", "Failed to create class loader for remote package\n ", e);
                return null;
            }
        }
    }

    private static synchronized lnv getRemoteLibraryLoaderFromInfo(lnw lnwVar) {
        synchronized (DynamiteClient.class) {
            ArrayMap arrayMap = a;
            lnv lnvVar = (lnv) arrayMap.get(lnwVar);
            if (lnvVar == null) {
                lnv lnvVar2 = new lnv(lnwVar);
                arrayMap.put(lnwVar, lnvVar2);
                return lnvVar2;
            }
            return lnvVar;
        }
    }

    public static synchronized long loadNativeRemoteLibrary(Context context, String str, String str2) {
        synchronized (DynamiteClient.class) {
            lnw lnwVar = new lnw(str, str2);
            lnv remoteLibraryLoaderFromInfo = getRemoteLibraryLoaderFromInfo(lnwVar);
            try {
                INativeLibraryLoader newNativeLibraryLoader = remoteLibraryLoaderFromInfo.b(context).newNativeLibraryLoader(new ObjectWrapper(remoteLibraryLoaderFromInfo.a(context)), new ObjectWrapper(context));
                if (newNativeLibraryLoader == null) {
                    Log.e("DynamiteClient", der.c(lnwVar, "Failed to load native library ", " from remote package: no loader available."));
                    return 0L;
                }
                return newNativeLibraryLoader.initializeAndLoadNativeLibrary(str2);
            } catch (RemoteException | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError | lnu e) {
                Log.e("DynamiteClient", der.c(lnwVar, "Failed to load native library ", " from remote package:\n  "), e);
                return 0L;
            }
        }
    }
}
