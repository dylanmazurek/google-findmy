package androidx.compose.ui.focus;

import defpackage.amr;
import defpackage.aow;
import defpackage.aqa;
import defpackage.aqc;
import defpackage.azf;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class FocusPropertiesElement extends azf {
    private final aqa a;

    public FocusPropertiesElement(aqa aqaVar) {
        this.a = aqaVar;
    }

    @Override // defpackage.azf
    public final /* bridge */ /* synthetic */ aow d() {
        return new aqc(this.a);
    }

    @Override // defpackage.azf
    public final /* bridge */ /* synthetic */ void e(aow aowVar) {
        ((aqc) aowVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof FocusPropertiesElement) && amr.i(this.a, ((FocusPropertiesElement) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FocusPropertiesElement(scope=" + this.a + ')';
    }
}
