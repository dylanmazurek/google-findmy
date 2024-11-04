package defpackage;

import android.os.Handler;
import android.os.Message;

/* compiled from: PG */
/* loaded from: classes.dex */
final class iwl implements Handler.Callback {
    final /* synthetic */ iwn a;

    public iwl(iwn iwnVar) {
        this.a = iwnVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        iwn iwnVar = this.a;
        iwm iwmVar = (iwm) message.obj;
        synchronized (iwnVar.a) {
            if (iwnVar.c == iwmVar || iwnVar.d == iwmVar) {
                iwnVar.d(iwmVar, 2);
            }
        }
        return true;
    }
}
