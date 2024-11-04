package defpackage;

import android.view.Window;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class byf extends bye {
    public byf(Window window) {
        super(window);
    }

    @Override // defpackage.bye, defpackage.bqs
    public final boolean f() {
        int systemBarsAppearance;
        systemBarsAppearance = this.a.getSystemBarsAppearance();
        if ((systemBarsAppearance & 8) != 0) {
            return true;
        }
        return false;
    }
}
