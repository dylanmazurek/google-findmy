package androidx.compose.ui.layout;

import defpackage.amr;
import defpackage.aow;
import defpackage.avu;
import defpackage.azf;
import defpackage.mom;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class LayoutElement extends azf {
    private final mom a;

    public LayoutElement(mom momVar) {
        this.a = momVar;
    }

    @Override // defpackage.azf
    public final /* bridge */ /* synthetic */ aow d() {
        return new avu(this.a);
    }

    @Override // defpackage.azf
    public final /* bridge */ /* synthetic */ void e(aow aowVar) {
        ((avu) aowVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof LayoutElement) && amr.i(this.a, ((LayoutElement) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LayoutElement(measure=" + this.a + ')';
    }
}
