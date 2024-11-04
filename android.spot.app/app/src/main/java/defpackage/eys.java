package defpackage;

import android.view.View;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eys implements bvj {
    public final int a;
    public brq b;

    public eys(int i) {
        this.a = i;
    }

    @Override // defpackage.bvj
    public final bya a(View view, bya byaVar) {
        brq f = byaVar.f(2);
        if (!Objects.equals(f, this.b)) {
            this.b = f;
            view.setBackground(new eyr(this));
        }
        return byaVar;
    }
}
