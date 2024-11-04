package defpackage;

import android.net.ssl.SSLSockets;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class njv implements nkc {
    @Override // defpackage.nkc
    public final String a(SSLSocket sSLSocket) {
        String applicationProtocol;
        applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol != null && !amr.i(applicationProtocol, "")) {
            return applicationProtocol;
        }
        return null;
    }

    @Override // defpackage.nkc
    public final void b(SSLSocket sSLSocket, String str, List list) {
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            nju njuVar = nju.b;
            sSLParameters.setApplicationProtocols((String[]) mkm.aR(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }

    @Override // defpackage.nkc
    public final boolean c() {
        return mkm.aQ();
    }

    @Override // defpackage.nkc
    public final boolean d(SSLSocket sSLSocket) {
        boolean isSupportedSocket;
        isSupportedSocket = SSLSockets.isSupportedSocket(sSLSocket);
        return isSupportedSocket;
    }
}
