package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.GoogleCertificatesQuery;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fgy {
    static final fgw a;
    static final fgw b;
    public static Context c;
    public static volatile flh d;
    private static final Object e;

    static {
        new fgr(fld.c("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
        new fgs(fld.c("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
        a = new fgt(fld.c("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
        b = new fgu(fld.c("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
        e = new Object();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void a(Context context) {
        synchronized (fgy.class) {
            if (c == null) {
                if (context != null) {
                    c = context.getApplicationContext();
                    return;
                }
                return;
            }
            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        }
    }

    public static void b() {
        flh flhVar;
        if (d != null) {
            return;
        }
        fma.aR(c);
        synchronized (e) {
            if (d == null) {
                IBinder c2 = fmz.b(c, fmz.b, "com.google.android.gms.googlecertificates").c();
                if (c2 == null) {
                    flhVar = null;
                } else {
                    IInterface queryLocalInterface = c2.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                    if (queryLocalInterface instanceof flh) {
                        flhVar = (flh) queryLocalInterface;
                    } else {
                        flhVar = new flh(c2);
                    }
                }
                d = flhVar;
            }
        }
    }

    public static fha c(String str, fld fldVar, boolean z, boolean z2) {
        fha fhaVar;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                b();
                fma.aR(c);
                GoogleCertificatesQuery googleCertificatesQuery = new GoogleCertificatesQuery(str, fldVar, z, z2);
                try {
                    flh flhVar = d;
                    fmm fmmVar = new fmm(c.getPackageManager());
                    Parcel a2 = flhVar.a();
                    duh.c(a2, googleCertificatesQuery);
                    duh.d(a2, fmmVar);
                    Parcel b2 = flhVar.b(5, a2);
                    boolean e2 = duh.e(b2);
                    b2.recycle();
                    if (e2) {
                        fhaVar = fha.a;
                    } else {
                        fhaVar = new fha(false);
                    }
                } catch (RemoteException e3) {
                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
                    fhaVar = new fha(false);
                }
            } catch (fmv e4) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e4);
                e4.getMessage();
                fhaVar = new fha(false);
            }
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return fhaVar;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }
}
