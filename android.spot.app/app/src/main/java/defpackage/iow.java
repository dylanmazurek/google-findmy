package defpackage;

import android.app.Dialog;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public class iow extends dq {
    @Override // defpackage.dq, defpackage.v
    public Dialog a(Bundle bundle) {
        return new iov(x(), this.b);
    }

    @Override // defpackage.v
    public final void d() {
        Dialog dialog = this.d;
        if (dialog instanceof iov) {
            boolean z = ((iov) dialog).a().v;
        }
        super.d();
    }
}
