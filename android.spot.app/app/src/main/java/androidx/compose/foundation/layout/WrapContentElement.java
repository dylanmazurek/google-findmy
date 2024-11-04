package androidx.compose.foundation.layout;

import defpackage.a;
import defpackage.amr;
import defpackage.aow;
import defpackage.azf;
import defpackage.mol;
import defpackage.yl;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class WrapContentElement extends azf {
    private final mol a;
    private final Object b;

    public WrapContentElement(mol molVar, Object obj) {
        this.a = molVar;
        this.b = obj;
    }

    @Override // defpackage.azf
    public final /* bridge */ /* synthetic */ aow d() {
        return new yl(this.a);
    }

    @Override // defpackage.azf
    public final /* bridge */ /* synthetic */ void e(aow aowVar) {
        yl ylVar = (yl) aowVar;
        ylVar.b = 1;
        ylVar.a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && amr.i(this.b, ((WrapContentElement) obj).b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        a.N(1);
        return this.b.hashCode() + 39308;
    }
}
