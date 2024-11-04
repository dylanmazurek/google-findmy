package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader;
import dalvik.system.DelegateLastClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fmz {
    private static Boolean d = null;
    private static String e = null;
    private static boolean f = false;
    private static int g = -1;
    private static Boolean h;
    private static fna l;
    private static fnb m;
    public final Context c;
    private static final ThreadLocal i = new ThreadLocal();
    private static final ThreadLocal j = new fmr();
    private static final fmw k = new fms();
    public static final fmy a = new fmt(1);
    public static final fmy b = new fmt(0);

    private fmz(Context context) {
        this.c = context;
    }

    /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object, android.database.Cursor] */
    public static int a(Context context, String str, boolean z) {
        Field declaredField;
        Throwable th;
        RemoteException e2;
        int readInt;
        fmn fmlVar;
        ?? r1;
        try {
            synchronized (fmz.class) {
                Boolean bool = d;
                Cursor cursor = null;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteModule$DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e3) {
                        Log.w("DynamiteModule", "Failed to load module via V2: " + e3.toString());
                        bool = Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader == ClassLoader.getSystemClassLoader()) {
                            bool = Boolean.FALSE;
                        } else if (classLoader != null) {
                            try {
                                e(classLoader);
                            } catch (fmv unused) {
                            }
                            bool = Boolean.TRUE;
                        } else {
                            if (!g(context)) {
                                return 0;
                            }
                            if (!f && !Boolean.TRUE.equals(null)) {
                                try {
                                    int d2 = d(context, str, z, true);
                                    String str2 = e;
                                    if (str2 != null && !str2.isEmpty()) {
                                        ClassLoader a2 = fmp.a();
                                        if (a2 == null) {
                                            if (Build.VERSION.SDK_INT >= 29) {
                                                String str3 = e;
                                                fma.aR(str3);
                                                a2 = new DelegateLastClassLoader(str3, ClassLoader.getSystemClassLoader());
                                            } else {
                                                String str4 = e;
                                                fma.aR(str4);
                                                a2 = new fmq(str4, ClassLoader.getSystemClassLoader());
                                            }
                                        }
                                        e(a2);
                                        declaredField.set(null, a2);
                                        d = Boolean.TRUE;
                                        return d2;
                                    }
                                    return d2;
                                } catch (fmv unused2) {
                                    declaredField.set(null, ClassLoader.getSystemClassLoader());
                                    bool = Boolean.FALSE;
                                }
                            } else {
                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                                bool = Boolean.FALSE;
                            }
                        }
                        d = bool;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return d(context, str, z, false);
                    } catch (fmv e4) {
                        Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e4.getMessage());
                        return 0;
                    }
                }
                fna h2 = h(context);
                try {
                    if (h2 == null) {
                        return 0;
                    }
                    try {
                        int e5 = h2.e();
                        if (e5 >= 3) {
                            lrs lrsVar = (lrs) i.get();
                            if (lrsVar != null && (r1 = lrsVar.a) != 0) {
                                return r1.getInt(0);
                            }
                            fmm fmmVar = new fmm(context);
                            long longValue = ((Long) j.get()).longValue();
                            Parcel a3 = h2.a();
                            duh.d(a3, fmmVar);
                            a3.writeString(str);
                            a3.writeInt(z ? 1 : 0);
                            a3.writeLong(longValue);
                            Parcel b2 = h2.b(7, a3);
                            IBinder readStrongBinder = b2.readStrongBinder();
                            if (readStrongBinder == null) {
                                fmlVar = null;
                            } else {
                                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                if (queryLocalInterface instanceof fmn) {
                                    fmlVar = (fmn) queryLocalInterface;
                                } else {
                                    fmlVar = new fml(readStrongBinder);
                                }
                            }
                            b2.recycle();
                            Cursor cursor2 = (Cursor) fmm.b(fmlVar);
                            if (cursor2 != null) {
                                try {
                                    if (cursor2.moveToFirst()) {
                                        readInt = cursor2.getInt(0);
                                        if (readInt <= 0 || !f(cursor2)) {
                                            cursor = cursor2;
                                        }
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                    }
                                } catch (RemoteException e6) {
                                    e2 = e6;
                                    cursor = cursor2;
                                    Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e2.getMessage());
                                    if (cursor == null) {
                                        return 0;
                                    }
                                    cursor.close();
                                    return 0;
                                } catch (Throwable th2) {
                                    th = th2;
                                    cursor = cursor2;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    throw th;
                                }
                            }
                            Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                            if (cursor2 == null) {
                                return 0;
                            }
                            cursor2.close();
                            return 0;
                        }
                        if (e5 == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                            fmm fmmVar2 = new fmm(context);
                            Parcel a4 = h2.a();
                            duh.d(a4, fmmVar2);
                            a4.writeString(str);
                            a4.writeInt(z ? 1 : 0);
                            Parcel b3 = h2.b(5, a4);
                            readInt = b3.readInt();
                            b3.recycle();
                        } else {
                            Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                            fmm fmmVar3 = new fmm(context);
                            Parcel a5 = h2.a();
                            duh.d(a5, fmmVar3);
                            a5.writeString(str);
                            a5.writeInt(z ? 1 : 0);
                            Parcel b4 = h2.b(3, a5);
                            readInt = b4.readInt();
                            b4.recycle();
                        }
                        return readInt;
                    } catch (RemoteException e7) {
                        e2 = e7;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            fma.A(context);
            throw th4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 19, insn: 0x02d1: MOVE (r7 I:??[OBJECT, ARRAY]) = (r19 I:??[OBJECT, ARRAY]) (LINE:722), block:B:231:0x02d0 */
    /* JADX WARN: Removed duplicated region for block: B:20:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0396  */
    /* JADX WARN: Type inference failed for: r2v16, types: [lrs] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object, android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v4, types: [lrs] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, lrs] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.fmz b(android.content.Context r21, defpackage.fmy r22, java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 944
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fmz.b(android.content.Context, fmy, java.lang.String):fmz");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0087, code lost:            if (f(r8) != false) goto L97;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int d(android.content.Context r8, java.lang.String r9, boolean r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fmz.d(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    private static void e(ClassLoader classLoader) {
        try {
            fnb fnbVar = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof fnb) {
                    fnbVar = (fnb) queryLocalInterface;
                } else {
                    fnbVar = new fnb(iBinder);
                }
            }
            m = fnbVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new fmv("Failed to instantiate dynamite loader", e2);
        }
    }

    private static boolean f(Cursor cursor) {
        lrs lrsVar = (lrs) i.get();
        if (lrsVar != null && lrsVar.a == null) {
            lrsVar.a = cursor;
            return true;
        }
        return false;
    }

    private static boolean g(Context context) {
        int i2;
        if (Boolean.TRUE.equals(null) || Boolean.TRUE.equals(h)) {
            return true;
        }
        boolean z = false;
        if (h == null) {
            PackageManager packageManager = context.getPackageManager();
            if (true != fma.y()) {
                i2 = 0;
            } else {
                i2 = 268435456;
            }
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider("com.google.android.gms.chimera", i2);
            if (fgq.d.g(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z = true;
            }
            Boolean valueOf = Boolean.valueOf(z);
            h = valueOf;
            valueOf.getClass();
            if (z && resolveContentProvider.applicationInfo != null && (resolveContentProvider.applicationInfo.flags & 129) == 0) {
                f = true;
            }
        }
        if (!z) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z;
    }

    private static fna h(Context context) {
        fna fnaVar;
        synchronized (fmz.class) {
            fna fnaVar2 = l;
            if (fnaVar2 != null) {
                return fnaVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    fnaVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    if (queryLocalInterface instanceof fna) {
                        fnaVar = (fna) queryLocalInterface;
                    } else {
                        fnaVar = new fna(iBinder);
                    }
                }
                if (fnaVar != null) {
                    l = fnaVar;
                    return fnaVar;
                }
            } catch (Exception e2) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e2.getMessage());
            }
            return null;
        }
    }

    public final IBinder c() {
        try {
            return (IBinder) this.c.getClassLoader().loadClass("com.google.android.gms.common.GoogleCertificatesImpl").newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            throw new fmv("Failed to instantiate module class: com.google.android.gms.common.GoogleCertificatesImpl", e2);
        }
    }
}
