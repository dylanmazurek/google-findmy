package defpackage;

import android.net.Uri;
import android.system.Os;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hrb {
    private static IOException a(File file, IOException iOException, String str) {
        String concat;
        try {
            concat = "Inoperable file:" + String.format(Locale.US, " canonical[%s] freeSpace[%d] protoName[%s]", file.getCanonicalPath(), Long.valueOf(file.getFreeSpace()), str);
            try {
                concat = concat + String.format(Locale.US, " mode[%d]", Integer.valueOf(Os.stat(file.getCanonicalPath()).st_mode));
            } catch (Exception unused) {
            }
        } catch (IOException unused2) {
            concat = "Inoperable file:".concat(" failed");
        }
        return new IOException(concat, iOException);
    }

    private static IOException b(File file, IOException iOException, String str) {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return a(file, iOException, str);
        }
        if (parentFile.exists()) {
            if (parentFile.isDirectory()) {
                if (parentFile.canRead()) {
                    if (parentFile.canWrite()) {
                        return a(file, iOException, str);
                    }
                    return a(file, iOException, str);
                }
                if (parentFile.canWrite()) {
                    return a(file, iOException, str);
                }
                return a(file, iOException, str);
            }
            if (parentFile.canRead()) {
                if (parentFile.canWrite()) {
                    return a(file, iOException, str);
                }
                return a(file, iOException, str);
            }
            if (parentFile.canWrite()) {
                return a(file, iOException, str);
            }
            return a(file, iOException, str);
        }
        return a(file, iOException, str);
    }

    public static nef d(nef nefVar, long j) {
        ljh ljhVar = (ljh) nefVar.z(5);
        ljhVar.w(nefVar);
        ljn ljnVar = ljhVar.b;
        nef nefVar2 = (nef) ljnVar;
        if ((nefVar2.a & 2) != 0) {
            long j2 = nefVar2.c - j;
            if (!ljnVar.y()) {
                ljhVar.t();
            }
            nef nefVar3 = (nef) ljhVar.b;
            nefVar3.a |= 2;
            nefVar3.c = j2;
        }
        ljn ljnVar2 = ljhVar.b;
        nef nefVar4 = (nef) ljnVar2;
        if ((nefVar4.a & 4) != 0) {
            long j3 = nefVar4.d - j;
            if (!ljnVar2.y()) {
                ljhVar.t();
            }
            nef nefVar5 = (nef) ljhVar.b;
            nefVar5.a |= 4;
            nefVar5.d = j3;
        }
        ljn ljnVar3 = ljhVar.b;
        nef nefVar6 = (nef) ljnVar3;
        if ((nefVar6.a & 8) != 0) {
            long j4 = nefVar6.e - j;
            if (!ljnVar3.y()) {
                ljhVar.t();
            }
            nef nefVar7 = (nef) ljhVar.b;
            nefVar7.a |= 8;
            nefVar7.e = j4;
        }
        return (nef) ljhVar.q();
    }

    public static int e(byte[] bArr) {
        ByteBuffer order = ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN);
        order.put(bArr).rewind();
        return order.getInt();
    }

    public static jis f(byte[] bArr, int i) {
        jin jinVar = new jin();
        BitSet valueOf = BitSet.valueOf(bArr);
        for (int i2 = 0; i2 < valueOf.length(); i2++) {
            if (valueOf.get(i2)) {
                jinVar.h(Integer.valueOf(i2 + i));
            }
        }
        return jinVar.g();
    }

    public static byte[] g(int i, int i2) {
        ByteBuffer order = ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN);
        order.putInt(i).rewind();
        byte[] bArr = new byte[i2];
        order.get(bArr, 0, Math.min(i2, 4));
        return bArr;
    }

    public static jyz h(jyz jyzVar) {
        return jwu.g(jyzVar, new jej(null), jxv.a);
    }

    public static void k(imh imhVar, HashMap hashMap) {
        String a = imhVar.a();
        hwx.O(!hashMap.containsKey(a), "There is already a factory registered for the ID %s", a);
        hashMap.put(a, imhVar);
    }

    public static void l(boolean z, String str, Object... objArr) {
        if (z) {
        } else {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static IOException m(kpb kpbVar, Uri uri, IOException iOException, String str) {
        try {
            iku ikuVar = new iku();
            ikuVar.b();
            File file = (File) kpbVar.n(uri, ikuVar);
            if (file.exists()) {
                if (file.isFile()) {
                    if (file.canRead()) {
                        if (file.canWrite()) {
                            return b(file, iOException, str);
                        }
                        return b(file, iOException, str);
                    }
                    if (file.canWrite()) {
                        return b(file, iOException, str);
                    }
                    return b(file, iOException, str);
                }
                if (file.canRead()) {
                    if (file.canWrite()) {
                        return b(file, iOException, str);
                    }
                    return b(file, iOException, str);
                }
                if (file.canWrite()) {
                    return b(file, iOException, str);
                }
                return b(file, iOException, str);
            }
            return b(file, iOException, str);
        } catch (IOException unused) {
            return new IOException(iOException);
        }
    }
}
