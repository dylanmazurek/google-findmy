package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mvd extends CancellationException implements msq {
    public final transient muf a;

    public mvd(String str, muf mufVar) {
        super(str);
        this.a = mufVar;
    }

    @Override // defpackage.msq
    public final /* bridge */ /* synthetic */ Throwable a() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        mvd mvdVar = new mvd(message, this.a);
        mvdVar.initCause(this);
        return mvdVar;
    }
}
