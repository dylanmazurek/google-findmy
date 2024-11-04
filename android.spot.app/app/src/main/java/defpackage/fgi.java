package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fgi extends fgg {
    public fgi(int i, Bundle bundle) {
        super(i, 1, bundle);
    }

    @Override // defpackage.fgg
    public final void a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        d(bundle2);
    }

    @Override // defpackage.fgg
    public final boolean b() {
        return false;
    }
}
