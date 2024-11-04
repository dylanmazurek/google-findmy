package defpackage;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ar implements bvd {
    final /* synthetic */ be a;

    public ar(be beVar) {
        this.a = beVar;
    }

    @Override // defpackage.bvd
    public final void a(Menu menu, MenuInflater menuInflater) {
        this.a.W(menu, menuInflater);
    }

    @Override // defpackage.bvd
    public final void b(Menu menu) {
        this.a.w(menu);
    }

    @Override // defpackage.bvd
    public final void c(Menu menu) {
        this.a.Y(menu);
    }

    @Override // defpackage.bvd
    public final boolean d(MenuItem menuItem) {
        return this.a.X(menuItem);
    }
}
