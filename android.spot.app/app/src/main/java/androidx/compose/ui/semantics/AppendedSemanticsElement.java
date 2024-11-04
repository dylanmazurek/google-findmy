package androidx.compose.ui.semantics;

import defpackage.amr;
import defpackage.aov;
import defpackage.aow;
import defpackage.azf;
import defpackage.bew;
import defpackage.moh;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class AppendedSemanticsElement extends azf implements aov {
    public final moh a;
    private final boolean b = false;

    public AppendedSemanticsElement(moh mohVar) {
        this.a = mohVar;
    }

    @Override // defpackage.azf
    public final /* bridge */ /* synthetic */ aow d() {
        return new bew(this.a);
    }

    @Override // defpackage.azf
    public final /* bridge */ /* synthetic */ void e(aow aowVar) {
        ((bew) aowVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppendedSemanticsElement)) {
            return false;
        }
        AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) obj;
        boolean z = appendedSemanticsElement.b;
        if (amr.i(this.a, appendedSemanticsElement.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + 38347;
    }

    public final String toString() {
        return "AppendedSemanticsElement(mergeDescendants=false, properties=" + this.a + ')';
    }
}
