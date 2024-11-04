package defpackage;

import android.content.Context;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hm extends gr {
    final /* synthetic */ ho d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hm(ho hoVar, Context context, gh ghVar, View view) {
        super(context, ghVar, view, true);
        this.d = hoVar;
        this.b = 8388613;
        e(hoVar.n);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.gr
    public final void c() {
        gh ghVar = this.d.c;
        if (ghVar != null) {
            ghVar.close();
        }
        this.d.j = null;
        super.c();
    }
}
