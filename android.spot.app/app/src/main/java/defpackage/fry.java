package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fry {
    private static final String a = "fry";
    private static Context b;
    private static frr c;

    public static frr a(Context context, frm frmVar) {
        fma.aR(context);
        String.valueOf(frmVar);
        frr frrVar = c;
        if (frrVar == null) {
            if (fhd.b(context, 13400000) == 0) {
                frr e = e(context, frmVar);
                c = e;
                try {
                    if (e.e() == 2) {
                        try {
                            frr frrVar2 = c;
                            fmm fmmVar = new fmm(c(context, frmVar));
                            Parcel a2 = frrVar2.a();
                            duh.d(a2, fmmVar);
                            frrVar2.c(11, a2);
                        } catch (RemoteException e2) {
                            throw new fsc(e2);
                        } catch (UnsatisfiedLinkError unused) {
                            Log.w(a, "Caught UnsatisfiedLinkError attempting to load the LATEST renderer's native library. Attempting to use the LEGACY renderer instead.");
                            b = null;
                            c = e(context, frm.LEGACY);
                        }
                    }
                    try {
                        frr frrVar3 = c;
                        Context c2 = c(context, frmVar);
                        c2.getClass();
                        fmm fmmVar2 = new fmm(c2.getResources());
                        Parcel a3 = frrVar3.a();
                        duh.d(a3, fmmVar2);
                        a3.writeInt(19000100);
                        frrVar3.c(6, a3);
                        return c;
                    } catch (RemoteException e3) {
                        throw new fsc(e3);
                    }
                } catch (RemoteException e4) {
                    throw new fsc(e4);
                }
            }
            throw new fhb();
        }
        return frrVar;
    }

    private static Context b(Exception exc, Context context) {
        Log.e(a, "Failed to load maps module, use pre-Chimera", exc);
        return fhd.c(context);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:5|6|(6:8|(1:10)|13|14|15|16)|27|13|14|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:            if (r5 != 1) goto L10;     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:            r0 = "com.google.android.gms.maps_core_dynamite";     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002c, code lost:            r5 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:            if (r0.equals("com.google.android.gms.maps_dynamite") == false) goto L28;     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:            r4 = b(r5, r4);     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0033, code lost:            r4 = defpackage.fmz.b(r4, defpackage.fmz.a, "com.google.android.gms.maps_dynamite").c;     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003c, code lost:            r5 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003d, code lost:            r4 = b(r5, r4);     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x001f, code lost:            if (r5 != defpackage.frm.LEGACY) goto L14;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.content.Context c(android.content.Context r4, defpackage.frm r5) {
        /*
            java.lang.String r0 = "com.google.android.gms.maps_legacy_dynamite"
            java.lang.String r1 = "com.google.android.gms.maps_core_dynamite"
            java.lang.String r2 = "com.google.android.gms.maps_dynamite"
            android.content.Context r3 = defpackage.fry.b
            if (r3 != 0) goto L49
            java.lang.String r3 = "com.google.android.gms.maps.internal.UseLegacyRendererAsDefault"
            java.lang.Class.forName(r3)     // Catch: java.lang.ClassNotFoundException -> L1c
            if (r5 == 0) goto L1a
            int r5 = r5.ordinal()
            if (r5 == 0) goto L23
            r0 = 1
            if (r5 == r0) goto L22
        L1a:
            r0 = r2
            goto L23
        L1c:
            frm r3 = defpackage.frm.LEGACY
            if (r5 != r3) goto L22
            goto L23
        L22:
            r0 = r1
        L23:
            fmy r5 = defpackage.fmz.a     // Catch: java.lang.Exception -> L2c
            fmz r5 = defpackage.fmz.b(r4, r5, r0)     // Catch: java.lang.Exception -> L2c
            android.content.Context r4 = r5.c     // Catch: java.lang.Exception -> L2c
            goto L46
        L2c:
            r5 = move-exception
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L42
            fmy r5 = defpackage.fmz.a     // Catch: java.lang.Exception -> L3c
            fmz r5 = defpackage.fmz.b(r4, r5, r2)     // Catch: java.lang.Exception -> L3c
            android.content.Context r4 = r5.c     // Catch: java.lang.Exception -> L3c
            goto L46
        L3c:
            r5 = move-exception
            android.content.Context r4 = b(r5, r4)
            goto L46
        L42:
            android.content.Context r4 = b(r5, r4)
        L46:
            defpackage.fry.b = r4
            return r4
        L49:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fry.c(android.content.Context, frm):android.content.Context");
    }

    private static Object d(Class cls) {
        try {
            return cls.newInstance();
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Unable to call the default constructor of ".concat(String.valueOf(cls.getName())), e);
        } catch (InstantiationException e2) {
            throw new IllegalStateException("Unable to instantiate the dynamic class ".concat(String.valueOf(cls.getName())), e2);
        }
    }

    private static frr e(Context context, frm frmVar) {
        ClassLoader classLoader = c(context, frmVar).getClassLoader();
        try {
            fma.aR(classLoader);
            IBinder iBinder = (IBinder) d(classLoader.loadClass("com.google.android.gms.maps.internal.CreatorImpl"));
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
            if (queryLocalInterface instanceof frr) {
                return (frr) queryLocalInterface;
            }
            return new frr(iBinder);
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl", e);
        }
    }
}
