package defpackage;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class isq extends gh {
    private final Class l;
    private final int m;

    public isq(Context context, Class cls, int i) {
        super(context);
        this.l = cls;
        this.m = i;
    }

    @Override // defpackage.gh, android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        throw new UnsupportedOperationException(String.valueOf(this.l.getSimpleName()).concat(" does not support submenus"));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.gh
    public final MenuItem c(int i, int i2, int i3, CharSequence charSequence) {
        int size = size() + 1;
        int i4 = this.m;
        if (size <= i4) {
            s();
            MenuItem c = super.c(i, i2, i3, charSequence);
            ((gj) c).j(true);
            r();
            return c;
        }
        String simpleName = this.l.getSimpleName();
        throw new IllegalArgumentException("Maximum number of items supported by " + simpleName + " is " + i4 + ". Limit can be checked with " + simpleName + "#getMaxItemCount()");
    }
}
