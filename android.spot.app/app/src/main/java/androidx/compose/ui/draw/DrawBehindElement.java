package androidx.compose.ui.draw;

import defpackage.amr;
import defpackage.aow;
import defpackage.apn;
import defpackage.azf;
import defpackage.moh;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class DrawBehindElement extends azf {
    private final moh a;

    public DrawBehindElement(moh mohVar) {
        this.a = mohVar;
    }

    @Override // defpackage.azf
    public final /* bridge */ /* synthetic */ aow d() {
        return new apn(this.a);
    }

    @Override // defpackage.azf
    public final /* bridge */ /* synthetic */ void e(aow aowVar) {
        ((apn) aowVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof DrawBehindElement) && amr.i(this.a, ((DrawBehindElement) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DrawBehindElement(onDraw=" + this.a + ')';
    }
}
