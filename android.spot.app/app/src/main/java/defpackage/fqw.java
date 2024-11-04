package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fqw extends Handler {
    public fqw() {
        Looper.getMainLooper();
    }

    public fqw(Looper looper) {
        super(looper);
        Looper.getMainLooper();
    }

    public fqw(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        Looper.getMainLooper();
    }
}
