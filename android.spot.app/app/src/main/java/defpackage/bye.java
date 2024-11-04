package defpackage;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bye extends bqs {
    final WindowInsetsController a;
    protected final Window b;

    public bye(Window window) {
        WindowInsetsController insetsController;
        insetsController = window.getInsetsController();
        new ta();
        this.a = insetsController;
        this.b = window;
    }

    @Override // defpackage.bqs
    public final void d(boolean z) {
        if (z) {
            g(16);
            this.a.setSystemBarsAppearance(16, 16);
        } else {
            h(16);
            this.a.setSystemBarsAppearance(0, 16);
        }
    }

    @Override // defpackage.bqs
    public final void e(boolean z) {
        if (z) {
            g(8192);
            this.a.setSystemBarsAppearance(8, 8);
        } else {
            h(8192);
            this.a.setSystemBarsAppearance(0, 8);
        }
    }

    @Override // defpackage.bqs
    public boolean f() {
        int systemBarsAppearance;
        this.a.setSystemBarsAppearance(0, 0);
        systemBarsAppearance = this.a.getSystemBarsAppearance();
        if ((systemBarsAppearance & 8) == 0) {
            return false;
        }
        return true;
    }

    protected final void g(int i) {
        View decorView = this.b.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    protected final void h(int i) {
        View decorView = this.b.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }
}
