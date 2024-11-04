package androidx.compose.ui.input.key;

import defpackage.amr;
import defpackage.aow;
import defpackage.atu;
import defpackage.azf;
import defpackage.moh;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class KeyInputElement extends azf {
    private final moh a;
    private final moh b = null;

    public KeyInputElement(moh mohVar) {
        this.a = mohVar;
    }

    @Override // defpackage.azf
    public final /* bridge */ /* synthetic */ aow d() {
        return new atu(this.a);
    }

    @Override // defpackage.azf
    public final /* bridge */ /* synthetic */ void e(aow aowVar) {
        ((atu) aowVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyInputElement)) {
            return false;
        }
        KeyInputElement keyInputElement = (KeyInputElement) obj;
        if (!amr.i(this.a, keyInputElement.a)) {
            return false;
        }
        moh mohVar = keyInputElement.b;
        if (amr.i(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "KeyInputElement(onKeyEvent=" + this.a + ", onPreKeyEvent=null)";
    }
}
