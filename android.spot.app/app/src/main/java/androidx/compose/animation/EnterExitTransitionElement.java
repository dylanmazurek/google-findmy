package androidx.compose.animation;

import defpackage.amr;
import defpackage.aow;
import defpackage.azf;
import defpackage.kgf;
import defpackage.mnw;
import defpackage.uc;
import defpackage.uf;
import defpackage.ug;
import defpackage.ui;
import defpackage.wi;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class EnterExitTransitionElement extends azf {
    private final wi a;
    private final uf b;
    private final ug c;
    private final mnw e;
    private final uc f;
    private final kgf g = null;
    private final kgf h = null;
    private final kgf i = null;

    public EnterExitTransitionElement(wi wiVar, uf ufVar, ug ugVar, mnw mnwVar, uc ucVar) {
        this.a = wiVar;
        this.b = ufVar;
        this.c = ugVar;
        this.e = mnwVar;
        this.f = ucVar;
    }

    @Override // defpackage.azf
    public final /* bridge */ /* synthetic */ aow d() {
        return new ui(this.a, this.b, this.c, this.e, this.f);
    }

    @Override // defpackage.azf
    public final /* bridge */ /* synthetic */ void e(aow aowVar) {
        ui uiVar = (ui) aowVar;
        uiVar.a = this.a;
        uiVar.b = this.b;
        uiVar.c = this.c;
        uiVar.d = this.e;
        uiVar.f = this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnterExitTransitionElement)) {
            return false;
        }
        EnterExitTransitionElement enterExitTransitionElement = (EnterExitTransitionElement) obj;
        if (!amr.i(this.a, enterExitTransitionElement.a)) {
            return false;
        }
        kgf kgfVar = enterExitTransitionElement.g;
        if (!amr.i(null, null)) {
            return false;
        }
        kgf kgfVar2 = enterExitTransitionElement.h;
        if (!amr.i(null, null)) {
            return false;
        }
        kgf kgfVar3 = enterExitTransitionElement.i;
        if (amr.i(null, null) && amr.i(this.b, enterExitTransitionElement.b) && amr.i(this.c, enterExitTransitionElement.c) && amr.i(this.e, enterExitTransitionElement.e) && amr.i(this.f, enterExitTransitionElement.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 923521) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "EnterExitTransitionElement(transition=" + this.a + ", sizeAnimation=null, offsetAnimation=null, slideAnimation=null, enter=" + this.b + ", exit=" + this.c + ", isEnabled=" + this.e + ", graphicsLayerBlock=" + this.f + ')';
    }
}
