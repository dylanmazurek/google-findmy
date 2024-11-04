package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nhv implements nge {
    private static final int b(ngn ngnVar, int i) {
        String a = ngn.a(ngnVar, "Retry-After");
        if (a == null) {
            return i;
        }
        if (new mrk("\\d+").a(a)) {
            return Integer.valueOf(a).intValue();
        }
        return Integer.MAX_VALUE;
    }

    private static final boolean c(IOException iOException, nhg nhgVar, ngk ngkVar, boolean z) {
        nhm nhmVar;
        nhi nhiVar;
        if (z) {
            msz mszVar = ngkVar.f;
            if (iOException instanceof FileNotFoundException) {
                return false;
            }
        }
        if ((iOException instanceof ProtocolException) || (!(iOException instanceof InterruptedIOException) ? !((!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException)) : !((iOException instanceof SocketTimeoutException) && !z))) {
            return false;
        }
        nhd nhdVar = nhgVar.h;
        nhdVar.getClass();
        int i = nhdVar.e;
        if (i == 0) {
            if (nhdVar.f != 0 || nhdVar.g != 0) {
                i = 0;
            }
            return false;
        }
        if (nhdVar.h == null) {
            ngq ngqVar = null;
            if (i <= 1 && nhdVar.f <= 1 && nhdVar.g <= 0 && (nhiVar = nhdVar.c.i) != null) {
                synchronized (nhiVar) {
                    if (nhiVar.j == 0) {
                        if (ngt.r(nhiVar.a.a.h, nhdVar.b.h)) {
                            ngqVar = nhiVar.a;
                        }
                    }
                }
            }
            if (ngqVar != null) {
                nhdVar.h = ngqVar;
            } else {
                njm njmVar = nhdVar.i;
                if ((njmVar == null || !njmVar.i()) && (nhmVar = nhdVar.d) != null && !nhmVar.a()) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x01b5 A[Catch: all -> 0x024b, TryCatch #3 {all -> 0x024b, blocks: (B:20:0x0076, B:23:0x007a, B:27:0x0080, B:29:0x0095, B:31:0x009c, B:32:0x00a3, B:34:0x00a4, B:36:0x00a9, B:37:0x00b7, B:50:0x00d9, B:52:0x00de, B:54:0x00e2, B:57:0x00e7, B:60:0x00ef, B:63:0x01de, B:65:0x01e2, B:70:0x01f3, B:71:0x01fe, B:75:0x00f5, B:79:0x0103, B:80:0x010a, B:81:0x010b, B:83:0x010f, B:86:0x0114, B:88:0x011d, B:90:0x0122, B:92:0x013e, B:94:0x014c, B:97:0x0155, B:99:0x015f, B:102:0x0168, B:104:0x0180, B:110:0x0194, B:114:0x01a0, B:116:0x01b5, B:117:0x01c6, B:119:0x01d0, B:120:0x01d5, B:123:0x01aa, B:124:0x01b0, B:152:0x0243, B:153:0x024a, B:132:0x0207, B:134:0x0212, B:140:0x021e, B:141:0x0221, B:143:0x0223, B:145:0x0230, B:149:0x023d, B:150:0x0242), top: B:19:0x0076, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01aa A[Catch: all -> 0x024b, TryCatch #3 {all -> 0x024b, blocks: (B:20:0x0076, B:23:0x007a, B:27:0x0080, B:29:0x0095, B:31:0x009c, B:32:0x00a3, B:34:0x00a4, B:36:0x00a9, B:37:0x00b7, B:50:0x00d9, B:52:0x00de, B:54:0x00e2, B:57:0x00e7, B:60:0x00ef, B:63:0x01de, B:65:0x01e2, B:70:0x01f3, B:71:0x01fe, B:75:0x00f5, B:79:0x0103, B:80:0x010a, B:81:0x010b, B:83:0x010f, B:86:0x0114, B:88:0x011d, B:90:0x0122, B:92:0x013e, B:94:0x014c, B:97:0x0155, B:99:0x015f, B:102:0x0168, B:104:0x0180, B:110:0x0194, B:114:0x01a0, B:116:0x01b5, B:117:0x01c6, B:119:0x01d0, B:120:0x01d5, B:123:0x01aa, B:124:0x01b0, B:152:0x0243, B:153:0x024a, B:132:0x0207, B:134:0x0212, B:140:0x021e, B:141:0x0221, B:143:0x0223, B:145:0x0230, B:149:0x023d, B:150:0x0242), top: B:19:0x0076, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01de A[Catch: all -> 0x024b, TryCatch #3 {all -> 0x024b, blocks: (B:20:0x0076, B:23:0x007a, B:27:0x0080, B:29:0x0095, B:31:0x009c, B:32:0x00a3, B:34:0x00a4, B:36:0x00a9, B:37:0x00b7, B:50:0x00d9, B:52:0x00de, B:54:0x00e2, B:57:0x00e7, B:60:0x00ef, B:63:0x01de, B:65:0x01e2, B:70:0x01f3, B:71:0x01fe, B:75:0x00f5, B:79:0x0103, B:80:0x010a, B:81:0x010b, B:83:0x010f, B:86:0x0114, B:88:0x011d, B:90:0x0122, B:92:0x013e, B:94:0x014c, B:97:0x0155, B:99:0x015f, B:102:0x0168, B:104:0x0180, B:110:0x0194, B:114:0x01a0, B:116:0x01b5, B:117:0x01c6, B:119:0x01d0, B:120:0x01d5, B:123:0x01aa, B:124:0x01b0, B:152:0x0243, B:153:0x024a, B:132:0x0207, B:134:0x0212, B:140:0x021e, B:141:0x0221, B:143:0x0223, B:145:0x0230, B:149:0x023d, B:150:0x0242), top: B:19:0x0076, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ff A[SYNTHETIC] */
    @Override // defpackage.nge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.ngn a(defpackage.nht r27) {
        /*
            Method dump skipped, instructions count: 632
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nhv.a(nht):ngn");
    }
}
