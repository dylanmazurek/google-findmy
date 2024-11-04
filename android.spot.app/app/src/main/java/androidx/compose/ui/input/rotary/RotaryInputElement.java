package androidx.compose.ui.input.rotary;

import defpackage.amr;
import defpackage.aow;
import defpackage.ava;
import defpackage.azf;
import defpackage.moh;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class RotaryInputElement extends azf {
    private final moh a;
    private final moh b = null;

    public RotaryInputElement(moh mohVar) {
        this.a = mohVar;
    }

    @Override // defpackage.azf
    public final /* bridge */ /* synthetic */ aow d() {
        return new ava(this.a);
    }

    @Override // defpackage.azf
    public final /* bridge */ /* synthetic */ void e(aow aowVar) {
        ((ava) aowVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RotaryInputElement)) {
            return false;
        }
        RotaryInputElement rotaryInputElement = (RotaryInputElement) obj;
        if (!amr.i(this.a, rotaryInputElement.a)) {
            return false;
        }
        moh mohVar = rotaryInputElement.b;
        if (amr.i(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "RotaryInputElement(onRotaryScrollEvent=" + this.a + ", onPreRotaryScrollEvent=null)";
    }
}
