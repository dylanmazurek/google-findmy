package defpackage;

import android.view.View;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iwb implements bvj {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public iwb(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.bvj
    public final bya a(View view, bya byaVar) {
        bya byaVar2;
        if (this.b != 0) {
            CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) this.a;
            if (true != collapsingToolbarLayout.getFitsSystemWindows()) {
                byaVar2 = null;
            } else {
                byaVar2 = byaVar;
            }
            if (!Objects.equals(collapsingToolbarLayout.e, byaVar2)) {
                collapsingToolbarLayout.e = byaVar2;
                collapsingToolbarLayout.requestLayout();
            }
            return byaVar.k();
        }
        ((iwh) this.a).n = byaVar.a();
        ((iwh) this.a).o = byaVar.b();
        int c = byaVar.c();
        iwh iwhVar = (iwh) this.a;
        iwhVar.p = c;
        iwhVar.k();
        return byaVar;
    }
}
