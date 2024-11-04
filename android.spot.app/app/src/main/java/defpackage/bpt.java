package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpt {
    public static Notification.Action.Builder a(Notification.Action.Builder builder, Bundle bundle) {
        return builder.addExtras(bundle);
    }

    public static Notification.Action.Builder b(Notification.Action.Builder builder, RemoteInput remoteInput) {
        return builder.addRemoteInput(remoteInput);
    }

    public static Notification.Action.Builder c(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        return new Notification.Action.Builder(i, charSequence, pendingIntent);
    }

    public static Notification.Action d(Notification.Action.Builder builder) {
        return builder.build();
    }

    public static Notification.Builder e(Notification.Builder builder, Notification.Action action) {
        return builder.addAction(action);
    }

    public static Notification.Builder f(Notification.Builder builder, String str) {
        return builder.setGroup(str);
    }

    public static Notification.Builder g(Notification.Builder builder, boolean z) {
        return builder.setGroupSummary(z);
    }

    public static Notification.Builder h(Notification.Builder builder, boolean z) {
        return builder.setLocalOnly(z);
    }

    public static Notification.Builder i(Notification.Builder builder, String str) {
        return builder.setSortKey(str);
    }

    public static String j(Notification notification) {
        return notification.getGroup();
    }

    public static File k(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, str + i);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static void l(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean m(File file, InputStream inputStream) {
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read != -1) {
                            fileOutputStream2.write(bArr, 0, read);
                        } else {
                            l(fileOutputStream2);
                            StrictMode.setThreadPolicy(allowThreadDiskWrites);
                            return true;
                        }
                    }
                } catch (IOException e) {
                    e = e;
                    fileOutputStream = fileOutputStream2;
                    Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    l(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    l(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e2) {
            e = e2;
        }
    }

    public static boolean n(File file, Resources resources, int i) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i);
        } catch (Throwable th) {
            th = th;
            inputStream = null;
        }
        try {
            boolean m = m(file, inputStream);
            l(inputStream);
            return m;
        } catch (Throwable th2) {
            th = th2;
            l(inputStream);
            throw th;
        }
    }

    public static ByteBuffer o(Context context, Uri uri) {
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
            if (openFileDescriptor == null) {
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                try {
                    FileChannel b = bpp.b(fileInputStream);
                    MappedByteBuffer map = b.map(FileChannel.MapMode.READ_ONLY, 0L, b.size());
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return map;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public static Paint.Cap p(int i) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 1) {
                return Paint.Cap.SQUARE;
            }
            return Paint.Cap.ROUND;
        }
        return Paint.Cap.BUTT;
    }

    public static final daz q(adt adtVar) {
        return (daz) adtVar.a();
    }

    public static final String r(String str) {
        if (str == null || moz.g(str)) {
            return null;
        }
        if (str.length() <= 0 || !moz.P(str.charAt(moz.j(str)), '/')) {
            return str.concat("/");
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0111 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0113 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object s(android.content.Context r13, defpackage.dba r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, defpackage.mmx r19) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bpt.s(android.content.Context, dba, java.lang.String, java.lang.String, java.lang.String, java.lang.String, mmx):java.lang.Object");
    }

    public static final daz t(dba dbaVar, abi abiVar) {
        abiVar.u(-1248473602);
        dbf dbfVar = new dbf(null);
        Context context = (Context) abiVar.f(AndroidCompositionLocals_androidKt.b);
        abiVar.u(100461544);
        boolean B = abiVar.B(dbaVar);
        abp abpVar = (abp) abiVar;
        Object P = abpVar.P();
        if (B || P == abh.a) {
            aee aeeVar = new aee(new daz(), agw.a);
            abpVar.Z(aeeVar);
            P = aeeVar;
        }
        adt adtVar = (adt) P;
        abpVar.U();
        abiVar.u(100470879);
        boolean B2 = abiVar.B(dbaVar) | abiVar.B("__LottieInternalDefaultCacheKey__");
        Object P2 = abpVar.P();
        if (B2 || P2 == abh.a) {
            P2 = u(context, dbaVar, "__LottieInternalDefaultCacheKey__");
            abpVar.Z(P2);
        }
        abpVar.U();
        act.d(dbaVar, "__LottieInternalDefaultCacheKey__", new dbg(dbfVar, context, dbaVar, adtVar, null), abiVar);
        daz q = q(adtVar);
        abpVar.U();
        return q;
    }

    private static final cyt u(Context context, dba dbaVar, String str) {
        if (dbaVar instanceof dba) {
            if (amr.i(str, "__LottieInternalDefaultCacheKey__")) {
                return cyg.f(context, dbaVar.a);
            }
            return cyg.g(context, dbaVar.a, str);
        }
        throw new mku();
    }
}
