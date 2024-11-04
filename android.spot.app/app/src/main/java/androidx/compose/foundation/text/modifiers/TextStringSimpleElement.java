package androidx.compose.foundation.text.modifiers;

import defpackage.a;
import defpackage.amr;
import defpackage.aow;
import defpackage.aqy;
import defpackage.azf;
import defpackage.bgm;
import defpackage.dkr;
import defpackage.qh;
import defpackage.qi;
import defpackage.qs;
import defpackage.zd;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class TextStringSimpleElement extends azf {
    private final String a;
    private final bgm b;
    private final int c;
    private final boolean e;
    private final int f;
    private final int g = 1;
    private final aqy h = null;
    private final dkr i;

    public TextStringSimpleElement(String str, bgm bgmVar, dkr dkrVar, int i, boolean z, int i2) {
        this.a = str;
        this.b = bgmVar;
        this.i = dkrVar;
        this.c = i;
        this.e = z;
        this.f = i2;
    }

    @Override // defpackage.azf
    public final /* bridge */ /* synthetic */ aow d() {
        return new zd(this.a, this.b, this.i, this.c, this.e, this.f);
    }

    @Override // defpackage.azf
    public final /* bridge */ /* synthetic */ void e(aow aowVar) {
        boolean z;
        zd zdVar = (zd) aowVar;
        boolean z2 = false;
        boolean z3 = true;
        if (amr.i(null, null) && this.b.s(zdVar.b)) {
            z = false;
        } else {
            z = true;
        }
        String str = this.a;
        if (!amr.i(zdVar.a, str)) {
            zdVar.a = str;
            zdVar.f();
            z2 = true;
        }
        bgm bgmVar = this.b;
        int i = this.f;
        boolean z4 = this.e;
        dkr dkrVar = this.i;
        int i2 = this.c;
        boolean z5 = !zdVar.b.t(bgmVar);
        zdVar.b = bgmVar;
        if (zdVar.f != 1) {
            zdVar.f = 1;
            z5 = true;
        }
        if (zdVar.e != i) {
            zdVar.e = i;
            z5 = true;
        }
        if (zdVar.d != z4) {
            zdVar.d = z4;
            z5 = true;
        }
        if (!amr.i(zdVar.i, dkrVar)) {
            zdVar.i = dkrVar;
            z5 = true;
        }
        if (!a.m(zdVar.c, i2)) {
            zdVar.c = i2;
        } else {
            z3 = z5;
        }
        if (z2 || z3) {
            zdVar.c().b(zdVar.a, zdVar.b, zdVar.i, zdVar.c, zdVar.d, zdVar.e);
        }
        if (zdVar.t) {
            if (z2 || (z && zdVar.g != null)) {
                qs.g(zdVar);
            }
            if (z2 || z3) {
                qi.d(zdVar);
                qh.e(zdVar);
            }
            if (z) {
                qh.e(zdVar);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStringSimpleElement)) {
            return false;
        }
        TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) obj;
        aqy aqyVar = textStringSimpleElement.h;
        if (!amr.i(null, null) || !amr.i(this.a, textStringSimpleElement.a) || !amr.i(this.b, textStringSimpleElement.b) || !amr.i(this.i, textStringSimpleElement.i) || !a.m(this.c, textStringSimpleElement.c) || this.e != textStringSimpleElement.e || this.f != textStringSimpleElement.f) {
            return false;
        }
        int i = textStringSimpleElement.g;
        return true;
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.i.hashCode()) * 31) + this.c) * 31) + a.i(this.e)) * 31) + this.f) * 31) + 1) * 31;
    }
}
