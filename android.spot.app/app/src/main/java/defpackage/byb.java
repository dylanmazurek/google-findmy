package defpackage;

import android.view.View;
import android.view.Window;

/* compiled from: PG */
/* loaded from: classes.dex */
public class byb extends bqs {
    protected final Window a;

    public byb(Window window) {
        this.a = window;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void g(int i) {
        View decorView = this.a.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void h(int i) {
        View decorView = this.a.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void i(int i) {
        this.a.clearFlags(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void j() {
        this.a.addFlags(Integer.MIN_VALUE);
    }
}
