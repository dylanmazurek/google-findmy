package defpackage;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nlk extends nko {
    private final Socket a;

    public nlk(Socket socket) {
        this.a = socket;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.nko
    public final void a() {
        try {
            this.a.close();
        } catch (AssertionError e) {
            if (nkz.d(e)) {
                Socket socket = this.a;
                Logger logger = nkz.a;
                Level level = Level.WARNING;
                Objects.toString(socket);
                logger.log(level, "Failed to close timed out socket ".concat(socket.toString()), (Throwable) e);
                return;
            }
            throw e;
        } catch (Exception e2) {
            Socket socket2 = this.a;
            Logger logger2 = nkz.a;
            Level level2 = Level.WARNING;
            Objects.toString(socket2);
            logger2.log(level2, "Failed to close timed out socket ".concat(socket2.toString()), (Throwable) e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.nko
    public final IOException d(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
