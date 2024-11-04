package androidx.compose.ui.graphics;

import defpackage.amr;
import defpackage.aow;
import defpackage.aqu;
import defpackage.azf;
import defpackage.azq;
import defpackage.moh;
import defpackage.qg;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class BlockGraphicsLayerElement extends azf {
    private final moh a;

    public BlockGraphicsLayerElement(moh mohVar) {
        this.a = mohVar;
    }

    @Override // defpackage.azf
    public final /* bridge */ /* synthetic */ aow d() {
        return new aqu(this.a);
    }

    @Override // defpackage.azf
    public final /* bridge */ /* synthetic */ void e(aow aowVar) {
        aqu aquVar = (aqu) aowVar;
        aquVar.a = this.a;
        azq azqVar = qg.g(aquVar, 2).t;
        if (azqVar != null) {
            azqVar.al(aquVar.a, true);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof BlockGraphicsLayerElement) && amr.i(this.a, ((BlockGraphicsLayerElement) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "BlockGraphicsLayerElement(block=" + this.a + ')';
    }
}
