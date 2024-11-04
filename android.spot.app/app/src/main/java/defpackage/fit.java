package defpackage;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fit extends fqw {
    public fit() {
        super(Looper.getMainLooper());
    }

    public final void a(fia fiaVar, fhz fhzVar) {
        ThreadLocal threadLocal = BasePendingResult.b;
        sendMessage(obtainMessage(1, new Pair(fiaVar, fhzVar)));
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                Log.wtf("BasePendingResult", "Don't know how to handle message: " + message.what, new Exception());
                return;
            }
            ((BasePendingResult) message.obj).l(Status.e);
            return;
        }
        Pair pair = (Pair) message.obj;
        fia fiaVar = (fia) pair.first;
        fhz fhzVar = (fhz) pair.second;
        try {
            fiaVar.a(fhzVar);
        } catch (RuntimeException e) {
            BasePendingResult.m(fhzVar);
            throw e;
        }
    }

    public fit(Looper looper) {
        super(looper);
    }
}
