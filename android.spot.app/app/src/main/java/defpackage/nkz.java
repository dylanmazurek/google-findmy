package defpackage;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class nkz {
    public static final Logger a = Logger.getLogger("okio.Okio");

    public static final nlj a(Socket socket) {
        socket.getClass();
        nlk nlkVar = new nlk(socket);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.getClass();
        return new nkm(nlkVar, new nlb(outputStream, nlkVar));
    }

    public static final nll b(InputStream inputStream) {
        inputStream.getClass();
        return new nky(inputStream, new nln());
    }

    public static final nll c(Socket socket) {
        socket.getClass();
        nlk nlkVar = new nlk(socket);
        InputStream inputStream = socket.getInputStream();
        inputStream.getClass();
        return new nkn(nlkVar, new nky(inputStream, nlkVar));
    }

    public static final boolean d(AssertionError assertionError) {
        String message;
        if (assertionError.getCause() != null && (message = assertionError.getMessage()) != null && moz.t(message, "getsockname failed")) {
            return true;
        }
        return false;
    }
}
