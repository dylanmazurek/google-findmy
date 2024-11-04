package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hjg extends frx {
    final /* synthetic */ View a;
    final /* synthetic */ int d;
    public final /* synthetic */ hjh e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hjg(hjh hjhVar, View view, int i) {
        super(null, null, null);
        this.a = view;
        this.d = i;
        this.e = hjhVar;
    }

    @Override // defpackage.frx
    public final void a(Object obj) {
        View view = this.a;
        view.post(new gzi(this, view, this.d, obj, 2));
    }
}
