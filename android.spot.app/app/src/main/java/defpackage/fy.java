package defpackage;

import android.content.Context;
import android.view.MenuItem;

/* compiled from: PG */
/* loaded from: classes.dex */
class fy {
    final Context a;
    public ta b;

    public fy(Context context) {
        this.a = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final MenuItem a(MenuItem menuItem) {
        if (menuItem instanceof bsq) {
            bsq bsqVar = (bsq) menuItem;
            if (this.b == null) {
                this.b = new ta();
            }
            MenuItem menuItem2 = (MenuItem) this.b.get(bsqVar);
            if (menuItem2 == null) {
                go goVar = new go(this.a, bsqVar);
                this.b.put(bsqVar, goVar);
                return goVar;
            }
            return menuItem2;
        }
        return menuItem;
    }
}
