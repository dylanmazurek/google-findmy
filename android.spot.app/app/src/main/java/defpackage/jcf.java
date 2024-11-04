package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.ar.core.exceptions.UnavailableUserDeclinedInstallationException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class jcf extends Handler {
    final /* synthetic */ jci a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jcf(jci jciVar, Looper looper) {
        super(looper);
        this.a = jciVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        this.a.d();
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    int i2 = message.what;
                    return;
                } else {
                    this.a.d = new UnavailableUserDeclinedInstallationException("User pressed back during the download.");
                    return;
                }
            }
            return;
        }
        this.a.d = new RuntimeException("Failed to install module.");
    }
}
