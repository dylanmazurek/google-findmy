package defpackage;

import android.view.MenuItem;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gn implements MenuItem.OnMenuItemClickListener {
    final /* synthetic */ go a;
    private final MenuItem.OnMenuItemClickListener b;

    public gn(go goVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.a = goVar;
        this.b = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.b.onMenuItemClick(this.a.a(menuItem));
    }
}
