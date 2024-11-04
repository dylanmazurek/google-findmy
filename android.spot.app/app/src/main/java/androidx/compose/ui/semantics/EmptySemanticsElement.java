package androidx.compose.ui.semantics;

import defpackage.aow;
import defpackage.azf;
import defpackage.bey;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class EmptySemanticsElement extends azf {
    private final bey a;

    public EmptySemanticsElement(bey beyVar) {
        this.a = beyVar;
    }

    @Override // defpackage.azf
    public final /* synthetic */ aow d() {
        return this.a;
    }

    @Override // defpackage.azf
    public final /* bridge */ /* synthetic */ void e(aow aowVar) {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }
}
