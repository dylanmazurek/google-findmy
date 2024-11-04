package androidx.compose.ui.draw;

import defpackage.a;
import defpackage.amr;
import defpackage.aon;
import defpackage.aow;
import defpackage.apq;
import defpackage.atq;
import defpackage.avo;
import defpackage.azf;
import defpackage.ji;
import defpackage.qh;
import defpackage.qi;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class PainterElement extends azf {
    private final atq a;
    private final aon c;
    private final avo e;
    private final boolean b = true;
    private final float f = 1.0f;
    private final ji g = null;

    public PainterElement(atq atqVar, aon aonVar, avo avoVar) {
        this.a = atqVar;
        this.c = aonVar;
        this.e = avoVar;
    }

    @Override // defpackage.azf
    public final /* bridge */ /* synthetic */ aow d() {
        return new apq(this.a, this.c, this.e);
    }

    @Override // defpackage.azf
    public final /* bridge */ /* synthetic */ void e(aow aowVar) {
        boolean z;
        apq apqVar = (apq) aowVar;
        if (apqVar.b && a.n(apqVar.a.a(), this.a.a())) {
            z = false;
        } else {
            z = true;
        }
        apqVar.a = this.a;
        apqVar.b = true;
        apqVar.c = this.c;
        apqVar.d = this.e;
        apqVar.e = 1.0f;
        if (z) {
            qi.d(apqVar);
        }
        qh.e(apqVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PainterElement)) {
            return false;
        }
        PainterElement painterElement = (PainterElement) obj;
        if (!amr.i(this.a, painterElement.a)) {
            return false;
        }
        boolean z = painterElement.b;
        if (!amr.i(this.c, painterElement.c) || !amr.i(this.e, painterElement.e)) {
            return false;
        }
        float f = painterElement.f;
        if (Float.compare(1.0f, 1.0f) != 0) {
            return false;
        }
        ji jiVar = painterElement.g;
        if (amr.i(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() * 31) + 1231) * 31) + this.c.hashCode()) * 31) + this.e.hashCode()) * 31) + Float.floatToIntBits(1.0f)) * 31;
    }

    public final String toString() {
        return "PainterElement(painter=" + this.a + ", sizeToIntrinsics=true, alignment=" + this.c + ", contentScale=" + this.e + ", alpha=1.0, colorFilter=null)";
    }
}
