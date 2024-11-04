package defpackage;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ipa extends bxf {
    private final View b;
    private int c;
    private int d;
    private final int[] e = new int[2];

    public ipa(View view) {
        this.b = view;
    }

    @Override // defpackage.bxf
    public final void a() {
        this.b.setTranslationY(0.0f);
    }

    @Override // defpackage.bxf
    public final void b() {
        this.b.getLocationOnScreen(this.e);
        this.c = this.e[1];
    }

    @Override // defpackage.bxf
    public final void c(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if ((((bxn) ((lrs) it.next()).a).h() & 8) != 0) {
                this.b.setTranslationY(inc.b(this.d, 0, r0.f()));
                return;
            }
        }
    }

    @Override // defpackage.bxf
    public final void d() {
        this.b.getLocationOnScreen(this.e);
        int i = this.c - this.e[1];
        this.d = i;
        this.b.setTranslationY(i);
    }
}
