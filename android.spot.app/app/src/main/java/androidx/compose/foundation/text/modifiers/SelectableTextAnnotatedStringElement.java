package androidx.compose.foundation.text.modifiers;

import defpackage.a;
import defpackage.amr;
import defpackage.aow;
import defpackage.aqy;
import defpackage.azf;
import defpackage.bfs;
import defpackage.bgm;
import defpackage.blc;
import defpackage.dkr;
import defpackage.moh;
import defpackage.qh;
import defpackage.qi;
import defpackage.qs;
import defpackage.yu;
import defpackage.yv;
import defpackage.za;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SelectableTextAnnotatedStringElement extends azf {
    private final bfs a;
    private final bgm b;
    private final int e;
    private final boolean f;
    private final int g;
    private final yv k;
    private final dkr m;
    private final moh c = null;
    private final int h = 1;
    private final List i = null;
    private final moh j = null;
    private final aqy l = null;

    public SelectableTextAnnotatedStringElement(bfs bfsVar, bgm bgmVar, dkr dkrVar, int i, boolean z, int i2, yv yvVar) {
        this.a = bfsVar;
        this.b = bgmVar;
        this.m = dkrVar;
        this.e = i;
        this.f = z;
        this.g = i2;
        this.k = yvVar;
    }

    @Override // defpackage.azf
    public final /* bridge */ /* synthetic */ aow d() {
        return new yu(this.a, this.b, this.m, this.e, this.f, this.g, this.k);
    }

    @Override // defpackage.azf
    public final /* bridge */ /* synthetic */ void e(aow aowVar) {
        boolean z;
        boolean z2;
        boolean z3;
        yu yuVar = (yu) aowVar;
        za zaVar = yuVar.b;
        boolean i = amr.i(null, null);
        bgm bgmVar = this.b;
        boolean z4 = false;
        if (i && bgmVar.s(zaVar.b)) {
            z = false;
        } else {
            z = true;
        }
        bfs bfsVar = this.a;
        boolean i2 = amr.i(zaVar.a.a, bfsVar.a);
        boolean i3 = amr.i(zaVar.a.c(), bfsVar.c());
        boolean i4 = amr.i(zaVar.a.b(), bfsVar.b());
        boolean i5 = amr.i(zaVar.a.d, bfsVar.d);
        if (i2 && i3 && i4 && i5) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            zaVar.a = bfsVar;
        }
        if (!i2) {
            zaVar.f();
        }
        int i6 = this.e;
        dkr dkrVar = this.m;
        boolean z5 = this.f;
        int i7 = this.g;
        boolean z6 = !zaVar.b.t(bgmVar);
        zaVar.b = bgmVar;
        boolean z7 = !amr.i(null, null);
        if (zaVar.f != 1) {
            zaVar.f = 1;
            z3 = true;
        } else {
            z3 = z7 | z6;
        }
        if (zaVar.e != i7) {
            zaVar.e = i7;
            z3 = true;
        }
        if (zaVar.d != z5) {
            zaVar.d = z5;
            z3 = true;
        }
        if (!amr.i(zaVar.j, dkrVar)) {
            zaVar.j = dkrVar;
            z3 = true;
        }
        if (!a.m(zaVar.c, i6)) {
            zaVar.c = i6;
            z3 = true;
        }
        yv yvVar = this.k;
        if (!amr.i(zaVar.g, yvVar)) {
            zaVar.g = yvVar;
            z4 = true;
        }
        if (z2 || z3 || z4) {
            zaVar.c().d(zaVar.a, zaVar.b, zaVar.j, zaVar.c, zaVar.d, zaVar.e);
        }
        if (zaVar.t) {
            if (z2 || (z && zaVar.h != null)) {
                qs.g(zaVar);
            }
            if (z2 || z3 || z4) {
                qi.d(zaVar);
                qh.e(zaVar);
            }
            if (z) {
                qh.e(zaVar);
            }
        }
        yuVar.a = yvVar;
        qi.d(yuVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectableTextAnnotatedStringElement)) {
            return false;
        }
        SelectableTextAnnotatedStringElement selectableTextAnnotatedStringElement = (SelectableTextAnnotatedStringElement) obj;
        aqy aqyVar = selectableTextAnnotatedStringElement.l;
        if (!amr.i(null, null) || !amr.i(this.a, selectableTextAnnotatedStringElement.a) || !amr.i(this.b, selectableTextAnnotatedStringElement.b)) {
            return false;
        }
        List list = selectableTextAnnotatedStringElement.i;
        if (!amr.i(null, null) || !amr.i(this.m, selectableTextAnnotatedStringElement.m)) {
            return false;
        }
        moh mohVar = selectableTextAnnotatedStringElement.c;
        if (!a.m(this.e, selectableTextAnnotatedStringElement.e) || this.f != selectableTextAnnotatedStringElement.f || this.g != selectableTextAnnotatedStringElement.g) {
            return false;
        }
        int i = selectableTextAnnotatedStringElement.h;
        moh mohVar2 = selectableTextAnnotatedStringElement.j;
        if (amr.i(this.k, selectableTextAnnotatedStringElement.k)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.m.hashCode()) * 961) + this.e) * 31) + a.i(this.f)) * 31) + this.g) * 31) + 1) * 29791) + this.k.hashCode()) * 31;
    }

    public final String toString() {
        return "SelectableTextAnnotatedStringElement(text=" + ((Object) this.a) + ", style=" + this.b + ", fontFamilyResolver=" + this.m + ", onTextLayout=null, overflow=" + ((Object) blc.a(this.e)) + ", softWrap=" + this.f + ", maxLines=" + this.g + ", minLines=1, placeholders=null, onPlaceholderLayout=null, selectionController=" + this.k + ", color=null)";
    }
}
