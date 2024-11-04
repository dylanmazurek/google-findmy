package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fgf extends fgg {
    public fgf(int i, int i2, Bundle bundle) {
        super(i, i2, bundle);
    }

    @Override // defpackage.fgg
    public final void a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            d(null);
        } else {
            c(new fgh("Invalid response to one way request"));
        }
    }

    @Override // defpackage.fgg
    public final boolean b() {
        return true;
    }
}
