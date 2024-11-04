package androidx.compose.ui.input.pointer;

import defpackage.amr;
import defpackage.aow;
import defpackage.atx;
import defpackage.auh;
import defpackage.auj;
import defpackage.azf;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class PointerHoverIconModifierElement extends azf {
    private final auj a;
    private final boolean b = false;

    public PointerHoverIconModifierElement(auj aujVar) {
        this.a = aujVar;
    }

    @Override // defpackage.azf
    public final /* bridge */ /* synthetic */ aow d() {
        return new auh(this.a);
    }

    @Override // defpackage.azf
    public final /* bridge */ /* synthetic */ void e(aow aowVar) {
        auh auhVar = (auh) aowVar;
        auj aujVar = auhVar.b;
        auj aujVar2 = this.a;
        if (!amr.i(aujVar, aujVar2)) {
            auhVar.b = aujVar2;
            if (auhVar.c) {
                auhVar.c();
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PointerHoverIconModifierElement)) {
            return false;
        }
        PointerHoverIconModifierElement pointerHoverIconModifierElement = (PointerHoverIconModifierElement) obj;
        if (!amr.i(this.a, pointerHoverIconModifierElement.a)) {
            return false;
        }
        boolean z = pointerHoverIconModifierElement.b;
        return true;
    }

    public final int hashCode() {
        return (((atx) this.a).a * 31) + 1237;
    }

    public final String toString() {
        return "PointerHoverIconModifierElement(icon=" + this.a + ", overrideDescendants=false)";
    }
}
