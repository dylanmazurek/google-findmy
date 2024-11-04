package defpackage;

import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class njt extends nju {
    public static final boolean a;

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:            if (r0.intValue() >= 9) goto L13;     */
    static {
        /*
            java.lang.String r0 = "java.specification.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            r1 = 0
            if (r0 == 0) goto Le
            java.lang.Integer r0 = defpackage.moz.e(r0)
            goto Lf
        Le:
            r0 = r1
        Lf:
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L1e
            int r0 = r0.intValue()
            r1 = 9
            if (r0 < r1) goto L1c
            goto L25
        L1c:
            r2 = 0
            goto L25
        L1e:
            java.lang.Class<javax.net.ssl.SSLSocket> r0 = javax.net.ssl.SSLSocket.class
            java.lang.String r4 = "getApplicationProtocol"
            r0.getMethod(r4, r1)     // Catch: java.lang.NoSuchMethodException -> L1c
        L25:
            defpackage.njt.a = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.njt.<clinit>():void");
    }

    @Override // defpackage.nju
    public final String a(SSLSocket sSLSocket) {
        String applicationProtocol;
        try {
            applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol != null) {
                if (!amr.i(applicationProtocol, "")) {
                    return applicationProtocol;
                }
            }
        } catch (UnsupportedOperationException unused) {
        }
        return null;
    }

    @Override // defpackage.nju
    public final void c(SSLSocket sSLSocket, String str, List list) {
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        sSLParameters.setApplicationProtocols((String[]) mkm.aR(list).toArray(new String[0]));
        sSLSocket.setSSLParameters(sSLParameters);
    }
}
