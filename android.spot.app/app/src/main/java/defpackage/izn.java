package defpackage;

import java.net.Socket;
import org.apache.http.conn.scheme.LayeredSocketFactory;

/* compiled from: PG */
/* loaded from: classes.dex */
final class izn extends izo implements LayeredSocketFactory {
    private final LayeredSocketFactory b;

    public izn(izp izpVar, LayeredSocketFactory layeredSocketFactory) {
        super(izpVar, layeredSocketFactory);
        this.b = layeredSocketFactory;
    }

    @Override // org.apache.http.conn.scheme.LayeredSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) {
        return this.b.createSocket(socket, str, i, z);
    }
}
