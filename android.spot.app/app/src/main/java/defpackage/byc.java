package defpackage;

import android.view.Window;

/* compiled from: PG */
/* loaded from: classes.dex */
public class byc extends byb {
    public byc(Window window) {
        super(window);
    }

    @Override // defpackage.bqs
    public final void e(boolean z) {
        if (z) {
            i(67108864);
            j();
            g(8192);
            return;
        }
        h(8192);
    }

    @Override // defpackage.bqs
    public final boolean f() {
        if ((this.a.getDecorView().getSystemUiVisibility() & 8192) != 0) {
            return true;
        }
        return false;
    }
}
